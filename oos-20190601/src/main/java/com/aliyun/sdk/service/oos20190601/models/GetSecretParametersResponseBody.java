// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretParametersResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecretParametersResponseBody</p>
 */
public class GetSecretParametersResponseBody extends TeaModel {
    @NameInMap("InvalidParameters")
    private java.util.List < String > invalidParameters;

    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @NameInMap("RequestId")
    private String requestId;

    private GetSecretParametersResponseBody(Builder builder) {
        this.invalidParameters = builder.invalidParameters;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretParametersResponseBody create() {
        return builder().build();
    }

    /**
     * @return invalidParameters
     */
    public java.util.List < String > getInvalidParameters() {
        return this.invalidParameters;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > invalidParameters; 
        private java.util.List < Parameters> parameters; 
        private String requestId; 

        /**
         * InvalidParameters.
         */
        public Builder invalidParameters(java.util.List < String > invalidParameters) {
            this.invalidParameters = invalidParameters;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
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

        public GetSecretParametersResponseBody build() {
            return new GetSecretParametersResponseBody(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @NameInMap("Constraints")
        private String constraints;

        @NameInMap("CreatedBy")
        private String createdBy;

        @NameInMap("CreatedDate")
        private String createdDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("KeyId")
        private String keyId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParameterVersion")
        private Integer parameterVersion;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ShareType")
        private String shareType;

        @NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdatedBy")
        private String updatedBy;

        @NameInMap("UpdatedDate")
        private String updatedDate;

        @NameInMap("Value")
        private String value;

        private Parameters(Builder builder) {
            this.constraints = builder.constraints;
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
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
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
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
        public java.util.Map < String, ? > getTags() {
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

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String constraints; 
            private String createdBy; 
            private String createdDate; 
            private String description; 
            private String id; 
            private String keyId; 
            private String name; 
            private Integer parameterVersion; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.Map < String, ? > tags; 
            private String type; 
            private String updatedBy; 
            private String updatedDate; 
            private String value; 

            /**
             * Constraints.
             */
            public Builder constraints(String constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * CreatedBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * CreatedDate.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * KeyId.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
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
             * ParameterVersion.
             */
            public Builder parameterVersion(Integer parameterVersion) {
                this.parameterVersion = parameterVersion;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ShareType.
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
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
             * UpdatedBy.
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * UpdatedDate.
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
