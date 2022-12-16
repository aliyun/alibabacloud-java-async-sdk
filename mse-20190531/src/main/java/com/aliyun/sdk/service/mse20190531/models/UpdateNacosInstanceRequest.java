// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNacosInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateNacosInstanceRequest</p>
 */
public class UpdateNacosInstanceRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterName")
    private String clusterName;

    @Query
    @NameInMap("Enabled")
    @Validation(required = true)
    private Boolean enabled;

    @Query
    @NameInMap("Ephemeral")
    @Validation(required = true)
    private Boolean ephemeral;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Ip")
    @Validation(required = true)
    private String ip;

    @Body
    @NameInMap("Metadata")
    private String metadata;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private Integer port;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Query
    @NameInMap("Weight")
    @Validation(required = true)
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
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The name of the Nacos instance.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * Specifies whether to disable this service. Valid values:
         * <p>
         * 
         * *   `true`: yes
         * *   `false`: no
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * Specifies whether the node is a non-persistent node. Valid values:
         * <p>
         * 
         * *   `true`: yes
         * *   `false`: no
         */
        public Builder ephemeral(Boolean ephemeral) {
            this.putQueryParameter("Ephemeral", ephemeral);
            this.ephemeral = ephemeral;
            return this;
        }

        /**
         * The name of the group.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The IP address of the Nacos instance.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * The metadata of the instance.
         */
        public Builder metadata(String metadata) {
            this.putBodyParameter("Metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * The ID of the namespace.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * The port of the Nacos instance.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The name of the service.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The weight. Valid values: 0 to 10000. The value must be an integer. A larger value indicates a higher frequency at which the instance is accessed.
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
