// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListRuleTargetAllResponseBody} extends {@link TeaModel}
 *
 * <p>ListRuleTargetAllResponseBody</p>
 */
public class ListRuleTargetAllResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleTargetList")
    private java.util.List<RuleTargetList> ruleTargetList;

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
    public java.util.List<RuleTargetList> getRuleTargetList() {
        return this.ruleTargetList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RuleTargetList> ruleTargetList; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>30CBF632-109F-596F-97F2-451C8B2A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the network objects.</p>
         */
        public Builder ruleTargetList(java.util.List<RuleTargetList> ruleTargetList) {
            this.ruleTargetList = ruleTargetList;
            return this;
        }

        public ListRuleTargetAllResponseBody build() {
            return new ListRuleTargetAllResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRuleTargetAllResponseBody} extends {@link TeaModel}
     *
     * <p>ListRuleTargetAllResponseBody</p>
     */
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
             * <p>The ID of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>301944</p>
             */
            public Builder targetId(Long targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>source-test-obj-xFKcx</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the object. Valid values:</p>
             * <ul>
             * <li>IMAGE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
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
