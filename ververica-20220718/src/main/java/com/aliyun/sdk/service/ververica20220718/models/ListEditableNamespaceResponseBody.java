// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListEditableNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>ListEditableNamespaceResponseBody</p>
 */
public class ListEditableNamespaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListEditableNamespaceResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEditableNamespaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
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
        private Data data; 
        private Integer httpCode; 
        private String message; 
        private String reason; 
        private String requestId; 
        private Boolean success; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEditableNamespaceResponseBody build() {
            return new ListEditableNamespaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEditableNamespaceResponseBody} extends {@link TeaModel}
     *
     * <p>ListEditableNamespaceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("editableNamespaces")
        private java.util.List < EditableNamespace > editableNamespaces;

        @com.aliyun.core.annotation.NameInMap("pageIndex")
        private String pageIndex;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private String total;

        private Data(Builder builder) {
            this.editableNamespaces = builder.editableNamespaces;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return editableNamespaces
         */
        public java.util.List < EditableNamespace > getEditableNamespaces() {
            return this.editableNamespaces;
        }

        /**
         * @return pageIndex
         */
        public String getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < EditableNamespace > editableNamespaces; 
            private String pageIndex; 
            private String pageSize; 
            private String total; 

            /**
             * editableNamespaces.
             */
            public Builder editableNamespaces(java.util.List < EditableNamespace > editableNamespaces) {
                this.editableNamespaces = editableNamespaces;
                return this;
            }

            /**
             * pageIndex.
             */
            public Builder pageIndex(String pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
