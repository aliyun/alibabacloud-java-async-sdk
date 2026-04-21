// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link ListVoicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVoicesResponseBody</p>
 */
public class ListVoicesResponseBody extends TeaModel {
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

    private ListVoicesResponseBody(Builder builder) {
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

    public static ListVoicesResponseBody create() {
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

        private Builder(ListVoicesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Params.
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVoicesResponseBody build() {
            return new ListVoicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVoicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoicesResponseBody</p>
     */
    public static class Voices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NlsEngine")
        private String nlsEngine;

        @com.aliyun.core.annotation.NameInMap("Style")
        private String style;

        @com.aliyun.core.annotation.NameInMap("SupportedParams")
        private java.util.List<String> supportedParams;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        private Voices(Builder builder) {
            this.category = builder.category;
            this.language = builder.language;
            this.model = builder.model;
            this.name = builder.name;
            this.nlsEngine = builder.nlsEngine;
            this.style = builder.style;
            this.supportedParams = builder.supportedParams;
            this.voice = builder.voice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Voices create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nlsEngine
         */
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        /**
         * @return style
         */
        public String getStyle() {
            return this.style;
        }

        /**
         * @return supportedParams
         */
        public java.util.List<String> getSupportedParams() {
            return this.supportedParams;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        public static final class Builder {
            private String category; 
            private String language; 
            private String model; 
            private String name; 
            private String nlsEngine; 
            private String style; 
            private java.util.List<String> supportedParams; 
            private String voice; 

            private Builder() {
            } 

            private Builder(Voices model) {
                this.category = model.category;
                this.language = model.language;
                this.model = model.model;
                this.name = model.name;
                this.nlsEngine = model.nlsEngine;
                this.style = model.style;
                this.supportedParams = model.supportedParams;
                this.voice = model.voice;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NlsEngine.
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * Style.
             */
            public Builder style(String style) {
                this.style = style;
                return this;
            }

            /**
             * SupportedParams.
             */
            public Builder supportedParams(java.util.List<String> supportedParams) {
                this.supportedParams = supportedParams;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            public Voices build() {
                return new Voices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVoicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("Voices")
        private java.util.List<Voices> voices;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.voices = builder.voices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return voices
         */
        public java.util.List<Voices> getVoices() {
            return this.voices;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 
            private java.util.List<Voices> voices; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.voices = model.voices;
            } 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * Voices.
             */
            public Builder voices(java.util.List<Voices> voices) {
                this.voices = voices;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
