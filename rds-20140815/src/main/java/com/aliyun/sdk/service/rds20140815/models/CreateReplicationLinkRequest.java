// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("TargetAddress")
    private String targetAddress;

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
        this.targetAddress = builder.targetAddress;
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
     * @return targetAddress
     */
    public String getTargetAddress() {
        return this.targetAddress;
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
        private String targetAddress; 
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
            this.targetAddress = request.targetAddress;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The instance ID of the disaster recovery instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2zeytekus0r******</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run for creating the synchronization link of the disaster recovery instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Executes a dry run without creating the instance. The system checks items such as request parameters, request format, business limits, and inventory.</li>
         * <li><strong>false</strong> (default): Sends a normal request and creates the instance after the check is passed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The database account used for data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>testdbuser</p>
         */
        public Builder replicatorAccount(String replicatorAccount) {
            this.putQueryParameter("ReplicatorAccount", replicatorAccount);
            this.replicatorAccount = replicatorAccount;
            return this;
        }

        /**
         * <p>The password of the synchronization account.</p>
         * 
         * <strong>example:</strong>
         * <p>testpassword</p>
         */
        public Builder replicatorPassword(String replicatorPassword) {
            this.putQueryParameter("ReplicatorPassword", replicatorPassword);
            this.replicatorPassword = replicatorPassword;
            return this;
        }

        /**
         * <p>The endpoint of the PostgreSQL source instance or the IP address of the SQL Server source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PostgreSQL：pgm-****.pg.rds.aliyuncs.com
         * SQL Server：10.XX.XXX.XXX</p>
         */
        public Builder sourceAddress(String sourceAddress) {
            this.putQueryParameter("SourceAddress", sourceAddress);
            this.sourceAddress = sourceAddress;
            return this;
        }

        /**
         * <p>The category of the source instance. Valid values:</p>
         * <ul>
         * <li><strong>other</strong>: Other. (<strong>Not supported for SQL Server.</strong>)</li>
         * <li><strong>aliyunRDS</strong>: ApsaraDB RDS instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyunRDS</p>
         */
        public Builder sourceCategory(String sourceCategory) {
            this.putQueryParameter("SourceCategory", sourceCategory);
            this.sourceCategory = sourceCategory;
            return this;
        }

        /**
         * <p>The name of the source instance. This parameter is required when <strong>SourceCategory</strong> is set to <strong>aliyunRDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2zeaaz62s18******</p>
         */
        public Builder sourceInstanceName(String sourceInstanceName) {
            this.putQueryParameter("SourceInstanceName", sourceInstanceName);
            this.sourceInstanceName = sourceInstanceName;
            return this;
        }

        /**
         * <p>The region ID of the source instance. This parameter is required when <strong>SourceCategory</strong> is set to <strong>aliyunRDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder sourceInstanceRegionId(String sourceInstanceRegionId) {
            this.putQueryParameter("SourceInstanceRegionId", sourceInstanceRegionId);
            this.sourceInstanceRegionId = sourceInstanceRegionId;
            return this;
        }

        /**
         * <p>The port of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        public Builder sourcePort(Long sourcePort) {
            this.putQueryParameter("SourcePort", sourcePort);
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * <p>The IP address of the SQL Server disaster recovery instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XXX.XX.XXX</p>
         */
        public Builder targetAddress(String targetAddress) {
            this.putQueryParameter("TargetAddress", targetAddress);
            this.targetAddress = targetAddress;
            return this;
        }

        /**
         * <p>The ID of a successful dry run task.</p>
         * 
         * <strong>example:</strong>
         * <p>43994****</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the dry run task. You can specify a custom name. If you do not specify this parameter, the system automatically generates a name.</p>
         * 
         * <strong>example:</strong>
         * <p>zbtest</p>
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
