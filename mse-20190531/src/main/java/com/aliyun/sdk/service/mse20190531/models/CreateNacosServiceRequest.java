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
 * {@link CreateNacosServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateNacosServiceRequest</p>
 */
public class CreateNacosServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ephemeral")
    private Boolean ephemeral;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectThreshold")
    private String protectThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    private CreateNacosServiceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.ephemeral = builder.ephemeral;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.protectThreshold = builder.protectThreshold;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNacosServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return ephemeral
     */
    public Boolean getEphemeral() {
        return this.ephemeral;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return protectThreshold
     */
    public String getProtectThreshold() {
        return this.protectThreshold;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<CreateNacosServiceRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private Boolean ephemeral; 
        private String groupName; 
        private String instanceId; 
        private String namespaceId; 
        private String protectThreshold; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateNacosServiceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterId = request.clusterId;
            this.ephemeral = request.ephemeral;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.protectThreshold = request.protectThreshold;
            this.serviceName = request.serviceName;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p>This operation contains both the InstanceId and ClusterId parameters. You must specify one of them.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mse-3691a080</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether the instance is marked as a temporary node. Valid values:</p>
         * <ul>
         * <li><code>true</code>: yes</li>
         * <li><code>false</code>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ephemeral(Boolean ephemeral) {
            this.putQueryParameter("Ephemeral", ephemeral);
            this.ephemeral = ephemeral;
            return this;
        }

        /**
         * <p>The name of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>This operation contains both the InstanceId and ClusterId parameters. You must specify one of them.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-st21ri2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The protection threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder protectThreshold(String protectThreshold) {
            this.putQueryParameter("ProtectThreshold", protectThreshold);
            this.protectThreshold = protectThreshold;
            return this;
        }

        /**
         * <p>The name of the service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibabacloud.hipstershop.cartserviceapi.service.CartService</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public CreateNacosServiceRequest build() {
            return new CreateNacosServiceRequest(this);
        } 

    } 

}
