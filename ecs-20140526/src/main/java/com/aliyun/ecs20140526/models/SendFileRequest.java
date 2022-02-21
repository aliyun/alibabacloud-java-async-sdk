// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendFileRequest} extends {@link RequestModel}
 *
 * <p>SendFileRequest</p>
 */
public class SendFileRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FileMode")
    private String fileMode;

    @Query
    @NameInMap("FileGroup")
    private String fileGroup;

    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("TargetDir")
    private String targetDir;

    @Query
    @NameInMap("ContentType")
    private String contentType;

    @Query
    @NameInMap("Timeout")
    private Long timeout;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Overwrite")
    private Boolean overwrite;

    @Query
    @NameInMap("InstanceId")
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("FileOwner")
    private String fileOwner;

    private SendFileRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.fileMode = builder.fileMode;
        this.fileGroup = builder.fileGroup;
        this.content = builder.content;
        this.targetDir = builder.targetDir;
        this.contentType = builder.contentType;
        this.timeout = builder.timeout;
        this.name = builder.name;
        this.overwrite = builder.overwrite;
        this.instanceId = builder.instanceId;
        this.fileOwner = builder.fileOwner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendFileRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileMode
     */
    public String getFileMode() {
        return this.fileMode;
    }

    /**
     * @return fileGroup
     */
    public String getFileGroup() {
        return this.fileGroup;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return targetDir
     */
    public String getTargetDir() {
        return this.targetDir;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return fileOwner
     */
    public String getFileOwner() {
        return this.fileOwner;
    }

    public static final class Builder extends Request.Builder<SendFileRequest, Builder> {
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String regionId; 
        private String description; 
        private String fileMode; 
        private String fileGroup; 
        private String content; 
        private String targetDir; 
        private String contentType; 
        private Long timeout; 
        private String name; 
        private Boolean overwrite; 
        private java.util.List < String > instanceId; 
        private String fileOwner; 

        private Builder() {
            super();
        } 

        private Builder(SendFileRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.regionId = response.regionId;
            this.description = response.description;
            this.fileMode = response.fileMode;
            this.fileGroup = response.fileGroup;
            this.content = response.content;
            this.targetDir = response.targetDir;
            this.contentType = response.contentType;
            this.timeout = response.timeout;
            this.name = response.name;
            this.overwrite = response.overwrite;
            this.instanceId = response.instanceId;
            this.fileOwner = response.fileOwner;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The region ID of the target ECS instance. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The description. The full character set is supported and cannot exceed 512 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The permissions of the file. This parameter takes effect only for Linux instances and is configured in the same way as the chmod command.
         * <p>
         * 
         * The default value is 0644, indicating that users have read/write permissions, and user groups and other users have read-only permissions.
         */
        public Builder fileMode(String fileMode) {
            this.putQueryParameter("FileMode", fileMode);
            this.fileMode = fileMode;
            return this;
        }

        /**
         * The user group of the file. This parameter takes effect only for Linux instances. The default value is root.
         */
        public Builder fileGroup(String fileGroup) {
            this.putQueryParameter("FileGroup", fileGroup);
            this.fileGroup = fileGroup;
            return this;
        }

        /**
         * The content of the file. The size of a base64-encoded file cannot exceed 32KB.
         * <p>
         * 
         * -If the "ContentType" parameter is "PlainText", this field is plain text.
         * -If the "ContentType" parameter is "Base64", this field is Base64-encoded.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Deliver the file to the Directory of the target ECS instance. If it does not exist, it is automatically created.
         */
        public Builder targetDir(String targetDir) {
            this.putQueryParameter("TargetDir", targetDir);
            this.targetDir = targetDir;
            return this;
        }

        /**
         * The content type of the file.
         * <p>
         * -PlainText: Plain text
         * -Base64:Base64 encoding
         * 
         * Default value: PlainText
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * The timeout period of the object to be delivered. Unit: Seconds
         * <p>
         * 
         * -A timeout occurs when files cannot be delivered due to process reasons, missing modules, or missing cloud assistant clients.
         * -When the specified timeout period is less than 10 seconds, the system automatically sets the timeout period to 10 seconds to ensure successful delivery.
         * 
         * Default value: 60
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The name of the file. The full character set is supported and cannot exceed 255 characters in length.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Specifies whether to overwrite an object with the same name if it already exists in the destination directory.
         * <p>
         * -true: overwrites
         * -false: does not overwrite
         * 
         * Default value: false
         */
        public Builder overwrite(Boolean overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * The list of ECS instances to run the command. You can specify a maximum of 50 ECS instance IDs. Valid values of N: 1 to 50.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The user of the file. This parameter takes effect only for Linux instances. The default value is root.
         */
        public Builder fileOwner(String fileOwner) {
            this.putQueryParameter("FileOwner", fileOwner);
            this.fileOwner = fileOwner;
            return this;
        }

        @Override
        public SendFileRequest build() {
            return new SendFileRequest(this);
        } 

    } 

}
