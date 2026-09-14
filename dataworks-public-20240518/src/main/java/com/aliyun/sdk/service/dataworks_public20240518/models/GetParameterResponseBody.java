// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetParameterResponseBody} extends {@link TeaModel}
 *
 * <p>GetParameterResponseBody</p>
 */
public class GetParameterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Parameter")
    private Parameter parameter;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetParameterResponseBody(Builder builder) {
        this.parameter = builder.parameter;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParameterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameter
     */
    public Parameter getParameter() {
        return this.parameter;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Parameter parameter; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetParameterResponseBody model) {
            this.parameter = model.parameter;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the parameter.</p>
         */
        public Builder parameter(Parameter parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetParameterResponseBody build() {
            return new GetParameterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetParameterResponseBody} extends {@link TeaModel}
     *
     * <p>GetParameterResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Properties(Builder builder) {
            this.envType = builder.envType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String envType; 
            private String value; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.envType = model.envType;
                this.value = model.value;
            } 

            /**
             * <p>The project environment. Valid values:</p>
             * <ul>
             * <li><p><code>Prod</code>: production.</p>
             * </li>
             * <li><p><code>Dev</code>: development.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>value123</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetParameterResponseBody} extends {@link TeaModel}
     *
     * <p>GetParameterResponseBody</p>
     */
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List<Properties> properties;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private Parameter(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.description = builder.description;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.properties = builder.properties;
            this.scope = builder.scope;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return properties
         */
        public java.util.List<Properties> getProperties() {
            return this.properties;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long createTime; 
            private String createUser; 
            private String description; 
            private Long id; 
            private Long modifyTime; 
            private String modifyUser; 
            private String name; 
            private String owner; 
            private Long projectId; 
            private java.util.List<Properties> properties; 
            private String scope; 
            private String type; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(Parameter model) {
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.description = model.description;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.modifyUser = model.modifyUser;
                this.name = model.name;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.properties = model.properties;
                this.scope = model.scope;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>The time when the parameter was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1640000000000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a test parameter.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the parameter was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1640000000000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The modifier of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>workspace.para</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The value configurations of the parameter.</p>
             */
            public Builder properties(java.util.List<Properties> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The scope of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Project</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The type of the parameter. Valid values:</p>
             * <ul>
             * <li><p><code>PlainConstant</code>: a constant in plaintext.</p>
             * </li>
             * <li><p><code>SecretConstant</code>: a constant in ciphertext.</p>
             * </li>
             * <li><p><code>Variable</code>: a variable.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PlainConstant</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
}
