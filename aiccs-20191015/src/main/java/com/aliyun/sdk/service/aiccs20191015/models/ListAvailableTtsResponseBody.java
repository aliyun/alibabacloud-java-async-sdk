// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link ListAvailableTtsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableTtsResponseBody</p>
 */
public class ListAvailableTtsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAvailableTtsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableTtsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public java.util.List<Data> getData() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAvailableTtsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAvailableTtsResponseBody build() {
            return new ListAvailableTtsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAvailableTtsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableTtsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TtsAuditionFileUrl")
        private String ttsAuditionFileUrl;

        @com.aliyun.core.annotation.NameInMap("TtsEngine")
        private String ttsEngine;

        @com.aliyun.core.annotation.NameInMap("TtsStyle")
        private String ttsStyle;

        @com.aliyun.core.annotation.NameInMap("TtsVoiceCode")
        private String ttsVoiceCode;

        @com.aliyun.core.annotation.NameInMap("TtsVoiceName")
        private String ttsVoiceName;

        private Data(Builder builder) {
            this.ttsAuditionFileUrl = builder.ttsAuditionFileUrl;
            this.ttsEngine = builder.ttsEngine;
            this.ttsStyle = builder.ttsStyle;
            this.ttsVoiceCode = builder.ttsVoiceCode;
            this.ttsVoiceName = builder.ttsVoiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ttsAuditionFileUrl
         */
        public String getTtsAuditionFileUrl() {
            return this.ttsAuditionFileUrl;
        }

        /**
         * @return ttsEngine
         */
        public String getTtsEngine() {
            return this.ttsEngine;
        }

        /**
         * @return ttsStyle
         */
        public String getTtsStyle() {
            return this.ttsStyle;
        }

        /**
         * @return ttsVoiceCode
         */
        public String getTtsVoiceCode() {
            return this.ttsVoiceCode;
        }

        /**
         * @return ttsVoiceName
         */
        public String getTtsVoiceName() {
            return this.ttsVoiceName;
        }

        public static final class Builder {
            private String ttsAuditionFileUrl; 
            private String ttsEngine; 
            private String ttsStyle; 
            private String ttsVoiceCode; 
            private String ttsVoiceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ttsAuditionFileUrl = model.ttsAuditionFileUrl;
                this.ttsEngine = model.ttsEngine;
                this.ttsStyle = model.ttsStyle;
                this.ttsVoiceCode = model.ttsVoiceCode;
                this.ttsVoiceName = model.ttsVoiceName;
            } 

            /**
             * <p>音色试听文件</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder ttsAuditionFileUrl(String ttsAuditionFileUrl) {
                this.ttsAuditionFileUrl = ttsAuditionFileUrl;
                return this;
            }

            /**
             * <p>音色平台CosyVoice/Volcano</p>
             * 
             * <strong>example:</strong>
             * <p>CosyVoice/Volcano</p>
             */
            public Builder ttsEngine(String ttsEngine) {
                this.ttsEngine = ttsEngine;
                return this;
            }

            /**
             * <p>音色cosy类型 cosyvoice-v2-XXXX-XXXX</p>
             * 
             * <strong>example:</strong>
             * <p>5EBAEBE6-0E77-5E1F-99E4-7B20512FCB3C</p>
             */
            public Builder ttsStyle(String ttsStyle) {
                this.ttsStyle = ttsStyle;
                return this;
            }

            /**
             * <p>音色编码</p>
             * 
             * <strong>example:</strong>
             * <p>V123456789</p>
             */
            public Builder ttsVoiceCode(String ttsVoiceCode) {
                this.ttsVoiceCode = ttsVoiceCode;
                return this;
            }

            /**
             * <p>音色名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder ttsVoiceName(String ttsVoiceName) {
                this.ttsVoiceName = ttsVoiceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
