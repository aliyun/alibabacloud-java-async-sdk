// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEngineNamepaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetEngineNamepaceResponseBody</p>
 */
public class GetEngineNamepaceResponseBody extends TeaModel {
    @NameInMap("ConfigCount")
    private String configCount;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpCode")
    private String httpCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("NamespaceDesc")
    private String namespaceDesc;

    @NameInMap("NamespaceShowName")
    private String namespaceShowName;

    @NameInMap("Quota")
    private String quota;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Type")
    private String type;

    private GetEngineNamepaceResponseBody(Builder builder) {
        this.configCount = builder.configCount;
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.namespace = builder.namespace;
        this.namespaceDesc = builder.namespaceDesc;
        this.namespaceShowName = builder.namespaceShowName;
        this.quota = builder.quota;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEngineNamepaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return configCount
     */
    public String getConfigCount() {
        return this.configCount;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getQuota() {
        return this.quota;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String configCount; 
        private String errorCode; 
        private String httpCode; 
        private String message; 
        private String namespace; 
        private String namespaceDesc; 
        private String namespaceShowName; 
        private String quota; 
        private String requestId; 
        private Boolean success; 
        private String type; 

        /**
         * The number of configurations.
         */
        public Builder configCount(String configCount) {
            this.configCount = configCount;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
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
         * The ID of the namespace.
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
        public Builder quota(String quota) {
            this.quota = quota;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The type of the namespace. Valid values:
         * <p>
         * 
         * *   0: global configuration
         * *   1: default namespace
         * *   2: custom namespace
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetEngineNamepaceResponseBody build() {
            return new GetEngineNamepaceResponseBody(this);
        } 

    } 

}
