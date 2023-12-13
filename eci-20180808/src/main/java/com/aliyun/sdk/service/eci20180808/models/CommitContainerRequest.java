// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommitContainerRequest} extends {@link RequestModel}
 *
 * <p>CommitContainerRequest</p>
 */
public class CommitContainerRequest extends Request {
    @Query
    @NameInMap("AcrRegistryInfo")
    private AcrRegistryInfo acrRegistryInfo;

    @Query
    @NameInMap("Arn")
    private Arn arn;

    @Query
    @NameInMap("ContainerGroupId")
    @Validation(required = true)
    private String containerGroupId;

    @Query
    @NameInMap("ContainerName")
    @Validation(required = true)
    private String containerName;

    @Query
    @NameInMap("Image")
    private Image image;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CommitContainerRequest(Builder builder) {
        super(builder);
        this.acrRegistryInfo = builder.acrRegistryInfo;
        this.arn = builder.arn;
        this.containerGroupId = builder.containerGroupId;
        this.containerName = builder.containerName;
        this.image = builder.image;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitContainerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrRegistryInfo
     */
    public AcrRegistryInfo getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    /**
     * @return arn
     */
    public Arn getArn() {
        return this.arn;
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
     * @return image
     */
    public Image getImage() {
        return this.image;
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

    public static final class Builder extends Request.Builder<CommitContainerRequest, Builder> {
        private AcrRegistryInfo acrRegistryInfo; 
        private Arn arn; 
        private String containerGroupId; 
        private String containerName; 
        private Image image; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CommitContainerRequest request) {
            super(request);
            this.acrRegistryInfo = request.acrRegistryInfo;
            this.arn = request.arn;
            this.containerGroupId = request.containerGroupId;
            this.containerName = request.containerName;
            this.image = request.image;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The access credential configurations of the Container Registry Enterprise Edition instance.\
         * <p>
         * If you use a Container Registry Personal Edition instance, you can leave this parameter empty.
         */
        public Builder acrRegistryInfo(AcrRegistryInfo acrRegistryInfo) {
            this.putQueryParameter("AcrRegistryInfo", acrRegistryInfo);
            this.acrRegistryInfo = acrRegistryInfo;
            return this;
        }

        /**
         * The ARN that is required for authorization.
         */
        public Builder arn(Arn arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * The ID of the container group.
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
         * The image of the container.
         */
        public Builder image(Image image) {
            this.putQueryParameter("Image", image);
            this.image = image;
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

        @Override
        public CommitContainerRequest build() {
            return new CommitContainerRequest(this);
        } 

    } 

    public static class AcrRegistryInfo extends TeaModel {
        @NameInMap("ArnService")
        private String arnService;

        @NameInMap("ArnUser")
        private String arnUser;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        private AcrRegistryInfo(Builder builder) {
            this.arnService = builder.arnService;
            this.arnUser = builder.arnUser;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcrRegistryInfo create() {
            return builder().build();
        }

        /**
         * @return arnService
         */
        public String getArnService() {
            return this.arnService;
        }

        /**
         * @return arnUser
         */
        public String getArnUser() {
            return this.arnUser;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String arnService; 
            private String arnUser; 
            private String instanceId; 
            private String regionId; 

            /**
             * The RAM role ARN of the account to which permissions are granted during a cross-account authorization.
             */
            public Builder arnService(String arnService) {
                this.arnService = arnService;
                return this;
            }

            /**
             * The RAM role ARN of the account that is used to grant permissions during a cross-account authorization.
             */
            public Builder arnUser(String arnUser) {
                this.arnUser = arnUser;
                return this;
            }

            /**
             * The ID of the Container Registry Enterprise Edition instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the region where the Container Registry Enterprise Edition instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public AcrRegistryInfo build() {
                return new AcrRegistryInfo(this);
            } 

        } 

    }
    public static class Arn extends TeaModel {
        @NameInMap("RoleArn")
        private String roleArn;

        @NameInMap("RoleType")
        private String roleType;

        private Arn(Builder builder) {
            this.roleArn = builder.roleArn;
            this.roleType = builder.roleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arn create() {
            return builder().build();
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        public static final class Builder {
            private String roleArn; 
            private String roleType; 

            /**
             * The ARN of the RAM role of the Container Registry Enterprise Edition instance.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * The type of the authorization.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            public Arn build() {
                return new Arn(this);
            } 

        } 

    }
    public static class Image extends TeaModel {
        @NameInMap("Author")
        private String author;

        @NameInMap("Message")
        private String message;

        @NameInMap("Repository")
        @Validation(required = true)
        private String repository;

        @NameInMap("Tag")
        @Validation(required = true)
        private String tag;

        private Image(Builder builder) {
            this.author = builder.author;
            this.message = builder.message;
            this.repository = builder.repository;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public String getAuthor() {
            return this.author;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return repository
         */
        public String getRepository() {
            return this.repository;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String author; 
            private String message; 
            private String repository; 
            private String tag; 

            /**
             * The authorization of the image.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * The message about the image.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The image repository.
             */
            public Builder repository(String repository) {
                this.repository = repository;
                return this;
            }

            /**
             * The tag of the image. This parameter is empty by default, which indicates that the tag is not modified.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
}
