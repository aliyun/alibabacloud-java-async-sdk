// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEngineNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEngineNamespaceResponseBody</p>
 */
public class UpdateEngineNamespaceResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private UpdateEngineNamespaceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEngineNamespaceResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request fails.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The message returned.
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * - `true`: The request is successful. 
         * - `false`: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateEngineNamespaceResponseBody build() {
            return new UpdateEngineNamespaceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ConfigCount")
        private Integer configCount;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("NamespaceDesc")
        private String namespaceDesc;

        @NameInMap("NamespaceShowName")
        private String namespaceShowName;

        @NameInMap("Quota")
        private Integer quota;

        @NameInMap("Type")
        private Integer type;

        private Data(Builder builder) {
            this.configCount = builder.configCount;
            this.namespace = builder.namespace;
            this.namespaceDesc = builder.namespaceDesc;
            this.namespaceShowName = builder.namespaceShowName;
            this.quota = builder.quota;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configCount
         */
        public Integer getConfigCount() {
            return this.configCount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return namespaceDesc
         */
        public String getNamespaceDesc() {
            return this.namespaceDesc;
        }

        /**
         * @return namespaceShowName
         */
        public String getNamespaceShowName() {
            return this.namespaceShowName;
        }

        /**
         * @return quota
         */
        public Integer getQuota() {
            return this.quota;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer configCount; 
            private String namespace; 
            private String namespaceDesc; 
            private String namespaceShowName; 
            private Integer quota; 
            private Integer type; 

            /**
             * The number of configurations.
             */
            public Builder configCount(Integer configCount) {
                this.configCount = configCount;
                return this;
            }

            /**
             * The name of the namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The description of the namespace.
             */
            public Builder namespaceDesc(String namespaceDesc) {
                this.namespaceDesc = namespaceDesc;
                return this;
            }

            /**
             * The display name of the namespace.
             */
            public Builder namespaceShowName(String namespaceShowName) {
                this.namespaceShowName = namespaceShowName;
                return this;
            }

            /**
             * The quota of configurations.
             */
            public Builder quota(Integer quota) {
                this.quota = quota;
                return this;
            }

            /**
             * The type of the namespace. Valid values:
             * <p>
             * - `0`: global configuration
             * - `1`: default namespace
             * - `2`: custom namespace
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
