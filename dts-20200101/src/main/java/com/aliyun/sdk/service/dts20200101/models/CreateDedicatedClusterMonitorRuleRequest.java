// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link CreateDedicatedClusterMonitorRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateDedicatedClusterMonitorRuleRequest</p>
 */
public class CreateDedicatedClusterMonitorRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuAlarmThreshold")
    private Long cpuAlarmThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dedicatedClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskAlarmThreshold")
    private Long diskAlarmThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DuAlarmThreshold")
    private Long duAlarmThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemAlarmThreshold")
    private Long memAlarmThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoticeSwitch")
    private Long noticeSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phones")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phones;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
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
         * <p>The alert threshold for CPU utilization. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder cpuAlarmThreshold(Long cpuAlarmThreshold) {
            this.putQueryParameter("CpuAlarmThreshold", cpuAlarmThreshold);
            this.cpuAlarmThreshold = cpuAlarmThreshold;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dts-dasd22******</p>
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putQueryParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * <p>The alert threshold for disk usage. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder diskAlarmThreshold(Long diskAlarmThreshold) {
            this.putQueryParameter("DiskAlarmThreshold", diskAlarmThreshold);
            this.diskAlarmThreshold = diskAlarmThreshold;
            return this;
        }

        /**
         * <p>The alert threshold for DTS Unit (DU) usage. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder duAlarmThreshold(Long duAlarmThreshold) {
            this.putQueryParameter("DuAlarmThreshold", duAlarmThreshold);
            this.duAlarmThreshold = duAlarmThreshold;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1162kryivb8****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The alert threshold for memory usage. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder memAlarmThreshold(Long memAlarmThreshold) {
            this.putQueryParameter("MemAlarmThreshold", memAlarmThreshold);
            this.memAlarmThreshold = memAlarmThreshold;
            return this;
        }

        /**
         * <p>Specifies whether to enable the alert feature. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables the alert feature.</li>
         * <li><strong>0</strong>: disables the alert feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The mobile phone number to which alerts are sent. Separate multiple mobile phone numbers with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>186****7654</p>
         */
        public Builder phones(String phones) {
            this.putQueryParameter("Phones", phones);
            this.phones = phones;
            return this;
        }

        /**
         * <p>The ID of the region in which the Data Transmission Service (DTS) instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID. This parameter is a global parameter and not required.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource group ID. This parameter is a global parameter and not required.</p>
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
