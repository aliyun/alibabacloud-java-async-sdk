// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateLogHubRequest} extends {@link RequestModel}
 *
 * <p>OperateLogHubRequest</p>
 */
public class OperateLogHubRequest extends Request {
    @Query
    @NameInMap("AccessKey")
    private String accessKey;

    @Query
    @NameInMap("AccessSecret")
    private String accessSecret;

    @Query
    @NameInMap("Create")
    @Validation(required = true)
    private Boolean create;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DeliverName")
    @Validation(required = true)
    private String deliverName;

    @Query
    @NameInMap("DeliverTime")
    @Validation(required = true)
    private String deliverTime;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("DomainUrl")
    @Validation(required = true)
    private String domainUrl;

    @Query
    @NameInMap("FilterDirtyData")
    private Boolean filterDirtyData;

    @Query
    @NameInMap("LogHubStores")
    @Validation(required = true)
    private java.util.List < LogHubStores> logHubStores;

    @Query
    @NameInMap("LogStoreName")
    @Validation(required = true)
    private String logStoreName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Query
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SchemaName")
    @Validation(required = true)
    private String schemaName;

    @Query
    @NameInMap("TableName")
    @Validation(required = true)
    private String tableName;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("UseLorne")
    private Boolean useLorne;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    private OperateLogHubRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.accessSecret = builder.accessSecret;
        this.create = builder.create;
        this.DBClusterId = builder.DBClusterId;
        this.deliverName = builder.deliverName;
        this.deliverTime = builder.deliverTime;
        this.description = builder.description;
        this.domainUrl = builder.domainUrl;
        this.filterDirtyData = builder.filterDirtyData;
        this.logHubStores = builder.logHubStores;
        this.logStoreName = builder.logStoreName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.projectName = builder.projectName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.taskId = builder.taskId;
        this.useLorne = builder.useLorne;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateLogHubRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return accessSecret
     */
    public String getAccessSecret() {
        return this.accessSecret;
    }

    /**
     * @return create
     */
    public Boolean getCreate() {
        return this.create;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return deliverName
     */
    public String getDeliverName() {
        return this.deliverName;
    }

    /**
     * @return deliverTime
     */
    public String getDeliverTime() {
        return this.deliverTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainUrl
     */
    public String getDomainUrl() {
        return this.domainUrl;
    }

    /**
     * @return filterDirtyData
     */
    public Boolean getFilterDirtyData() {
        return this.filterDirtyData;
    }

    /**
     * @return logHubStores
     */
    public java.util.List < LogHubStores> getLogHubStores() {
        return this.logHubStores;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return useLorne
     */
    public Boolean getUseLorne() {
        return this.useLorne;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<OperateLogHubRequest, Builder> {
        private String accessKey; 
        private String accessSecret; 
        private Boolean create; 
        private String DBClusterId; 
        private String deliverName; 
        private String deliverTime; 
        private String description; 
        private String domainUrl; 
        private Boolean filterDirtyData; 
        private java.util.List < LogHubStores> logHubStores; 
        private String logStoreName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private String projectName; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String schemaName; 
        private String tableName; 
        private String taskId; 
        private Boolean useLorne; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(OperateLogHubRequest response) {
            super(response);
            this.accessKey = response.accessKey;
            this.accessSecret = response.accessSecret;
            this.create = response.create;
            this.DBClusterId = response.DBClusterId;
            this.deliverName = response.deliverName;
            this.deliverTime = response.deliverTime;
            this.description = response.description;
            this.domainUrl = response.domainUrl;
            this.filterDirtyData = response.filterDirtyData;
            this.logHubStores = response.logHubStores;
            this.logStoreName = response.logStoreName;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.password = response.password;
            this.projectName = response.projectName;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.schemaName = response.schemaName;
            this.tableName = response.tableName;
            this.taskId = response.taskId;
            this.useLorne = response.useLorne;
            this.userName = response.userName;
        } 

        /**
         * AccessKey.
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * AccessSecret.
         */
        public Builder accessSecret(String accessSecret) {
            this.putQueryParameter("AccessSecret", accessSecret);
            this.accessSecret = accessSecret;
            return this;
        }

        /**
         * Create.
         */
        public Builder create(Boolean create) {
            this.putQueryParameter("Create", create);
            this.create = create;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DeliverName.
         */
        public Builder deliverName(String deliverName) {
            this.putQueryParameter("DeliverName", deliverName);
            this.deliverName = deliverName;
            return this;
        }

        /**
         * DeliverTime.
         */
        public Builder deliverTime(String deliverTime) {
            this.putQueryParameter("DeliverTime", deliverTime);
            this.deliverTime = deliverTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DomainUrl.
         */
        public Builder domainUrl(String domainUrl) {
            this.putQueryParameter("DomainUrl", domainUrl);
            this.domainUrl = domainUrl;
            return this;
        }

        /**
         * FilterDirtyData.
         */
        public Builder filterDirtyData(Boolean filterDirtyData) {
            this.putQueryParameter("FilterDirtyData", filterDirtyData);
            this.filterDirtyData = filterDirtyData;
            return this;
        }

        /**
         * LogHubStores.
         */
        public Builder logHubStores(java.util.List < LogHubStores> logHubStores) {
            this.putQueryParameter("LogHubStores", logHubStores);
            this.logHubStores = logHubStores;
            return this;
        }

        /**
         * LogStoreName.
         */
        public Builder logStoreName(String logStoreName) {
            this.putQueryParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * SchemaName.
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * UseLorne.
         */
        public Builder useLorne(Boolean useLorne) {
            this.putQueryParameter("UseLorne", useLorne);
            this.useLorne = useLorne;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public OperateLogHubRequest build() {
            return new OperateLogHubRequest(this);
        } 

    } 

    public static class LogHubStores extends TeaModel {
        @NameInMap("FieldKey")
        @Validation(required = true)
        private String fieldKey;

        @NameInMap("LogKey")
        @Validation(required = true)
        private String logKey;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private LogHubStores(Builder builder) {
            this.fieldKey = builder.fieldKey;
            this.logKey = builder.logKey;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogHubStores create() {
            return builder().build();
        }

        /**
         * @return fieldKey
         */
        public String getFieldKey() {
            return this.fieldKey;
        }

        /**
         * @return logKey
         */
        public String getLogKey() {
            return this.logKey;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String fieldKey; 
            private String logKey; 
            private String type; 

            /**
             * FieldKey.
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * LogKey.
             */
            public Builder logKey(String logKey) {
                this.logKey = logKey;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LogHubStores build() {
                return new LogHubStores(this);
            } 

        } 

    }
}
