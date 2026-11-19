// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bchat20261105.models;

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
 * {@link ChatResponseBody} extends {@link TeaModel}
 *
 * <p>ChatResponseBody</p>
 */
public class ChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("audioFrames")
    private java.util.List<AudioFrames> audioFrames;

    @com.aliyun.core.annotation.NameInMap("communication")
    private Communication communication;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("error")
    private Error error;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private Object errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ChatResponseBody(Builder builder) {
        this.audioFrames = builder.audioFrames;
        this.communication = builder.communication;
        this.data = builder.data;
        this.error = builder.error;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioFrames
     */
    public java.util.List<AudioFrames> getAudioFrames() {
        return this.audioFrames;
    }

    /**
     * @return communication
     */
    public Communication getCommunication() {
        return this.communication;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return error
     */
    public Error getError() {
        return this.error;
    }

    /**
     * @return errorCode
     */
    public Object getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AudioFrames> audioFrames; 
        private Communication communication; 
        private Data data; 
        private Error error; 
        private Object errorCode; 
        private String errorMsg; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ChatResponseBody model) {
            this.audioFrames = model.audioFrames;
            this.communication = model.communication;
            this.data = model.data;
            this.error = model.error;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The optional list of audio frames in the response. This list can be empty or omitted when no audio is present.</p>
         */
        public Builder audioFrames(java.util.List<AudioFrames> audioFrames) {
            this.audioFrames = audioFrames;
            return this;
        }

        /**
         * <p>The information used to associate the response frame with the original business request and session.</p>
         */
        public Builder communication(Communication communication) {
            this.communication = communication;
            return this;
        }

        /**
         * <p>The business data returned in the response, including messages and optional extended information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error details returned when a business call fails.</p>
         */
        public Builder error(Error error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorCode(Object errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The business status description.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The optional business request correlation ID. For the POP request ID, see x-acs-request-id.</p>
         * 
         * <strong>example:</strong>
         * <p>req-example-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ChatResponseBody build() {
            return new ChatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class AudioFrames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("last")
        private Boolean last;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private AudioFrames(Builder builder) {
            this.code = builder.code;
            this.data = builder.data;
            this.last = builder.last;
            this.message = builder.message;
            this.requestId = builder.requestId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioFrames create() {
            return builder().build();
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
        public String getData() {
            return this.data;
        }

        /**
         * @return last
         */
        public Boolean getLast() {
            return this.last;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String data; 
            private Boolean last; 
            private String message; 
            private String requestId; 
            private String type; 

            private Builder() {
            } 

            private Builder(AudioFrames model) {
                this.code = model.code;
                this.data = model.data;
                this.last = model.last;
                this.message = model.message;
                this.requestId = model.requestId;
                this.type = model.type;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>DOWNSTREAM_ERROR</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The encoded audio data.</p>
             * 
             * <strong>example:</strong>
             * <p>SUQz</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Indicates whether the frame is the last audio frame.</p>
             */
            public Builder last(Boolean last) {
                this.last = last;
                return this;
            }

            /**
             * <p>The error description.</p>
             * 
             * <strong>example:</strong>
             * <p>Speech synthesis is currently unavailable</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The business request correlation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>req-example-001</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The type of the audio or error frame.</p>
             * 
             * <strong>example:</strong>
             * <p>audio</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AudioFrames build() {
                return new AudioFrames(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class Communication extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("responseId")
        private Long responseId;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        private Communication(Builder builder) {
            this.requestId = builder.requestId;
            this.responseId = builder.responseId;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Communication create() {
            return builder().build();
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return responseId
         */
        public Long getResponseId() {
            return this.responseId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String requestId; 
            private Long responseId; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Communication model) {
                this.requestId = model.requestId;
                this.responseId = model.responseId;
                this.sessionId = model.sessionId;
            } 

            /**
             * <p>The business request ID, if present.</p>
             * 
             * <strong>example:</strong>
             * <p>req-example-001</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The identifier of the business response frame.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder responseId(Long responseId) {
                this.responseId = responseId;
                return this;
            }

            /**
             * <p>The customer session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>session-example-001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Communication build() {
                return new Communication(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class InputResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contentIndex")
        private Integer contentIndex;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private InputResources(Builder builder) {
            this.contentIndex = builder.contentIndex;
            this.fileName = builder.fileName;
            this.resourceId = builder.resourceId;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputResources create() {
            return builder().build();
        }

        /**
         * @return contentIndex
         */
        public Integer getContentIndex() {
            return this.contentIndex;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Integer contentIndex; 
            private String fileName; 
            private String resourceId; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(InputResources model) {
                this.contentIndex = model.contentIndex;
                this.fileName = model.fileName;
                this.resourceId = model.resourceId;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * <p>The position of the original content block.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder contentIndex(Integer contentIndex) {
                this.contentIndex = contentIndex;
                return this;
            }

            /**
             * <p>The file name of the transferred and stored resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cat.png</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The ID of the transferred and stored resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ws_example_001</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the transferred and stored resource.</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL of the transferred and stored resource.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cdn.example.com/uploads/cat.png">https://cdn.example.com/uploads/cat.png</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public InputResources build() {
                return new InputResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class ExtraInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputResources")
        private java.util.List<InputResources> inputResources;

        private ExtraInfo(Builder builder) {
            this.inputResources = builder.inputResources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraInfo create() {
            return builder().build();
        }

        /**
         * @return inputResources
         */
        public java.util.List<InputResources> getInputResources() {
            return this.inputResources;
        }

        public static final class Builder {
            private java.util.List<InputResources> inputResources; 

            private Builder() {
            } 

            private Builder(ExtraInfo model) {
                this.inputResources = model.inputResources;
            } 

            /**
             * <p>The transfer and storage results of the input resources for the current round.</p>
             */
            public Builder inputResources(java.util.List<InputResources> inputResources) {
                this.inputResources = inputResources;
                return this;
            }

            public ExtraInfo build() {
                return new ExtraInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class MultiLoad extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private Object content;

        @com.aliyun.core.annotation.NameInMap("sourceSeq")
        private String sourceSeq;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private MultiLoad(Builder builder) {
            this.content = builder.content;
            this.sourceSeq = builder.sourceSeq;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiLoad create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Object getContent() {
            return this.content;
        }

        /**
         * @return sourceSeq
         */
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Object content; 
            private String sourceSeq; 
            private String type; 

            private Builder() {
            } 

            private Builder(MultiLoad model) {
                this.content = model.content;
                this.sourceSeq = model.sourceSeq;
                this.type = model.type;
            } 

            /**
             * <p>The card content.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;list&quot;:[{&quot;imageUrl&quot;:&quot;<a href="https://images.example.com/cat.png%22%7D%5D%7D">https://images.example.com/cat.png&quot;}]}</a></p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The card reference identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>image_waterfall_1</p>
             */
            public Builder sourceSeq(String sourceSeq) {
                this.sourceSeq = sourceSeq;
                return this;
            }

            /**
             * <p>The card type.</p>
             * 
             * <strong>example:</strong>
             * <p>image_waterfall</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MultiLoad build() {
                return new MultiLoad(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class MetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("barTitle")
        private String barTitle;

        @com.aliyun.core.annotation.NameInMap("content")
        private Object content;

        @com.aliyun.core.annotation.NameInMap("multiLoad")
        private java.util.List<MultiLoad> multiLoad;

        @com.aliyun.core.annotation.NameInMap("sourceSeq")
        private String sourceSeq;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private MetaData(Builder builder) {
            this.barTitle = builder.barTitle;
            this.content = builder.content;
            this.multiLoad = builder.multiLoad;
            this.sourceSeq = builder.sourceSeq;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaData create() {
            return builder().build();
        }

        /**
         * @return barTitle
         */
        public String getBarTitle() {
            return this.barTitle;
        }

        /**
         * @return content
         */
        public Object getContent() {
            return this.content;
        }

        /**
         * @return multiLoad
         */
        public java.util.List<MultiLoad> getMultiLoad() {
            return this.multiLoad;
        }

        /**
         * @return sourceSeq
         */
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String barTitle; 
            private Object content; 
            private java.util.List<MultiLoad> multiLoad; 
            private String sourceSeq; 
            private String type; 

            private Builder() {
            } 

            private Builder(MetaData model) {
                this.barTitle = model.barTitle;
                this.content = model.content;
                this.multiLoad = model.multiLoad;
                this.sourceSeq = model.sourceSeq;
                this.type = model.type;
            } 

            /**
             * <p>The display title of the process module.</p>
             * 
             * <strong>example:</strong>
             * <p>Issue analysis</p>
             */
            public Builder barTitle(String barTitle) {
                this.barTitle = barTitle;
                return this;
            }

            /**
             * <p>The complete content snapshot of the process module.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;body&quot;:&quot;Analyzing the issue&quot;,&quot;status&quot;:&quot;processing&quot;}</p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The list of structured content associated with the body, such as image-text cards, returned by message type.</p>
             */
            public Builder multiLoad(java.util.List<MultiLoad> multiLoad) {
                this.multiLoad = multiLoad;
                return this;
            }

            /**
             * <p>The process module identifier within the current request.</p>
             * 
             * <strong>example:</strong>
             * <p>thinking-1</p>
             */
            public Builder sourceSeq(String sourceSeq) {
                this.sourceSeq = sourceSeq;
                return this;
            }

            /**
             * <p>The process module type.</p>
             * 
             * <strong>example:</strong>
             * <p>bar_thinking</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MetaData build() {
                return new MetaData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private Object content;

        @com.aliyun.core.annotation.NameInMap("metaData")
        private MetaData metaData;

        @com.aliyun.core.annotation.NameInMap("mimeType")
        private String mimeType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.metaData = builder.metaData;
            this.mimeType = builder.mimeType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Object getContent() {
            return this.content;
        }

        /**
         * @return metaData
         */
        public MetaData getMetaData() {
            return this.metaData;
        }

        /**
         * @return mimeType
         */
        public String getMimeType() {
            return this.mimeType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Object content; 
            private MetaData metaData; 
            private String mimeType; 
            private String status; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.metaData = model.metaData;
                this.mimeType = model.mimeType;
                this.status = model.status;
            } 

            /**
             * <p>The text or content of the corresponding message type.</p>
             * 
             * <strong>example:</strong>
             * <p>Image as follows [(image_waterfall_1)]</p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The extended metadata associated with the message.</p>
             */
            public Builder metaData(MetaData metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * <p>The message type.</p>
             * 
             * <strong>example:</strong>
             * <p>multi_load/iframe</p>
             */
            public Builder mimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }

            /**
             * <p>The business message status.</p>
             * 
             * <strong>example:</strong>
             * <p>complete</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("debug")
        private Object debug;

        @com.aliyun.core.annotation.NameInMap("extraInfo")
        private ExtraInfo extraInfo;

        @com.aliyun.core.annotation.NameInMap("messages")
        private java.util.List<Messages> messages;

        private Data(Builder builder) {
            this.debug = builder.debug;
            this.extraInfo = builder.extraInfo;
            this.messages = builder.messages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return debug
         */
        public Object getDebug() {
            return this.debug;
        }

        /**
         * @return extraInfo
         */
        public ExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        public static final class Builder {
            private Object debug; 
            private ExtraInfo extraInfo; 
            private java.util.List<Messages> messages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.debug = model.debug;
                this.extraInfo = model.extraInfo;
                this.messages = model.messages;
            } 

            /**
             * <p>The optional debug information included in the business response.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;intentLabel&quot;:&quot;image_search&quot;}</p>
             */
            public Builder debug(Object debug) {
                this.debug = debug;
                return this;
            }

            /**
             * <p>The business extended information, which may include inputResources.</p>
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>The list of messages returned in the business response or the current streaming response frame.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private Object code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Object getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private Object code; 
            private String message; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
                this.requestId = model.requestId;
            } 

            /**
             * <p>The business error code used by the client to identify the failure type.</p>
             * 
             * <strong>example:</strong>
             * <p>INVALID_REQUEST</p>
             */
            public Builder code(Object code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The descriptive text of the business error.</p>
             * 
             * <strong>example:</strong>
             * <p>Invalid request parameters</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The business request correlation ID of the failed call, used for troubleshooting.</p>
             * 
             * <strong>example:</strong>
             * <p>req-example-001</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
}
