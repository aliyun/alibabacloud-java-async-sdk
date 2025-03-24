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
 * {@link UpdateNacosInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateNacosInstanceRequest</p>
 */
public class UpdateNacosInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ephemeral")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean ephemeral;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private String metadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Weight")
    @com.aliyun.core.annotation.Validation(required = true)
    private String weight;

    private UpdateNacosInstanceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterName = builder.clusterName;
        this.enabled = builder.enabled;
        this.ephemeral = builder.ephemeral;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.metadata = builder.metadata;
        this.namespaceId = builder.namespaceId;
        this.port = builder.port;
        this.serviceName = builder.serviceName;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNacosInstanceRequest create() {
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
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return metadata
     */
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return weight
     */
    public String getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<UpdateNacosInstanceRequest, Builder> {
        private String acceptLanguage; 
        private String clusterName; 
        private Boolean enabled; 
        private Boolean ephemeral; 
        private String groupName; 
        private String instanceId; 
        private String ip; 
        private String metadata; 
        private String namespaceId; 
        private Integer port; 
        private String serviceName; 
        private String weight; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNacosInstanceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterName = request.clusterName;
            this.enabled = request.enabled;
            this.ephemeral = request.ephemeral;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.metadata = request.metadata;
            this.namespaceId = request.namespaceId;
            this.port = request.port;
            this.serviceName = request.serviceName;
            this.weight = request.weight;
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
         * <p>The name of the Nacos instance.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>Specifies whether to disable this service. Valid values:</p>
         * <ul>
         * <li><code>true</code>: yes.</li>
         * <li><code>false</code>: no.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>Specifies whether the node is a non-persistent node. Valid values:</p>
         * <ul>
         * <li><code>true</code>: yes.</li>
         * <li><code>false</code>: no.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ephemeral(Boolean ephemeral) {
            this.putQueryParameter("Ephemeral", ephemeral);
            this.ephemeral = ephemeral;
            return this;
        }

        /**
         * <p>The name of the group.</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-123456</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IP address of the Nacos instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.X.X</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The metadata of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>[int]</p>
         */
        public Builder metadata(String metadata) {
            this.putBodyParameter("Metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>9e78a671-4b9b-4dd4-99c1-0****</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The port number of the Nacos instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12281</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The name of the service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hello_service</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The weight. Valid values: 0 to 10000. The value must be an integer. A larger value indicates a higher frequency at which the instance is accessed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder weight(String weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public UpdateNacosInstanceRequest build() {
            return new UpdateNacosInstanceRequest(this);
        } 

    } 

}
