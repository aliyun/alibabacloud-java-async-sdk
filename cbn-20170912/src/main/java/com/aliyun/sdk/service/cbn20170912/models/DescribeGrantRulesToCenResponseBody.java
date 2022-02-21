// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGrantRulesToCenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGrantRulesToCenResponseBody</p>
 */
public class DescribeGrantRulesToCenResponseBody extends TeaModel {
    @NameInMap("GrantRules")
    private GrantRules grantRules;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGrantRulesToCenResponseBody(Builder builder) {
        this.grantRules = builder.grantRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGrantRulesToCenResponseBody create() {
        return builder().build();
    }

    /**
     * @return grantRules
     */
    public GrantRules getGrantRules() {
        return this.grantRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GrantRules grantRules; 
        private String requestId; 

        /**
         * GrantRules.
         */
        public Builder grantRules(GrantRules grantRules) {
            this.grantRules = grantRules;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGrantRulesToCenResponseBody build() {
            return new DescribeGrantRulesToCenResponseBody(this);
        } 

    } 

    public static class GrantRule extends TeaModel {
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("ChildInstanceId")
        private String childInstanceId;

        @NameInMap("ChildInstanceOwnerId")
        private Long childInstanceOwnerId;

        @NameInMap("ChildInstanceRegionId")
        private String childInstanceRegionId;

        @NameInMap("ChildInstanceType")
        private String childInstanceType;

        @NameInMap("OrderType")
        private String orderType;

        private GrantRule(Builder builder) {
            this.cenId = builder.cenId;
            this.childInstanceId = builder.childInstanceId;
            this.childInstanceOwnerId = builder.childInstanceOwnerId;
            this.childInstanceRegionId = builder.childInstanceRegionId;
            this.childInstanceType = builder.childInstanceType;
            this.orderType = builder.orderType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantRule create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return childInstanceId
         */
        public String getChildInstanceId() {
            return this.childInstanceId;
        }

        /**
         * @return childInstanceOwnerId
         */
        public Long getChildInstanceOwnerId() {
            return this.childInstanceOwnerId;
        }

        /**
         * @return childInstanceRegionId
         */
        public String getChildInstanceRegionId() {
            return this.childInstanceRegionId;
        }

        /**
         * @return childInstanceType
         */
        public String getChildInstanceType() {
            return this.childInstanceType;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        public static final class Builder {
            private String cenId; 
            private String childInstanceId; 
            private Long childInstanceOwnerId; 
            private String childInstanceRegionId; 
            private String childInstanceType; 
            private String orderType; 

            /**
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * ChildInstanceId.
             */
            public Builder childInstanceId(String childInstanceId) {
                this.childInstanceId = childInstanceId;
                return this;
            }

            /**
             * ChildInstanceOwnerId.
             */
            public Builder childInstanceOwnerId(Long childInstanceOwnerId) {
                this.childInstanceOwnerId = childInstanceOwnerId;
                return this;
            }

            /**
             * ChildInstanceRegionId.
             */
            public Builder childInstanceRegionId(String childInstanceRegionId) {
                this.childInstanceRegionId = childInstanceRegionId;
                return this;
            }

            /**
             * ChildInstanceType.
             */
            public Builder childInstanceType(String childInstanceType) {
                this.childInstanceType = childInstanceType;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            public GrantRule build() {
                return new GrantRule(this);
            } 

        } 

    }
    public static class GrantRules extends TeaModel {
        @NameInMap("GrantRule")
        private java.util.List < GrantRule> grantRule;

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
        public java.util.List < GrantRule> getGrantRule() {
            return this.grantRule;
        }

        public static final class Builder {
            private java.util.List < GrantRule> grantRule; 

            /**
             * GrantRule.
             */
            public Builder grantRule(java.util.List < GrantRule> grantRule) {
                this.grantRule = grantRule;
                return this;
            }

            public GrantRules build() {
                return new GrantRules(this);
            } 

        } 

    }
}
