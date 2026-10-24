// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link ListOperationHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListOperationHistoryRequest</p>
 */
public class ListOperationHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationId")
    private String operationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationStatus")
    private String operationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private ListOperationHistoryRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.operationId = builder.operationId;
        this.operationStatus = builder.operationStatus;
        this.operationType = builder.operationType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return operationStatus
     */
    public String getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListOperationHistoryRequest, Builder> {
        private Long endTime; 
        private String instanceId; 
        private String operationId; 
        private String operationStatus; 
        private String operationType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationHistoryRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.operationId = request.operationId;
            this.operationStatus = request.operationStatus;
            this.operationType = request.operationType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time of the operation. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>op-f49743caa809****</p>
         */
        public Builder operationId(String operationId) {
            this.putQueryParameter("OperationId", operationId);
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>The operation status. Valid values:</p>
         * <ul>
         * <li>COMPLETED: Completed.</li>
         * <li>TERMINATED: Terminated.</li>
         * <li>HUMAN_PROCESSING: Pending manual processing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        public Builder operationStatus(String operationStatus) {
            this.putQueryParameter("OperationStatus", operationStatus);
            this.operationStatus = operationStatus;
            return this;
        }

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>trial_to_official: Upgrades the trial edition to the standard edition.</li>
         * <li>upgrade_version: Upgrades the version.</li>
         * <li>update_configuration: Updates the configuration.</li>
         * <li>update_public_network_status: Updates the public network status.</li>
         * <li>create_cluster: Creates a cluster.</li>
         * <li>delete_cluster: Deletes a cluster.</li>
         * <li>disable_cluster: Stops a cluster.</li>
         * <li>enable_cluster: Recovers a cluster.</li>
         * <li>restart_cluster: Restarts a cluster.</li>
         * <li>migrate_cluster: Migrates a cluster.</li>
         * <li>renew_cluster: Renews a cluster.</li>
         * <li>modify_charge_type: Changes the billing method.</li>
         * <li>UPGRADE: Upgrades a cluster.</li>
         * <li>DOWNGRADE: Downgrades a cluster.</li>
         * <li>create_node_group: Creates a node group.</li>
         * <li>delete_node_group: Deletes a node group.</li>
         * <li>disable_node_group: Stops a node group.</li>
         * <li>enable_node_group: Recovers a node group.</li>
         * <li>sre_operation: Performs O&amp;M on a cluster.</li>
         * <li>resource_change: Changes resources.</li>
         * <li>disable_postpaid_resource: Disables pay-as-you-go resources.</li>
         * <li>enable_postpaid_resource: Recovers pay-as-you-go resources.</li>
         * <li>restart_node_group: Restarts a compute group.</li>
         * <li>enable_ha_cluster: Enables high availability (HA) to keep the cluster active.</li>
         * <li>restart_node: Restarts a node.</li>
         * <li>backup: Backs up data.</li>
         * <li>delete_backup: Deletes a data backup.</li>
         * <li>cancel_backup_task: Cancels a data backup task.</li>
         * <li>modify_timezone: Modifies the system time zone.</li>
         * <li>restore: Recovers data.</li>
         * <li>switch_az: Switches the primary and secondary zones.</li>
         * <li>rollback_upgrade_version: Rolls back a version upgrade.</li>
         * <li>scale_out_fe: Scales out FE nodes.</li>
         * <li>scale_in_fe: Scales in FE nodes.</li>
         * <li>upgrade_fe_cu: Upgrades the FE CU specifications.</li>
         * <li>downgrade_fe_cu: Decrease the quota of FE CU specifications.</li>
         * <li>increase_fe_disk_size: Increases the FE disk size.</li>
         * <li>decrease_fe_disk_size: Decreases the FE disk size.</li>
         * <li>increase_fe_disk_number: Increases the number of FE disks.</li>
         * <li>decrease_fe_disk_number: Decreases the number of FE disks.</li>
         * <li>upgrade_fe_disk_performance_level: Upgrades the FE disk performance level (PL).</li>
         * <li>downgrade_fe_disk_performance_level: Decrease the quota of the FE disk performance level (PL).</li>
         * <li>create_agent: Creates an agent.</li>
         * <li>upgrade_agent_cu: Upgrades the agent CU specifications.</li>
         * <li>scale_out_be: Scales out BE nodes.</li>
         * <li>scale_in_be: Scales in BE nodes.</li>
         * <li>upgrade_be_cu: Upgrades the BE CU specifications.</li>
         * <li>downgrade_be_cu: Decrease the quota of BE CU specifications.</li>
         * <li>increase_be_disk_size: Increases the BE disk size.</li>
         * <li>decrease_be_disk_size: Decreases the BE disk size.</li>
         * <li>increase_be_disk_number: Increases the number of BE disks.</li>
         * <li>decrease_be_disk_number: Decreases the number of BE disks.</li>
         * <li>upgrade_be_disk_performance_level: Upgrades the BE disk performance level (PL).</li>
         * <li>downgrade_be_disk_performance_level: Decrease the quota of the BE disk performance level (PL).</li>
         * <li>upgrade_be_spec_type: Upgrades the BE specification type.</li>
         * <li>downgrade_be_spec_type: Decrease the quota of the BE specification type.</li>
         * <li>scale_out_cn: Scales out CN nodes.</li>
         * <li>scale_in_cn: Scales in CN nodes.</li>
         * <li>upgrade_cn_cu: Upgrades the CN CU specifications.</li>
         * <li>downgrade_cn_cu: Decrease the quota of CN CU specifications.</li>
         * <li>increase_cn_disk_size: Increases the CN disk size.</li>
         * <li>decrease_cn_disk_size: Decreases the CN disk size.</li>
         * <li>increase_cn_disk_number: Increases the number of CN disks.</li>
         * <li>decrease_cn_disk_number: Decreases the number of CN disks.</li>
         * <li>upgrade_cn_disk_performance: Upgrades the CN disk performance level (PL).</li>
         * <li>downgrade_cn_disk_performance: Decrease the quota of the CN disk performance level (PL).</li>
         * <li>upgrade_cn_spec_type: Upgrades the CN specification type.</li>
         * <li>downgrade_cn_spec_type: Decrease the quota of the CN specification type.</li>
         * <li>elastic_scale_out_cn: Elastically scales out CN nodes.</li>
         * <li>elastic_scale_in_cn: Elastically scales in CN nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>update_configuration</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>The page number of the current page. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for paging in a paged query. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The start time of the operation. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListOperationHistoryRequest build() {
            return new ListOperationHistoryRequest(this);
        } 

    } 

}
