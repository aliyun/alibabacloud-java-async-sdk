// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private CreateNamespaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * bucketPath
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The region where the namespace resides.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * http://sae_pop_pre/#vpc
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the namespace.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The description of the custom namespace.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * mountDir
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CreateNamespaceResponseBody build() {
            return new CreateNamespaceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableMicroRegistration")
        private Boolean enableMicroRegistration;

        @com.aliyun.core.annotation.NameInMap("NameSpaceShortId")
        private String nameSpaceShortId;

        @com.aliyun.core.annotation.NameInMap("NamespaceDescription")
        private String namespaceDescription;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private Data(Builder builder) {
            this.enableMicroRegistration = builder.enableMicroRegistration;
            this.nameSpaceShortId = builder.nameSpaceShortId;
            this.namespaceDescription = builder.namespaceDescription;
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enableMicroRegistration
         */
        public Boolean getEnableMicroRegistration() {
            return this.enableMicroRegistration;
        }

        /**
         * @return nameSpaceShortId
         */
        public String getNameSpaceShortId() {
            return this.nameSpaceShortId;
        }

        /**
         * @return namespaceDescription
         */
        public String getNamespaceDescription() {
            return this.namespaceDescription;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Boolean enableMicroRegistration; 
            private String nameSpaceShortId; 
            private String namespaceDescription; 
            private String namespaceId; 
            private String namespaceName; 
            private String regionId; 

            /**
             * EnableMicroRegistration.
             */
            public Builder enableMicroRegistration(Boolean enableMicroRegistration) {
                this.enableMicroRegistration = enableMicroRegistration;
                return this;
            }

            /**
             * Indicates whether the namespace was created. Valid values:
             * <p>
             * 
             * *   **true**: The instance was created.
             * *   **false**: The call failed to be created.
             */
            public Builder nameSpaceShortId(String nameSpaceShortId) {
                this.nameSpaceShortId = nameSpaceShortId;
                return this;
            }

            /**
             * The short ID of the namespace.
             */
            public Builder namespaceDescription(String namespaceDescription) {
                this.namespaceDescription = namespaceDescription;
                return this;
            }

            /**
             * The error code returned. Take note of the following rules:
             * <p>
             * 
             * *   The **ErrorCode** parameter is not returned if the request succeeds.
             * *   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * Null
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * The HTTP status code. Valid values:
             * <p>
             * 
             * *   **2xx**: The call was successful.
             * *   **3xx**: The call was redirected.
             * *   **4xx**: The call failed.
             * *   **5xx**: A server error occurred.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
