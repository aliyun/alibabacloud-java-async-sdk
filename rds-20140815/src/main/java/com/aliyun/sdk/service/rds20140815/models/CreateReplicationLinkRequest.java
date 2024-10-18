// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1trqb4p1xd****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run but does not create the instance. The system checks items such as the request parameters, request format, service limits, and available resources.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the instance is created.</li>
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
         * <p>The account of the database that is used for data synchronization.</p>
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
         * <p>The password of the account.</p>
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
         * <p>The endpoint of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-****.pg.rds.aliyuncs.com</p>
         */
        public Builder sourceAddress(String sourceAddress) {
            this.putQueryParameter("SourceAddress", sourceAddress);
            this.sourceAddress = sourceAddress;
            return this;
        }

        /**
         * <p>The type of the source instance. Valid values:</p>
         * <ul>
         * <li><strong>other</strong>: other instances</li>
         * <li><strong>aliyunRDS</strong>: an ApsaraDB RDS instance</li>
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
         * <p>The name of the source instance.</p>
         * <blockquote>
         * <p> This parameter is required when you set the <strong>SourceCategory</strong> parameter to <strong>aliyunRDS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testInstance</p>
         */
        public Builder sourceInstanceName(String sourceInstanceName) {
            this.putQueryParameter("SourceInstanceName", sourceInstanceName);
            this.sourceInstanceName = sourceInstanceName;
            return this;
        }

        /**
         * <p>The region ID of the source instance.</p>
         * <blockquote>
         * <p> This parameter is required when you set the <strong>SourceCategory</strong> parameter to <strong>aliyunRDS</strong>.</p>
         * </blockquote>
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
         * <p>The task ID of the successful dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>439946016</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the task. You can specify a custom task name. If you do not specify this parameter, ApsaraDB RDS automatically generates a task name.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
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
