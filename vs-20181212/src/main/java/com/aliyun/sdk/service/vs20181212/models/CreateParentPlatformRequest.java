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
 * {@link CreateParentPlatformRequest} extends {@link RequestModel}
 *
 * <p>CreateParentPlatformRequest</p>
 */
public class CreateParentPlatformRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String gbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    private CreateParentPlatformRequest(Builder builder) {
        super(builder);
        this.autoStart = builder.autoStart;
        this.clientAuth = builder.clientAuth;
        this.clientPassword = builder.clientPassword;
        this.clientUsername = builder.clientUsername;
        this.description = builder.description;
        this.gbId = builder.gbId;
        this.ip = builder.ip;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.port = builder.port;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateParentPlatformRequest create() {
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

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder extends Request.Builder<CreateParentPlatformRequest, Builder> {
        private Boolean autoStart; 
        private Boolean clientAuth; 
        private String clientPassword; 
        private String clientUsername; 
        private String description; 
        private String gbId; 
        private String ip; 
        private String name; 
        private Long ownerId; 
        private Long port; 
        private String protocol; 

        private Builder() {
            super();
        } 

        private Builder(CreateParentPlatformRequest request) {
            super(request);
            this.autoStart = request.autoStart;
            this.clientAuth = request.clientAuth;
            this.clientPassword = request.clientPassword;
            this.clientUsername = request.clientUsername;
            this.description = request.description;
            this.gbId = request.gbId;
            this.ip = request.ip;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.port = request.port;
            this.protocol = request.protocol;
        } 

        /**
         * AutoStart.
         */
        public Builder autoStart(Boolean autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
            return this;
        }

        /**
         * ClientAuth.
         */
        public Builder clientAuth(Boolean clientAuth) {
            this.putQueryParameter("ClientAuth", clientAuth);
            this.clientAuth = clientAuth;
            return this;
        }

        /**
         * ClientPassword.
         */
        public Builder clientPassword(String clientPassword) {
            this.putQueryParameter("ClientPassword", clientPassword);
            this.clientPassword = clientPassword;
            return this;
        }

        /**
         * ClientUsername.
         */
        public Builder clientUsername(String clientUsername) {
            this.putQueryParameter("ClientUsername", clientUsername);
            this.clientUsername = clientUsername;
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5060</p>
         */
        public Builder port(Long port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        @Override
        public CreateParentPlatformRequest build() {
            return new CreateParentPlatformRequest(this);
        } 

    } 

}
