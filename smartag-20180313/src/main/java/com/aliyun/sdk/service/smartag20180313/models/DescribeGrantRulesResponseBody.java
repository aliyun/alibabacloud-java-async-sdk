// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeGrantRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGrantRulesResponseBody</p>
 */
public class DescribeGrantRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GrantRules")
    private GrantRules grantRules;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGrantRulesResponseBody(Builder builder) {
        this.grantRules = builder.grantRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGrantRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return grantRules
     */
    public GrantRules getGrantRules() {
        return this.grantRules;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private GrantRules grantRules; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeGrantRulesResponseBody model) {
            this.grantRules = model.grantRules;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The permissions that are granted.</p>
         */
        public Builder grantRules(GrantRules grantRules) {
            this.grantRules = grantRules;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FA579C2D-84A0-4BA1-B9C3-1E5A3B15F1B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGrantRulesResponseBody build() {
            return new DescribeGrantRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGrantRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantRulesResponseBody</p>
     */
    public static class GrantRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CcnInstanceId")
        private String ccnInstanceId;

        @com.aliyun.core.annotation.NameInMap("CcnUid")
        private Long ccnUid;

        @com.aliyun.core.annotation.NameInMap("CenInstanceId")
        private String cenInstanceId;

        @com.aliyun.core.annotation.NameInMap("CenUid")
        private Long cenUid;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("GrantRuleId")
        private String grantRuleId;

        @com.aliyun.core.annotation.NameInMap("GrantTrafficService")
        private Boolean grantTrafficService;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private GrantRule(Builder builder) {
            this.ccnInstanceId = builder.ccnInstanceId;
            this.ccnUid = builder.ccnUid;
            this.cenInstanceId = builder.cenInstanceId;
            this.cenUid = builder.cenUid;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.grantRuleId = builder.grantRuleId;
            this.grantTrafficService = builder.grantTrafficService;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantRule create() {
            return builder().build();
        }

        /**
         * @return ccnInstanceId
         */
        public String getCcnInstanceId() {
            return this.ccnInstanceId;
        }

        /**
         * @return ccnUid
         */
        public Long getCcnUid() {
            return this.ccnUid;
        }

        /**
         * @return cenInstanceId
         */
        public String getCenInstanceId() {
            return this.cenInstanceId;
        }

        /**
         * @return cenUid
         */
        public Long getCenUid() {
            return this.cenUid;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return grantRuleId
         */
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

        /**
         * @return grantTrafficService
         */
        public Boolean getGrantTrafficService() {
            return this.grantTrafficService;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String ccnInstanceId; 
            private Long ccnUid; 
            private String cenInstanceId; 
            private Long cenUid; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String grantRuleId; 
            private Boolean grantTrafficService; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(GrantRule model) {
                this.ccnInstanceId = model.ccnInstanceId;
                this.ccnUid = model.ccnUid;
                this.cenInstanceId = model.cenInstanceId;
                this.cenUid = model.cenUid;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.grantRuleId = model.grantRuleId;
                this.grantTrafficService = model.grantTrafficService;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The ID of the CCN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-n2935s1mnwv8i*****</p>
             */
            public Builder ccnInstanceId(String ccnInstanceId) {
                this.ccnInstanceId = ccnInstanceId;
                return this;
            }

            /**
             * <p>The UID of the Alibaba Cloud account to which the CCN instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1220123456123456</p>
             */
            public Builder ccnUid(Long ccnUid) {
                this.ccnUid = ccnUid;
                return this;
            }

            /**
             * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-0jtu0bcbika5b5****</p>
             */
            public Builder cenInstanceId(String cenInstanceId) {
                this.cenInstanceId = cenInstanceId;
                return this;
            }

            /**
             * <p>The UID of the Alibaba Cloud account to which the CEN instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1250123456123456</p>
             */
            public Builder cenUid(Long cenUid) {
                this.cenUid = cenUid;
                return this;
            }

            /**
             * <p>The timestamp when the permissions are granted.</p>
             * 
             * <strong>example:</strong>
             * <p>1563439920000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The timestamp when the permissions are modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1563439920000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>18313265-d988-406c-965d-3e110ff*****</p>
             */
            public Builder grantRuleId(String grantRuleId) {
                this.grantRuleId = grantRuleId;
                return this;
            }

            /**
             * <p>Indicates whether the permissions to manage network traffic from the CCN instance are granted to a CEN instance that belongs to another account. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder grantTrafficService(Boolean grantTrafficService) {
                this.grantTrafficService = grantTrafficService;
                return this;
            }

            /**
             * <p>The ID of the region where the CCN instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public GrantRule build() {
                return new GrantRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGrantRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantRulesResponseBody</p>
     */
    public static class GrantRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GrantRule")
        private java.util.List<GrantRule> grantRule;

        private GrantRules(Builder builder) {
            this.grantRule = builder.grantRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantRules create() {
            return builder().build();
        }

        /**
         * @return grantRule
         */
        public java.util.List<GrantRule> getGrantRule() {
            return this.grantRule;
        }

        public static final class Builder {
            private java.util.List<GrantRule> grantRule; 

            private Builder() {
            } 

            private Builder(GrantRules model) {
                this.grantRule = model.grantRule;
            } 

            /**
             * GrantRule.
             */
            public Builder grantRule(java.util.List<GrantRule> grantRule) {
                this.grantRule = grantRule;
                return this;
            }

            public GrantRules build() {
                return new GrantRules(this);
            } 

        } 

    }
}
