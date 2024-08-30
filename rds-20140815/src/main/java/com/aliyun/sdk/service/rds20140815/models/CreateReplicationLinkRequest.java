// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReplicationLinkRequest} extends {@link RequestModel}
 *
 * <p>CreateReplicationLinkRequest</p>
 */
public class CreateReplicationLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicatorAccount")
    private String replicatorAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicatorPassword")
    private String replicatorPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceAddress")
    private String sourceAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCategory")
    private String sourceCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceName")
    private String sourceInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceRegionId")
    private String sourceInstanceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePort")
    private Long sourcePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private CreateReplicationLinkRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.dryRun = builder.dryRun;
        this.replicatorAccount = builder.replicatorAccount;
        this.replicatorPassword = builder.replicatorPassword;
        this.sourceAddress = builder.sourceAddress;
        this.sourceCategory = builder.sourceCategory;
        this.sourceInstanceName = builder.sourceInstanceName;
        this.sourceInstanceRegionId = builder.sourceInstanceRegionId;
        this.sourcePort = builder.sourcePort;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReplicationLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return replicatorAccount
     */
    public String getReplicatorAccount() {
        return this.replicatorAccount;
    }

    /**
     * @return replicatorPassword
     */
    public String getReplicatorPassword() {
        return this.replicatorPassword;
    }

    /**
     * @return sourceAddress
     */
    public String getSourceAddress() {
        return this.sourceAddress;
    }

    /**
     * @return sourceCategory
     */
    public String getSourceCategory() {
        return this.sourceCategory;
    }

    /**
     * @return sourceInstanceName
     */
    public String getSourceInstanceName() {
        return this.sourceInstanceName;
    }

    /**
     * @return sourceInstanceRegionId
     */
    public String getSourceInstanceRegionId() {
        return this.sourceInstanceRegionId;
    }

    /**
     * @return sourcePort
     */
    public Long getSourcePort() {
        return this.sourcePort;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateReplicationLinkRequest, Builder> {
        private String DBInstanceId; 
        private Boolean dryRun; 
        private String replicatorAccount; 
        private String replicatorPassword; 
        private String sourceAddress; 
        private String sourceCategory; 
        private String sourceInstanceName; 
        private String sourceInstanceRegionId; 
        private Long sourcePort; 
        private Long taskId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateReplicationLinkRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.dryRun = request.dryRun;
            this.replicatorAccount = request.replicatorAccount;
            this.replicatorPassword = request.replicatorPassword;
            this.sourceAddress = request.sourceAddress;
            this.sourceCategory = request.sourceCategory;
            this.sourceInstanceName = request.sourceInstanceName;
            this.sourceInstanceRegionId = request.sourceInstanceRegionId;
            this.sourcePort = request.sourcePort;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
        } 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run but does not create the instance. The system checks items such as the request parameters, request format, service limits, and available resources.
         * *   **false** (default): performs a dry run and sends the request. If the request passes the dry run, the instance is created.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The account of the database that is used for data synchronization.
         */
        public Builder replicatorAccount(String replicatorAccount) {
            this.putQueryParameter("ReplicatorAccount", replicatorAccount);
            this.replicatorAccount = replicatorAccount;
            return this;
        }

        /**
         * The password of the account.
         */
        public Builder replicatorPassword(String replicatorPassword) {
            this.putQueryParameter("ReplicatorPassword", replicatorPassword);
            this.replicatorPassword = replicatorPassword;
            return this;
        }

        /**
         * The endpoint of the source instance.
         */
        public Builder sourceAddress(String sourceAddress) {
            this.putQueryParameter("SourceAddress", sourceAddress);
            this.sourceAddress = sourceAddress;
            return this;
        }

        /**
         * The type of the source instance. Valid values:
         * <p>
         * 
         * *   **other**: other instances
         * *   **aliyunRDS**: an ApsaraDB RDS instance
         */
        public Builder sourceCategory(String sourceCategory) {
            this.putQueryParameter("SourceCategory", sourceCategory);
            this.sourceCategory = sourceCategory;
            return this;
        }

        /**
         * The name of the source instance.
         * <p>
         * 
         * >  You must specify this parameter if **SourceCategory** is set to **aliyunRDS**.
         */
        public Builder sourceInstanceName(String sourceInstanceName) {
            this.putQueryParameter("SourceInstanceName", sourceInstanceName);
            this.sourceInstanceName = sourceInstanceName;
            return this;
        }

        /**
         * The ID of the region where the source instance is located.
         * <p>
         * 
         * >  You must specify this parameter if **SourceCategory** is set to **aliyunRDS**.
         */
        public Builder sourceInstanceRegionId(String sourceInstanceRegionId) {
            this.putQueryParameter("SourceInstanceRegionId", sourceInstanceRegionId);
            this.sourceInstanceRegionId = sourceInstanceRegionId;
            return this;
        }

        /**
         * The port number of the source instance.
         */
        public Builder sourcePort(Long sourcePort) {
            this.putQueryParameter("SourcePort", sourcePort);
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * The task ID of the successful dry run.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The name of the task. You can specify a custom task name. If you do not specify this parameter, ApsaraDB RDS automatically generates a task name.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateReplicationLinkRequest build() {
            return new CreateReplicationLinkRequest(this);
        } 

    } 

}
