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
         * <p>The returned HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The moderation results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned in response to the request.</p>
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("dataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("descriptions")
        private String descriptions;

        @com.aliyun.core.annotation.NameInMap("deviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.dataId = builder.dataId;
            this.descriptions = builder.descriptions;
            this.deviceId = builder.deviceId;
            this.labels = builder.labels;
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
         * @return labels
         */
        public String getLabels() {
            return this.labels;
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
            private String labels; 
            private String reason; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.dataId = model.dataId;
                this.descriptions = model.descriptions;
                this.deviceId = model.deviceId;
                this.labels = model.labels;
                this.reason = model.reason;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * dataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * descriptions.
             */
            public Builder descriptions(String descriptions) {
                this.descriptions = descriptions;
                return this;
            }

            /**
             * <p>The device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>Labels.</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The JSON string used to locate the cause.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;detectedLanguage&quot;:&quot;ar&quot;,&quot;riskTips&quot;:&quot;sexuality_Suggestive&quot;,&quot;riskWords&quot;:&quot;pxxxxy&quot;,&quot;translatedContent&quot;:&quot;pxxxxy sxxxx&quot;}</p>
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
