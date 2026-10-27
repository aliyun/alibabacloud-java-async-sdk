// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link DialogueResponseBody} extends {@link TeaModel}
 *
 * <p>DialogueResponseBody</p>
 */
public class DialogueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DialogueResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DialogueResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DialogueResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of <code>OK</code> indicates that the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business-specific data returned by the operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. A value of <code>200</code> indicates a successful response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The HTTP response message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The parameters associated with an error.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DB8BA95-4513-54B9-9C67-A28909CFB4AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DialogueResponseBody build() {
            return new DialogueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DialogueResponseBody} extends {@link TeaModel}
     *
     * <p>DialogueResponseBody</p>
     */
    public static class ControlParamsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ControlParamsList(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlParamsList create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            private Builder() {
            } 

            private Builder(ControlParamsList model) {
                this.type = model.type;
            } 

            /**
             * <p>The type of the control parameter.</p>
             * <blockquote>
             * <ul>
             * <li><p><code>HangUp</code>: Hang up.</p>
             * </li>
             * <li><p><code>Transfer</code>: Transfer.</p>
             * </li>
             * <li><p><code>GatherDtmf</code>: Gather DTMF.</p>
             * </li>
             * <li><p><code>Voice</code>: Voice.</p>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Voice</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ControlParamsList build() {
                return new ControlParamsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DialogueResponseBody} extends {@link TeaModel}
     *
     * <p>DialogueResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("ControlParamsList")
        private java.util.List<ControlParamsList> controlParamsList;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StreamEnd")
        private Boolean streamEnd;

        @com.aliyun.core.annotation.NameInMap("StreamId")
        private String streamId;

        private Data(Builder builder) {
            this.answer = builder.answer;
            this.controlParamsList = builder.controlParamsList;
            this.endTime = builder.endTime;
            this.sessionId = builder.sessionId;
            this.startTime = builder.startTime;
            this.streamEnd = builder.streamEnd;
            this.streamId = builder.streamId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return controlParamsList
         */
        public java.util.List<ControlParamsList> getControlParamsList() {
            return this.controlParamsList;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return streamEnd
         */
        public Boolean getStreamEnd() {
            return this.streamEnd;
        }

        /**
         * @return streamId
         */
        public String getStreamId() {
            return this.streamId;
        }

        public static final class Builder {
            private String answer; 
            private java.util.List<ControlParamsList> controlParamsList; 
            private Long endTime; 
            private String sessionId; 
            private Long startTime; 
            private Boolean streamEnd; 
            private String streamId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.answer = model.answer;
                this.controlParamsList = model.controlParamsList;
                this.endTime = model.endTime;
                this.sessionId = model.sessionId;
                this.startTime = model.startTime;
                this.streamEnd = model.streamEnd;
                this.streamId = model.streamId;
            } 

            /**
             * <p>The bot\&quot;s reply.</p>
             * 
             * <strong>example:</strong>
             * <p>不好意思，我没听</p>
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>A list of control parameters.</p>
             */
            public Builder controlParamsList(java.util.List<ControlParamsList> controlParamsList) {
                this.controlParamsList = controlParamsList;
                return this;
            }

            /**
             * <p>The Unix timestamp for when the operation ended.</p>
             * 
             * <strong>example:</strong>
             * <p>1752283603978</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>07d72ea0-6e38-48d4-8371-14deaaba996f</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The Unix timestamp for when the operation started.</p>
             * 
             * <strong>example:</strong>
             * <p>1774858849987</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>A flag that indicates whether the stream has ended. A value of <code>true</code> signifies the end of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder streamEnd(Boolean streamEnd) {
                this.streamEnd = streamEnd;
                return this;
            }

            /**
             * <p>The stream ID for the conversational turn.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder streamId(String streamId) {
                this.streamId = streamId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
