// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateParameterResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateParameterResponseBody</p>
 */
public class UpdateParameterResponseBody extends TeaModel {
    @NameInMap("Parameter")
    private Parameter parameter;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateParameterResponseBody(Builder builder) {
        this.parameter = builder.parameter;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateParameterResponseBody create() {
        return builder().build();
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

        /**
         * The information about the common parameter.
         */
        public Builder parameter(Parameter parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateParameterResponseBody build() {
            return new UpdateParameterResponseBody(this);
        } 

    } 

    public static class Parameter extends TeaModel {
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

        @NameInMap("Name")
        private String name;

        @NameInMap("ParameterVersion")
        private Integer parameterVersion;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ShareType")
        private String shareType;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdatedBy")
        private String updatedBy;

        @NameInMap("UpdatedDate")
        private String updatedDate;

        private Parameter(Builder builder) {
            this.constraints = builder.constraints;
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.id = builder.id;
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
        public String getTags() {
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
            private String description; 
            private String id; 
            private String name; 
            private Integer parameterVersion; 
            private String resourceGroupId; 
            private String shareType; 
            private String tags; 
            private String type; 
            private String updatedBy; 
            private String updatedDate; 

            /**
             * The constraints of the common parameter.
             */
            public Builder constraints(String constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * The user who created the common parameter.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * The time when the common parameter was created.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * The description of the common parameter.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The parameter ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the common parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The version number of the common parameter.
             */
            public Builder parameterVersion(Integer parameterVersion) {
                this.parameterVersion = parameterVersion;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The share type of the common parameter.
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * The tag added to the common parameter.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The data type of the common parameter.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The user who updated the common parameter.
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * The time when the common parameter was updated.
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
