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
 * {@link DescribeGrantSagVbrRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGrantSagVbrRulesResponseBody</p>
 */
public class DescribeGrantSagVbrRulesResponseBody extends TeaModel {
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

    private DescribeGrantSagVbrRulesResponseBody(Builder builder) {
        this.grantRules = builder.grantRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGrantSagVbrRulesResponseBody create() {
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

        private Builder(DescribeGrantSagVbrRulesResponseBody model) {
            this.grantRules = model.grantRules;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the authorization rule.</p>
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
         * <p>The number of entries returned per page.</p>
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
         * <p>46E98E69-FBA2-423E-9E5A-A3C6D843FED1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of authorization rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGrantSagVbrRulesResponseBody build() {
            return new DescribeGrantSagVbrRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGrantSagVbrRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantSagVbrRulesResponseBody</p>
     */
    public static class GrantRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bound")
        private Boolean bound;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        private String smartAGId;

        @com.aliyun.core.annotation.NameInMap("SmartAGUid")
        private Long smartAGUid;

        @com.aliyun.core.annotation.NameInMap("VbrInstanceId")
        private String vbrInstanceId;

        @com.aliyun.core.annotation.NameInMap("VbrRegionId")
        private String vbrRegionId;

        @com.aliyun.core.annotation.NameInMap("VbrUid")
        private Long vbrUid;

        private GrantRule(Builder builder) {
            this.bound = builder.bound;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.smartAGId = builder.smartAGId;
            this.smartAGUid = builder.smartAGUid;
            this.vbrInstanceId = builder.vbrInstanceId;
            this.vbrRegionId = builder.vbrRegionId;
            this.vbrUid = builder.vbrUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantRule create() {
            return builder().build();
        }

        /**
         * @return bound
         */
        public Boolean getBound() {
            return this.bound;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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

        /**
         * @return smartAGUid
         */
        public Long getSmartAGUid() {
            return this.smartAGUid;
        }

        /**
         * @return vbrInstanceId
         */
        public String getVbrInstanceId() {
            return this.vbrInstanceId;
        }

        /**
         * @return vbrRegionId
         */
        public String getVbrRegionId() {
            return this.vbrRegionId;
        }

        /**
         * @return vbrUid
         */
        public Long getVbrUid() {
            return this.vbrUid;
        }

        public static final class Builder {
            private Boolean bound; 
            private Long createTime; 
            private String instanceId; 
            private String smartAGId; 
            private Long smartAGUid; 
            private String vbrInstanceId; 
            private String vbrRegionId; 
            private Long vbrUid; 

            private Builder() {
            } 

            private Builder(GrantRule model) {
                this.bound = model.bound;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.smartAGId = model.smartAGId;
                this.smartAGUid = model.smartAGUid;
                this.vbrInstanceId = model.vbrInstanceId;
                this.vbrRegionId = model.vbrRegionId;
                this.vbrUid = model.vbrUid;
            } 

            /**
             * <p>Indicates whether the SAG instance is associated with the VBR. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: not associated.</li>
             * <li><strong>true</strong>: associated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder bound(Boolean bound) {
                this.bound = bound;
                return this;
            }

            /**
             * <p>The time when the rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1600743723000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>sgv-3x8djyem7vqh70****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-0nnteglltw6z4b****</p>
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            /**
             * <p>The user ID (UID) of the account to which the SAG instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1231571212121212</p>
             */
            public Builder smartAGUid(Long smartAGUid) {
                this.smartAGUid = smartAGUid;
                return this;
            }

            /**
             * <p>The ID of the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-bp13gtbhdp0pfqg6s****</p>
             */
            public Builder vbrInstanceId(String vbrInstanceId) {
                this.vbrInstanceId = vbrInstanceId;
                return this;
            }

            /**
             * <p>The ID of the region where the VBR is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder vbrRegionId(String vbrRegionId) {
                this.vbrRegionId = vbrRegionId;
                return this;
            }

            /**
             * <p>The user ID (UID) of the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>1231571212121212</p>
             */
            public Builder vbrUid(Long vbrUid) {
                this.vbrUid = vbrUid;
                return this;
            }

            public GrantRule build() {
                return new GrantRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGrantSagVbrRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantSagVbrRulesResponseBody</p>
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
