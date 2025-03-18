// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link RunDocQaResponseBody} extends {@link TeaModel}
 *
 * <p>RunDocQaResponseBody</p>
 */
public class RunDocQaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Header")
    private RunDocQaResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunDocQaResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDocQaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return header
     */
    public RunDocQaResponseBodyHeader getHeader() {
        return this.header;
    }

    /**
     * @return payload
     */
    public Payload getPayload() {
        return this.payload;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RunDocQaResponseBodyHeader header; 
        private Payload payload; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunDocQaResponseBody model) {
            this.header = model.header;
            this.payload = model.payload;
            this.requestId = model.requestId;
        } 

        /**
         * Header.
         */
        public Builder header(RunDocQaResponseBodyHeader header) {
            this.header = header;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(Payload payload) {
            this.payload = payload;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunDocQaResponseBody build() {
            return new RunDocQaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunDocQaResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocQaResponseBody</p>
     */
    public static class RunDocQaResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("EventInfo")
        private String eventInfo;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private RunDocQaResponseBodyHeader(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.eventInfo = builder.eventInfo;
            this.sessionId = builder.sessionId;
            this.taskId = builder.taskId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunDocQaResponseBodyHeader create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventInfo
         */
        public String getEventInfo() {
            return this.eventInfo;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String event; 
            private String eventInfo; 
            private String sessionId; 
            private String taskId; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(RunDocQaResponseBodyHeader model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.event = model.event;
                this.eventInfo = model.eventInfo;
                this.sessionId = model.sessionId;
                this.taskId = model.taskId;
                this.traceId = model.traceId;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
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
             * EventInfo.
             */
            public Builder eventInfo(String eventInfo) {
                this.eventInfo = eventInfo;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public RunDocQaResponseBodyHeader build() {
                return new RunDocQaResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDocQaResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocQaResponseBody</p>
     */
    public static class ClipInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        private ClipInfos(Builder builder) {
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClipInfos create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        public static final class Builder {
            private Double from; 
            private Double to; 

            private Builder() {
            } 

            private Builder(ClipInfos model) {
                this.from = model.from;
                this.to = model.to;
            } 

            /**
             * From.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * To.
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            public ClipInfos build() {
                return new ClipInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDocQaResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocQaResponseBody</p>
     */
    public static class MediaUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipInfos")
        private java.util.List<ClipInfos> clipInfos;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        private MediaUrlList(Builder builder) {
            this.clipInfos = builder.clipInfos;
            this.fileUrl = builder.fileUrl;
            this.mediaType = builder.mediaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaUrlList create() {
            return builder().build();
        }

        /**
         * @return clipInfos
         */
        public java.util.List<ClipInfos> getClipInfos() {
            return this.clipInfos;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        public static final class Builder {
            private java.util.List<ClipInfos> clipInfos; 
            private String fileUrl; 
            private String mediaType; 

            private Builder() {
            } 

            private Builder(MediaUrlList model) {
                this.clipInfos = model.clipInfos;
                this.fileUrl = model.fileUrl;
                this.mediaType = model.mediaType;
            } 

            /**
             * ClipInfos.
             */
            public Builder clipInfos(java.util.List<ClipInfos> clipInfos) {
                this.clipInfos = clipInfos;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            public MediaUrlList build() {
                return new MediaUrlList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDocQaResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocQaResponseBody</p>
     */
    public static class Recommends extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Recommends(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recommends create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Recommends model) {
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Recommends build() {
                return new Recommends(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDocQaResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocQaResponseBody</p>
     */
    public static class References extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceDocId")
        private String sourceDocId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private References(Builder builder) {
            this.pubTime = builder.pubTime;
            this.source = builder.source;
            this.sourceDocId = builder.sourceDocId;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static References create() {
            return builder().build();
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceDocId
         */
        public String getSourceDocId() {
            return this.sourceDocId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String pubTime; 
            private String source; 
            private String sourceDocId; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(References model) {
                this.pubTime = model.pubTime;
                this.source = model.source;
                this.sourceDocId = model.sourceDocId;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceDocId.
             */
            public Builder sourceDocId(String sourceDocId) {
                this.sourceDocId = sourceDocId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public References build() {
                return new References(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDocQaResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocQaResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("InterveneContent")
        private String interveneContent;

        @com.aliyun.core.annotation.NameInMap("IsReject")
        private Boolean isReject;

        @com.aliyun.core.annotation.NameInMap("MediaUrlList")
        private java.util.List<MediaUrlList> mediaUrlList;

        @com.aliyun.core.annotation.NameInMap("Recommends")
        private java.util.List<Recommends> recommends;

        @com.aliyun.core.annotation.NameInMap("References")
        private java.util.List<References> references;

        private Output(Builder builder) {
            this.content = builder.content;
            this.interveneContent = builder.interveneContent;
            this.isReject = builder.isReject;
            this.mediaUrlList = builder.mediaUrlList;
            this.recommends = builder.recommends;
            this.references = builder.references;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return interveneContent
         */
        public String getInterveneContent() {
            return this.interveneContent;
        }

        /**
         * @return isReject
         */
        public Boolean getIsReject() {
            return this.isReject;
        }

        /**
         * @return mediaUrlList
         */
        public java.util.List<MediaUrlList> getMediaUrlList() {
            return this.mediaUrlList;
        }

        /**
         * @return recommends
         */
        public java.util.List<Recommends> getRecommends() {
            return this.recommends;
        }

        /**
         * @return references
         */
        public java.util.List<References> getReferences() {
            return this.references;
        }

        public static final class Builder {
            private String content; 
            private String interveneContent; 
            private Boolean isReject; 
            private java.util.List<MediaUrlList> mediaUrlList; 
            private java.util.List<Recommends> recommends; 
            private java.util.List<References> references; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.content = model.content;
                this.interveneContent = model.interveneContent;
                this.isReject = model.isReject;
                this.mediaUrlList = model.mediaUrlList;
                this.recommends = model.recommends;
                this.references = model.references;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * InterveneContent.
             */
            public Builder interveneContent(String interveneContent) {
                this.interveneContent = interveneContent;
                return this;
            }

            /**
             * IsReject.
             */
            public Builder isReject(Boolean isReject) {
                this.isReject = isReject;
                return this;
            }

            /**
             * MediaUrlList.
             */
            public Builder mediaUrlList(java.util.List<MediaUrlList> mediaUrlList) {
                this.mediaUrlList = mediaUrlList;
                return this;
            }

            /**
             * Recommends.
             */
            public Builder recommends(java.util.List<Recommends> recommends) {
                this.recommends = recommends;
                return this;
            }

            /**
             * References.
             */
            public Builder references(java.util.List<References> references) {
                this.references = references;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDocQaResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocQaResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

        private Usage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 
            private Long totalTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * InputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * TotalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDocQaResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocQaResponseBody</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Usage usage;

        private Payload(Builder builder) {
            this.output = builder.output;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Output output; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.output = model.output;
                this.usage = model.usage;
            } 

            /**
             * Output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
}
