// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNacosClusterRequest} extends {@link RequestModel}
 *
 * <p>UpdateNacosClusterRequest</p>
 */
public class UpdateNacosClusterRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("CheckPort")
    private Integer checkPort;

    @Query
    @NameInMap("ClusterName")
    @Validation(required = true)
    private String clusterName;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("HealthChecker")
    private String healthChecker;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Query
    @NameInMap("UseInstancePortForCheck")
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
         * system error
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * cluster not found
         */
        public Builder checkPort(Integer checkPort) {
            this.putQueryParameter("CheckPort", checkPort);
            this.checkPort = checkPort;
            return this;
        }

        /**
         * clusterNotFound
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * illegal request:%s
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * systemError
         */
        public Builder healthChecker(String healthChecker) {
            this.putQueryParameter("HealthChecker", healthChecker);
            this.healthChecker = healthChecker;
            return this;
        }

        /**
         * mse-100-007
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * mse-200-021
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * illegalRequest
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * mse-100-001
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
