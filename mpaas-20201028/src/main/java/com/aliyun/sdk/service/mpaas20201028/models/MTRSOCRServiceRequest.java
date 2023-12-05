// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MTRSOCRServiceRequest} extends {@link RequestModel}
 *
 * <p>MTRSOCRServiceRequest</p>
 */
public class MTRSOCRServiceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("ImageRaw")
    @Validation(required = true)
    private String imageRaw;

    @Body
    @NameInMap("Mask")
    private Boolean mask;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private MTRSOCRServiceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.imageRaw = builder.imageRaw;
        this.mask = builder.mask;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MTRSOCRServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return imageRaw
     */
    public String getImageRaw() {
        return this.imageRaw;
    }

    /**
     * @return mask
     */
    public Boolean getMask() {
        return this.mask;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<MTRSOCRServiceRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String imageRaw; 
        private Boolean mask; 
        private String tenantId; 
        private String type; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(MTRSOCRServiceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.imageRaw = request.imageRaw;
            this.mask = request.mask;
            this.tenantId = request.tenantId;
            this.type = request.type;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ImageRaw.
         */
        public Builder imageRaw(String imageRaw) {
            this.putBodyParameter("ImageRaw", imageRaw);
            this.imageRaw = imageRaw;
            return this;
        }

        /**
         * Mask.
         */
        public Builder mask(Boolean mask) {
            this.putBodyParameter("Mask", mask);
            this.mask = mask;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public MTRSOCRServiceRequest build() {
            return new MTRSOCRServiceRequest(this);
        } 

    } 

}
