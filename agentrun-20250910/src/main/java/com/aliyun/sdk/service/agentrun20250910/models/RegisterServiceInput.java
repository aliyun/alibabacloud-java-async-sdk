// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link RegisterServiceInput} extends {@link TeaModel}
 *
 * <p>RegisterServiceInput</p>
 */
public class RegisterServiceInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("resourceName")
    private String resourceName;

    @com.aliyun.core.annotation.NameInMap("serviceBackendEndpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceBackendEndpoint;

    @com.aliyun.core.annotation.NameInMap("serviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("serviceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private RegisterServiceInput(Builder builder) {
        this.credentialName = builder.credentialName;
        this.protocol = builder.protocol;
        this.resourceName = builder.resourceName;
        this.serviceBackendEndpoint = builder.serviceBackendEndpoint;
        this.serviceName = builder.serviceName;
        this.serviceType = builder.serviceType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterServiceInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return serviceBackendEndpoint
     */
    public String getServiceBackendEndpoint() {
        return this.serviceBackendEndpoint;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder {
        private String credentialName; 
        private String protocol; 
        private String resourceName; 
        private String serviceBackendEndpoint; 
        private String serviceName; 
        private String serviceType; 
        private String tenantId; 

        private Builder() {
        } 

        private Builder(RegisterServiceInput model) {
            this.credentialName = model.credentialName;
            this.protocol = model.protocol;
            this.resourceName = model.resourceName;
            this.serviceBackendEndpoint = model.serviceBackendEndpoint;
            this.serviceName = model.serviceName;
            this.serviceType = model.serviceType;
            this.tenantId = model.tenantId;
        } 

        /**
         * <p>关联的凭证ID，用于服务认证</p>
         * 
         * <strong>example:</strong>
         * <p>my-credential</p>
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }

        /**
         * <p>服务的协议类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>关联的资源名称</p>
         * 
         * <strong>example:</strong>
         * <p>my-resource</p>
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>转发的下游服务端点URL，必须是有效的HTTP/HTTPS地址（这里是 FC trigger endpoint）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://123456789.cn-hangzhou.fc.aliyuncs.com/2016-08-15/proxy/my-service/my-function/">https://123456789.cn-hangzhou.fc.aliyuncs.com/2016-08-15/proxy/my-service/my-function/</a></p>
         */
        public Builder serviceBackendEndpoint(String serviceBackendEndpoint) {
            this.serviceBackendEndpoint = serviceBackendEndpoint;
            return this;
        }

        /**
         * <p>服务名称，在租户内唯一</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-service</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>服务类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC</p>
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>租户ID，用于多租户隔离</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public RegisterServiceInput build() {
            return new RegisterServiceInput(this);
        } 

    } 

}
