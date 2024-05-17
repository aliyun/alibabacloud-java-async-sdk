// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNamespaceResponseBody</p>
 */
public class CreateNamespaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateNamespaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNamespaceResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the namespace.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message that is returned only if the corresponding error occurs.
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

        /**
         * Indicates whether the application was created. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateNamespaceResponseBody build() {
            return new CreateNamespaceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NamespaceUid")
        private String namespaceUid;

        private Data(Builder builder) {
            this.namespaceUid = builder.namespaceUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return namespaceUid
         */
        public String getNamespaceUid() {
            return this.namespaceUid;
        }

        public static final class Builder {
            private String namespaceUid; 

            /**
             * The UID of the namespace.
             */
            public Builder namespaceUid(String namespaceUid) {
                this.namespaceUid = namespaceUid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
