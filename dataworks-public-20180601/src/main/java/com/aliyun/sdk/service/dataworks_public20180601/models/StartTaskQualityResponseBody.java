// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTaskQualityResponseBody} extends {@link TeaModel}
 *
 * <p>StartTaskQualityResponseBody</p>
 */
public class StartTaskQualityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReturnCode")
    private String returnCode;

    @com.aliyun.core.annotation.NameInMap("ReturnValue")
    private ReturnValue returnValue;

    private StartTaskQualityResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.returnCode = builder.returnCode;
        this.returnValue = builder.returnValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartTaskQualityResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return returnCode
     */
    public String getReturnCode() {
        return this.returnCode;
    }

    /**
     * @return returnValue
     */
    public ReturnValue getReturnValue() {
        return this.returnValue;
    }

    public static final class Builder {
        private String requestId; 
        private String returnCode; 
        private ReturnValue returnValue; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReturnCode.
         */
        public Builder returnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }

        /**
         * ReturnValue.
         */
        public Builder returnValue(ReturnValue returnValue) {
            this.returnValue = returnValue;
            return this;
        }

        public StartTaskQualityResponseBody build() {
            return new StartTaskQualityResponseBody(this);
        } 

    } 

    public static class StrongMethodSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColName")
        private String colName;

        @com.aliyun.core.annotation.NameInMap("IsColRule")
        private Boolean isColRule;

        @com.aliyun.core.annotation.NameInMap("IsSqlRule")
        private Boolean isSqlRule;

        @com.aliyun.core.annotation.NameInMap("IsStrongRule")
        private Boolean isStrongRule;

        @com.aliyun.core.annotation.NameInMap("MethodName")
        private String methodName;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private StrongMethodSet(Builder builder) {
            this.colName = builder.colName;
            this.isColRule = builder.isColRule;
            this.isSqlRule = builder.isSqlRule;
            this.isStrongRule = builder.isStrongRule;
            this.methodName = builder.methodName;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StrongMethodSet create() {
            return builder().build();
        }

        /**
         * @return colName
         */
        public String getColName() {
            return this.colName;
        }

        /**
         * @return isColRule
         */
        public Boolean getIsColRule() {
            return this.isColRule;
        }

        /**
         * @return isSqlRule
         */
        public Boolean getIsSqlRule() {
            return this.isSqlRule;
        }

        /**
         * @return isStrongRule
         */
        public Boolean getIsStrongRule() {
            return this.isStrongRule;
        }

        /**
         * @return methodName
         */
        public String getMethodName() {
            return this.methodName;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String colName; 
            private Boolean isColRule; 
            private Boolean isSqlRule; 
            private Boolean isStrongRule; 
            private String methodName; 
            private Long ruleId; 

            /**
             * ColName.
             */
            public Builder colName(String colName) {
                this.colName = colName;
                return this;
            }

            /**
             * IsColRule.
             */
            public Builder isColRule(Boolean isColRule) {
                this.isColRule = isColRule;
                return this;
            }

            /**
             * IsSqlRule.
             */
            public Builder isSqlRule(Boolean isSqlRule) {
                this.isSqlRule = isSqlRule;
                return this;
            }

            /**
             * IsStrongRule.
             */
            public Builder isStrongRule(Boolean isStrongRule) {
                this.isStrongRule = isStrongRule;
                return this;
            }

            /**
             * MethodName.
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public StrongMethodSet build() {
                return new StrongMethodSet(this);
            } 

        } 

    }
    public static class WeakMethodSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColName")
        private String colName;

        @com.aliyun.core.annotation.NameInMap("IsColRule")
        private Boolean isColRule;

        @com.aliyun.core.annotation.NameInMap("IsSqlRule")
        private Boolean isSqlRule;

        @com.aliyun.core.annotation.NameInMap("IsStrongRule")
        private Boolean isStrongRule;

        @com.aliyun.core.annotation.NameInMap("MethodName")
        private String methodName;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private WeakMethodSet(Builder builder) {
            this.colName = builder.colName;
            this.isColRule = builder.isColRule;
            this.isSqlRule = builder.isSqlRule;
            this.isStrongRule = builder.isStrongRule;
            this.methodName = builder.methodName;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeakMethodSet create() {
            return builder().build();
        }

        /**
         * @return colName
         */
        public String getColName() {
            return this.colName;
        }

        /**
         * @return isColRule
         */
        public Boolean getIsColRule() {
            return this.isColRule;
        }

        /**
         * @return isSqlRule
         */
        public Boolean getIsSqlRule() {
            return this.isSqlRule;
        }

        /**
         * @return isStrongRule
         */
        public Boolean getIsStrongRule() {
            return this.isStrongRule;
        }

        /**
         * @return methodName
         */
        public String getMethodName() {
            return this.methodName;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String colName; 
            private Boolean isColRule; 
            private Boolean isSqlRule; 
            private Boolean isStrongRule; 
            private String methodName; 
            private Long ruleId; 

            /**
             * ColName.
             */
            public Builder colName(String colName) {
                this.colName = colName;
                return this;
            }

            /**
             * IsColRule.
             */
            public Builder isColRule(Boolean isColRule) {
                this.isColRule = isColRule;
                return this;
            }

            /**
             * IsSqlRule.
             */
            public Builder isSqlRule(Boolean isSqlRule) {
                this.isSqlRule = isSqlRule;
                return this;
            }

            /**
             * IsStrongRule.
             */
            public Builder isStrongRule(Boolean isStrongRule) {
                this.isStrongRule = isStrongRule;
                return this;
            }

            /**
             * MethodName.
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public WeakMethodSet build() {
                return new WeakMethodSet(this);
            } 

        } 

    }
    public static class ReturnValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualExpression")
        private String actualExpression;

        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("CallbackUrl")
        private String callbackUrl;

        @com.aliyun.core.annotation.NameInMap("Connection")
        private String connection;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private Long entityId;

        @com.aliyun.core.annotation.NameInMap("MatchExpression")
        private String matchExpression;

        @com.aliyun.core.annotation.NameInMap("PluginName")
        private String pluginName;

        @com.aliyun.core.annotation.NameInMap("StatisticsFlag")
        private Long statisticsFlag;

        @com.aliyun.core.annotation.NameInMap("StrongMethodSet")
        private java.util.List < StrongMethodSet> strongMethodSet;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TriggerFlag")
        private Long triggerFlag;

        @com.aliyun.core.annotation.NameInMap("WeakMethodSet")
        private java.util.List < WeakMethodSet> weakMethodSet;

        private ReturnValue(Builder builder) {
            this.actualExpression = builder.actualExpression;
            this.bizDate = builder.bizDate;
            this.callbackUrl = builder.callbackUrl;
            this.connection = builder.connection;
            this.entityId = builder.entityId;
            this.matchExpression = builder.matchExpression;
            this.pluginName = builder.pluginName;
            this.statisticsFlag = builder.statisticsFlag;
            this.strongMethodSet = builder.strongMethodSet;
            this.tableGuid = builder.tableGuid;
            this.taskId = builder.taskId;
            this.triggerFlag = builder.triggerFlag;
            this.weakMethodSet = builder.weakMethodSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReturnValue create() {
            return builder().build();
        }

        /**
         * @return actualExpression
         */
        public String getActualExpression() {
            return this.actualExpression;
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return callbackUrl
         */
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        /**
         * @return connection
         */
        public String getConnection() {
            return this.connection;
        }

        /**
         * @return entityId
         */
        public Long getEntityId() {
            return this.entityId;
        }

        /**
         * @return matchExpression
         */
        public String getMatchExpression() {
            return this.matchExpression;
        }

        /**
         * @return pluginName
         */
        public String getPluginName() {
            return this.pluginName;
        }

        /**
         * @return statisticsFlag
         */
        public Long getStatisticsFlag() {
            return this.statisticsFlag;
        }

        /**
         * @return strongMethodSet
         */
        public java.util.List < StrongMethodSet> getStrongMethodSet() {
            return this.strongMethodSet;
        }

        /**
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return triggerFlag
         */
        public Long getTriggerFlag() {
            return this.triggerFlag;
        }

        /**
         * @return weakMethodSet
         */
        public java.util.List < WeakMethodSet> getWeakMethodSet() {
            return this.weakMethodSet;
        }

        public static final class Builder {
            private String actualExpression; 
            private String bizDate; 
            private String callbackUrl; 
            private String connection; 
            private Long entityId; 
            private String matchExpression; 
            private String pluginName; 
            private Long statisticsFlag; 
            private java.util.List < StrongMethodSet> strongMethodSet; 
            private String tableGuid; 
            private String taskId; 
            private Long triggerFlag; 
            private java.util.List < WeakMethodSet> weakMethodSet; 

            /**
             * ActualExpression.
             */
            public Builder actualExpression(String actualExpression) {
                this.actualExpression = actualExpression;
                return this;
            }

            /**
             * BizDate.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * CallbackUrl.
             */
            public Builder callbackUrl(String callbackUrl) {
                this.callbackUrl = callbackUrl;
                return this;
            }

            /**
             * Connection.
             */
            public Builder connection(String connection) {
                this.connection = connection;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * MatchExpression.
             */
            public Builder matchExpression(String matchExpression) {
                this.matchExpression = matchExpression;
                return this;
            }

            /**
             * PluginName.
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * StatisticsFlag.
             */
            public Builder statisticsFlag(Long statisticsFlag) {
                this.statisticsFlag = statisticsFlag;
                return this;
            }

            /**
             * StrongMethodSet.
             */
            public Builder strongMethodSet(java.util.List < StrongMethodSet> strongMethodSet) {
                this.strongMethodSet = strongMethodSet;
                return this;
            }

            /**
             * TableGuid.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TriggerFlag.
             */
            public Builder triggerFlag(Long triggerFlag) {
                this.triggerFlag = triggerFlag;
                return this;
            }

            /**
             * WeakMethodSet.
             */
            public Builder weakMethodSet(java.util.List < WeakMethodSet> weakMethodSet) {
                this.weakMethodSet = weakMethodSet;
                return this;
            }

            public ReturnValue build() {
                return new ReturnValue(this);
            } 

        } 

    }
}
