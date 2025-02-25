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
 * {@link ListSecretParametersResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecretParametersResponseBody</p>
 */
public class ListSecretParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSecretParametersResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretParametersResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Parameters> parameters; 
        private String requestId; 

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>sPH90GZOVGC6KPDUL0FIIbEtMQHq_19S6_4O_XqA</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The information about the parameters.</p>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CA9C6248-AF2A-4AE9-A166-88FD901BBB90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSecretParametersResponseBody build() {
            return new ListSecretParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecretParametersResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretParametersResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParameterVersion")
        private String parameterVersion;

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

        private Parameters(Builder builder) {
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
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
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
        public String getParameterVersion() {
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
            private String createdBy; 
            private String createdDate; 
            private String description; 
            private String id; 
            private String keyId; 
            private String name; 
            private String parameterVersion; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.Map<String, ?> tags; 
            private String type; 
            private String updatedBy; 
            private String updatedDate; 

            /**
             * <p>The user who created the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The time when the parameter was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-01T09:28:47Z</p>
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>SecretParameter</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>p-14ed150fdcd048xxxxxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the KMS customer master key (CMK) that is used for encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>80e9409f-78fa-42ab-84bd-83f40c******</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>MySecretParameter</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version number of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parameterVersion(String parameterVersion) {
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
             * <p>The share type of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * <p>The tags of the parameter.</p>
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
             * <p>The user who updated the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * <p>The time when the parameter was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-01T09:35:17Z</p>
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
