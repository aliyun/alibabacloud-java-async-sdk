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
 * {@link GetCategoriesByTaskIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetCategoriesByTaskIdResponseBody</p>
 */
public class GetCategoriesByTaskIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCategoriesByTaskIdResponseBody(Builder builder) {
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

    public static GetCategoriesByTaskIdResponseBody create() {
        return builder().build();
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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

        public GetCategoriesByTaskIdResponseBody build() {
            return new GetCategoriesByTaskIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCategoriesByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetCategoriesByTaskIdResponseBody</p>
     */
    public static class Children extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        private Children(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Children create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        public static final class Builder {
            private String category; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public Children build() {
                return new Children(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCategoriesByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetCategoriesByTaskIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<Children> children;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        private Data(Builder builder) {
            this.category = builder.category;
            this.children = builder.children;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return children
         */
        public java.util.List<Children> getChildren() {
            return this.children;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private String category; 
            private java.util.List<Children> children; 
            private Integer count; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Children.
             */
            public Builder children(java.util.List<Children> children) {
                this.children = children;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
