// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link FetchParseDocumentLayoutTaskResponseBody} extends {@link TeaModel}
 *
 * <p>FetchParseDocumentLayoutTaskResponseBody</p>
 */
public class FetchParseDocumentLayoutTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FetchParseDocumentLayoutTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchParseDocumentLayoutTaskResponseBody create() {
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(FetchParseDocumentLayoutTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
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

        public FetchParseDocumentLayoutTaskResponseBody build() {
            return new FetchParseDocumentLayoutTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FetchParseDocumentLayoutTaskResponseBody} extends {@link TeaModel}
     *
     * <p>FetchParseDocumentLayoutTaskResponseBody</p>
     */
    public static class Elements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FormatContent")
        private String formatContent;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Float index;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Elements(Builder builder) {
            this.content = builder.content;
            this.formatContent = builder.formatContent;
            this.index = builder.index;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Elements create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return formatContent
         */
        public String getFormatContent() {
            return this.formatContent;
        }

        /**
         * @return index
         */
        public Float getIndex() {
            return this.index;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String formatContent; 
            private Float index; 
            private String type; 

            private Builder() {
            } 

            private Builder(Elements model) {
                this.content = model.content;
                this.formatContent = model.formatContent;
                this.index = model.index;
                this.type = model.type;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * FormatContent.
             */
            public Builder formatContent(String formatContent) {
                this.formatContent = formatContent;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Float index) {
                this.index = index;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Elements build() {
                return new Elements(this);
            } 

        } 

    }
    /**
     * 
     * {@link FetchParseDocumentLayoutTaskResponseBody} extends {@link TeaModel}
     *
     * <p>FetchParseDocumentLayoutTaskResponseBody</p>
     */
    public static class LayoutResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Elements")
        private java.util.List<Elements> elements;

        private LayoutResult(Builder builder) {
            this.elements = builder.elements;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayoutResult create() {
            return builder().build();
        }

        /**
         * @return elements
         */
        public java.util.List<Elements> getElements() {
            return this.elements;
        }

        public static final class Builder {
            private java.util.List<Elements> elements; 

            private Builder() {
            } 

            private Builder(LayoutResult model) {
                this.elements = model.elements;
            } 

            /**
             * Elements.
             */
            public Builder elements(java.util.List<Elements> elements) {
                this.elements = elements;
                return this;
            }

            public LayoutResult build() {
                return new LayoutResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link FetchParseDocumentLayoutTaskResponseBody} extends {@link TeaModel}
     *
     * <p>FetchParseDocumentLayoutTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LayoutResult")
        private LayoutResult layoutResult;

        @com.aliyun.core.annotation.NameInMap("TaskStats")
        private String taskStats;

        private Data(Builder builder) {
            this.layoutResult = builder.layoutResult;
            this.taskStats = builder.taskStats;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return layoutResult
         */
        public LayoutResult getLayoutResult() {
            return this.layoutResult;
        }

        /**
         * @return taskStats
         */
        public String getTaskStats() {
            return this.taskStats;
        }

        public static final class Builder {
            private LayoutResult layoutResult; 
            private String taskStats; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.layoutResult = model.layoutResult;
                this.taskStats = model.taskStats;
            } 

            /**
             * LayoutResult.
             */
            public Builder layoutResult(LayoutResult layoutResult) {
                this.layoutResult = layoutResult;
                return this;
            }

            /**
             * TaskStats.
             */
            public Builder taskStats(String taskStats) {
                this.taskStats = taskStats;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
