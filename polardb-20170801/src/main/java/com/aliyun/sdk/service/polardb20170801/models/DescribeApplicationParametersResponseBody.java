// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApplicationParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationParametersResponseBody</p>
 */
public class DescribeApplicationParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterTemplates")
    private ParameterTemplates parameterTemplates;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private Parameters parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApplicationParametersResponseBody(Builder builder) {
        this.parameterTemplates = builder.parameterTemplates;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationParametersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterTemplates
     */
    public ParameterTemplates getParameterTemplates() {
        return this.parameterTemplates;
    }

    /**
     * @return parameters
     */
    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ParameterTemplates parameterTemplates; 
        private Parameters parameters; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeApplicationParametersResponseBody model) {
            this.parameterTemplates = model.parameterTemplates;
            this.parameters = model.parameters;
            this.requestId = model.requestId;
        } 

        /**
         * ParameterTemplates.
         */
        public Builder parameterTemplates(ParameterTemplates parameterTemplates) {
            this.parameterTemplates = parameterTemplates;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(Parameters parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApplicationParametersResponseBody build() {
            return new DescribeApplicationParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationParametersResponseBody</p>
     */
    public static class ComponentParameterTemplatesParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Default")
        private String _default;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedRestart")
        private Boolean needRestart;

        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ComponentParameterTemplatesParameters(Builder builder) {
            this._default = builder._default;
            this.description = builder.description;
            this.name = builder.name;
            this.needRestart = builder.needRestart;
            this.pattern = builder.pattern;
            this.readOnly = builder.readOnly;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentParameterTemplatesParameters create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public String get_default() {
            return this._default;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needRestart
         */
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String _default; 
            private String description; 
            private String name; 
            private Boolean needRestart; 
            private String pattern; 
            private Boolean readOnly; 
            private String type; 

            private Builder() {
            } 

            private Builder(ComponentParameterTemplatesParameters model) {
                this._default = model._default;
                this.description = model.description;
                this.name = model.name;
                this.needRestart = model.needRestart;
                this.pattern = model.pattern;
                this.readOnly = model.readOnly;
                this.type = model.type;
            } 

            /**
             * Default.
             */
            public Builder _default(String _default) {
                this._default = _default;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NeedRestart.
             */
            public Builder needRestart(Boolean needRestart) {
                this.needRestart = needRestart;
                return this;
            }

            /**
             * Pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * ReadOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ComponentParameterTemplatesParameters build() {
                return new ComponentParameterTemplatesParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationParametersResponseBody</p>
     */
    public static class ComponentParameterTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private String componentId;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List<ComponentParameterTemplatesParameters> parameters;

        private ComponentParameterTemplates(Builder builder) {
            this.componentId = builder.componentId;
            this.componentType = builder.componentType;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentParameterTemplates create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return parameters
         */
        public java.util.List<ComponentParameterTemplatesParameters> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String componentId; 
            private String componentType; 
            private java.util.List<ComponentParameterTemplatesParameters> parameters; 

            private Builder() {
            } 

            private Builder(ComponentParameterTemplates model) {
                this.componentId = model.componentId;
                this.componentType = model.componentType;
                this.parameters = model.parameters;
            } 

            /**
             * ComponentId.
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.List<ComponentParameterTemplatesParameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            public ComponentParameterTemplates build() {
                return new ComponentParameterTemplates(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationParametersResponseBody</p>
     */
    public static class ParameterTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentParameterTemplates")
        private java.util.List<ComponentParameterTemplates> componentParameterTemplates;

        private ParameterTemplates(Builder builder) {
            this.componentParameterTemplates = builder.componentParameterTemplates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterTemplates create() {
            return builder().build();
        }

        /**
         * @return componentParameterTemplates
         */
        public java.util.List<ComponentParameterTemplates> getComponentParameterTemplates() {
            return this.componentParameterTemplates;
        }

        public static final class Builder {
            private java.util.List<ComponentParameterTemplates> componentParameterTemplates; 

            private Builder() {
            } 

            private Builder(ParameterTemplates model) {
                this.componentParameterTemplates = model.componentParameterTemplates;
            } 

            /**
             * ComponentParameterTemplates.
             */
            public Builder componentParameterTemplates(java.util.List<ComponentParameterTemplates> componentParameterTemplates) {
                this.componentParameterTemplates = componentParameterTemplates;
                return this;
            }

            public ParameterTemplates build() {
                return new ParameterTemplates(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationParametersResponseBody</p>
     */
    public static class ComponentParametersParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Default")
        private String _default;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedRestart")
        private Boolean needRestart;

        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ComponentParametersParameters(Builder builder) {
            this._default = builder._default;
            this.description = builder.description;
            this.name = builder.name;
            this.needRestart = builder.needRestart;
            this.pattern = builder.pattern;
            this.readOnly = builder.readOnly;
            this.status = builder.status;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentParametersParameters create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public String get_default() {
            return this._default;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needRestart
         */
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String _default; 
            private String description; 
            private String name; 
            private Boolean needRestart; 
            private String pattern; 
            private Boolean readOnly; 
            private String status; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(ComponentParametersParameters model) {
                this._default = model._default;
                this.description = model.description;
                this.name = model.name;
                this.needRestart = model.needRestart;
                this.pattern = model.pattern;
                this.readOnly = model.readOnly;
                this.status = model.status;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Default.
             */
            public Builder _default(String _default) {
                this._default = _default;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NeedRestart.
             */
            public Builder needRestart(Boolean needRestart) {
                this.needRestart = needRestart;
                return this;
            }

            /**
             * Pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * ReadOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ComponentParametersParameters build() {
                return new ComponentParametersParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationParametersResponseBody</p>
     */
    public static class ComponentParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private String componentId;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List<ComponentParametersParameters> parameters;

        private ComponentParameters(Builder builder) {
            this.componentId = builder.componentId;
            this.componentType = builder.componentType;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentParameters create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return parameters
         */
        public java.util.List<ComponentParametersParameters> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String componentId; 
            private String componentType; 
            private java.util.List<ComponentParametersParameters> parameters; 

            private Builder() {
            } 

            private Builder(ComponentParameters model) {
                this.componentId = model.componentId;
                this.componentType = model.componentType;
                this.parameters = model.parameters;
            } 

            /**
             * ComponentId.
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.List<ComponentParametersParameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            public ComponentParameters build() {
                return new ComponentParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationParametersResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentParameters")
        private java.util.List<ComponentParameters> componentParameters;

        private Parameters(Builder builder) {
            this.componentParameters = builder.componentParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return componentParameters
         */
        public java.util.List<ComponentParameters> getComponentParameters() {
            return this.componentParameters;
        }

        public static final class Builder {
            private java.util.List<ComponentParameters> componentParameters; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.componentParameters = model.componentParameters;
            } 

            /**
             * ComponentParameters.
             */
            public Builder componentParameters(java.util.List<ComponentParameters> componentParameters) {
                this.componentParameters = componentParameters;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
