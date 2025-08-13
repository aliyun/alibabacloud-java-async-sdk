// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeRuleSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleSnapshotResponseBody</p>
 */
public class DescribeRuleSnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeRuleSnapshotResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleSnapshotResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeRuleSnapshotResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeRuleSnapshotResponseBody build() {
            return new DescribeRuleSnapshotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRuleSnapshotResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRuleSnapshotResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizVersion")
        private String bizVersion;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("logicExpression")
        private String logicExpression;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("ruleActions")
        private String ruleActions;

        @com.aliyun.core.annotation.NameInMap("ruleExpressions")
        private String ruleExpressions;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ruleStatus")
        private String ruleStatus;

        private ResultObject(Builder builder) {
            this.bizVersion = builder.bizVersion;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.logicExpression = builder.logicExpression;
            this.memo = builder.memo;
            this.ruleActions = builder.ruleActions;
            this.ruleExpressions = builder.ruleExpressions;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return bizVersion
         */
        public String getBizVersion() {
            return this.bizVersion;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
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
         * @return logicExpression
         */
        public String getLogicExpression() {
            return this.logicExpression;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return ruleActions
         */
        public String getRuleActions() {
            return this.ruleActions;
        }

        /**
         * @return ruleExpressions
         */
        public String getRuleExpressions() {
            return this.ruleExpressions;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public static final class Builder {
            private String bizVersion; 
            private String eventCode; 
            private String eventName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String logicExpression; 
            private String memo; 
            private String ruleActions; 
            private String ruleExpressions; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.bizVersion = model.bizVersion;
                this.eventCode = model.eventCode;
                this.eventName = model.eventName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.logicExpression = model.logicExpression;
                this.memo = model.memo;
                this.ruleActions = model.ruleActions;
                this.ruleExpressions = model.ruleExpressions;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
            } 

            /**
             * <p>Business version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizVersion(String bizVersion) {
                this.bizVersion = bizVersion;
                return this;
            }

            /**
             * <p>Event code</p>
             * 
             * <strong>example:</strong>
             * <p>de_aszbjb7236</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>Event name.</p>
             * 
             * <strong>example:</strong>
             * <p>注册风险</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1621578648000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1565701886000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Expression for analysis results.</p>
             * 
             * <strong>example:</strong>
             * <p>1&amp;2</p>
             */
            public Builder logicExpression(String logicExpression) {
                this.logicExpression = logicExpression;
                return this;
            }

            /**
             * <p>Memo.</p>
             * 
             * <strong>example:</strong>
             * <p>备注</p>
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * <p>Rule actions.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;inputs&quot;:[&quot;LdShop&quot;],&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;actionType&quot;:&quot;TAG&quot;,&quot;outputType&quot;:&quot;const&quot;}]</p>
             */
            public Builder ruleActions(String ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * <p>Expression.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;expressionName&quot;:&quot;代下单_记录日志&quot;,&quot;itemId&quot;:1,&quot;left&quot;:{&quot;name&quot;:&quot;dhcfX2v7670&quot;},&quot;operatorCode&quot;:&quot;gte&quot;,&quot;operatorName&quot;:&quot;大于等于&quot;,&quot;right&quot;:{&quot;fieldValue&quot;:&quot;2&quot;}}]</p>
             */
            public Builder ruleExpressions(String ruleExpressions) {
                this.ruleExpressions = ruleExpressions;
                return this;
            }

            /**
             * <p>Policy ID</p>
             * 
             * <strong>example:</strong>
             * <p>101804</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Policy name</p>
             * 
             * <strong>example:</strong>
             * <p>营销风险识别</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Policy status</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
