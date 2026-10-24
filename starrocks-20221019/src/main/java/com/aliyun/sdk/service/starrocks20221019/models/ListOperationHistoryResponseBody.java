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
 * {@link ListOperationHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationHistoryResponseBody</p>
 */
public class ListOperationHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListOperationHistoryResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationHistoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListOperationHistoryResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The details of the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParams</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid params: [instance not exists].</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>832</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListOperationHistoryResponseBody build() {
            return new ListOperationHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationHistoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterValue")
        private String afterValue;

        @com.aliyun.core.annotation.NameInMap("BeforeValue")
        private String beforeValue;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtEnd")
        private Long gmtEnd;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OperationDetail")
        private String operationDetail;

        @com.aliyun.core.annotation.NameInMap("OperationId")
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("OperationStatus")
        private String operationStatus;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        private Data(Builder builder) {
            this.afterValue = builder.afterValue;
            this.beforeValue = builder.beforeValue;
            this.gmtCreate = builder.gmtCreate;
            this.gmtEnd = builder.gmtEnd;
            this.instanceId = builder.instanceId;
            this.operationDetail = builder.operationDetail;
            this.operationId = builder.operationId;
            this.operationStatus = builder.operationStatus;
            this.operationType = builder.operationType;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return afterValue
         */
        public String getAfterValue() {
            return this.afterValue;
        }

        /**
         * @return beforeValue
         */
        public String getBeforeValue() {
            return this.beforeValue;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtEnd
         */
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return operationDetail
         */
        public String getOperationDetail() {
            return this.operationDetail;
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
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private String afterValue; 
            private String beforeValue; 
            private Long gmtCreate; 
            private Long gmtEnd; 
            private String instanceId; 
            private String operationDetail; 
            private String operationId; 
            private String operationStatus; 
            private String operationType; 
            private Integer progress; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.afterValue = model.afterValue;
                this.beforeValue = model.beforeValue;
                this.gmtCreate = model.gmtCreate;
                this.gmtEnd = model.gmtEnd;
                this.instanceId = model.instanceId;
                this.operationDetail = model.operationDetail;
                this.operationId = model.operationId;
                this.operationStatus = model.operationStatus;
                this.operationType = model.operationType;
                this.progress = model.progress;
            } 

            /**
             * <p>The value after the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>FE enable = true</p>
             */
            public Builder afterValue(String afterValue) {
                this.afterValue = afterValue;
                return this;
            }

            /**
             * <p>The value before the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>FE enable = false</p>
             */
            public Builder beforeValue(String beforeValue) {
                this.beforeValue = beforeValue;
                return this;
            }

            /**
             * <p>The start time of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1742179008000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The end time of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1742179008000</p>
             */
            public Builder gmtEnd(Long gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-cd7a3a6f2186d5c9</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The operation details.</p>
             * 
             * <strong>example:</strong>
             * <p>Insufficient inventory. The operation failed and a refund has been issued</p>
             */
            public Builder operationDetail(String operationDetail) {
                this.operationDetail = operationDetail;
                return this;
            }

            /**
             * <p>The operation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>op-f49743caa809****</p>
             */
            public Builder operationId(String operationId) {
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
             * <p>upgrade_version</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The operation progress.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
