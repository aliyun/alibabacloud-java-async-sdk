// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link CreateSecretParameterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecretParameterResponseBody</p>
 */
public class CreateSecretParameterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Parameter")
    private Parameter parameter;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateSecretParameterResponseBody(Builder builder) {
        this.parameter = builder.parameter;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecretParameterResponseBody create() {
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

        private Builder(CreateSecretParameterResponseBody model) {
            this.parameter = model.parameter;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the encryption parameter.</p>
         */
        public Builder parameter(Parameter parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B419FF3-ABC6-4DF0-95E5-636DC8CBB8AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSecretParameterResponseBody build() {
            return new CreateSecretParameterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSecretParameterResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSecretParameterResponseBody</p>
     */
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Constraints")
        private String constraints;

        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("DKMSInstanceId")
        private String DKMSInstanceId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParameterVersion")
        private Integer parameterVersion;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, ?> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdatedBy")
        private String updatedBy;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
        private String updatedDate;

        private Parameter(Builder builder) {
            this.constraints = builder.constraints;
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
            this.DKMSInstanceId = builder.DKMSInstanceId;
            this.description = builder.description;
            this.id = builder.id;
            this.keyId = builder.keyId;
            this.name = builder.name;
            this.parameterVersion = builder.parameterVersion;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareType = builder.shareType;
            this.tags = builder.tags;
            this.type = builder.type;
            this.updatedBy = builder.updatedBy;
            this.updatedDate = builder.updatedDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return constraints
         */
        public String getConstraints() {
            return this.constraints;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return createdDate
         */
        public String getCreatedDate() {
            return this.createdDate;
        }

        /**
         * @return DKMSInstanceId
         */
        public String getDKMSInstanceId() {
            return this.DKMSInstanceId;
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
        public String getId() {
            return this.id;
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameterVersion
         */
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return shareType
         */
        public String getShareType() {
            return this.shareType;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updatedBy
         */
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        /**
         * @return updatedDate
         */
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public static final class Builder {
            private String constraints; 
            private String createdBy; 
            private String createdDate; 
            private String DKMSInstanceId; 
            private String description; 
            private String id; 
            private String keyId; 
            private String name; 
            private Integer parameterVersion; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.Map<String, ?> tags; 
            private String type; 
            private String updatedBy; 
            private String updatedDate; 

            private Builder() {
            } 

            private Builder(Parameter model) {
                this.constraints = model.constraints;
                this.createdBy = model.createdBy;
                this.createdDate = model.createdDate;
                this.DKMSInstanceId = model.DKMSInstanceId;
                this.description = model.description;
                this.id = model.id;
                this.keyId = model.keyId;
                this.name = model.name;
                this.parameterVersion = model.parameterVersion;
                this.resourceGroupId = model.resourceGroupId;
                this.shareType = model.shareType;
                this.tags = model.tags;
                this.type = model.type;
                this.updatedBy = model.updatedBy;
                this.updatedDate = model.updatedDate;
            } 

            /**
             * <p>The constraints of the encryption parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{ 	&quot;AllowedValues&quot;: [&quot;secretparameter&quot;], 	&quot;AllowedPattern&quot;: &quot;secretparameter&quot;, 	&quot;MinLength&quot;: 0, 	&quot;MaxLength&quot;: 20 }&quot;</p>
             */
            public Builder constraints(String constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * <p>The user who created the encryption parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The time when the encryption parameter was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-01T09:30:36Z</p>
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * <p>The instance ID of the KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>kst-hzz****</p>
             */
            public Builder DKMSInstanceId(String DKMSInstanceId) {
                this.DKMSInstanceId = DKMSInstanceId;
                return this;
            }

            /**
             * <p>The description of the encryption parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>SecretParameter</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the encryption parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>p-0b0fff9919c946xxxxxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The key ID of KMS that is used to encrypt the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>80e9409f-78fa-42ab-84bd-83f40c******</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The name of the encryption parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>MyParameter</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version number of the encryption parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parameterVersion(Integer parameterVersion) {
                this.parameterVersion = parameterVersion;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxsn4m4******</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The share type of the encryption parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;: &quot;v1&quot;, &quot;k2&quot;: &quot;v2&quot;}</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Secret</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The user who updated the encryption parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * <p>The time when the encryption parameter was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-01T09:30:36Z</p>
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
}
