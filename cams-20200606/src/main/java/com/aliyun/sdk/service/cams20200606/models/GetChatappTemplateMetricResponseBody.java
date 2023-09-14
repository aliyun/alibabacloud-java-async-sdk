// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappTemplateMetricResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatappTemplateMetricResponseBody</p>
 */
public class GetChatappTemplateMetricResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
        public Builder data(java.util.List < Data> data) {
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

        public GetChatappTemplateMetricResponseBody build() {
            return new GetChatappTemplateMetricResponseBody(this);
        } 

    } 

    public static class Cliented extends TeaModel {
        @NameInMap("ButtonContent")
        private String buttonContent;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("Type")
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
             * ButtonContent.
             */
            public Builder buttonContent(String buttonContent) {
                this.buttonContent = buttonContent;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("Cliented")
        private java.util.List < Cliented> cliented;

        @NameInMap("DeliveredCount")
        private Integer deliveredCount;

        @NameInMap("End")
        private Long end;

        @NameInMap("Language")
        private String language;

        @NameInMap("ReadCount")
        private Integer readCount;

        @NameInMap("SentCount")
        private Integer sentCount;

        @NameInMap("Start")
        private Long start;

        @NameInMap("TemplateCode")
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
             * Cliented.
             */
            public Builder cliented(java.util.List < Cliented> cliented) {
                this.cliented = cliented;
                return this;
            }

            /**
             * DeliveredCount.
             */
            public Builder deliveredCount(Integer deliveredCount) {
                this.deliveredCount = deliveredCount;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
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
             * ReadCount.
             */
            public Builder readCount(Integer readCount) {
                this.readCount = readCount;
                return this;
            }

            /**
             * SentCount.
             */
            public Builder sentCount(Integer sentCount) {
                this.sentCount = sentCount;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * TemplateCode.
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
