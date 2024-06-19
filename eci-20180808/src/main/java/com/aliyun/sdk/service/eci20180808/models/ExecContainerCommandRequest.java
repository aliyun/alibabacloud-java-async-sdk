// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecContainerCommandRequest} extends {@link RequestModel}
 *
 * <p>ExecContainerCommandRequest</p>
 */
public class ExecContainerCommandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Command")
    @com.aliyun.core.annotation.Validation(required = true)
    private String command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String containerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String containerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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
    @com.aliyun.core.annotation.NameInMap("Stdin")
    private Boolean stdin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sync")
    private Boolean sync;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TTY")
    private Boolean TTY;

    private ExecContainerCommandRequest(Builder builder) {
        super(builder);
        this.command = builder.command;
        this.containerGroupId = builder.containerGroupId;
        this.containerName = builder.containerName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.stdin = builder.stdin;
        this.sync = builder.sync;
        this.TTY = builder.TTY;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecContainerCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return containerGroupId
     */
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    /**
     * @return containerName
     */
    public String getContainerName() {
        return this.containerName;
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
     * @return stdin
     */
    public Boolean getStdin() {
        return this.stdin;
    }

    /**
     * @return sync
     */
    public Boolean getSync() {
        return this.sync;
    }

    /**
     * @return TTY
     */
    public Boolean getTTY() {
        return this.TTY;
    }

    public static final class Builder extends Request.Builder<ExecContainerCommandRequest, Builder> {
        private String command; 
        private String containerGroupId; 
        private String containerName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean stdin; 
        private Boolean sync; 
        private Boolean TTY; 

        private Builder() {
            super();
        } 

        private Builder(ExecContainerCommandRequest request) {
            super(request);
            this.command = request.command;
            this.containerGroupId = request.containerGroupId;
            this.containerName = request.containerName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.stdin = request.stdin;
            this.sync = request.sync;
            this.TTY = request.TTY;
        } 

        /**
         * The commands to run in the container. You can specify up to 20 commands. Each command can be up to 256 characters in length.\
         * <p>
         * The strings must be in the JSON format. Example: `["/bin/sh", "-c", "ls -a"]`.
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * The ID of the elastic container instance.
         */
        public Builder containerGroupId(String containerGroupId) {
            this.putQueryParameter("ContainerGroupId", containerGroupId);
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * The name of the container.
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
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
         * The region ID of the instance.
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
         * Specifies whether to read the commands from standard input (stdin). Default value: true.
         */
        public Builder stdin(Boolean stdin) {
            this.putQueryParameter("Stdin", stdin);
            this.stdin = stdin;
            return this;
        }

        /**
         * Specifies whether to immediately run the command and synchronously return the result. Default value: false.\
         * <p>
         * If this parameter is set to true, TTY must be set to false. Command cannot be set to `/bin/bash`.
         */
        public Builder sync(Boolean sync) {
            this.putQueryParameter("Sync", sync);
            this.sync = sync;
            return this;
        }

        /**
         * Specifies whether to enable interaction. Default value: false.\
         * <p>
         * If the Command parameter is set to `/bin/bash`, set this parameter to true.
         */
        public Builder TTY(Boolean TTY) {
            this.putQueryParameter("TTY", TTY);
            this.TTY = TTY;
            return this;
        }

        @Override
        public ExecContainerCommandRequest build() {
            return new ExecContainerCommandRequest(this);
        } 

    } 

}
