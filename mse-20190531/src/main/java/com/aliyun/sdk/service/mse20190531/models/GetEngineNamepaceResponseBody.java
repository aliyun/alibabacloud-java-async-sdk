// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link GetEngineNamepaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetEngineNamepaceResponseBody</p>
 */
public class GetEngineNamepaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigCount")
    private String configCount;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("NamespaceDesc")
    private String namespaceDesc;

    @com.aliyun.core.annotation.NameInMap("NamespaceShowName")
    private String namespaceShowName;

    @com.aliyun.core.annotation.NameInMap("Quota")
    private String quota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Type")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetEngineNamepaceResponseBody model) {
            this.configCount = model.configCount;
            this.errorCode = model.errorCode;
            this.httpCode = model.httpCode;
            this.message = model.message;
            this.namespace = model.namespace;
            this.namespaceDesc = model.namespaceDesc;
            this.namespaceShowName = model.namespaceShowName;
            this.quota = model.quota;
            this.requestId = model.requestId;
            this.success = model.success;
            this.type = model.type;
        } 

        /**
         * <p>The number of configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder configCount(String configCount) {
            this.configCount = configCount;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>202</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>mytest</p>
         */
        public Builder namespaceDesc(String namespaceDesc) {
            this.namespaceDesc = namespaceDesc;
            return this;
        }

        /**
         * <p>The display name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder namespaceShowName(String namespaceShowName) {
            this.namespaceShowName = namespaceShowName;
            return this;
        }

        /**
         * <p>The quota of configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder quota(String quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FA8F966F-420C-52F5-B49E-6ED7CCE02697</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The type of the namespace. Valid values:</p>
         * <ul>
         * <li>0: global configuration</li>
         * <li>1: default namespace</li>
         * <li>2: custom namespace</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
