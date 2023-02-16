// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNamespaceResponseBody</p>
 */
public class CreateNamespaceResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information of the namespace.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message that is returned only if the error occurs.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether an application is created. Valid values:
         * <p>
         * 
         * *   **true**: The application is created.
         * *   **false**: Failed to create the application.
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
        @NameInMap("NamespaceUid")
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
             * The unique identifier of the namespace.
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
