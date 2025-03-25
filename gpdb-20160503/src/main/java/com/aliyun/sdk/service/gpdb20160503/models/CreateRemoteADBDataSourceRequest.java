// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateRemoteADBDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateRemoteADBDataSourceRequest</p>
 */
public class CreateRemoteADBDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalDBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localDBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalDatabase")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localDatabase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagerUserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String managerUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagerUserPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String managerUserPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteDBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remoteDBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteDatabase")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remoteDatabase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userPassword;

    private CreateRemoteADBDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceName = builder.dataSourceName;
        this.localDBInstanceId = builder.localDBInstanceId;
        this.localDatabase = builder.localDatabase;
        this.managerUserName = builder.managerUserName;
        this.managerUserPassword = builder.managerUserPassword;
        this.ownerId = builder.ownerId;
        this.remoteDBInstanceId = builder.remoteDBInstanceId;
        this.remoteDatabase = builder.remoteDatabase;
        this.userName = builder.userName;
        this.userPassword = builder.userPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRemoteADBDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return localDBInstanceId
     */
    public String getLocalDBInstanceId() {
        return this.localDBInstanceId;
    }

    /**
     * @return localDatabase
     */
    public String getLocalDatabase() {
        return this.localDatabase;
    }

    /**
     * @return managerUserName
     */
    public String getManagerUserName() {
        return this.managerUserName;
    }

    /**
     * @return managerUserPassword
     */
    public String getManagerUserPassword() {
        return this.managerUserPassword;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return remoteDBInstanceId
     */
    public String getRemoteDBInstanceId() {
        return this.remoteDBInstanceId;
    }

    /**
     * @return remoteDatabase
     */
    public String getRemoteDatabase() {
        return this.remoteDatabase;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userPassword
     */
    public String getUserPassword() {
        return this.userPassword;
    }

    public static final class Builder extends Request.Builder<CreateRemoteADBDataSourceRequest, Builder> {
        private String dataSourceName; 
        private String localDBInstanceId; 
        private String localDatabase; 
        private String managerUserName; 
        private String managerUserPassword; 
        private Long ownerId; 
        private String remoteDBInstanceId; 
        private String remoteDatabase; 
        private String userName; 
        private String userPassword; 

        private Builder() {
            super();
        } 

        private Builder(CreateRemoteADBDataSourceRequest request) {
            super(request);
            this.dataSourceName = request.dataSourceName;
            this.localDBInstanceId = request.localDBInstanceId;
            this.localDatabase = request.localDatabase;
            this.managerUserName = request.managerUserName;
            this.managerUserPassword = request.managerUserPassword;
            this.ownerId = request.ownerId;
            this.remoteDBInstanceId = request.remoteDBInstanceId;
            this.remoteDatabase = request.remoteDatabase;
            this.userName = request.userName;
            this.userPassword = request.userPassword;
        } 

        /**
         * <p>Customer-specified DataSourceName.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putQueryParameter("DataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>Instance ID of the data being used (required).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-test1</p>
         */
        public Builder localDBInstanceId(String localDBInstanceId) {
            this.putQueryParameter("LocalDBInstanceId", localDBInstanceId);
            this.localDBInstanceId = localDBInstanceId;
            return this;
        }

        /**
         * <p>Database name of the data being used (required)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>db1</p>
         */
        public Builder localDatabase(String localDatabase) {
            this.putQueryParameter("LocalDatabase", localDatabase);
            this.localDatabase = localDatabase;
            return this;
        }

        /**
         * <p>Management account of the data-using instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>managerAccount</p>
         */
        public Builder managerUserName(String managerUserName) {
            this.putQueryParameter("ManagerUserName", managerUserName);
            this.managerUserName = managerUserName;
            return this;
        }

        /**
         * <p>Password of the management account of the data-using instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>password2</p>
         */
        public Builder managerUserPassword(String managerUserPassword) {
            this.putQueryParameter("ManagerUserPassword", managerUserPassword);
            this.managerUserPassword = managerUserPassword;
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
         * <p>Instance ID providing the data (required).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-test2</p>
         */
        public Builder remoteDBInstanceId(String remoteDBInstanceId) {
            this.putQueryParameter("RemoteDBInstanceId", remoteDBInstanceId);
            this.remoteDBInstanceId = remoteDBInstanceId;
            return this;
        }

        /**
         * <p>Database name providing the data (required).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>db2</p>
         */
        public Builder remoteDatabase(String remoteDatabase) {
            this.putQueryParameter("RemoteDatabase", remoteDatabase);
            this.remoteDatabase = remoteDatabase;
            return this;
        }

        /**
         * <p>Account name of the data-providing instance used for user mapping (required).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>account1</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>Password of the data-providing instance account used for user mapping.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>password1</p>
         */
        public Builder userPassword(String userPassword) {
            this.putQueryParameter("UserPassword", userPassword);
            this.userPassword = userPassword;
            return this;
        }

        @Override
        public CreateRemoteADBDataSourceRequest build() {
            return new CreateRemoteADBDataSourceRequest(this);
        } 

    } 

}
