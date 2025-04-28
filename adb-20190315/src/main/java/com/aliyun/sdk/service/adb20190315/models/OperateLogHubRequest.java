// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link OperateLogHubRequest} extends {@link RequestModel}
 *
 * <p>OperateLogHubRequest</p>
 */
public class OperateLogHubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Create")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean create;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliverName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliverName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliverTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliverTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterDirtyData")
    private Boolean filterDirtyData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogHubStores")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<LogHubStores> logHubStores;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schemaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private OperateLogHubRequest(Builder builder) {
        super(builder);
        this.create = builder.create;
        this.DBClusterId = builder.DBClusterId;
        this.deliverName = builder.deliverName;
        this.deliverTime = builder.deliverTime;
        this.description = builder.description;
        this.filterDirtyData = builder.filterDirtyData;
        this.logHubStores = builder.logHubStores;
        this.logStoreName = builder.logStoreName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.projectName = builder.projectName;
        this.provider = builder.provider;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
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
     * @return filterDirtyData
     */
    public Boolean getFilterDirtyData() {
        return this.filterDirtyData;
    }

    /**
     * @return logHubStores
     */
    public java.util.List<LogHubStores> getLogHubStores() {
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
     * @return provider
     */
    public String getProvider() {
        return this.provider;
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<OperateLogHubRequest, Builder> {
        private Boolean create; 
        private String DBClusterId; 
        private String deliverName; 
        private String deliverTime; 
        private String description; 
        private Boolean filterDirtyData; 
        private java.util.List<LogHubStores> logHubStores; 
        private String logStoreName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private String projectName; 
        private String provider; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String schemaName; 
        private String tableName; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(OperateLogHubRequest request) {
            super(request);
            this.create = request.create;
            this.DBClusterId = request.DBClusterId;
            this.deliverName = request.deliverName;
            this.deliverTime = request.deliverTime;
            this.description = request.description;
            this.filterDirtyData = request.filterDirtyData;
            this.logHubStores = request.logHubStores;
            this.logStoreName = request.logStoreName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.projectName = request.projectName;
            this.provider = request.provider;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.schemaName = request.schemaName;
            this.tableName = request.tableName;
            this.userName = request.userName;
        } 

        /**
         * <p>Specifies whether to create the log shipping job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder create(Boolean create) {
            this.putQueryParameter("Create", create);
            this.create = create;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-uf6rtqaj25491628z</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the log shipping job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xhxsblz_limited_gift_pay</p>
         */
        public Builder deliverName(String deliverName) {
            this.putQueryParameter("DeliverName", deliverName);
            this.deliverName = deliverName;
            return this;
        }

        /**
         * <p>The shipping time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-24&quot;T&quot;13:10&quot;Z&quot;</p>
         */
        public Builder deliverTime(String deliverTime) {
            this.putQueryParameter("DeliverTime", deliverTime);
            this.deliverTime = deliverTime;
            return this;
        }

        /**
         * <p>The description of the log shipping job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to filter dirty data.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder filterDirtyData(Boolean filterDirtyData) {
            this.putQueryParameter("FilterDirtyData", filterDirtyData);
            this.filterDirtyData = filterDirtyData;
            return this;
        }

        /**
         * <p>The log keywords.</p>
         * <p>This parameter is required.</p>
         */
        public Builder logHubStores(java.util.List<LogHubStores> logHubStores) {
            this.putQueryParameter("LogHubStores", logHubStores);
            this.logHubStores = logHubStores;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>beta-game-mjxb-ham-pool-export</p>
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
         * <p>The password of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ads_123</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The name of the Simple Log Service project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-adb</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The channel of the log shipping job.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
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
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wddata</p>
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rest_action_latest</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
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

    /**
     * 
     * {@link OperateLogHubRequest} extends {@link TeaModel}
     *
     * <p>OperateLogHubRequest</p>
     */
    public static class LogHubStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fieldKey;

        @com.aliyun.core.annotation.NameInMap("LogKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String logKey;

        private LogHubStores(Builder builder) {
            this.fieldKey = builder.fieldKey;
            this.logKey = builder.logKey;
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

        public static final class Builder {
            private String fieldKey; 
            private String logKey; 

            private Builder() {
            } 

            private Builder(LogHubStores model) {
                this.fieldKey = model.fieldKey;
                this.logKey = model.logKey;
            } 

            /**
             * <p>The value of the log keyword.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * <p>The log keyword.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder logKey(String logKey) {
                this.logKey = logKey;
                return this;
            }

            public LogHubStores build() {
                return new LogHubStores(this);
            } 

        } 

    }
}
