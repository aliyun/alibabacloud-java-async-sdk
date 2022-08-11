// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBusinessRequest} extends {@link RequestModel}
 *
 * <p>UpdateBusinessRequest</p>
 */
public class UpdateBusinessRequest extends Request {
    @Body
    @NameInMap("BusinessId")
    @Validation(required = true)
    private Long businessId;

    @Body
    @NameInMap("BusinessName")
    private String businessName;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Owner")
    private String owner;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateBusinessRequest(Builder builder) {
        super(builder);
        this.businessId = builder.businessId;
        this.businessName = builder.businessName;
        this.description = builder.description;
        this.owner = builder.owner;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBusinessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessId
     */
    public Long getBusinessId() {
        return this.businessId;
    }

    /**
     * @return businessName
     */
    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectIdentifier
     */
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateBusinessRequest, Builder> {
        private Long businessId; 
        private String businessName; 
        private String description; 
        private String owner; 
        private Long projectId; 
        private String projectIdentifier; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBusinessRequest request) {
            super(request);
            this.businessId = request.businessId;
            this.businessName = request.businessName;
            this.description = request.description;
            this.owner = request.owner;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.regionId = request.regionId;
        } 

        /**
         * BusinessId.
         */
        public Builder businessId(Long businessId) {
            this.putBodyParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * BusinessName.
         */
        public Builder businessName(String businessName) {
            this.putBodyParameter("BusinessName", businessName);
            this.businessName = businessName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectIdentifier.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateBusinessRequest build() {
            return new UpdateBusinessRequest(this);
        } 

    } 

}
