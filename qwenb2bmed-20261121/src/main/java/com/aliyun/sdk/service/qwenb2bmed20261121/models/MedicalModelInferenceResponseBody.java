// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bmed20261121.models;

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
 * {@link MedicalModelInferenceResponseBody} extends {@link TeaModel}
 *
 * <p>MedicalModelInferenceResponseBody</p>
 */
public class MedicalModelInferenceResponseBody extends TeaModel {
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

    private MedicalModelInferenceResponseBody(Builder builder) {
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

    public static MedicalModelInferenceResponseBody create() {
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

        private Builder(MedicalModelInferenceResponseBody model) {
            this.audioFrames = model.audioFrames;
            this.communication = model.communication;
            this.data = model.data;
            this.error = model.error;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
        } 

        /**
         * <p>可选的聚合音频帧列表。若返回音频，正常帧可含 type=audio、Base64 字符串 data 和布尔值 last，正常末帧的 data 可为空字符串。失败帧可含 type=error、code、requestId、last 和可选 message。各帧字段依类型而定。</p>
         */
        public Builder audioFrames(java.util.List<AudioFrames> audioFrames) {
            this.audioFrames = audioFrames;
            return this;
        }

        /**
         * <p>关联原请求及会话的标识。</p>
         */
        public Builder communication(Communication communication) {
            this.communication = communication;
            return this;
        }

        /**
         * <p>本次应答的业务数据，正文位于 messages。</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>可选的结构化错误信息。返回时读取 code、message 和 requestId。</p>
         */
        public Builder error(Error error) {
            this.error = error;
            return this;
        }

        /**
         * <p>业务状态码。0 表示业务成功，非 0 时结合 errorMsg 或 error 查看原因。流式还应处理 event:error。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorCode(Object errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>业务状态的文字说明。失败时用于辅助排查，程序分支应依据状态码。</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>可选的业务请求 ID。联系支持时可同时提供响应头 x-acs-request-id 中的阿里云请求 ID。</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MedicalModelInferenceResponseBody build() {
            return new MedicalModelInferenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MedicalModelInferenceResponseBody} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceResponseBody</p>
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
             * <p>AAEC</p>
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
             * <p>音频生成失败</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>用于关联音频错误与本次业务请求。</p>
             * 
             * <strong>example:</strong>
             * <p>med-req-001</p>
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
     * {@link MedicalModelInferenceResponseBody} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceResponseBody</p>
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
             * <p>对应请求中的 communication.requestId，便于匹配并发请求。</p>
             * 
             * <strong>example:</strong>
             * <p>med-req-001</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>业务响应帧标识。一次完整 JSON 聚合时可为 0。SSE 按事件到达顺序处理，responseId 无需连续。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder responseId(Long responseId) {
                this.responseId = responseId;
                return this;
            }

            /**
             * <p>对应请求中的 communication.sessionId。</p>
             * 
             * <strong>example:</strong>
             * <p>med-session-001</p>
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
     * {@link MedicalModelInferenceResponseBody} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceResponseBody</p>
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
             * <p>原请求本轮 content 数组的索引，从 0 开始。文本块也占用索引。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder contentIndex(Integer contentIndex) {
                this.contentIndex = contentIndex;
                return this;
            }

            /**
             * <p>上游提供时返回资源文件名。</p>
             * 
             * <strong>example:</strong>
             * <p>report.png</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>返回的输入资源标识，存在时可用于在业务记录中引用该资源。</p>
             * 
             * <strong>example:</strong>
             * <p>ws_123</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>资源类型，例如图片引用。</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>返回的资源访问地址。客户端按实际返回值使用。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/report.png">https://example.com/report.png</a></p>
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
     * {@link MedicalModelInferenceResponseBody} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceResponseBody</p>
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
             * <p>可选的资源信息数组，通过 contentIndex 与请求中的内容块对应。未返回资源信息时可省略。</p>
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
     * {@link MedicalModelInferenceResponseBody} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceResponseBody</p>
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
             * <p>可选 JSON 内容，结构随实际附加项类型变化，不保证存在固定业务卡片。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;list&quot;:[{&quot;image_url&quot;:&quot;<a href="https://example.com/image.jpg%22,%22image_width%22:%22800%22,%22image_height%22:%22600%22%7D%5D%7D">https://example.com/image.jpg&quot;,&quot;image_width&quot;:&quot;800&quot;,&quot;image_height&quot;:&quot;600&quot;}]}</a></p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>可选的附加项关联标识，存在时按实际值解释。</p>
             * 
             * <strong>example:</strong>
             * <p>image_waterfall_1</p>
             */
            public Builder sourceSeq(String sourceSeq) {
                this.sourceSeq = sourceSeq;
                return this;
            }

            /**
             * <p>可选的附加项类型，遇到未识别类型可忽略该附加项。</p>
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
     * {@link MedicalModelInferenceResponseBody} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceResponseBody</p>
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
             * <p>可选的消息附加标题，存在时按实际值使用。</p>
             * 
             * <strong>example:</strong>
             * <p>问题分析中</p>
             */
            public Builder barTitle(String barTitle) {
                this.barTitle = barTitle;
                return this;
            }

            /**
             * <p>可选元数据内容，按实际返回类型解释。当前医疗模型不保证返回进度模块。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;body&quot;:&quot;正在分析用户的问题。&quot;,&quot;status&quot;:&quot;processing&quot;}</p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>为兼容已有响应形状保留的可选列表，可为空或省略；当前医疗模型不保证生成 Agent 业务卡片。</p>
             */
            public Builder multiLoad(java.util.List<MultiLoad> multiLoad) {
                this.multiLoad = multiLoad;
                return this;
            }

            /**
             * <p>可选的消息关联标识，存在时按实际值使用；本模型接口不保证返回。</p>
             * 
             * <strong>example:</strong>
             * <p>bar_thinking_1</p>
             */
            public Builder sourceSeq(String sourceSeq) {
                this.sourceSeq = sourceSeq;
                return this;
            }

            /**
             * <p>可选元数据类型，存在时按实际类型解释；不据此推断模型提供 Agent 过程能力。</p>
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
     * {@link MedicalModelInferenceResponseBody} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceResponseBody</p>
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
             * <p>消息正文，具体结构随 mimeType 变化。流式快照可能包含到当前为止的完整正文，收到新快照时更新原内容，避免重复拼接。</p>
             * 
             * <strong>example:</strong>
             * <p>血红蛋白用于携带氧气。解读报告时可结合报告上的参考范围。</p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>可选消息附加信息，按实际返回处理。当前医疗模型不承诺返回医疗 Agent 的检索进度、资料来源或业务卡片。</p>
             */
            public Builder metaData(MetaData metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * <p>该消息的内容类型，用于选择解析和展示方式。multi_load/iframe 表示正文；遇到应用不支持的类型，可跳过该消息。</p>
             * 
             * <strong>example:</strong>
             * <p>multi_load/iframe</p>
             */
            public Builder mimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }

            /**
             * <p>当前消息的处理状态。complete 表示这条消息已完成；流式请求是否结束以 SSE 结束事件为准。</p>
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
     * {@link MedicalModelInferenceResponseBody} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceResponseBody</p>
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
             * <p>可选业务调试信息，可为任意 JSON 值（含 null）。是否返回、返回时机和内容按实际执行结果，不保证每轮或结束事件必有；不用于判断业务完成。</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder debug(Object debug) {
                this.debug = debug;
                return this;
            }

            /**
             * <p>响应的可选补充信息。使用图片等资源时可读取 inputResources 中返回的对应资源信息。</p>
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>当前响应中的消息列表。读取消息的 mimeType、status 和 content。完整正文可通过 mimeType=multi_load/iframe 且 status=complete 的消息取得。</p>
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
     * {@link MedicalModelInferenceResponseBody} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceResponseBody</p>
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
             * <p>业务错误码，客户端可根据此字段判断错误类型。</p>
             * 
             * <strong>example:</strong>
             * <p>INVALID_REQUEST</p>
             */
            public Builder code(Object code) {
                this.code = code;
                return this;
            }

            /**
             * <p>错误原因的文字说明，便于排查后调整请求。</p>
             * 
             * <strong>example:</strong>
             * <p>请求参数无效</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>失败请求的业务请求 ID，联系支持时可一并提供。</p>
             * 
             * <strong>example:</strong>
             * <p>med-req-001</p>
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
