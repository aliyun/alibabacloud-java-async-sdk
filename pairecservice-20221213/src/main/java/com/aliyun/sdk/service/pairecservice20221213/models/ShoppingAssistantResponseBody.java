// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ShoppingAssistantResponseBody} extends {@link TeaModel}
 *
 * <p>ShoppingAssistantResponseBody</p>
 */
public class ShoppingAssistantResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Citation")
    private Citation citation;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("StopReason")
    private String stopReason;

    private ShoppingAssistantResponseBody(Builder builder) {
        this.citation = builder.citation;
        this.content = builder.content;
        this.conversationId = builder.conversationId;
        this.errorCode = builder.errorCode;
        this.event = builder.event;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.sessionId = builder.sessionId;
        this.stopReason = builder.stopReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShoppingAssistantResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return citation
     */
    public Citation getCitation() {
        return this.citation;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return stopReason
     */
    public String getStopReason() {
        return this.stopReason;
    }

    public static final class Builder {
        private Citation citation; 
        private String content; 
        private String conversationId; 
        private String errorCode; 
        private String event; 
        private String requestId; 
        private Result result; 
        private String sessionId; 
        private String stopReason; 

        private Builder() {
        } 

        private Builder(ShoppingAssistantResponseBody model) {
            this.citation = model.citation;
            this.content = model.content;
            this.conversationId = model.conversationId;
            this.errorCode = model.errorCode;
            this.event = model.event;
            this.requestId = model.requestId;
            this.result = model.result;
            this.sessionId = model.sessionId;
            this.stopReason = model.stopReason;
        } 

        /**
         * Citation.
         */
        public Builder citation(Citation citation) {
            this.citation = citation;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Event.
         */
        public Builder event(String event) {
            this.event = event;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * StopReason.
         */
        public Builder stopReason(String stopReason) {
            this.stopReason = stopReason;
            return this;
        }

        public ShoppingAssistantResponseBody build() {
            return new ShoppingAssistantResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ShoppingAssistantResponseBody} extends {@link TeaModel}
     *
     * <p>ShoppingAssistantResponseBody</p>
     */
    public static class Citation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Citation(Builder builder) {
            this.itemId = builder.itemId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Citation create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String itemId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Citation model) {
                this.itemId = model.itemId;
                this.type = model.type;
            } 

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Citation build() {
                return new Citation(this);
            } 

        } 

    }
    /**
     * 
     * {@link ShoppingAssistantResponseBody} extends {@link TeaModel}
     *
     * <p>ShoppingAssistantResponseBody</p>
     */
    public static class ResultCitation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ResultCitation(Builder builder) {
            this.itemId = builder.itemId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultCitation create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String itemId; 
            private String type; 

            private Builder() {
            } 

            private Builder(ResultCitation model) {
                this.itemId = model.itemId;
                this.type = model.type;
            } 

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResultCitation build() {
                return new ResultCitation(this);
            } 

        } 

    }
    /**
     * 
     * {@link ShoppingAssistantResponseBody} extends {@link TeaModel}
     *
     * <p>ShoppingAssistantResponseBody</p>
     */
    public static class StepInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Step")
        private String step;

        private StepInfo(Builder builder) {
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepInfo create() {
            return builder().build();
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        public static final class Builder {
            private String step; 

            private Builder() {
            } 

            private Builder(StepInfo model) {
                this.step = model.step;
            } 

            /**
             * Step.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            public StepInfo build() {
                return new StepInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ShoppingAssistantResponseBody} extends {@link TeaModel}
     *
     * <p>ShoppingAssistantResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Citation")
        private ResultCitation citation;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("StepInfo")
        private StepInfo stepInfo;

        @com.aliyun.core.annotation.NameInMap("StopReason")
        private String stopReason;

        private Result(Builder builder) {
            this.citation = builder.citation;
            this.content = builder.content;
            this.errorCode = builder.errorCode;
            this.stepInfo = builder.stepInfo;
            this.stopReason = builder.stopReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return citation
         */
        public ResultCitation getCitation() {
            return this.citation;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return stepInfo
         */
        public StepInfo getStepInfo() {
            return this.stepInfo;
        }

        /**
         * @return stopReason
         */
        public String getStopReason() {
            return this.stopReason;
        }

        public static final class Builder {
            private ResultCitation citation; 
            private String content; 
            private String errorCode; 
            private StepInfo stepInfo; 
            private String stopReason; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.citation = model.citation;
                this.content = model.content;
                this.errorCode = model.errorCode;
                this.stepInfo = model.stepInfo;
                this.stopReason = model.stopReason;
            } 

            /**
             * Citation.
             */
            public Builder citation(ResultCitation citation) {
                this.citation = citation;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * StepInfo.
             */
            public Builder stepInfo(StepInfo stepInfo) {
                this.stepInfo = stepInfo;
                return this;
            }

            /**
             * StopReason.
             */
            public Builder stopReason(String stopReason) {
                this.stopReason = stopReason;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
