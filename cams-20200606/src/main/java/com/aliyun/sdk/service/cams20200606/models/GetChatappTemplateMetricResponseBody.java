// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
    private java.util.List<Data> data;

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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetChatappTemplateMetricResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The value OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChatappTemplateMetricResponseBody build() {
            return new GetChatappTemplateMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetChatappTemplateMetricResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatappTemplateMetricResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Cliented model) {
                this.buttonContent = model.buttonContent;
                this.count = model.count;
                this.type = model.type;
            } 

            /**
             * <p>The text on the button.</p>
             * 
             * <strong>example:</strong>
             * <p>Open url</p>
             */
            public Builder buttonContent(String buttonContent) {
                this.buttonContent = buttonContent;
                return this;
            }

            /**
             * <p>The number of clicks.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The button type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>phone_number_button</li>
             * <li>url_button</li>
             * <li>quick_relpy_button</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>quick_reply_button</p>
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
    /**
     * 
     * {@link GetChatappTemplateMetricResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatappTemplateMetricResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cliented")
        private java.util.List<Cliented> cliented;

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
        public java.util.List<Cliented> getCliented() {
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
            private java.util.List<Cliented> cliented; 
            private Integer deliveredCount; 
            private Long end; 
            private String language; 
            private Integer readCount; 
            private Integer sentCount; 
            private Long start; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cliented = model.cliented;
                this.deliveredCount = model.deliveredCount;
                this.end = model.end;
                this.language = model.language;
                this.readCount = model.readCount;
                this.sentCount = model.sentCount;
                this.start = model.start;
                this.templateCode = model.templateCode;
            } 

            /**
             * <p>The statistics on button clicks.</p>
             */
            public Builder cliented(java.util.List<Cliented> cliented) {
                this.cliented = cliented;
                return this;
            }

            /**
             * <p>The number of delivered messages.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder deliveredCount(Integer deliveredCount) {
                this.deliveredCount = deliveredCount;
                return this;
            }

            /**
             * <p>The end of the time range you queried.</p>
             * 
             * <strong>example:</strong>
             * <p>1668138331485</p>
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The template language.</p>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The number of read messages.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder readCount(Integer readCount) {
                this.readCount = readCount;
                return this;
            }

            /**
             * <p>The number of sent messages.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sentCount(Integer sentCount) {
                this.sentCount = sentCount;
                return this;
            }

            /**
             * <p>The beginning of the time range you queried.</p>
             * 
             * <strong>example:</strong>
             * <p>1673919240001</p>
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * <p>The template code.</p>
             * 
             * <strong>example:</strong>
             * <p>83837774838*****</p>
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
