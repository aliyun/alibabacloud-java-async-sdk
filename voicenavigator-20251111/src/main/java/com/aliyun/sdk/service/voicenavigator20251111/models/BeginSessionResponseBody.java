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
 * {@link BeginSessionResponseBody} extends {@link TeaModel}
 *
 * <p>BeginSessionResponseBody</p>
 */
public class BeginSessionResponseBody extends TeaModel {
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

    private BeginSessionResponseBody(Builder builder) {
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

    public static BeginSessionResponseBody create() {
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

        private Builder(BeginSessionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of OK indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. A value of 200 indicates that the HTTP request is successful.</p>
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
         * <p>The dynamic error parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The POP request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BeginSessionResponseBody build() {
            return new BeginSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BeginSessionResponseBody} extends {@link TeaModel}
     *
     * <p>BeginSessionResponseBody</p>
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
             * <p>The control parameter type. Valid values:</p>
             * <blockquote>
             * <ul>
             * <li>HangUp: Hang up.</li>
             * <li>Transfer: Transfer.</li>
             * <li>GatherDtmf: Gather DTMF.</li>
             * <li>Voice: Voice.</li>
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
     * {@link BeginSessionResponseBody} extends {@link TeaModel}
     *
     * <p>BeginSessionResponseBody</p>
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
             * <p>The chatbot reply content.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello, welcome to STO Express. How can I help you?</p>
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>The list of control parameters.</p>
             */
            public Builder controlParamsList(java.util.List<ControlParamsList> controlParamsList) {
                this.controlParamsList = controlParamsList;
                return this;
            }

            /**
             * <p>The end time.</p>
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
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1774858849987</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Specifies whether the streaming response has ended.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder streamEnd(Boolean streamEnd) {
                this.streamEnd = streamEnd;
                return this;
            }

            /**
             * <p>The turn ID of the conversation.</p>
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
