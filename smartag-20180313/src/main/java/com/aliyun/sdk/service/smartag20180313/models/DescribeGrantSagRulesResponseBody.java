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
 * {@link DescribeGrantSagRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGrantSagRulesResponseBody</p>
 */
public class DescribeGrantSagRulesResponseBody extends TeaModel {
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

    private DescribeGrantSagRulesResponseBody(Builder builder) {
        this.grantRules = builder.grantRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGrantSagRulesResponseBody create() {
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

        private Builder(DescribeGrantSagRulesResponseBody model) {
            this.grantRules = model.grantRules;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the permissions that the SAG instance grants to the CCN instance of another Alibaba Cloud account.</p>
         */
        public Builder grantRules(GrantRules grantRules) {
            this.grantRules = grantRules;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
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
         * <p>6E1674AC-083C-4031-B047-7A66E418E0C6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGrantSagRulesResponseBody build() {
            return new DescribeGrantSagRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGrantSagRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantSagRulesResponseBody</p>
     */
    public static class GrantRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CcnInstanceId")
        private String ccnInstanceId;

        @com.aliyun.core.annotation.NameInMap("CcnUid")
        private Long ccnUid;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("GrantTrafficService")
        private Boolean grantTrafficService;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        private String smartAGId;

        private GrantRule(Builder builder) {
            this.ccnInstanceId = builder.ccnInstanceId;
            this.ccnUid = builder.ccnUid;
            this.createTime = builder.createTime;
            this.grantTrafficService = builder.grantTrafficService;
            this.instanceId = builder.instanceId;
            this.smartAGId = builder.smartAGId;
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return grantTrafficService
         */
        public Boolean getGrantTrafficService() {
            return this.grantTrafficService;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return smartAGId
         */
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public static final class Builder {
            private String ccnInstanceId; 
            private Long ccnUid; 
            private Long createTime; 
            private Boolean grantTrafficService; 
            private String instanceId; 
            private String smartAGId; 

            private Builder() {
            } 

            private Builder(GrantRule model) {
                this.ccnInstanceId = model.ccnInstanceId;
                this.ccnUid = model.ccnUid;
                this.createTime = model.createTime;
                this.grantTrafficService = model.grantTrafficService;
                this.instanceId = model.instanceId;
                this.smartAGId = model.smartAGId;
            } 

            /**
             * <p>The ID of the CCN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-hd**********</p>
             */
            public Builder ccnInstanceId(String ccnInstanceId) {
                this.ccnInstanceId = ccnInstanceId;
                return this;
            }

            /**
             * <p>The user ID (UID) of the Alibaba Cloud account to which the CCN instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder ccnUid(Long ccnUid) {
                this.ccnUid = ccnUid;
                return this;
            }

            /**
             * <p>The timestamp when the permissions were granted.</p>
             * 
             * <strong>example:</strong>
             * <p>156576751700</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the CCN instance is granted permissions to manage network traffic from the SAG instance.</p>
             * <ul>
             * <li><strong>true</strong>: granted.</li>
             * <li><strong>false</strong>: not granted.</li>
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
             * <p>The ID of the Alibaba Cloud account to which the SAG instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123455</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-hdhgn*****</p>
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            public GrantRule build() {
                return new GrantRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGrantSagRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantSagRulesResponseBody</p>
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
