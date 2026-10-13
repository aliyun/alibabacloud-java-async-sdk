// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeIntentStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIntentStatisticsResponseBody</p>
 */
public class DescribeIntentStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GlobalIntentNum")
    private Integer globalIntentNum;

    @com.aliyun.core.annotation.NameInMap("GlobalIntents")
    private java.util.List<GlobalIntents> globalIntents;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IntentsAfterNoAnswer")
    private java.util.List<IntentsAfterNoAnswer> intentsAfterNoAnswer;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ProcessIntentNum")
    private Integer processIntentNum;

    @com.aliyun.core.annotation.NameInMap("ProcessIntents")
    private java.util.List<ProcessIntents> processIntents;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeIntentStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.globalIntentNum = builder.globalIntentNum;
        this.globalIntents = builder.globalIntents;
        this.groupId = builder.groupId;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.intentsAfterNoAnswer = builder.intentsAfterNoAnswer;
        this.message = builder.message;
        this.processIntentNum = builder.processIntentNum;
        this.processIntents = builder.processIntents;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIntentStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return globalIntentNum
     */
    public Integer getGlobalIntentNum() {
        return this.globalIntentNum;
    }

    /**
     * @return globalIntents
     */
    public java.util.List<GlobalIntents> getGlobalIntents() {
        return this.globalIntents;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return intentsAfterNoAnswer
     */
    public java.util.List<IntentsAfterNoAnswer> getIntentsAfterNoAnswer() {
        return this.intentsAfterNoAnswer;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return processIntentNum
     */
    public Integer getProcessIntentNum() {
        return this.processIntentNum;
    }

    /**
     * @return processIntents
     */
    public java.util.List<ProcessIntents> getProcessIntents() {
        return this.processIntents;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer globalIntentNum; 
        private java.util.List<GlobalIntents> globalIntents; 
        private String groupId; 
        private Integer httpStatusCode; 
        private String instanceId; 
        private java.util.List<IntentsAfterNoAnswer> intentsAfterNoAnswer; 
        private String message; 
        private Integer processIntentNum; 
        private java.util.List<ProcessIntents> processIntents; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeIntentStatisticsResponseBody model) {
            this.code = model.code;
            this.globalIntentNum = model.globalIntentNum;
            this.globalIntents = model.globalIntents;
            this.groupId = model.groupId;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceId = model.instanceId;
            this.intentsAfterNoAnswer = model.intentsAfterNoAnswer;
            this.message = model.message;
            this.processIntentNum = model.processIntentNum;
            this.processIntents = model.processIntents;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>API status code</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Total count of global intents</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder globalIntentNum(Integer globalIntentNum) {
            this.globalIntentNum = globalIntentNum;
            return this;
        }

        /**
         * <p>Global intent array</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder globalIntents(java.util.List<GlobalIntents> globalIntents) {
            this.globalIntents = globalIntents;
            return this;
        }

        /**
         * <p>Group ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0c3f352f-d045-491d-9ce7-11f2d2b7775d</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Rejected intent information list</p>
         */
        public Builder intentsAfterNoAnswer(java.util.List<IntentsAfterNoAnswer> intentsAfterNoAnswer) {
            this.intentsAfterNoAnswer = intentsAfterNoAnswer;
            return this;
        }

        /**
         * <p>API message</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Total count of flow intents</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder processIntentNum(Integer processIntentNum) {
            this.processIntentNum = processIntentNum;
            return this;
        }

        /**
         * <p>Intent information list</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder processIntents(java.util.List<ProcessIntents> processIntents) {
            this.processIntents = processIntents;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Success</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeIntentStatisticsResponseBody build() {
            return new DescribeIntentStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIntentStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIntentStatisticsResponseBody</p>
     */
    public static class GlobalIntents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("HitAfterNoAnswer")
        private Integer hitAfterNoAnswer;

        @com.aliyun.core.annotation.NameInMap("HitNum")
        private Integer hitNum;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        private String intentId;

        @com.aliyun.core.annotation.NameInMap("IntentName")
        private String intentName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private GlobalIntents(Builder builder) {
            this.groupId = builder.groupId;
            this.hitAfterNoAnswer = builder.hitAfterNoAnswer;
            this.hitNum = builder.hitNum;
            this.instanceId = builder.instanceId;
            this.intentId = builder.intentId;
            this.intentName = builder.intentName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalIntents create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return hitAfterNoAnswer
         */
        public Integer getHitAfterNoAnswer() {
            return this.hitAfterNoAnswer;
        }

        /**
         * @return hitNum
         */
        public Integer getHitNum() {
            return this.hitNum;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return intentId
         */
        public String getIntentId() {
            return this.intentId;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String groupId; 
            private Integer hitAfterNoAnswer; 
            private Integer hitNum; 
            private String instanceId; 
            private String intentId; 
            private String intentName; 
            private String type; 

            private Builder() {
            } 

            private Builder(GlobalIntents model) {
                this.groupId = model.groupId;
                this.hitAfterNoAnswer = model.hitAfterNoAnswer;
                this.hitNum = model.hitNum;
                this.instanceId = model.instanceId;
                this.intentId = model.intentId;
                this.intentName = model.intentName;
                this.type = model.type;
            } 

            /**
             * <p>Task group ID</p>
             * 
             * <strong>example:</strong>
             * <p>0c3f352f-d045-491d-9ce7-11f2d2b7775d</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Hit after no acknowledgement</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hitAfterNoAnswer(Integer hitAfterNoAnswer) {
                this.hitAfterNoAnswer = hitAfterNoAnswer;
                return this;
            }

            /**
             * <p>Hit count</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder hitNum(Integer hitNum) {
                this.hitNum = hitNum;
                return this;
            }

            /**
             * <p>Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Intent ID</p>
             * 
             * <strong>example:</strong>
             * <p>21343425</p>
             */
            public Builder intentId(String intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * <p>Intent name</p>
             * 
             * <strong>example:</strong>
             * <p>请假意图</p>
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * <p>Type</p>
             * <p>GlobalIntent(0): Global intent</p>
             * <p>ProcessIntent(1): Flow intent</p>
             * 
             * <strong>example:</strong>
             * <p>GlobalIntent</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public GlobalIntents build() {
                return new GlobalIntents(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIntentStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIntentStatisticsResponseBody</p>
     */
    public static class IntentsAfterNoAnswer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("HitAfterNoAnswer")
        private Integer hitAfterNoAnswer;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        private String intentId;

        @com.aliyun.core.annotation.NameInMap("IntentName")
        private String intentName;

        private IntentsAfterNoAnswer(Builder builder) {
            this.groupId = builder.groupId;
            this.hitAfterNoAnswer = builder.hitAfterNoAnswer;
            this.instanceId = builder.instanceId;
            this.intentId = builder.intentId;
            this.intentName = builder.intentName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntentsAfterNoAnswer create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return hitAfterNoAnswer
         */
        public Integer getHitAfterNoAnswer() {
            return this.hitAfterNoAnswer;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return intentId
         */
        public String getIntentId() {
            return this.intentId;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        public static final class Builder {
            private String groupId; 
            private Integer hitAfterNoAnswer; 
            private String instanceId; 
            private String intentId; 
            private String intentName; 

            private Builder() {
            } 

            private Builder(IntentsAfterNoAnswer model) {
                this.groupId = model.groupId;
                this.hitAfterNoAnswer = model.hitAfterNoAnswer;
                this.instanceId = model.instanceId;
                this.intentId = model.intentId;
                this.intentName = model.intentName;
            } 

            /**
             * <p>Task group ID</p>
             * 
             * <strong>example:</strong>
             * <p>b24d321a-2a74-4dd1-a0ba-4ab09cef6652</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>No acknowledgement is received after a hit.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hitAfterNoAnswer(Integer hitAfterNoAnswer) {
                this.hitAfterNoAnswer = hitAfterNoAnswer;
                return this;
            }

            /**
             * <p>Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Intent ID</p>
             * 
             * <strong>example:</strong>
             * <p>10398032</p>
             */
            public Builder intentId(String intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * <p>Intent name</p>
             * 
             * <strong>example:</strong>
             * <p>请假意图</p>
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            public IntentsAfterNoAnswer build() {
                return new IntentsAfterNoAnswer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIntentStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIntentStatisticsResponseBody</p>
     */
    public static class ProcessIntents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("HitAfterNoAnswer")
        private Integer hitAfterNoAnswer;

        @com.aliyun.core.annotation.NameInMap("HitNum")
        private Integer hitNum;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        private String intentId;

        @com.aliyun.core.annotation.NameInMap("IntentName")
        private String intentName;

        @com.aliyun.core.annotation.NameInMap("RateDisplay")
        private String rateDisplay;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ProcessIntents(Builder builder) {
            this.groupId = builder.groupId;
            this.hitAfterNoAnswer = builder.hitAfterNoAnswer;
            this.hitNum = builder.hitNum;
            this.instanceId = builder.instanceId;
            this.intentId = builder.intentId;
            this.intentName = builder.intentName;
            this.rateDisplay = builder.rateDisplay;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessIntents create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return hitAfterNoAnswer
         */
        public Integer getHitAfterNoAnswer() {
            return this.hitAfterNoAnswer;
        }

        /**
         * @return hitNum
         */
        public Integer getHitNum() {
            return this.hitNum;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return intentId
         */
        public String getIntentId() {
            return this.intentId;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        /**
         * @return rateDisplay
         */
        public String getRateDisplay() {
            return this.rateDisplay;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String groupId; 
            private Integer hitAfterNoAnswer; 
            private Integer hitNum; 
            private String instanceId; 
            private String intentId; 
            private String intentName; 
            private String rateDisplay; 
            private String type; 

            private Builder() {
            } 

            private Builder(ProcessIntents model) {
                this.groupId = model.groupId;
                this.hitAfterNoAnswer = model.hitAfterNoAnswer;
                this.hitNum = model.hitNum;
                this.instanceId = model.instanceId;
                this.intentId = model.intentId;
                this.intentName = model.intentName;
                this.rateDisplay = model.rateDisplay;
                this.type = model.type;
            } 

            /**
             * <p>Task group ID</p>
             * 
             * <strong>example:</strong>
             * <p>0c3f352f-d045-491d-9ce7-11f2d2b7775d</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Hit after no acknowledgement</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hitAfterNoAnswer(Integer hitAfterNoAnswer) {
                this.hitAfterNoAnswer = hitAfterNoAnswer;
                return this;
            }

            /**
             * <p>Hit count</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder hitNum(Integer hitNum) {
                this.hitNum = hitNum;
                return this;
            }

            /**
             * <p>Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Intent ID</p>
             * 
             * <strong>example:</strong>
             * <p>12343</p>
             */
            public Builder intentId(String intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * <p>Intent name</p>
             * 
             * <strong>example:</strong>
             * <p>请假意图</p>
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * <p>Percentage</p>
             * 
             * <strong>example:</strong>
             * <p>33.33%</p>
             */
            public Builder rateDisplay(String rateDisplay) {
                this.rateDisplay = rateDisplay;
                return this;
            }

            /**
             * <p>Type</p>
             * <ul>
             * <li><p>GlobalIntent(0): Global intent</p>
             * </li>
             * <li><p>ProcessIntent(1): Flow intent</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ProcessIntent</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ProcessIntents build() {
                return new ProcessIntents(this);
            } 

        } 

    }
}
