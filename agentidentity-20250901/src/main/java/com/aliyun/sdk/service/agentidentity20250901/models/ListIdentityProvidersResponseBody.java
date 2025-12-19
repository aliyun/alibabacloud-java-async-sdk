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
 * {@link ListIdentityProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ListIdentityProvidersResponseBody</p>
 */
public class ListIdentityProvidersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdentityProviders")
    private java.util.List<IdentityProviders> identityProviders;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListIdentityProvidersResponseBody(Builder builder) {
        this.identityProviders = builder.identityProviders;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityProvidersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProviders
     */
    public java.util.List<IdentityProviders> getIdentityProviders() {
        return this.identityProviders;
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
        private java.util.List<IdentityProviders> identityProviders; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListIdentityProvidersResponseBody model) {
            this.identityProviders = model.identityProviders;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * IdentityProviders.
         */
        public Builder identityProviders(java.util.List<IdentityProviders> identityProviders) {
            this.identityProviders = identityProviders;
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

        public ListIdentityProvidersResponseBody build() {
            return new ListIdentityProvidersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIdentityProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListIdentityProvidersResponseBody</p>
     */
    public static class IdentityProviders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedAudience")
        private java.util.List<String> allowedAudience;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiscoveryURL")
        private String discoveryURL;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderArn")
        private String identityProviderArn;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
        private String identityProviderName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private IdentityProviders(Builder builder) {
            this.allowedAudience = builder.allowedAudience;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.discoveryURL = builder.discoveryURL;
            this.identityProviderArn = builder.identityProviderArn;
            this.identityProviderName = builder.identityProviderName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityProviders create() {
            return builder().build();
        }

        /**
         * @return allowedAudience
         */
        public java.util.List<String> getAllowedAudience() {
            return this.allowedAudience;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return discoveryURL
         */
        public String getDiscoveryURL() {
            return this.discoveryURL;
        }

        /**
         * @return identityProviderArn
         */
        public String getIdentityProviderArn() {
            return this.identityProviderArn;
        }

        /**
         * @return identityProviderName
         */
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<String> allowedAudience; 
            private String createTime; 
            private String description; 
            private String discoveryURL; 
            private String identityProviderArn; 
            private String identityProviderName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(IdentityProviders model) {
                this.allowedAudience = model.allowedAudience;
                this.createTime = model.createTime;
                this.description = model.description;
                this.discoveryURL = model.discoveryURL;
                this.identityProviderArn = model.identityProviderArn;
                this.identityProviderName = model.identityProviderName;
                this.updateTime = model.updateTime;
            } 

            /**
             * AllowedAudience.
             */
            public Builder allowedAudience(java.util.List<String> allowedAudience) {
                this.allowedAudience = allowedAudience;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DiscoveryURL.
             */
            public Builder discoveryURL(String discoveryURL) {
                this.discoveryURL = discoveryURL;
                return this;
            }

            /**
             * IdentityProviderArn.
             */
            public Builder identityProviderArn(String identityProviderArn) {
                this.identityProviderArn = identityProviderArn;
                return this;
            }

            /**
             * IdentityProviderName.
             */
            public Builder identityProviderName(String identityProviderName) {
                this.identityProviderName = identityProviderName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public IdentityProviders build() {
                return new IdentityProviders(this);
            } 

        } 

    }
}
