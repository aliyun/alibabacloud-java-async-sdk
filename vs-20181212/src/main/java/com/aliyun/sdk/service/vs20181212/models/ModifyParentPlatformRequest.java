// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ModifyParentPlatformRequest} extends {@link RequestModel}
 *
 * <p>ModifyParentPlatformRequest</p>
 */
public class ModifyParentPlatformRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStart")
    private Boolean autoStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientAuth")
    private Boolean clientAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientPassword")
    private String clientPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientUsername")
    private String clientUsername;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GbId")
    private String gbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Long port;

    private ModifyParentPlatformRequest(Builder builder) {
        super(builder);
        this.autoStart = builder.autoStart;
        this.clientAuth = builder.clientAuth;
        this.clientPassword = builder.clientPassword;
        this.clientUsername = builder.clientUsername;
        this.description = builder.description;
        this.gbId = builder.gbId;
        this.id = builder.id;
        this.ip = builder.ip;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyParentPlatformRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoStart
     */
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    /**
     * @return clientAuth
     */
    public Boolean getClientAuth() {
        return this.clientAuth;
    }

    /**
     * @return clientPassword
     */
    public String getClientPassword() {
        return this.clientPassword;
    }

    /**
     * @return clientUsername
     */
    public String getClientUsername() {
        return this.clientUsername;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    public static final class Builder extends Request.Builder<ModifyParentPlatformRequest, Builder> {
        private Boolean autoStart; 
        private Boolean clientAuth; 
        private String clientPassword; 
        private String clientUsername; 
        private String description; 
        private String gbId; 
        private String id; 
        private String ip; 
        private String name; 
        private Long ownerId; 
        private Long port; 

        private Builder() {
            super();
        } 

        private Builder(ModifyParentPlatformRequest request) {
            super(request);
            this.autoStart = request.autoStart;
            this.clientAuth = request.clientAuth;
            this.clientPassword = request.clientPassword;
            this.clientUsername = request.clientUsername;
            this.description = request.description;
            this.gbId = request.gbId;
            this.id = request.id;
            this.ip = request.ip;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.port = request.port;
        } 

        /**
         * <p>Specifies whether to automatically enable the platform. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoStart(Boolean autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
            return this;
        }

        /**
         * <p>Specifies whether to enable local authentication. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder clientAuth(Boolean clientAuth) {
            this.putQueryParameter("ClientAuth", clientAuth);
            this.clientAuth = clientAuth;
            return this;
        }

        /**
         * <p>The local password.</p>
         * 
         * <strong>example:</strong>
         * <p>admin123</p>
         */
        public Builder clientPassword(String clientPassword) {
            this.putQueryParameter("ClientPassword", clientPassword);
            this.clientPassword = clientPassword;
            return this;
        }

        /**
         * <p>The local username.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        public Builder clientUsername(String clientUsername) {
            this.putQueryParameter("ClientUsername", clientUsername);
            this.clientUsername = clientUsername;
            return this;
        }

        /**
         * <p>The description of the parent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>国标级联修改测试</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The GB ID of the parent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>31000*****2170123451</p>
         */
        public Builder gbId(String gbId) {
            this.putQueryParameter("GbId", gbId);
            this.gbId = gbId;
            return this;
        }

        /**
         * <p>The ID of the parent platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>359*****374-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The SIP service IP of the parent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.10</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The name of the parent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>国标级联修改测试</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The SIP service port of the parent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>5060</p>
         */
        public Builder port(Long port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        @Override
        public ModifyParentPlatformRequest build() {
            return new ModifyParentPlatformRequest(this);
        } 

    } 

}
