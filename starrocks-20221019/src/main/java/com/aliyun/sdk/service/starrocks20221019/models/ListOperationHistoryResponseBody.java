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
         * <p>Details about access denied errors.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParams</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid params: [instance not exists].</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total number of records.</p>
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
             * <p>Value after the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>FE enable = true</p>
             */
            public Builder afterValue(String afterValue) {
                this.afterValue = afterValue;
                return this;
            }

            /**
             * <p>Value before the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>FE enable = false</p>
             */
            public Builder beforeValue(String beforeValue) {
                this.beforeValue = beforeValue;
                return this;
            }

            /**
             * <p>Start time of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1742179008000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>End time of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1742179008000</p>
             */
            public Builder gmtEnd(Long gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-cd7a3a6f2186d5c9</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Operation details.</p>
             * 
             * <strong>example:</strong>
             * <p>库存不足，操作失败，已退款</p>
             */
            public Builder operationDetail(String operationDetail) {
                this.operationDetail = operationDetail;
                return this;
            }

            /**
             * <p>Operation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>op-f49743caa809****</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>Operation status:</p>
             * <ul>
             * <li><p>COMPLETED: completed</p>
             * </li>
             * <li><p>TERMINATED: terminated</p>
             * </li>
             * <li><p>HUMAN_PROCESSING: pending manual processing</p>
             * </li>
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
             * <p>Operation type. Valid values:</p>
             * <ul>
             * <li><p>trial_to_official: upgrade from Trial Edition to Standard Edition</p>
             * </li>
             * <li><p>upgrade_version: upgrade version</p>
             * </li>
             * <li><p>update_configuration: update configuration</p>
             * </li>
             * <li><p>update_public_network_status: update public network status</p>
             * </li>
             * <li><p>create_cluster: create cluster</p>
             * </li>
             * <li><p>delete_cluster: delete cluster</p>
             * </li>
             * <li><p>disable_cluster: stop cluster</p>
             * </li>
             * <li><p>enable_cluster: resume cluster</p>
             * </li>
             * <li><p>restart_cluster: restart cluster</p>
             * </li>
             * <li><p>migrate_cluster: migrate cluster</p>
             * </li>
             * <li><p>renew_cluster: renew cluster</p>
             * </li>
             * <li><p>modify_charge_type: change billing method</p>
             * </li>
             * <li><p>UPGRADE: upgrade cluster</p>
             * </li>
             * <li><p>DOWNGRADE: downgrade cluster</p>
             * </li>
             * <li><p>create_node_group: create node group</p>
             * </li>
             * <li><p>delete_node_group: delete node group</p>
             * </li>
             * <li><p>disable_node_group: stop node group</p>
             * </li>
             * <li><p>enable_node_group: resume node group</p>
             * </li>
             * <li><p>sre_operation: O\&amp;M cluster</p>
             * </li>
             * <li><p>resource_change: resource change</p>
             * </li>
             * <li><p>disable_postpaid_resource: disable pay-as-you-go resources</p>
             * </li>
             * <li><p>enable_postpaid_resource: enable pay-as-you-go resources</p>
             * </li>
             * <li><p>restart_node_group: restart compute group</p>
             * </li>
             * <li><p>enable_ha_cluster: enable high availability (HA) for cluster</p>
             * </li>
             * <li><p>restart_node: restart node</p>
             * </li>
             * <li><p>backup: data backup</p>
             * </li>
             * <li><p>delete_backup: delete data backup</p>
             * </li>
             * <li><p>cancel_backup_task: cancel data backup</p>
             * </li>
             * <li><p>modify_timezone: modify system time zone</p>
             * </li>
             * <li><p>restore: data restoration</p>
             * </li>
             * <li><p>switch_az: switch primary and secondary zones</p>
             * </li>
             * <li><p>rollback_upgrade_version: roll back version upgrade</p>
             * </li>
             * <li><p>scale_out_fe: scale out FE</p>
             * </li>
             * <li><p>scale_in_fe: scale in FE</p>
             * </li>
             * <li><p>upgrade_fe_cu: upgrade FE CU specification</p>
             * </li>
             * <li><p>downgrade_fe_cu: downgrade FE CU specification</p>
             * </li>
             * <li><p>increase_fe_disk_size: increase FE disk size</p>
             * </li>
             * <li><p>decrease_fe_disk_size: decrease FE disk size</p>
             * </li>
             * <li><p>increase_fe_disk_number: increase FE disk count</p>
             * </li>
             * <li><p>decrease_fe_disk_number: decrease FE disk count</p>
             * </li>
             * <li><p>upgrade_fe_disk_performance_level: upgrade FE disk performance level</p>
             * </li>
             * <li><p>downgrade_fe_disk_performance_level: downgrade FE disk performance level</p>
             * </li>
             * <li><p>create_agent: create Agent</p>
             * </li>
             * <li><p>upgrade_agent_cu: upgrade Agent CU specification</p>
             * </li>
             * <li><p>scale_out_be: scale out BE</p>
             * </li>
             * <li><p>scale_in_be: scale in BE</p>
             * </li>
             * <li><p>upgrade_be_cu: upgrade BE CU specification</p>
             * </li>
             * <li><p>downgrade_be_cu: downgrade BE CU specification</p>
             * </li>
             * <li><p>increase_be_disk_size: increase BE disk size</p>
             * </li>
             * <li><p>decrease_be_disk_size: decrease BE disk size</p>
             * </li>
             * <li><p>increase_be_disk_number: increase BE disk count</p>
             * </li>
             * <li><p>decrease_be_disk_number: decrease BE disk count</p>
             * </li>
             * <li><p>upgrade_be_disk_performance_level: upgrade BE disk performance level</p>
             * </li>
             * <li><p>downgrade_be_disk_performance_level: downgrade BE disk performance level</p>
             * </li>
             * <li><p>upgrade_be_spec_type: upgrade BE specification type</p>
             * </li>
             * <li><p>downgrade_be_spec_type: downgrade BE specification type</p>
             * </li>
             * <li><p>scale_out_cn: scale out CN</p>
             * </li>
             * <li><p>scale_in_cn: scale in CN</p>
             * </li>
             * <li><p>upgrade_cn_cu: upgrade CN CU specification</p>
             * </li>
             * <li><p>downgrade_cn_cu: downgrade CN CU specification</p>
             * </li>
             * <li><p>increase_cn_disk_size: increase CN disk size</p>
             * </li>
             * <li><p>decrease_cn_disk_size: decrease CN disk size</p>
             * </li>
             * <li><p>increase_cn_disk_number: increase CN disk count</p>
             * </li>
             * <li><p>decrease_cn_disk_number: decrease CN disk count</p>
             * </li>
             * <li><p>upgrade_cn_disk_performance: upgrade CN disk performance level</p>
             * </li>
             * <li><p>downgrade_cn_disk_performance: downgrade CN disk performance level</p>
             * </li>
             * <li><p>upgrade_cn_spec_type: upgrade CN specification type</p>
             * </li>
             * <li><p>downgrade_cn_spec_type: downgrade CN specification type</p>
             * </li>
             * <li><p>elastic_scale_out_cn: elastically scale out CN</p>
             * </li>
             * <li><p>elastic_scale_in_cn: elastically scale in CN</p>
             * </li>
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
             * <p>Operation progress.</p>
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
