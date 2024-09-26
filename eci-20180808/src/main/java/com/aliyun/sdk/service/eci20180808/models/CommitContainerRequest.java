// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CommitContainerRequest} extends {@link RequestModel}
 *
 * <p>CommitContainerRequest</p>
 */
public class CommitContainerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcrRegistryInfo")
    private AcrRegistryInfo acrRegistryInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Arn")
    private Arn arn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String containerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String containerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Image")
    private Image image;

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
         * <p>The access credential configurations of the Container Registry Enterprise Edition instance.</p>
         * <blockquote>
         * <p> If you use a Container Registry Personal Edition instance, you do not need to configure this parameter. If you use a Container Registry Enterprise Edition instance, you must configure this parameter.</p>
         * </blockquote>
         */
        public Builder acrRegistryInfo(AcrRegistryInfo acrRegistryInfo) {
            this.putQueryParameter("AcrRegistryInfo", acrRegistryInfo);
            this.acrRegistryInfo = acrRegistryInfo;
            return this;
        }

        /**
         * <p>The details about the ARN that is required for authorization.</p>
         */
        public Builder arn(Arn arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * <p>The ID of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-bp1do4xz75fa5sd****</p>
         */
        public Builder containerGroupId(String containerGroupId) {
            this.putQueryParameter("ContainerGroupId", containerGroupId);
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>container-1</p>
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * <p>The image of the container.</p>
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
         * <p>The region ID of the instance.</p>
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

        @Override
        public CommitContainerRequest build() {
            return new CommitContainerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CommitContainerRequest} extends {@link TeaModel}
     *
     * <p>CommitContainerRequest</p>
     */
    public static class AcrRegistryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArnService")
        private String arnService;

        @com.aliyun.core.annotation.NameInMap("ArnUser")
        private String arnUser;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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
             * <p>The Alibaba Cloud Resource Access (ARN) of the RAM role that is assigned to the user (the authorized account) in cross-account authorization scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1609982529******:role/role-test</p>
             */
            public Builder arnService(String arnService) {
                this.arnService = arnService;
                return this;
            }

            /**
             * <p>The ARN of the RAM role that is assigned to the authorizer in cross-account authorization scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1298452580******:role/role-test</p>
             */
            public Builder arnUser(String arnUser) {
                this.arnUser = arnUser;
                return this;
            }

            /**
             * <p>The ID of the Container Registry Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-nwj395hgf6f3****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID of the Container Registry Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link CommitContainerRequest} extends {@link TeaModel}
     *
     * <p>CommitContainerRequest</p>
     */
    public static class Arn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("RoleType")
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
             * <p>The ARN of the authorized role.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram:xxx</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The authorization type. A value of service indicates that RAM roles are used for authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
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
    /**
     * 
     * {@link CommitContainerRequest} extends {@link TeaModel}
     *
     * <p>CommitContainerRequest</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Repository")
        @com.aliyun.core.annotation.Validation(required = true)
        private String repository;

        @com.aliyun.core.annotation.NameInMap("Tag")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The authorization of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>ECI</p>
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * <p>The message about the image.</p>
             * 
             * <strong>example:</strong>
             * <p>test commit</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eastest/registry-test</p>
             */
            public Builder repository(String repository) {
                this.repository = repository;
                return this;
            }

            /**
             * <p>The tag of the image. This parameter is empty by default, which indicates that the tag is not modified.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.6</p>
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
