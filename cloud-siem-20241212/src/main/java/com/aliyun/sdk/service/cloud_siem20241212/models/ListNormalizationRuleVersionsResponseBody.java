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
 * {@link ListNormalizationRuleVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNormalizationRuleVersionsResponseBody</p>
 */
public class ListNormalizationRuleVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NormalizationRuleVersions")
    private java.util.List<NormalizationRuleVersions> normalizationRuleVersions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNormalizationRuleVersionsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.normalizationRuleVersions = builder.normalizationRuleVersions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNormalizationRuleVersionsResponseBody create() {
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
     * @return normalizationRuleVersions
     */
    public java.util.List<NormalizationRuleVersions> getNormalizationRuleVersions() {
        return this.normalizationRuleVersions;
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
        private java.util.List<NormalizationRuleVersions> normalizationRuleVersions; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNormalizationRuleVersionsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.normalizationRuleVersions = model.normalizationRuleVersions;
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
         * NormalizationRuleVersions.
         */
        public Builder normalizationRuleVersions(java.util.List<NormalizationRuleVersions> normalizationRuleVersions) {
            this.normalizationRuleVersions = normalizationRuleVersions;
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

        public ListNormalizationRuleVersionsResponseBody build() {
            return new ListNormalizationRuleVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNormalizationRuleVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNormalizationRuleVersionsResponseBody</p>
     */
    public static class NormalizationRuleVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleExpression")
        private String normalizationRuleExpression;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
        private String normalizationRuleId;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleVersion")
        private Integer normalizationRuleVersion;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private NormalizationRuleVersions(Builder builder) {
            this.createTime = builder.createTime;
            this.normalizationRuleExpression = builder.normalizationRuleExpression;
            this.normalizationRuleId = builder.normalizationRuleId;
            this.normalizationRuleVersion = builder.normalizationRuleVersion;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationRuleVersions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return normalizationRuleExpression
         */
        public String getNormalizationRuleExpression() {
            return this.normalizationRuleExpression;
        }

        /**
         * @return normalizationRuleId
         */
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        /**
         * @return normalizationRuleVersion
         */
        public Integer getNormalizationRuleVersion() {
            return this.normalizationRuleVersion;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String normalizationRuleExpression; 
            private String normalizationRuleId; 
            private Integer normalizationRuleVersion; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(NormalizationRuleVersions model) {
                this.createTime = model.createTime;
                this.normalizationRuleExpression = model.normalizationRuleExpression;
                this.normalizationRuleId = model.normalizationRuleId;
                this.normalizationRuleVersion = model.normalizationRuleVersion;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * NormalizationRuleExpression.
             */
            public Builder normalizationRuleExpression(String normalizationRuleExpression) {
                this.normalizationRuleExpression = normalizationRuleExpression;
                return this;
            }

            /**
             * NormalizationRuleId.
             */
            public Builder normalizationRuleId(String normalizationRuleId) {
                this.normalizationRuleId = normalizationRuleId;
                return this;
            }

            /**
             * NormalizationRuleVersion.
             */
            public Builder normalizationRuleVersion(Integer normalizationRuleVersion) {
                this.normalizationRuleVersion = normalizationRuleVersion;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public NormalizationRuleVersions build() {
                return new NormalizationRuleVersions(this);
            } 

        } 

    }
}
