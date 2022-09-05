// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDriveRequest} extends {@link RequestModel}
 *
 * <p>CreateDriveRequest</p>
 */
public class CreateDriveRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DomainId")
    private String domainId;

    @Query
    @NameInMap("DriveName")
    private String driveName;

    @Query
    @NameInMap("ExternalDomainId")
    private String externalDomainId;

    @Query
    @NameInMap("ProfileRoaming")
    private Boolean profileRoaming;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("TotalSize")
    private Long totalSize;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("UsedSize")
    private Long usedSize;

    @Query
    @NameInMap("UserId")
    private String userId;

    private CreateDriveRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.driveName = builder.driveName;
        this.externalDomainId = builder.externalDomainId;
        this.profileRoaming = builder.profileRoaming;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.totalSize = builder.totalSize;
        this.type = builder.type;
        this.usedSize = builder.usedSize;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDriveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveName
     */
    public String getDriveName() {
        return this.driveName;
    }

    /**
     * @return externalDomainId
     */
    public String getExternalDomainId() {
        return this.externalDomainId;
    }

    /**
     * @return profileRoaming
     */
    public Boolean getProfileRoaming() {
        return this.profileRoaming;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return totalSize
     */
    public Long getTotalSize() {
        return this.totalSize;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return usedSize
     */
    public Long getUsedSize() {
        return this.usedSize;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateDriveRequest, Builder> {
        private Long aliUid; 
        private String description; 
        private String domainId; 
        private String driveName; 
        private String externalDomainId; 
        private Boolean profileRoaming; 
        private String regionId; 
        private String resourceType; 
        private Long totalSize; 
        private String type; 
        private Long usedSize; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDriveRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.description = request.description;
            this.domainId = request.domainId;
            this.driveName = request.driveName;
            this.externalDomainId = request.externalDomainId;
            this.profileRoaming = request.profileRoaming;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.totalSize = request.totalSize;
            this.type = request.type;
            this.usedSize = request.usedSize;
            this.userId = request.userId;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
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
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * DriveName.
         */
        public Builder driveName(String driveName) {
            this.putQueryParameter("DriveName", driveName);
            this.driveName = driveName;
            return this;
        }

        /**
         * ExternalDomainId.
         */
        public Builder externalDomainId(String externalDomainId) {
            this.putQueryParameter("ExternalDomainId", externalDomainId);
            this.externalDomainId = externalDomainId;
            return this;
        }

        /**
         * ProfileRoaming.
         */
        public Builder profileRoaming(Boolean profileRoaming) {
            this.putQueryParameter("ProfileRoaming", profileRoaming);
            this.profileRoaming = profileRoaming;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * TotalSize.
         */
        public Builder totalSize(Long totalSize) {
            this.putQueryParameter("TotalSize", totalSize);
            this.totalSize = totalSize;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UsedSize.
         */
        public Builder usedSize(Long usedSize) {
            this.putQueryParameter("UsedSize", usedSize);
            this.usedSize = usedSize;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateDriveRequest build() {
            return new CreateDriveRequest(this);
        } 

    } 

}
