// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateDriveRequest} extends {@link RequestModel}
 *
 * <p>CreateDriveRequest</p>
 */
public class CreateDriveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainId")
    private String domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriveName")
    private String driveName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalDomainId")
    private String externalDomainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProfileRoaming")
    private Boolean profileRoaming;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
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
        this.type = builder.type;
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
     * @return type
     */
    public String getType() {
        return this.type;
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
        private String type; 
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
            this.type = request.type;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
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
