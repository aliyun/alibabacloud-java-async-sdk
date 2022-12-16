// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNacosInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteNacosInstanceRequest</p>
 */
public class DeleteNacosInstanceRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterName")
    private String clusterName;

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

    private DeleteNacosInstanceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterName = builder.clusterName;
        this.ephemeral = builder.ephemeral;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.namespaceId = builder.namespaceId;
        this.port = builder.port;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNacosInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteNacosInstanceRequest, Builder> {
        private String acceptLanguage; 
        private String clusterName; 
        private Boolean ephemeral; 
        private String groupName; 
        private String instanceId; 
        private String ip; 
        private String namespaceId; 
        private Integer port; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNacosInstanceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterName = request.clusterName;
            this.ephemeral = request.ephemeral;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.namespaceId = request.namespaceId;
            this.port = request.port;
            this.serviceName = request.serviceName;
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
         * The name of the instance.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * Specifies whether the instance is a temporary node. Valid values:
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
         * The IP address of the instance.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
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
         * The port number of the instance.
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

        @Override
        public DeleteNacosInstanceRequest build() {
            return new DeleteNacosInstanceRequest(this);
        } 

    } 

}
