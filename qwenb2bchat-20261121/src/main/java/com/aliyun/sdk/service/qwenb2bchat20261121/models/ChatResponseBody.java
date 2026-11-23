// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bchat20261121.models;

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
         * <p>开通 HTTP 音频输出后，完整 JSON 可在 audioFrames 中返回音频帧。type 为 audio 时，data 为 Base64 音频数据，last 为布尔末帧标识。type 为 error 时可含 code、requestId 和 message。无音频时可为空或省略。</p>
         */
        public Builder audioFrames(java.util.List<AudioFrames> audioFrames) {
            this.audioFrames = audioFrames;
            return this;
        }

        /**
         * <p>用于关联响应帧与原业务请求和会话的信息。</p>
         */
        public Builder communication(Communication communication) {
            this.communication = communication;
            return this;
        }

        /**
         * <p>可选业务对象，字段按实际响应出现。单帧 HTTP 音频响应的 data 也可能直接为 Base64 字符串；多态音频完整形状见接口说明。客户端不得假定固定字段全部存在。</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>可选错误对象，出现时按失败处理。准备阶段可用错误HTTP状态+JSON返回；已识别业务错误可保留HTTP200，SSE首帧提交后用错误终帧表达。优先结合HTTP X-Request-Id关联。</p>
         */
        public Builder error(Error error) {
            this.error = error;
            return this;
        }

        /**
         * <p>可选字符串或数值，成功业务响应可为数字0；非零或失败码按错误处理。未返回本字段不自动判失败，须综合 error、HTTP 和流终帧。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorCode(Object errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>与响应顶层业务状态码对应的说明。</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>响应顶层可选的业务请求关联号。POP 请求号由响应头 x-acs-request-id 提供。</p>
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
             * <p>音频处理失败时可能提供。</p>
             * 
             * <strong>example:</strong>
             * <p>DOWNSTREAM_ERROR</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>音频帧的 Base64 数据。末帧的值可以为空字符串。</p>
             * 
             * <strong>example:</strong>
             * <p>SUQz</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>true 表示本路音频的最后一帧。</p>
             */
            public Builder last(Boolean last) {
                this.last = last;
                return this;
            }

            /**
             * <p>音频处理失败时按实际错误返回。</p>
             * 
             * <strong>example:</strong>
             * <p>语音合成暂不可用</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>用于关联音频错误与本次业务请求。</p>
             * 
             * <strong>example:</strong>
             * <p>req-example-001</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>audio 表示音频，error 表示处理失败。</p>
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
             * <p>当前响应所属的业务请求 ID，返回时与请求中的 communication.requestId 一致。</p>
             * 
             * <strong>example:</strong>
             * <p>req-example-001</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>可选整数，业务响应帧标识；网关多帧聚合可为0。不代表可对所有网络帧排序的序列号，也不是会话或请求ID。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder responseId(Long responseId) {
                this.responseId = responseId;
                return this;
            }

            /**
             * <p>当前响应所属的客户会话 ID。</p>
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
             * <p>从零开始，按原始 content 数组计数，包含文本块。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder contentIndex(Integer contentIndex) {
                this.contentIndex = contentIndex;
                return this;
            }

            /**
             * <p>有文件名时返回。</p>
             * 
             * <strong>example:</strong>
             * <p>cat.png</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>本轮输入资源的标识，用于关联对应资源。</p>
             * 
             * <strong>example:</strong>
             * <p>ws_example_001</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>原始内容块对应的资源类型。</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>本轮输入资源的可访问地址。</p>
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
             * <p>仅在响应提供本轮输入资源处理结果时返回。</p>
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
             * <p>可选，结构随卡片类型变化。图文卡片可含资源列表。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;list&quot;:[{&quot;imageUrl&quot;:&quot;<a href="https://images.example.com/cat.png%22%7D%5D%7D">https://images.example.com/cat.png&quot;}]}</a></p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>与正文中的卡片引用关联。相同标识代表同一卡片。</p>
             * 
             * <strong>example:</strong>
             * <p>image_waterfall_1</p>
             */
            public Builder sourceSeq(String sourceSeq) {
                this.sourceSeq = sourceSeq;
                return this;
            }

            /**
             * <p>按类型选择卡片展示组件。</p>
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
             * <p>用于展示当前过程的上下文标题。处理状态见对应消息的 status。</p>
             * 
             * <strong>example:</strong>
             * <p>问题分析</p>
             */
            public Builder barTitle(String barTitle) {
                this.barTitle = barTitle;
                return this;
            }

            /**
             * <p>数据结构随模块类型变化。bar/progress 中，思考过程使用 body，工具和结束提示使用 title，过程中检索资料或图片分别使用 docs、images。完整键和示例见接入说明。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;body&quot;:&quot;正在分析问题&quot;,&quot;status&quot;:&quot;processing&quot;}</p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>与正文关联的结构化内容列表，例如图文卡片，按消息类型返回。</p>
             */
            public Builder multiLoad(java.util.List<MultiLoad> multiLoad) {
                this.multiLoad = multiLoad;
                return this;
            }

            /**
             * <p>按本次请求和 sourceSeq 关联同一模块的更新。新的完整快照替换旧快照。</p>
             * 
             * <strong>example:</strong>
             * <p>thinking-1</p>
             */
            public Builder sourceSeq(String sourceSeq) {
                this.sourceSeq = sourceSeq;
                return this;
            }

            /**
             * <p>例如 bar_thinking、bar_tool、bar_think_finish、bar_ref_source_inline 或 bar_image_inline。按实际类型选择展示组件。</p>
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
             * <p>可选多态内容，按 mimeType 解析。multi_load/iframe 常为累计文本快照；后帧更新当前内容。过程、卡片按各自类型处理，不把任意 content 强转字符串。</p>
             * 
             * <strong>example:</strong>
             * <p>图片如下[(image_waterfall_1)]</p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>可选、可扩展的消息元数据。正文消息可通过 multiLoad 提供卡片；过程消息可按类型包含 sourceSeq、type、barTitle、content，用于关联和展示相应内容。</p>
             */
            public Builder metaData(MetaData metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * <p>消息类型，按此值解析正文、进度及可选信号和追问。常见类型见接入说明。</p>
             * 
             * <strong>example:</strong>
             * <p>multi_load/iframe</p>
             */
            public Builder mimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }

            /**
             * <p>可选消息状态，如 processing、complete；complete 只结束该消息，不替代 SSE event:complete。HTTP200 或单条消息complete都不足以判定整次流成功。</p>
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
             * <p>可选业务调试信息，可省略或为 null。在支持的联调场景中可能包含 intentLabel；具体结构和返回时机按实际响应读取。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;intentLabel&quot;:&quot;image_search&quot;}</p>
             */
            public Builder debug(Object debug) {
                this.debug = debug;
                return this;
            }

            /**
             * <p>业务响应附带的可选扩展信息。inputResources 是本轮输入资源的处理结果数组，元素可含 contentIndex、type、resourceId、url 和 fileName。contentIndex 是原始消息 content 数组的零起始下标，文本块也计数。</p>
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>可选数组，可能含多条正文、过程或卡片消息。multi_load/iframe 文本为累计快照，不将每帧全文重复拼接；不要固定只取 messages[0]。</p>
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
             * <p>可选的错误码，可为字符串或数值，表示服务或 Agent 的具体错误类型。程序应按 code 判断，不依赖 message 全文；数值业务码 500 不代表 HTTP 状态一定为 500。</p>
             * 
             * <strong>example:</strong>
             * <p>INVALID_REQUEST</p>
             */
            public Builder code(Object code) {
                this.code = code;
                return this;
            }

            /**
             * <p>业务错误的说明文本。</p>
             * 
             * <strong>example:</strong>
             * <p>请求参数无效</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>失败调用的业务请求关联号，用于定位问题。</p>
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
