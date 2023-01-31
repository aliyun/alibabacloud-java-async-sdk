// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIntentStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIntentStatisticsResponseBody</p>
 */
public class DescribeIntentStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GlobalIntentNum")
    private Integer globalIntentNum;

    @NameInMap("GlobalIntents")
    private java.util.List < GlobalIntents> globalIntents;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("IntentsAfterNoAnswer")
    private java.util.List < IntentsAfterNoAnswer> intentsAfterNoAnswer;

    @NameInMap("Message")
    private String message;

    @NameInMap("ProcessIntentNum")
    private Integer processIntentNum;

    @NameInMap("ProcessIntents")
    private java.util.List < ProcessIntents> processIntents;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
    public java.util.List < GlobalIntents> getGlobalIntents() {
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
    public java.util.List < IntentsAfterNoAnswer> getIntentsAfterNoAnswer() {
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
    public java.util.List < ProcessIntents> getProcessIntents() {
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
        private java.util.List < GlobalIntents> globalIntents; 
        private String groupId; 
        private Integer httpStatusCode; 
        private String instanceId; 
        private java.util.List < IntentsAfterNoAnswer> intentsAfterNoAnswer; 
        private String message; 
        private Integer processIntentNum; 
        private java.util.List < ProcessIntents> processIntents; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GlobalIntentNum.
         */
        public Builder globalIntentNum(Integer globalIntentNum) {
            this.globalIntentNum = globalIntentNum;
            return this;
        }

        /**
         * GlobalIntents.
         */
        public Builder globalIntents(java.util.List < GlobalIntents> globalIntents) {
            this.globalIntents = globalIntents;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IntentsAfterNoAnswer.
         */
        public Builder intentsAfterNoAnswer(java.util.List < IntentsAfterNoAnswer> intentsAfterNoAnswer) {
            this.intentsAfterNoAnswer = intentsAfterNoAnswer;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ProcessIntentNum.
         */
        public Builder processIntentNum(Integer processIntentNum) {
            this.processIntentNum = processIntentNum;
            return this;
        }

        /**
         * ProcessIntents.
         */
        public Builder processIntents(java.util.List < ProcessIntents> processIntents) {
            this.processIntents = processIntents;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeIntentStatisticsResponseBody build() {
            return new DescribeIntentStatisticsResponseBody(this);
        } 

    } 

    public static class GlobalIntents extends TeaModel {
        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("HitAfterNoAnswer")
        private Integer hitAfterNoAnswer;

        @NameInMap("HitNum")
        private Integer hitNum;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IntentId")
        private String intentId;

        @NameInMap("IntentName")
        private String intentName;

        @NameInMap("Type")
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

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * HitAfterNoAnswer.
             */
            public Builder hitAfterNoAnswer(Integer hitAfterNoAnswer) {
                this.hitAfterNoAnswer = hitAfterNoAnswer;
                return this;
            }

            /**
             * HitNum.
             */
            public Builder hitNum(Integer hitNum) {
                this.hitNum = hitNum;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IntentId.
             */
            public Builder intentId(String intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * IntentName.
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * Type.
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
    public static class IntentsAfterNoAnswer extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        private IntentsAfterNoAnswer(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntentsAfterNoAnswer create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public IntentsAfterNoAnswer build() {
                return new IntentsAfterNoAnswer(this);
            } 

        } 

    }
    public static class ProcessIntents extends TeaModel {
        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("HitAfterNoAnswer")
        private Integer hitAfterNoAnswer;

        @NameInMap("HitNum")
        private Integer hitNum;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IntentId")
        private String intentId;

        @NameInMap("IntentName")
        private String intentName;

        @NameInMap("Type")
        private String type;

        private ProcessIntents(Builder builder) {
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

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * HitAfterNoAnswer.
             */
            public Builder hitAfterNoAnswer(Integer hitAfterNoAnswer) {
                this.hitAfterNoAnswer = hitAfterNoAnswer;
                return this;
            }

            /**
             * HitNum.
             */
            public Builder hitNum(Integer hitNum) {
                this.hitNum = hitNum;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IntentId.
             */
            public Builder intentId(String intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * IntentName.
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * Type.
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
