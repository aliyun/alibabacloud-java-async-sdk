// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateParentPlatformRequest} extends {@link RequestModel}
 *
 * <p>CreateParentPlatformRequest</p>
 */
public class CreateParentPlatformRequest extends Request {
    @Query
    @NameInMap("AutoStart")
    private Boolean autoStart;

    @Query
    @NameInMap("ClientAuth")
    private Boolean clientAuth;

    @Query
    @NameInMap("ClientPassword")
    private String clientPassword;

    @Query
    @NameInMap("ClientUsername")
    private String clientUsername;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GbId")
    @Validation(required = true)
    private String gbId;

    @Query
    @NameInMap("Ip")
    @Validation(required = true)
    private String ip;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private Long port;

    @Query
    @NameInMap("Protocol")
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

        private Builder(CreateParentPlatformRequest response) {
            super(response);
            this.autoStart = response.autoStart;
            this.clientAuth = response.clientAuth;
            this.clientPassword = response.clientPassword;
            this.clientUsername = response.clientUsername;
            this.description = response.description;
            this.gbId = response.gbId;
            this.ip = response.ip;
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.port = response.port;
            this.protocol = response.protocol;
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
         * GbId.
         */
        public Builder gbId(String gbId) {
            this.putQueryParameter("GbId", gbId);
            this.gbId = gbId;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * Name.
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
         * Port.
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
