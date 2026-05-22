// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisearchengine20260417.models;

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
 * {@link EngineSearchResponseBody} extends {@link TeaModel}
 *
 * <p>EngineSearchResponseBody</p>
 */
public class EngineSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private EngineSearchResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EngineSearchResponseBody create() {
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 

        private Builder() {
        } 

        private Builder(EngineSearchResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
        } 

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public EngineSearchResponseBody build() {
            return new EngineSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EngineSearchResponseBody} extends {@link TeaModel}
     *
     * <p>EngineSearchResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("algorithm")
        private java.util.Map<String, ?> algorithm;

        @com.aliyun.core.annotation.NameInMap("content")
        private java.util.Map<String, ?> content;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("traceInfo")
        private java.util.Map<String, ?> traceInfo;

        private Items(Builder builder) {
            this.algorithm = builder.algorithm;
            this.content = builder.content;
            this.id = builder.id;
            this.score = builder.score;
            this.traceInfo = builder.traceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public java.util.Map<String, ?> getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return content
         */
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return traceInfo
         */
        public java.util.Map<String, ?> getTraceInfo() {
            return this.traceInfo;
        }

        public static final class Builder {
            private java.util.Map<String, ?> algorithm; 
            private java.util.Map<String, ?> content; 
            private String id; 
            private Float score; 
            private java.util.Map<String, ?> traceInfo; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.algorithm = model.algorithm;
                this.content = model.content;
                this.id = model.id;
                this.score = model.score;
                this.traceInfo = model.traceInfo;
            } 

            /**
             * algorithm.
             */
            public Builder algorithm(java.util.Map<String, ?> algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * content.
             */
            public Builder content(java.util.Map<String, ?> content) {
                this.content = content;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * traceInfo.
             */
            public Builder traceInfo(java.util.Map<String, ?> traceInfo) {
                this.traceInfo = traceInfo;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link EngineSearchResponseBody} extends {@link TeaModel}
     *
     * <p>EngineSearchResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("extra")
        private java.util.Map<String, ?> extra;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("traceInfo")
        private java.util.Map<String, ?> traceInfo;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.extra = builder.extra;
            this.items = builder.items;
            this.page = builder.page;
            this.requestId = builder.requestId;
            this.size = builder.size;
            this.status = builder.status;
            this.total = builder.total;
            this.traceInfo = builder.traceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return extra
         */
        public java.util.Map<String, ?> getExtra() {
            return this.extra;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return traceInfo
         */
        public java.util.Map<String, ?> getTraceInfo() {
            return this.traceInfo;
        }

        public static final class Builder {
            private String errorMessage; 
            private java.util.Map<String, ?> extra; 
            private java.util.List<Items> items; 
            private Integer page; 
            private String requestId; 
            private Integer size; 
            private String status; 
            private Integer total; 
            private java.util.Map<String, ?> traceInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorMessage = model.errorMessage;
                this.extra = model.extra;
                this.items = model.items;
                this.page = model.page;
                this.requestId = model.requestId;
                this.size = model.size;
                this.status = model.status;
                this.total = model.total;
                this.traceInfo = model.traceInfo;
            } 

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * extra.
             */
            public Builder extra(java.util.Map<String, ?> extra) {
                this.extra = extra;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * requestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * traceInfo.
             */
            public Builder traceInfo(java.util.Map<String, ?> traceInfo) {
                this.traceInfo = traceInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
