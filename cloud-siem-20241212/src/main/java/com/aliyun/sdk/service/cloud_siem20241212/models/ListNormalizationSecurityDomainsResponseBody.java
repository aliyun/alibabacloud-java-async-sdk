// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListNormalizationSecurityDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNormalizationSecurityDomainsResponseBody</p>
 */
public class ListNormalizationSecurityDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NormalizationSecurityDomains")
    private java.util.List<NormalizationSecurityDomains> normalizationSecurityDomains;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNormalizationSecurityDomainsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.normalizationSecurityDomains = builder.normalizationSecurityDomains;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNormalizationSecurityDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return normalizationSecurityDomains
     */
    public java.util.List<NormalizationSecurityDomains> getNormalizationSecurityDomains() {
        return this.normalizationSecurityDomains;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<NormalizationSecurityDomains> normalizationSecurityDomains; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNormalizationSecurityDomainsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.normalizationSecurityDomains = model.normalizationSecurityDomains;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
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
         * NormalizationSecurityDomains.
         */
        public Builder normalizationSecurityDomains(java.util.List<NormalizationSecurityDomains> normalizationSecurityDomains) {
            this.normalizationSecurityDomains = normalizationSecurityDomains;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
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

        public ListNormalizationSecurityDomainsResponseBody build() {
            return new ListNormalizationSecurityDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNormalizationSecurityDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNormalizationSecurityDomainsResponseBody</p>
     */
    public static class NormalizationSecurityDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalizationSecurityDomainId")
        private String normalizationSecurityDomainId;

        @com.aliyun.core.annotation.NameInMap("NormalizationSecurityDomainName")
        private String normalizationSecurityDomainName;

        private NormalizationSecurityDomains(Builder builder) {
            this.normalizationSecurityDomainId = builder.normalizationSecurityDomainId;
            this.normalizationSecurityDomainName = builder.normalizationSecurityDomainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationSecurityDomains create() {
            return builder().build();
        }

        /**
         * @return normalizationSecurityDomainId
         */
        public String getNormalizationSecurityDomainId() {
            return this.normalizationSecurityDomainId;
        }

        /**
         * @return normalizationSecurityDomainName
         */
        public String getNormalizationSecurityDomainName() {
            return this.normalizationSecurityDomainName;
        }

        public static final class Builder {
            private String normalizationSecurityDomainId; 
            private String normalizationSecurityDomainName; 

            private Builder() {
            } 

            private Builder(NormalizationSecurityDomains model) {
                this.normalizationSecurityDomainId = model.normalizationSecurityDomainId;
                this.normalizationSecurityDomainName = model.normalizationSecurityDomainName;
            } 

            /**
             * NormalizationSecurityDomainId.
             */
            public Builder normalizationSecurityDomainId(String normalizationSecurityDomainId) {
                this.normalizationSecurityDomainId = normalizationSecurityDomainId;
                return this;
            }

            /**
             * NormalizationSecurityDomainName.
             */
            public Builder normalizationSecurityDomainName(String normalizationSecurityDomainName) {
                this.normalizationSecurityDomainName = normalizationSecurityDomainName;
                return this;
            }

            public NormalizationSecurityDomains build() {
                return new NormalizationSecurityDomains(this);
            } 

        } 

    }
}
