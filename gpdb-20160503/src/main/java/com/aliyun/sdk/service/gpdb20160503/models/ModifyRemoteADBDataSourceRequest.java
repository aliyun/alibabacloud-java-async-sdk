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
 * {@link ModifyRemoteADBDataSourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyRemoteADBDataSourceRequest</p>
 */
public class ModifyRemoteADBDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalDBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localDBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userPassword;

    private ModifyRemoteADBDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceName = builder.dataSourceName;
        this.localDBInstanceId = builder.localDBInstanceId;
        this.ownerId = builder.ownerId;
        this.userName = builder.userName;
        this.userPassword = builder.userPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRemoteADBDataSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<ModifyRemoteADBDataSourceRequest, Builder> {
        private String dataSourceId; 
        private String dataSourceName; 
        private String localDBInstanceId; 
        private Long ownerId; 
        private String userName; 
        private String userPassword; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRemoteADBDataSourceRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
            this.dataSourceName = request.dataSourceName;
            this.localDBInstanceId = request.localDBInstanceId;
            this.ownerId = request.ownerId;
            this.userName = request.userName;
            this.userPassword = request.userPassword;
        } 

        /**
         * <p>Service ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>Specified dataSourceName.</p>
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
         * <p>The ID of the local data instance being used.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-test</p>
         */
        public Builder localDBInstanceId(String localDBInstanceId) {
            this.putQueryParameter("LocalDBInstanceId", localDBInstanceId);
            this.localDBInstanceId = localDBInstanceId;
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
         * <p>New user name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>newUserName</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>New user password, which must be transmitted in encrypted form.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>newUserPassword</p>
         */
        public Builder userPassword(String userPassword) {
            this.putQueryParameter("UserPassword", userPassword);
            this.userPassword = userPassword;
            return this;
        }

        @Override
        public ModifyRemoteADBDataSourceRequest build() {
            return new ModifyRemoteADBDataSourceRequest(this);
        } 

    } 

}
