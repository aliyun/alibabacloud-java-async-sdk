// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
         * <p>The ID of the simple application server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9ae7106e68eb4402b0dcbd48a9de****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The password that corresponds to the username.</p>
         * <ul>
         * <li>For a Linux server, you do not need to enter a password.</li>
         * <li>For a Windows server, enter the password that you set. If you have not set a password for the simple application server, set a password. For more information, see <a href="https://help.aliyun.com/document_detail/60055.html">Reset the password</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Test****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The port number that is used to log on to the simple application server by using Workbench.</p>
         * <ul>
         * <li>Linux servers: The default value is 22.</li>
         * <li>Windows servers: The default value is 3389.</li>
         * </ul>
         * <blockquote>
         * <p> If you want to connect to a server by using a custom port, you must modify the default remote connection port. For more information, see <a href="https://help.aliyun.com/document_detail/2807402.html">Configure a custom remote connection port</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3389</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
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

        /**
         * <p>The username of the simple application server.</p>
         * <ul>
         * <li>For a Linux server, you do not need to enter a username.</li>
         * <li>For a Windows server, the default username <code>administrator</code> is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>administrator</p>
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
