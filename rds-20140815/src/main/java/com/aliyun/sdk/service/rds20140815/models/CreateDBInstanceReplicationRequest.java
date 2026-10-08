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
 * {@link CreateDBInstanceReplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceReplicationRequest</p>
 */
public class CreateDBInstanceReplicationRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String masterHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterPassword")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 44, minLength = 8)
    private String masterPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535, minimum = 1)
    private Integer masterPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterUser")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32, minLength = 1)
    private String masterUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 30, minLength = 1)
    private String regionId;

    private CreateDBInstanceReplicationRequest(Builder builder) {
        super(builder);
        this.channelName = builder.channelName;
        this.dbInstanceId = builder.dbInstanceId;
        this.masterHost = builder.masterHost;
        this.masterPassword = builder.masterPassword;
        this.masterPort = builder.masterPort;
        this.masterUser = builder.masterUser;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceReplicationRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDBInstanceReplicationRequest, Builder> {
        private String channelName; 
        private String dbInstanceId; 
        private String masterHost; 
        private String masterPassword; 
        private Integer masterPort; 
        private String masterUser; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceReplicationRequest request) {
            super(request);
            this.channelName = request.channelName;
            this.dbInstanceId = request.dbInstanceId;
            this.masterHost = request.masterHost;
            this.masterPassword = request.masterPassword;
            this.masterPort = request.masterPort;
            this.masterUser = request.masterUser;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the replication channel, which is used to identify the replication task.</p>
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
         * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
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
         * <p>The address of the primary database host. IP addresses and domain names are supported.</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The username of the primary database, which is used to establish the replication connection.</p>
         * <p>This parameter is required.</p>
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
         * <p>The region ID of the instance.</p>
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
        public CreateDBInstanceReplicationRequest build() {
            return new CreateDBInstanceReplicationRequest(this);
        } 

    } 

}
