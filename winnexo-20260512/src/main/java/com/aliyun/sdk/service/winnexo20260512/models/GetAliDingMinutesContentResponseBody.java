// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetAliDingMinutesContentResponseBody} extends {@link TeaModel}
 *
 * <p>GetAliDingMinutesContentResponseBody</p>
 */
public class GetAliDingMinutesContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("minutesId")
    private String minutesId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("todoContent")
    private String todoContent;

    @com.aliyun.core.annotation.NameInMap("transcription")
    private java.util.List<Transcription> transcription;

    private GetAliDingMinutesContentResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.minutesId = builder.minutesId;
        this.requestId = builder.requestId;
        this.summary = builder.summary;
        this.title = builder.title;
        this.todoContent = builder.todoContent;
        this.transcription = builder.transcription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAliDingMinutesContentResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return minutesId
     */
    public String getMinutesId() {
        return this.minutesId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return todoContent
     */
    public String getTodoContent() {
        return this.todoContent;
    }

    /**
     * @return transcription
     */
    public java.util.List<Transcription> getTranscription() {
        return this.transcription;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String minutesId; 
        private String requestId; 
        private String summary; 
        private String title; 
        private String todoContent; 
        private java.util.List<Transcription> transcription; 

        private Builder() {
        } 

        private Builder(GetAliDingMinutesContentResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.minutesId = model.minutesId;
            this.requestId = model.requestId;
            this.summary = model.summary;
            this.title = model.title;
            this.todoContent = model.todoContent;
            this.transcription = model.transcription;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The DingTalk minutes ID.</p>
         * 
         * <strong>example:</strong>
         * <p>76327569643231383535353939365f3436383537393431335f32</p>
         */
        public Builder minutesId(String minutesId) {
            this.minutesId = minutesId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-id</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The intelligent meeting summary content.</p>
         * 
         * <strong>example:</strong>
         * <h1>Meeting Summary</h1>
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>The new session title.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly Project Meeting</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The to-do item details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dingtalkTodoList&quot;:[]}</p>
         */
        public Builder todoContent(String todoContent) {
            this.todoContent = todoContent;
            return this;
        }

        /**
         * <p>The speech-type execution parameters.</p>
         */
        public Builder transcription(java.util.List<Transcription> transcription) {
            this.transcription = transcription;
            return this;
        }

        public GetAliDingMinutesContentResponseBody build() {
            return new GetAliDingMinutesContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAliDingMinutesContentResponseBody} extends {@link TeaModel}
     *
     * <p>GetAliDingMinutesContentResponseBody</p>
     */
    public static class Transcription extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("speaker")
        private String speaker;

        @com.aliyun.core.annotation.NameInMap("speakerAvatar")
        private String speakerAvatar;

        @com.aliyun.core.annotation.NameInMap("timeEnd")
        private Long timeEnd;

        @com.aliyun.core.annotation.NameInMap("timeStart")
        private Long timeStart;

        private Transcription(Builder builder) {
            this.content = builder.content;
            this.speaker = builder.speaker;
            this.speakerAvatar = builder.speakerAvatar;
            this.timeEnd = builder.timeEnd;
            this.timeStart = builder.timeStart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transcription create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return speaker
         */
        public String getSpeaker() {
            return this.speaker;
        }

        /**
         * @return speakerAvatar
         */
        public String getSpeakerAvatar() {
            return this.speakerAvatar;
        }

        /**
         * @return timeEnd
         */
        public Long getTimeEnd() {
            return this.timeEnd;
        }

        /**
         * @return timeStart
         */
        public Long getTimeStart() {
            return this.timeStart;
        }

        public static final class Builder {
            private String content; 
            private String speaker; 
            private String speakerAvatar; 
            private Long timeEnd; 
            private Long timeStart; 

            private Builder() {
            } 

            private Builder(Transcription model) {
                this.content = model.content;
                this.speaker = model.speaker;
                this.speakerAvatar = model.speakerAvatar;
                this.timeEnd = model.timeEnd;
                this.timeStart = model.timeStart;
            } 

            /**
             * <p>The returned content.</p>
             * 
             * <strong>example:</strong>
             * <p>Meeting started</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The speaker.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder speaker(String speaker) {
                this.speaker = speaker;
                return this;
            }

            /**
             * <p>The avatar of the speaker. An empty string is returned if no avatar is available.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://robject.oss-cn-shanghai.aliyuncs.com/robject-daily1/">https://robject.oss-cn-shanghai.aliyuncs.com/robject-daily1/</a></p>
             */
            public Builder speakerAvatar(String speakerAvatar) {
                this.speakerAvatar = speakerAvatar;
                return this;
            }

            /**
             * <p>The end time of the segment.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder timeEnd(Long timeEnd) {
                this.timeEnd = timeEnd;
                return this;
            }

            /**
             * <p>The start time of the segment.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder timeStart(Long timeStart) {
                this.timeStart = timeStart;
                return this;
            }

            public Transcription build() {
                return new Transcription(this);
            } 

        } 

    }
}
