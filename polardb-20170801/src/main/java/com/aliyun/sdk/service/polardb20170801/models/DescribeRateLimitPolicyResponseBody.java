// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeRateLimitPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRateLimitPolicyResponseBody</p>
 */
public class DescribeRateLimitPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeRateLimitPolicyResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRateLimitPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String pageNumber; 
        private String pageRecordCount; 
        private String pageSize; 
        private String requestId; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeRateLimitPolicyResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>An array of rate limit policy objects.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The returned page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of matching entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeRateLimitPolicyResponseBody build() {
            return new DescribeRateLimitPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRateLimitPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRateLimitPolicyResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GwClusterId")
        private String gwClusterId;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("RateLimitRpm")
        private String rateLimitRpm;

        @com.aliyun.core.annotation.NameInMap("RateLimitTpm")
        private String rateLimitTpm;

        @com.aliyun.core.annotation.NameInMap("ScopeRefId")
        private String scopeRefId;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Items(Builder builder) {
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.gwClusterId = builder.gwClusterId;
            this.policyId = builder.policyId;
            this.policyType = builder.policyType;
            this.rateLimitRpm = builder.rateLimitRpm;
            this.rateLimitTpm = builder.rateLimitTpm;
            this.scopeRefId = builder.scopeRefId;
            this.scopeType = builder.scopeType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gwClusterId
         */
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return rateLimitRpm
         */
        public String getRateLimitRpm() {
            return this.rateLimitRpm;
        }

        /**
         * @return rateLimitTpm
         */
        public String getRateLimitTpm() {
            return this.rateLimitTpm;
        }

        /**
         * @return scopeRefId
         */
        public String getScopeRefId() {
            return this.scopeRefId;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String gmtCreated; 
            private String gmtModified; 
            private String gwClusterId; 
            private String policyId; 
            private String policyType; 
            private String rateLimitRpm; 
            private String rateLimitTpm; 
            private String scopeRefId; 
            private String scopeType; 
            private String status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.gwClusterId = model.gwClusterId;
                this.policyId = model.policyId;
                this.policyType = model.policyType;
                this.rateLimitRpm = model.rateLimitRpm;
                this.rateLimitTpm = model.rateLimitTpm;
                this.scopeRefId = model.scopeRefId;
                this.scopeType = model.scopeType;
                this.status = model.status;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-01T17:52:05+08:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-19T16:47:25+08:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the gateway instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-xxxxxxxx</p>
             */
            public Builder gwClusterId(String gwClusterId) {
                this.gwClusterId = gwClusterId;
                return this;
            }

            /**
             * <p>The ID of the rate limit policy.</p>
             * 
             * <strong>example:</strong>
             * <p>02eccf7c61cf4d05a543075ee907f3**</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>RateLimit</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The maximum requests per minute (RPM).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rateLimitRpm(String rateLimitRpm) {
                this.rateLimitRpm = rateLimitRpm;
                return this;
            }

            /**
             * <p>The maximum tokens per minute (TPM).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rateLimitTpm(String rateLimitTpm) {
                this.rateLimitTpm = rateLimitTpm;
                return this;
            }

            /**
             * <p>The ID of the object within the policy\&quot;s scope, such as a consumer group or a consumer.</p>
             * 
             * <strong>example:</strong>
             * <p>cg-xxxxxxx</p>
             */
            public Builder scopeRefId(String scopeRefId) {
                this.scopeRefId = scopeRefId;
                return this;
            }

            /**
             * <p>The scope of the policy. Valid values:</p>
             * <ul>
             * <li><p><strong>ConsumerGroup</strong>: The policy applies to a consumer group.</p>
             * </li>
             * <li><p><strong>Consumer</strong>: The policy applies to a specific consumer.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ConsumerGroup</p>
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * <p>The status of the policy. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: The policy is enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: The policy is disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
