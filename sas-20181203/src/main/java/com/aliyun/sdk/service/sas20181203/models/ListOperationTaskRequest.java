// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListOperationTaskRequest} extends {@link RequestModel}
 *
 * <p>ListOperationTaskRequest</p>
 */
public class ListOperationTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationTaskInstances")
    private java.util.List<OperationTaskInstances> operationTaskInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListOperationTaskRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.operationTaskInstances = builder.operationTaskInstances;
        this.pageSize = builder.pageSize;
        this.statuses = builder.statuses;
        this.taskId = builder.taskId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operationTaskInstances
     */
    public java.util.List<OperationTaskInstances> getOperationTaskInstances() {
        return this.operationTaskInstances;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListOperationTaskRequest, Builder> {
        private Long checkId; 
        private Integer currentPage; 
        private String lang; 
        private java.util.List<OperationTaskInstances> operationTaskInstances; 
        private Integer pageSize; 
        private java.util.List<String> statuses; 
        private String taskId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationTaskRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.operationTaskInstances = request.operationTaskInstances;
            this.pageSize = request.pageSize;
            this.statuses = request.statuses;
            this.taskId = request.taskId;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> API to obtain the check item ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>76</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The page number to display in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Set the language type for the request and response messages. The default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The instance information of the operation tasks to be queried.</p>
         */
        public Builder operationTaskInstances(java.util.List<OperationTaskInstances> operationTaskInstances) {
            this.putQueryParameter("OperationTaskInstances", operationTaskInstances);
            this.operationTaskInstances = operationTaskInstances;
            return this;
        }

        /**
         * <p>The maximum number of items to display per page in a paginated query.</p>
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
         * <p>A list of task statuses. Multiple statuses should be separated by commas (,). Values:</p>
         * <ul>
         * <li><strong>INIT</strong>: Initialization</li>
         * <li><strong>FAIL</strong>: Processing failed</li>
         * <li><strong>THROTTLING</strong>: Repairing concurrently</li>
         * <li><strong>IN_BACKUP</strong>: Backing up</li>
         * <li><strong>BACKED_UP</strong>: Backed up</li>
         * <li><strong>BACKUP_FAIL</strong>: Backup failed</li>
         * <li><strong>REPAIRING</strong>: Repairing</li>
         * <li><strong>REPAIR_SUCCESS</strong>: Repair succeeded</li>
         * <li><strong>REPAIR_FAIL</strong>: Repair failed</li>
         * <li><strong>REPAIR_SUCCESS_VERIFYING</strong>: Verifying repair success</li>
         * <li><strong>REPAIR_SUCCESS_UNVERIFIED</strong>: Repair success verification failed</li>
         * <li><strong>REPAIR_SUCCESS_VERIFIED</strong>: Repair success verified</li>
         * <li><strong>REPAIR_RE_EXECUTE</strong>: Re-executing repair</li>
         * <li><strong>ROLL_BACKING</strong>: Rolling back</li>
         * <li><strong>ROLL_BACKED</strong>: Rolled back</li>
         * <li><strong>ROLL_BACK_FAIL</strong>: Rollback failed</li>
         * <li><strong>ROLL_BACK_INIT</strong>: Rollback initiated</li>
         * <li><strong>ROLL_BACK_VERIFYING</strong>: Verifying rollback success</li>
         * <li><strong>ROLL_BACK_UNVERIFIED</strong>: Rollback success verification failed</li>
         * <li><strong>ROLL_BACK_VERIFIED</strong>: Rollback success verified</li>
         * </ul>
         */
        public Builder statuses(java.util.List<String> statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * <p>The ID of the task to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>d7b2acf8d362742123e4a84e1bf8****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The type of operation task to be queried:</p>
         * <ul>
         * <li>REPAIR: Repair</li>
         * <li>ROLLBACK: Rollback</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REPAIR</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListOperationTaskRequest build() {
            return new ListOperationTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationTaskRequest} extends {@link TeaModel}
     *
     * <p>ListOperationTaskRequest</p>
     */
    public static class OperationTaskInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private OperationTaskInstances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationTaskInstances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 
            private String vendor; 

            /**
             * <p>The instance ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>am-bp1vy2yaj1nvx****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the region where the instance is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Cloud asset vendor.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public OperationTaskInstances build() {
                return new OperationTaskInstances(this);
            } 

        } 

    }
}
