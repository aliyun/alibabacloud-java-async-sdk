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
 * {@link DeleteNacosInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteNacosInstanceRequest</p>
 */
public class DeleteNacosInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

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
         * <p>The alias of the cluster.</p>
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
         * <p>Specifies whether the node is an ephemeral node. Valid values:</p>
         * <ul>
         * <li><code>true</code>: yes</li>
         * <li><code>false</code>: no</li>
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
         * <p>The ID of the Nacos instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-st21v5****</p>
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
         * <p>10.237.1.32</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>9e78a671-4b9b-4dd4-99c1-0b9da87****</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The port of the Nacos instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
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

        @Override
        public DeleteNacosInstanceRequest build() {
            return new DeleteNacosInstanceRequest(this);
        } 

    } 

}
