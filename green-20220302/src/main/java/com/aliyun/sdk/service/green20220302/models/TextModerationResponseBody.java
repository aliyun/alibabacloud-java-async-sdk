// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
 * {@link TextModerationResponseBody} extends {@link TeaModel}
 *
 * <p>TextModerationResponseBody</p>
 */
public class TextModerationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TextModerationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextModerationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(TextModerationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The moderation result data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TextModerationResponseBody build() {
            return new TextModerationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TextModerationResponseBody} extends {@link TeaModel}
     *
     * <p>TextModerationResponseBody</p>
     */
    public static class LlmContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("outputText")
        private String outputText;

        private LlmContent(Builder builder) {
            this.outputText = builder.outputText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmContent create() {
            return builder().build();
        }

        /**
         * @return outputText
         */
        public String getOutputText() {
            return this.outputText;
        }

        public static final class Builder {
            private String outputText; 

            private Builder() {
            } 

            private Builder(LlmContent model) {
                this.outputText = model.outputText;
            } 

            /**
             * <p>The output content.</p>
             * 
             * <strong>example:</strong>
             * <p>正常。文本中无风险内容。</p>
             */
            public Builder outputText(String outputText) {
                this.outputText = outputText;
                return this;
            }

            public LlmContent build() {
                return new LlmContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link TextModerationResponseBody} extends {@link TeaModel}
     *
     * <p>TextModerationResponseBody</p>
     */
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("llmContent")
        private LlmContent llmContent;

        private Ext(Builder builder) {
            this.llmContent = builder.llmContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return llmContent
         */
        public LlmContent getLlmContent() {
            return this.llmContent;
        }

        public static final class Builder {
            private LlmContent llmContent; 

            private Builder() {
            } 

            private Builder(Ext model) {
                this.llmContent = model.llmContent;
            } 

            /**
             * <p>The output from the Large Language Model (LLM).</p>
             */
            public Builder llmContent(LlmContent llmContent) {
                this.llmContent = llmContent;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
    /**
     * 
     * {@link TextModerationResponseBody} extends {@link TeaModel}
     *
     * <p>TextModerationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("dataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("descriptions")
        private String descriptions;

        @com.aliyun.core.annotation.NameInMap("deviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("ext")
        private Ext ext;

        @com.aliyun.core.annotation.NameInMap("labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("manualTaskId")
        private String manualTaskId;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.dataId = builder.dataId;
            this.descriptions = builder.descriptions;
            this.deviceId = builder.deviceId;
            this.ext = builder.ext;
            this.labels = builder.labels;
            this.manualTaskId = builder.manualTaskId;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return descriptions
         */
        public String getDescriptions() {
            return this.descriptions;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return ext
         */
        public Ext getExt() {
            return this.ext;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return manualTaskId
         */
        public String getManualTaskId() {
            return this.manualTaskId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String accountId; 
            private String dataId; 
            private String descriptions; 
            private String deviceId; 
            private Ext ext; 
            private String labels; 
            private String manualTaskId; 
            private String reason; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.dataId = model.dataId;
                this.descriptions = model.descriptions;
                this.deviceId = model.deviceId;
                this.ext = model.ext;
                this.labels = model.labels;
                this.manualTaskId = model.manualTaskId;
                this.reason = model.reason;
            } 

            /**
             * <p>The \<code>accountId\\</code> specified in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The data ID of the moderated object.</p>
             * <blockquote>
             * <p>If you specify the dataId parameter in the request, its value is returned in this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>text1234</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The description of the label.</p>
             * 
             * <strong>example:</strong>
             * <p>疑似广告内容</p>
             */
            public Builder descriptions(String descriptions) {
                this.descriptions = descriptions;
                return this;
            }

            /**
             * <p>The \<code>deviceId\\</code> specified in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>Auxiliary reference information for the text.</p>
             */
            public Builder ext(Ext ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The moderation labels. If multiple labels are returned, they are separated by commas (,). Valid values: ad: advertisement profanity: profanity contraband: contraband sexual_content: sexual content violence: violent and terrorist content nonsense: meaningless content spam: spam negative_content: undesirable content cyberbullying: cyberbullying C_customized: A match in a custom library</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The ID of the manual review task.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx-xxxxx</p>
             */
            public Builder manualTaskId(String manualTaskId) {
                this.manualTaskId = manualTaskId;
                return this;
            }

            /**
             * <p>A JSON string that contains the reason for the moderation result. The string includes the following fields:</p>
             * <ol>
             * <li><p>riskTips: The sub-labels.</p>
             * </li>
             * <li><p>riskWords: The detected risk words.</p>
             * </li>
             * <li><p>adNums: The detected ad-related numbers.</p>
             * </li>
             * <li><p>customizedWords: The detected custom words.</p>
             * </li>
             * <li><p>customizedLibs: The names of the custom libraries that contain a match.</p>
             * </li>
             * <li><p>riskLevel: The risk level, which is recommended by the system. Valid values:</p>
             * </li>
             * </ol>
             * <ul>
             * <li><p>high: high risk</p>
             * </li>
             * <li><p>medium: medium risk</p>
             * </li>
             * <li><p>low: low risk</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;riskLevel\&quot;:\&quot;high\&quot;,\&quot;riskTips\&quot;:\&quot;色情_低俗词\&quot;,\&quot;riskWords\&quot;:\&quot;色情服务\&quot;}</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
