package butterknife.compiler;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;

final class FieldViewBinding implements MemberViewBinding {
  private final String name;
  private final TypeName type;
  private final boolean required;
  private final int parentId;

  FieldViewBinding(String name, TypeName type, boolean required, int parentId) {
    this.name = name;
    this.type = type;
    this.required = required;
    this.parentId = parentId;
  }
  public int getParentId() {
    return parentId;
  }

  public String getName() {
    return name;
  }

  public TypeName getType() {
    return type;
  }

  public ClassName getRawType() {
    if (type instanceof ParameterizedTypeName) {
      return ((ParameterizedTypeName) type).rawType;
    }
    return (ClassName) type;
  }

  @Override public String getDescription() {
    return "field '" + name + "'";
  }

  public boolean isRequired() {
    return required;
  }
}
