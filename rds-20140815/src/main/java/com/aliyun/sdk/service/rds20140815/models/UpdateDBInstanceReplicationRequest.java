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
 * {@link UpdateDBInstanceReplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdateDBInstanceReplicationRequest</p>
 */
public class UpdateDBInstanceReplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String channelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 30, minLength = 1)
    private String dbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterHost")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String masterHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterPassword")
    @com.aliyun.core.annotation.Validation(maxLength = 44, minLength = 8)
    private String masterPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer masterPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterUser")
    @com.aliyun.core.annotation.Validation(maxLength = 32, minLength = 1)
    private String masterUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 30, minLength = 1)
    private String regionId;

    private UpdateDBInstanceReplicationRequest(Builder builder) {
        super(builder);
        this.channelName = builder.channelName;
        this.dbInstanceId = builder.dbInstanceId;
        this.masterHost = builder.masterHost;
        this.masterPassword = builder.masterPassword;
        this.masterPort = builder.masterPort;
        this.masterUser = builder.masterUser;
        this.operation = builder.operation;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDBInstanceReplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return masterHost
     */
    public String getMasterHost() {
        return this.masterHost;
    }

    /**
     * @return masterPassword
     */
    public String getMasterPassword() {
        return this.masterPassword;
    }

    /**
     * @return masterPort
     */
    public Integer getMasterPort() {
        return this.masterPort;
    }

    /**
     * @return masterUser
     */
    public String getMasterUser() {
        return this.masterUser;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateDBInstanceReplicationRequest, Builder> {
        private String channelName; 
        private String dbInstanceId; 
        private String masterHost; 
        private String masterPassword; 
        private Integer masterPort; 
        private String masterUser; 
        private String operation; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDBInstanceReplicationRequest request) {
            super(request);
            this.channelName = request.channelName;
            this.dbInstanceId = request.dbInstanceId;
            this.masterHost = request.masterHost;
            this.masterPassword = request.masterPassword;
            this.masterPort = request.masterPort;
            this.masterUser = request.masterUser;
            this.operation = request.operation;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the replication channel, which is used to identify the replication channel.</p>
         * 
         * <strong>example:</strong>
         * <p>replication-channel-001</p>
         */
        public Builder channelName(String channelName) {
            this.putQueryParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1234567890abcdef</p>
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * <p>The host address of the primary database. IP addresses and domain names are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.100</p>
         */
        public Builder masterHost(String masterHost) {
            this.putQueryParameter("MasterHost", masterHost);
            this.masterHost = masterHost;
            return this;
        }

        /**
         * <p>The password of the primary database, which is used to authenticate the replication user. The password must be Base64-encoded in advance.</p>
         * 
         * <strong>example:</strong>
         * <p>U2VjdXJlUGFzczEyMyE=</p>
         */
        public Builder masterPassword(String masterPassword) {
            this.putQueryParameter("MasterPassword", masterPassword);
            this.masterPassword = masterPassword;
            return this;
        }

        /**
         * <p>The port number of the primary database. The default port is 3306 for MySQL.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder masterPort(Integer masterPort) {
            this.putQueryParameter("MasterPort", masterPort);
            this.masterPort = masterPort;
            return this;
        }

        /**
         * <p>The username of the primary database, which is used to establish a replication connection. Specify this parameter only when an update is required.</p>
         * 
         * <strong>example:</strong>
         * <p>repl_user</p>
         */
        public Builder masterUser(String masterUser) {
            this.putQueryParameter("MasterUser", masterUser);
            this.masterUser = masterUser;
            return this;
        }

        /**
         * <p>The operation type. Specifies the operation to perform on the replication channel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Start</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>阿里云账号ID，用于指定资源的所有者</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateDBInstanceReplicationRequest build() {
            return new UpdateDBInstanceReplicationRequest(this);
        } 

    } 

}
