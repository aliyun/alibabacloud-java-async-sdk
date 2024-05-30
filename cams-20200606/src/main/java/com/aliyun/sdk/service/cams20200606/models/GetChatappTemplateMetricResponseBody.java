// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappTemplateMetricResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatappTemplateMetricResponseBody</p>
 */
public class GetChatappTemplateMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetChatappTemplateMetricResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatappTemplateMetricResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
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
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * The details about the access denial.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The value OK indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChatappTemplateMetricResponseBody build() {
            return new GetChatappTemplateMetricResponseBody(this);
        } 

    } 

    public static class Cliented extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ButtonContent")
        private String buttonContent;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Cliented(Builder builder) {
            this.buttonContent = builder.buttonContent;
            this.count = builder.count;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cliented create() {
            return builder().build();
        }

        /**
         * @return buttonContent
         */
        public String getButtonContent() {
            return this.buttonContent;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String buttonContent; 
            private Integer count; 
            private String type; 

            /**
             * The text on the button.
             */
            public Builder buttonContent(String buttonContent) {
                this.buttonContent = buttonContent;
                return this;
            }

            /**
             * The number of clicks.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The button type.
             * <p>
             * 
             * >  Valid values:
             * 
             * *   url_button
             * 
             * *   quick_relpy_button
             * 
             * *   phone_number_button
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Cliented build() {
                return new Cliented(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cliented")
        private java.util.List < Cliented> cliented;

        @com.aliyun.core.annotation.NameInMap("DeliveredCount")
        private Integer deliveredCount;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("ReadCount")
        private Integer readCount;

        @com.aliyun.core.annotation.NameInMap("SentCount")
        private Integer sentCount;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Long start;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        private Data(Builder builder) {
            this.cliented = builder.cliented;
            this.deliveredCount = builder.deliveredCount;
            this.end = builder.end;
            this.language = builder.language;
            this.readCount = builder.readCount;
            this.sentCount = builder.sentCount;
            this.start = builder.start;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cliented
         */
        public java.util.List < Cliented> getCliented() {
            return this.cliented;
        }

        /**
         * @return deliveredCount
         */
        public Integer getDeliveredCount() {
            return this.deliveredCount;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return readCount
         */
        public Integer getReadCount() {
            return this.readCount;
        }

        /**
         * @return sentCount
         */
        public Integer getSentCount() {
            return this.sentCount;
        }

        /**
         * @return start
         */
        public Long getStart() {
            return this.start;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private java.util.List < Cliented> cliented; 
            private Integer deliveredCount; 
            private Long end; 
            private String language; 
            private Integer readCount; 
            private Integer sentCount; 
            private Long start; 
            private String templateCode; 

            /**
             * The statistics on button clicks.
             */
            public Builder cliented(java.util.List < Cliented> cliented) {
                this.cliented = cliented;
                return this;
            }

            /**
             * The number of delivered messages.
             */
            public Builder deliveredCount(Integer deliveredCount) {
                this.deliveredCount = deliveredCount;
                return this;
            }

            /**
             * The end of the time range you queried.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * The template language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * The number of read messages.
             */
            public Builder readCount(Integer readCount) {
                this.readCount = readCount;
                return this;
            }

            /**
             * The number of sent messages.
             */
            public Builder sentCount(Integer sentCount) {
                this.sentCount = sentCount;
                return this;
            }

            /**
             * The beginning of the time range you queried.
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * The template code.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
