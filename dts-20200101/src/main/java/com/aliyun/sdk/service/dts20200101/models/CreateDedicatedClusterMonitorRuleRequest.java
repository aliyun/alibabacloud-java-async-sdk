// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedClusterMonitorRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateDedicatedClusterMonitorRuleRequest</p>
 */
public class CreateDedicatedClusterMonitorRuleRequest extends Request {
    @Query
    @NameInMap("CpuAlarmThreshold")
    private Long cpuAlarmThreshold;

    @Query
    @NameInMap("DedicatedClusterId")
    @Validation(required = true)
    private String dedicatedClusterId;

    @Query
    @NameInMap("DiskAlarmThreshold")
    private Long diskAlarmThreshold;

    @Query
    @NameInMap("DuAlarmThreshold")
    private Long duAlarmThreshold;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MemAlarmThreshold")
    private Long memAlarmThreshold;

    @Query
    @NameInMap("NoticeSwitch")
    private Long noticeSwitch;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("Phones")
    @Validation(required = true)
    private String phones;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateDedicatedClusterMonitorRuleRequest(Builder builder) {
        super(builder);
        this.cpuAlarmThreshold = builder.cpuAlarmThreshold;
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.diskAlarmThreshold = builder.diskAlarmThreshold;
        this.duAlarmThreshold = builder.duAlarmThreshold;
        this.instanceId = builder.instanceId;
        this.memAlarmThreshold = builder.memAlarmThreshold;
        this.noticeSwitch = builder.noticeSwitch;
        this.ownerId = builder.ownerId;
        this.phones = builder.phones;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedClusterMonitorRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuAlarmThreshold
     */
    public Long getCpuAlarmThreshold() {
        return this.cpuAlarmThreshold;
    }

    /**
     * @return dedicatedClusterId
     */
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    /**
     * @return diskAlarmThreshold
     */
    public Long getDiskAlarmThreshold() {
        return this.diskAlarmThreshold;
    }

    /**
     * @return duAlarmThreshold
     */
    public Long getDuAlarmThreshold() {
        return this.duAlarmThreshold;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return memAlarmThreshold
     */
    public Long getMemAlarmThreshold() {
        return this.memAlarmThreshold;
    }

    /**
     * @return noticeSwitch
     */
    public Long getNoticeSwitch() {
        return this.noticeSwitch;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phones
     */
    public String getPhones() {
        return this.phones;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateDedicatedClusterMonitorRuleRequest, Builder> {
        private Long cpuAlarmThreshold; 
        private String dedicatedClusterId; 
        private Long diskAlarmThreshold; 
        private Long duAlarmThreshold; 
        private String instanceId; 
        private Long memAlarmThreshold; 
        private Long noticeSwitch; 
        private String ownerId; 
        private String phones; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDedicatedClusterMonitorRuleRequest request) {
            super(request);
            this.cpuAlarmThreshold = request.cpuAlarmThreshold;
            this.dedicatedClusterId = request.dedicatedClusterId;
            this.diskAlarmThreshold = request.diskAlarmThreshold;
            this.duAlarmThreshold = request.duAlarmThreshold;
            this.instanceId = request.instanceId;
            this.memAlarmThreshold = request.memAlarmThreshold;
            this.noticeSwitch = request.noticeSwitch;
            this.ownerId = request.ownerId;
            this.phones = request.phones;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The alert threshold for CPU utilization. Unit: percentage.
         */
        public Builder cpuAlarmThreshold(Long cpuAlarmThreshold) {
            this.putQueryParameter("CpuAlarmThreshold", cpuAlarmThreshold);
            this.cpuAlarmThreshold = cpuAlarmThreshold;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putQueryParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * The alert threshold for disk usage. Unit: percentage.
         */
        public Builder diskAlarmThreshold(Long diskAlarmThreshold) {
            this.putQueryParameter("DiskAlarmThreshold", diskAlarmThreshold);
            this.diskAlarmThreshold = diskAlarmThreshold;
            return this;
        }

        /**
         * The alert threshold for DTS Unit (DU) usage. Unit: percentage.
         */
        public Builder duAlarmThreshold(Long duAlarmThreshold) {
            this.putQueryParameter("DuAlarmThreshold", duAlarmThreshold);
            this.duAlarmThreshold = duAlarmThreshold;
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
         * The alert threshold for memory usage. Unit: percentage.
         */
        public Builder memAlarmThreshold(Long memAlarmThreshold) {
            this.putQueryParameter("MemAlarmThreshold", memAlarmThreshold);
            this.memAlarmThreshold = memAlarmThreshold;
            return this;
        }

        /**
         * Specifies whether to enable the alert feature. Valid values:
         * <p>
         * 
         * *   **1**: enables the alert feature.
         * *   **0**: disables the alert feature.
         */
        public Builder noticeSwitch(Long noticeSwitch) {
            this.putQueryParameter("NoticeSwitch", noticeSwitch);
            this.noticeSwitch = noticeSwitch;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The mobile phone number to which alerts are sent. Separate multiple mobile phone numbers with commas (,).
         */
        public Builder phones(String phones) {
            this.putQueryParameter("Phones", phones);
            this.phones = phones;
            return this;
        }

        /**
         * The ID of the region in which the Data Transmission Service (DTS) instance resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateDedicatedClusterMonitorRuleRequest build() {
            return new CreateDedicatedClusterMonitorRuleRequest(this);
        } 

    } 

}
