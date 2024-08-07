// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LoginInstanceRequest} extends {@link RequestModel}
 *
 * <p>LoginInstanceRequest</p>
 */
public class LoginInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private LoginInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoginInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<LoginInstanceRequest, Builder> {
        private String instanceId; 
        private String password; 
        private Integer port; 
        private String regionId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(LoginInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.password = request.password;
            this.port = request.port;
            this.regionId = request.regionId;
            this.username = request.username;
        } 

        /**
         * The ID of the simple application server.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The password that corresponds to the username.
         * <p>
         * 
         * *   For a Linux server, you do not need to enter a password.
         * *   For a Windows server, enter the password that you set. If you have not set a password for the simple application server, set a password. For more information, see [Reset the password](~~60055~~).
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The username of the simple application server.
         * <p>
         * 
         * *   For a Linux server, you do not need to enter a username.
         * *   For a Windows server, the default username `administrator` is used.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public LoginInstanceRequest build() {
            return new LoginInstanceRequest(this);
        } 

    } 

}
