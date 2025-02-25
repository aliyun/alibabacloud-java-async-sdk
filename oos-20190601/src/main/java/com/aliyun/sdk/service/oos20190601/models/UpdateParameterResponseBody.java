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
 * {@link UpdateParameterResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateParameterResponseBody</p>
 */
public class UpdateParameterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Parameter")
    private Parameter parameter;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>AF1AE6DE-61C4-435E-8687-072CFACCCEC7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateParameterResponseBody build() {
            return new UpdateParameterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateParameterResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateParameterResponseBody</p>
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
        private String tags;

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
             * <p>The constraints of the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;AllowedValues&quot;:[&quot;parameter&quot;],&quot;AllowedPattern&quot;:&quot;parameter&quot;,&quot;MinLength&quot;:0,&quot;MaxLength&quot;:20}&quot;</p>
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
             * <p>update</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The parameter ID.</p>
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
             * <p>2</p>
             */
            public Builder parameterVersion(Integer parameterVersion) {
                this.parameterVersion = parameterVersion;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxsn4m4******</p>
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
             * <p>The tag added to the common parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;: &quot;v1&quot;, &quot;k2&quot;: &quot;v2&quot;}</p>
             */
            public Builder tags(String tags) {
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
             * <p>2020-09-01T08:04:23Z</p>
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
