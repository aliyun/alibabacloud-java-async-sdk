// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductResponseBody</p>
 */
public class ListProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListProductResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details about the access denial.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other values indicate that the request failed. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
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
         * The returned data.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListProductResponseBody build() {
            return new ListProductResponseBody(this);
        } 

    } 

    public static class Cursors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("After")
        private String after;

        @com.aliyun.core.annotation.NameInMap("Before")
        private String before;

        private Cursors(Builder builder) {
            this.after = builder.after;
            this.before = builder.before;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cursors create() {
            return builder().build();
        }

        /**
         * @return after
         */
        public String getAfter() {
            return this.after;
        }

        /**
         * @return before
         */
        public String getBefore() {
            return this.before;
        }

        public static final class Builder {
            private String after; 
            private String before; 

            /**
             * The cursor that points to the end of the page of the returned data.
             */
            public Builder after(String after) {
                this.after = after;
                return this;
            }

            /**
             * The cursor that points to the beginning of the page of the returned data.
             */
            public Builder before(String before) {
                this.before = before;
                return this;
            }

            public Cursors build() {
                return new Cursors(this);
            } 

        } 

    }
    public static class Paging extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cursors")
        private Cursors cursors;

        private Paging(Builder builder) {
            this.cursors = builder.cursors;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paging create() {
            return builder().build();
        }

        /**
         * @return cursors
         */
        public Cursors getCursors() {
            return this.cursors;
        }

        public static final class Builder {
            private Cursors cursors; 

            /**
             * The cursors for pagination.
             */
            public Builder cursors(Cursors cursors) {
                this.cursors = cursors;
                return this;
            }

            public Paging build() {
                return new Paging(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List < java.util.Map<String, ?>> data;

        @com.aliyun.core.annotation.NameInMap("Paging")
        private Paging paging;

        private Model(Builder builder) {
            this.data = builder.data;
            this.paging = builder.paging;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < java.util.Map<String, ?>> getData() {
            return this.data;
        }

        /**
         * @return paging
         */
        public Paging getPaging() {
            return this.paging;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> data; 
            private Paging paging; 

            /**
             * The returned data.
             */
            public Builder data(java.util.List < java.util.Map<String, ?>> data) {
                this.data = data;
                return this;
            }

            /**
             * The pagination details.
             */
            public Builder paging(Paging paging) {
                this.paging = paging;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
