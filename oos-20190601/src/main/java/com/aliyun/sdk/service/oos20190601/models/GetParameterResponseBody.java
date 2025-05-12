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
         * <p>The information about the common parameter.</p>
         */
        public Builder parameter(Parameter parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BA326372-2A10-4C3B-BE3E-6439DB7557CC</p>
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
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Constraints")
        private String constraints;

        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

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

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

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
            this.value = builder.value;
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
            private String name; 
            private Integer parameterVersion; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.Map<String, ?> tags; 
            private String type; 
            private String updatedBy; 
            private String updatedDate; 
            private String value; 

            private Builder() {
            } 

            private Builder(Parameter model) {
                this.constraints = model.constraints;
                this.createdBy = model.createdBy;
                this.createdDate = model.createdDate;
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.parameterVersion = model.parameterVersion;
                this.resourceGroupId = model.resourceGroupId;
                this.shareType = model.shareType;
                this.tags = model.tags;
                this.type = model.type;
                this.updatedBy = model.updatedBy;
                this.updatedDate = model.updatedDate;
                this.value = model.value;
            } 

            /**
             * <p>The constraints of the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;&quot;AllowedValues&quot;:[&quot;parameter&quot;],&quot;AllowedPattern&quot;:&quot;parameter&quot;,&quot;MinLength&quot;:0,&quot;MaxLength&quot;:20}&quot;</p>
             */
            public Builder constraints(String constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * <p>The user who created the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The time when the common parameter was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-01T08:01:43Z</p>
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * <p>The description of the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>parameter</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>p-4c4b401cab6747xxxxxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>MyParameter</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version number of the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parameterVersion(Integer parameterVersion) {
                this.parameterVersion = parameterVersion;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxsn4m*****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The share type of the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * <p>The tags added to the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The data type of the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The user who updated the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * <p>The time when the common parameter was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-01T08:01:43Z</p>
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            /**
             * <p>The value of the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>parameter</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
}
