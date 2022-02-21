// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudMigrationPrecheckTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudMigrationPrecheckTaskRequest</p>
 */
public class CreateCloudMigrationPrecheckTaskRequest extends Request {
    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceAccount")
    @Validation(required = true)
    private String sourceAccount;

    @Query
    @NameInMap("SourceCategory")
    @Validation(required = true)
    private String sourceCategory;

    @Query
    @NameInMap("SourceIpAddress")
    @Validation(required = true)
    private String sourceIpAddress;

    @Query
    @NameInMap("SourcePassword")
    @Validation(required = true)
    private String sourcePassword;

    @Query
    @NameInMap("SourcePort")
    @Validation(required = true)
    private Long sourcePort;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    private CreateCloudMigrationPrecheckTaskRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceAccount = builder.sourceAccount;
        this.sourceCategory = builder.sourceCategory;
        this.sourceIpAddress = builder.sourceIpAddress;
        this.sourcePassword = builder.sourcePassword;
        this.sourcePort = builder.sourcePort;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudMigrationPrecheckTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceAccount
     */
    public String getSourceAccount() {
        return this.sourceAccount;
    }

    /**
     * @return sourceCategory
     */
    public String getSourceCategory() {
        return this.sourceCategory;
    }

    /**
     * @return sourceIpAddress
     */
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    /**
     * @return sourcePassword
     */
    public String getSourcePassword() {
        return this.sourcePassword;
    }

    /**
     * @return sourcePort
     */
    public Long getSourcePort() {
        return this.sourcePort;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateCloudMigrationPrecheckTaskRequest, Builder> {
        private String DBInstanceName; 
        private Long resourceOwnerId; 
        private String sourceAccount; 
        private String sourceCategory; 
        private String sourceIpAddress; 
        private String sourcePassword; 
        private Long sourcePort; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudMigrationPrecheckTaskRequest response) {
            super(response);
            this.DBInstanceName = response.DBInstanceName;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceAccount = response.sourceAccount;
            this.sourceCategory = response.sourceCategory;
            this.sourceIpAddress = response.sourceIpAddress;
            this.sourcePassword = response.sourcePassword;
            this.sourcePort = response.sourcePort;
            this.taskName = response.taskName;
        } 

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SourceAccount.
         */
        public Builder sourceAccount(String sourceAccount) {
            this.putQueryParameter("SourceAccount", sourceAccount);
            this.sourceAccount = sourceAccount;
            return this;
        }

        /**
         * SourceCategory.
         */
        public Builder sourceCategory(String sourceCategory) {
            this.putQueryParameter("SourceCategory", sourceCategory);
            this.sourceCategory = sourceCategory;
            return this;
        }

        /**
         * SourceIpAddress.
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.putQueryParameter("SourceIpAddress", sourceIpAddress);
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * SourcePassword.
         */
        public Builder sourcePassword(String sourcePassword) {
            this.putQueryParameter("SourcePassword", sourcePassword);
            this.sourcePassword = sourcePassword;
            return this;
        }

        /**
         * SourcePort.
         */
        public Builder sourcePort(Long sourcePort) {
            this.putQueryParameter("SourcePort", sourcePort);
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateCloudMigrationPrecheckTaskRequest build() {
            return new CreateCloudMigrationPrecheckTaskRequest(this);
        } 

    } 

}
