// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

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
 * {@link TranslateImageResponseBody} extends {@link TeaModel}
 *
 * <p>TranslateImageResponseBody</p>
 */
public class TranslateImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TranslateImageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TranslateImageResponseBody create() {
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

        private Builder(TranslateImageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public TranslateImageResponseBody build() {
            return new TranslateImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TranslateImageResponseBody} extends {@link TeaModel}
     *
     * <p>TranslateImageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinalImageUrl")
        private String finalImageUrl;

        @com.aliyun.core.annotation.NameInMap("InPaintingUrl")
        private String inPaintingUrl;

        @com.aliyun.core.annotation.NameInMap("TemplateJson")
        private String templateJson;

        private Data(Builder builder) {
            this.finalImageUrl = builder.finalImageUrl;
            this.inPaintingUrl = builder.inPaintingUrl;
            this.templateJson = builder.templateJson;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return finalImageUrl
         */
        public String getFinalImageUrl() {
            return this.finalImageUrl;
        }

        /**
         * @return inPaintingUrl
         */
        public String getInPaintingUrl() {
            return this.inPaintingUrl;
        }

        /**
         * @return templateJson
         */
        public String getTemplateJson() {
            return this.templateJson;
        }

        public static final class Builder {
            private String finalImageUrl; 
            private String inPaintingUrl; 
            private String templateJson; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.finalImageUrl = model.finalImageUrl;
                this.inPaintingUrl = model.inPaintingUrl;
                this.templateJson = model.templateJson;
            } 

            /**
             * FinalImageUrl.
             */
            public Builder finalImageUrl(String finalImageUrl) {
                this.finalImageUrl = finalImageUrl;
                return this;
            }

            /**
             * InPaintingUrl.
             */
            public Builder inPaintingUrl(String inPaintingUrl) {
                this.inPaintingUrl = inPaintingUrl;
                return this;
            }

            /**
             * TemplateJson.
             */
            public Builder templateJson(String templateJson) {
                this.templateJson = templateJson;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
