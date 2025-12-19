// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link ListAPIKeyCredentialProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ListAPIKeyCredentialProvidersResponseBody</p>
 */
public class ListAPIKeyCredentialProvidersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("APIKeyCredentialProviders")
    private java.util.List<APIKeyCredentialProviders> APIKeyCredentialProviders;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAPIKeyCredentialProvidersResponseBody(Builder builder) {
        this.APIKeyCredentialProviders = builder.APIKeyCredentialProviders;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAPIKeyCredentialProvidersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return APIKeyCredentialProviders
     */
    public java.util.List<APIKeyCredentialProviders> getAPIKeyCredentialProviders() {
        return this.APIKeyCredentialProviders;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<APIKeyCredentialProviders> APIKeyCredentialProviders; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAPIKeyCredentialProvidersResponseBody model) {
            this.APIKeyCredentialProviders = model.APIKeyCredentialProviders;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * APIKeyCredentialProviders.
         */
        public Builder APIKeyCredentialProviders(java.util.List<APIKeyCredentialProviders> APIKeyCredentialProviders) {
            this.APIKeyCredentialProviders = APIKeyCredentialProviders;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAPIKeyCredentialProvidersResponseBody build() {
            return new ListAPIKeyCredentialProvidersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAPIKeyCredentialProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListAPIKeyCredentialProvidersResponseBody</p>
     */
    public static class APIKeyCredentialProviders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("APIKeyCredentialProviderName")
        private String APIKeyCredentialProviderName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CredentialProviderArn")
        private String credentialProviderArn;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private APIKeyCredentialProviders(Builder builder) {
            this.APIKeyCredentialProviderName = builder.APIKeyCredentialProviderName;
            this.createTime = builder.createTime;
            this.credentialProviderArn = builder.credentialProviderArn;
            this.description = builder.description;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static APIKeyCredentialProviders create() {
            return builder().build();
        }

        /**
         * @return APIKeyCredentialProviderName
         */
        public String getAPIKeyCredentialProviderName() {
            return this.APIKeyCredentialProviderName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return credentialProviderArn
         */
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String APIKeyCredentialProviderName; 
            private String createTime; 
            private String credentialProviderArn; 
            private String description; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(APIKeyCredentialProviders model) {
                this.APIKeyCredentialProviderName = model.APIKeyCredentialProviderName;
                this.createTime = model.createTime;
                this.credentialProviderArn = model.credentialProviderArn;
                this.description = model.description;
                this.updateTime = model.updateTime;
            } 

            /**
             * APIKeyCredentialProviderName.
             */
            public Builder APIKeyCredentialProviderName(String APIKeyCredentialProviderName) {
                this.APIKeyCredentialProviderName = APIKeyCredentialProviderName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CredentialProviderArn.
             */
            public Builder credentialProviderArn(String credentialProviderArn) {
                this.credentialProviderArn = credentialProviderArn;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public APIKeyCredentialProviders build() {
                return new APIKeyCredentialProviders(this);
            } 

        } 

    }
}
