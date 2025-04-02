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
 * {@link UpdateNacosClusterRequest} extends {@link RequestModel}
 *
 * <p>UpdateNacosClusterRequest</p>
 */
public class UpdateNacosClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckPort")
    private Integer checkPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthChecker")
    private String healthChecker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseInstancePortForCheck")
    private Boolean useInstancePortForCheck;

    private UpdateNacosClusterRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.checkPort = builder.checkPort;
        this.clusterName = builder.clusterName;
        this.groupName = builder.groupName;
        this.healthChecker = builder.healthChecker;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.serviceName = builder.serviceName;
        this.useInstancePortForCheck = builder.useInstancePortForCheck;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNacosClusterRequest create() {
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
     * @return checkPort
     */
    public Integer getCheckPort() {
        return this.checkPort;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return healthChecker
     */
    public String getHealthChecker() {
        return this.healthChecker;
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return useInstancePortForCheck
     */
    public Boolean getUseInstancePortForCheck() {
        return this.useInstancePortForCheck;
    }

    public static final class Builder extends Request.Builder<UpdateNacosClusterRequest, Builder> {
        private String acceptLanguage; 
        private Integer checkPort; 
        private String clusterName; 
        private String groupName; 
        private String healthChecker; 
        private String instanceId; 
        private String namespaceId; 
        private String serviceName; 
        private Boolean useInstancePortForCheck; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNacosClusterRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.checkPort = request.checkPort;
            this.clusterName = request.clusterName;
            this.groupName = request.groupName;
            this.healthChecker = request.healthChecker;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.serviceName = request.serviceName;
            this.useInstancePortForCheck = request.useInstancePortForCheck;
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
         * <p>The port used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder checkPort(Integer checkPort) {
            this.putQueryParameter("CheckPort", checkPort);
            this.checkPort = checkPort;
            return this;
        }

        /**
         * <p>The name of the Nacos cluster.</p>
         * <p>This parameter is required.</p>
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
         * <p>The type of the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;none&quot;}</p>
         */
        public Builder healthChecker(String healthChecker) {
            this.putQueryParameter("HealthChecker", healthChecker);
            this.healthChecker = healthChecker;
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
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>9e78a671-4b9b-4dd4-99c1-0b9da87d3dec</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
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
         * <p>Specifies whether to use the port of the instance for a health check.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useInstancePortForCheck(Boolean useInstancePortForCheck) {
            this.putQueryParameter("UseInstancePortForCheck", useInstancePortForCheck);
            this.useInstancePortForCheck = useInstancePortForCheck;
            return this;
        }

        @Override
        public UpdateNacosClusterRequest build() {
            return new UpdateNacosClusterRequest(this);
        } 

    } 

}
