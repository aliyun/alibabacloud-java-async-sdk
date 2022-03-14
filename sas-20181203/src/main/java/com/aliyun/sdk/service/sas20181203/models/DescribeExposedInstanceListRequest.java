// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedInstanceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedInstanceListRequest</p>
 */
public class DescribeExposedInstanceListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ExposureComponent")
    private String exposureComponent;

    @Query
    @NameInMap("ExposureIp")
    private String exposureIp;

    @Query
    @NameInMap("ExposurePort")
    private String exposurePort;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("HealthStatus")
    private Boolean healthStatus;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("VulStatus")
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
            this.vulStatus = request.vulStatus;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ExposureComponent.
         */
        public Builder exposureComponent(String exposureComponent) {
            this.putQueryParameter("ExposureComponent", exposureComponent);
            this.exposureComponent = exposureComponent;
            return this;
        }

        /**
         * ExposureIp.
         */
        public Builder exposureIp(String exposureIp) {
            this.putQueryParameter("ExposureIp", exposureIp);
            this.exposureIp = exposureIp;
            return this;
        }

        /**
         * ExposurePort.
         */
        public Builder exposurePort(String exposurePort) {
            this.putQueryParameter("ExposurePort", exposurePort);
            this.exposurePort = exposurePort;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * HealthStatus.
         */
        public Builder healthStatus(Boolean healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * VulStatus.
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
