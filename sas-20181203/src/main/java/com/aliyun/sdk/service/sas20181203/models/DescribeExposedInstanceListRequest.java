// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedInstanceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedInstanceListRequest</p>
 */
public class DescribeExposedInstanceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExposureComponent")
    private String exposureComponent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExposureIp")
    private String exposureIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExposurePort")
    private String exposurePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthStatus")
    private Boolean healthStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulStatus")
    private Boolean vulStatus;

    private DescribeExposedInstanceListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.exposureComponent = builder.exposureComponent;
        this.exposureIp = builder.exposureIp;
        this.exposurePort = builder.exposurePort;
        this.groupId = builder.groupId;
        this.healthStatus = builder.healthStatus;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.pageSize = builder.pageSize;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.vulStatus = builder.vulStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedInstanceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return exposureComponent
     */
    public String getExposureComponent() {
        return this.exposureComponent;
    }

    /**
     * @return exposureIp
     */
    public String getExposureIp() {
        return this.exposureIp;
    }

    /**
     * @return exposurePort
     */
    public String getExposurePort() {
        return this.exposurePort;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return healthStatus
     */
    public Boolean getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return vulStatus
     */
    public Boolean getVulStatus() {
        return this.vulStatus;
    }

    public static final class Builder extends Request.Builder<DescribeExposedInstanceListRequest, Builder> {
        private Integer currentPage; 
        private String exposureComponent; 
        private String exposureIp; 
        private String exposurePort; 
        private Long groupId; 
        private Boolean healthStatus; 
        private String instanceId; 
        private String instanceName; 
        private Integer pageSize; 
        private Long resourceDirectoryAccountId; 
        private Boolean vulStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExposedInstanceListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.exposureComponent = request.exposureComponent;
            this.exposureIp = request.exposureIp;
            this.exposurePort = request.exposurePort;
            this.groupId = request.groupId;
            this.healthStatus = request.healthStatus;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.pageSize = request.pageSize;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.vulStatus = request.vulStatus;
        } 

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The server component that is exposed on the Internet.
         */
        public Builder exposureComponent(String exposureComponent) {
            this.putQueryParameter("ExposureComponent", exposureComponent);
            this.exposureComponent = exposureComponent;
            return this;
        }

        /**
         * The public IP address of the server.
         */
        public Builder exposureIp(String exposureIp) {
            this.putQueryParameter("ExposureIp", exposureIp);
            this.exposureIp = exposureIp;
            return this;
        }

        /**
         * The port that is exposed on the Internet.
         */
        public Builder exposurePort(String exposurePort) {
            this.putQueryParameter("ExposurePort", exposurePort);
            this.exposurePort = exposurePort;
            return this;
        }

        /**
         * The ID of the server group.
         * <p>
         * 
         * > You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The health status of the Elastic Compute Service (ECS) instance in the scaling group. ECS instances that are not in the Running state are considered unhealthy. Valid values:
         * <p>
         * 
         * *   Healthy
         * *   Unhealthy
         * 
         * Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases the automatically created instances among the unhealthy instances.
         * 
         * Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of the instance lifecycle. If the lifecycle of the ECS instances is not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release them. If the lifecycle of the ECS instances is managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases them.
         * 
         * >  Make sure that you have sufficient balance within your account. If you have overdue payments in your account, pay-as-you-go and preemptible instances are stopped or released. For information about how the status of ECS instances changes when you have overdue payments in your account, see [Overdue payments](~~170589~~).
         */
        public Builder healthStatus(Boolean healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * The ID of the server.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the server.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The Alibaba Cloud account ID of the member in the resource directory.
         * <p>
         * 
         * >  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to obtain the ID.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * Specifies whether the server has vulnerabilities. Valid values:
         * <p>
         * 
         * *   **true**: The server has vulnerabilities.
         * *   **false**: The server does not have vulnerabilities.
         */
        public Builder vulStatus(Boolean vulStatus) {
            this.putQueryParameter("VulStatus", vulStatus);
            this.vulStatus = vulStatus;
            return this;
        }

        @Override
        public DescribeExposedInstanceListRequest build() {
            return new DescribeExposedInstanceListRequest(this);
        } 

    } 

}
