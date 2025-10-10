// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link StartTerminalSessionRequest} extends {@link RequestModel}
 *
 * <p>StartTerminalSessionRequest</p>
 */
public class StartTerminalSessionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandLine")
    private String commandLine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionType")
    private String connectionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionOptions")
    private EncryptionOptions encryptionOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordName")
    private String passwordName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortNumber")
    private Integer portNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetServer")
    private String targetServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private StartTerminalSessionRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.commandLine = builder.commandLine;
        this.connectionType = builder.connectionType;
        this.encryptionOptions = builder.encryptionOptions;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.passwordName = builder.passwordName;
        this.portNumber = builder.portNumber;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetServer = builder.targetServer;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartTerminalSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return commandLine
     */
    public String getCommandLine() {
        return this.commandLine;
    }

    /**
     * @return connectionType
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * @return encryptionOptions
     */
    public EncryptionOptions getEncryptionOptions() {
        return this.encryptionOptions;
    }

    /**
     * @return instanceId
     */
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
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
     * @return passwordName
     */
    public String getPasswordName() {
        return this.passwordName;
    }

    /**
     * @return portNumber
     */
    public Integer getPortNumber() {
        return this.portNumber;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return targetServer
     */
    public String getTargetServer() {
        return this.targetServer;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<StartTerminalSessionRequest, Builder> {
        private String sourceRegionId; 
        private String commandLine; 
        private String connectionType; 
        private EncryptionOptions encryptionOptions; 
        private java.util.List<String> instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String passwordName; 
        private Integer portNumber; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String targetServer; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(StartTerminalSessionRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.commandLine = request.commandLine;
            this.connectionType = request.connectionType;
            this.encryptionOptions = request.encryptionOptions;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.passwordName = request.passwordName;
            this.portNumber = request.portNumber;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetServer = request.targetServer;
            this.username = request.username;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The command to run after the session is initiated. The command length cannot exceed 512 characters.</p>
         * <blockquote>
         * <p> If you specify the <code>CommandLine</code> parameter, you cannot specify the <code>PortNumber</code> or <code>TargetServer</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ssh <a href="mailto:root@192.168.0.246">root@192.168.0.246</a></p>
         */
        public Builder commandLine(String commandLine) {
            this.putQueryParameter("CommandLine", commandLine);
            this.commandLine = commandLine;
            return this;
        }

        /**
         * <p>The network type of the WebSocket URL required to connect to the instance. Valid values:</p>
         * <ul>
         * <li>Internet (default)</li>
         * <li>Intranet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        public Builder connectionType(String connectionType) {
            this.putQueryParameter("ConnectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * EncryptionOptions.
         */
        public Builder encryptionOptions(EncryptionOptions encryptionOptions) {
            String encryptionOptionsShrink = shrink(encryptionOptions, "EncryptionOptions", "json");
            this.putQueryParameter("EncryptionOptions", encryptionOptionsShrink);
            this.encryptionOptions = encryptionOptions;
            return this;
        }

        /**
         * <p>The instance IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(java.util.List<String> instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * PasswordName.
         */
        public Builder passwordName(String passwordName) {
            this.putQueryParameter("PasswordName", passwordName);
            this.passwordName = passwordName;
            return this;
        }

        /**
         * <p>The port number of the ECS instance. The port is used to forward data. After this parameter is configured, Cloud Assistant Agent forwards data to the specified port. For example, you can set this parameter to 22 for data forwarding over SSH.</p>
         * <p>This parameter is empty by default, which indicates that no port is configured to forward data.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder portNumber(Integer portNumber) {
            this.putQueryParameter("PortNumber", portNumber);
            this.portNumber = portNumber;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The IP address of the instance. You can use the IP address to access the destination service in a virtual private cloud (VPC).</p>
         * <blockquote>
         * <p> If this parameter is not empty, <code>PortNumber</code> specifies the port number that is used by the managed instance to access the destination service in the VPC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.246</p>
         */
        public Builder targetServer(String targetServer) {
            this.putQueryParameter("TargetServer", targetServer);
            this.targetServer = targetServer;
            return this;
        }

        /**
         * <p>The username used for connection establishment.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public StartTerminalSessionRequest build() {
            return new StartTerminalSessionRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartTerminalSessionRequest} extends {@link TeaModel}
     *
     * <p>StartTerminalSessionRequest</p>
     */
    public static class EncryptionOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private EncryptionOptions(Builder builder) {
            this.enabled = builder.enabled;
            this.KMSKeyId = builder.KMSKeyId;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EncryptionOptions create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String KMSKeyId; 
            private String mode; 

            private Builder() {
            } 

            private Builder(EncryptionOptions model) {
                this.enabled = model.enabled;
                this.KMSKeyId = model.KMSKeyId;
                this.mode = model.mode;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * KMSKeyId.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public EncryptionOptions build() {
                return new EncryptionOptions(this);
            } 

        } 

    }
}
