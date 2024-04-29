// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRuleTargetAllResponseBody} extends {@link TeaModel}
 *
 * <p>ListRuleTargetAllResponseBody</p>
 */
public class ListRuleTargetAllResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleTargetList")
    private java.util.List < RuleTargetList> ruleTargetList;

    private ListRuleTargetAllResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleTargetList = builder.ruleTargetList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRuleTargetAllResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleTargetList
     */
    public java.util.List < RuleTargetList> getRuleTargetList() {
        return this.ruleTargetList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RuleTargetList> ruleTargetList; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the network objects.
         */
        public Builder ruleTargetList(java.util.List < RuleTargetList> ruleTargetList) {
            this.ruleTargetList = ruleTargetList;
            return this;
        }

        public ListRuleTargetAllResponseBody build() {
            return new ListRuleTargetAllResponseBody(this);
        } 

    } 

    public static class RuleTargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetId")
        private Long targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private RuleTargetList(Builder builder) {
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleTargetList create() {
            return builder().build();
        }

        /**
         * @return targetId
         */
        public Long getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private Long targetId; 
            private String targetName; 
            private String targetType; 

            /**
             * The ID of the network object.
             */
            public Builder targetId(Long targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The name of the network object.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * The type of the object. Valid values:
             * <p>
             * 
             * *   IMAGE
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public RuleTargetList build() {
                return new RuleTargetList(this);
            } 

        } 

    }
}
