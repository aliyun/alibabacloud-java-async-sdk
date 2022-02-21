// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceBrandRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceBrandRequest</p>
 */
public class CreateDeviceBrandRequest extends Request {
    @Query
    @NameInMap("BrandName")
    @Validation(required = true)
    private String brandName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Manufacture")
    private String manufacture;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateDeviceBrandRequest(Builder builder) {
        super(builder);
        this.brandName = builder.brandName;
        this.description = builder.description;
        this.manufacture = builder.manufacture;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceBrandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandName
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return manufacture
     */
    public String getManufacture() {
        return this.manufacture;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateDeviceBrandRequest, Builder> {
        private String brandName; 
        private String description; 
        private String manufacture; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceBrandRequest response) {
            super(response);
            this.brandName = response.brandName;
            this.description = response.description;
            this.manufacture = response.manufacture;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * BrandName.
         */
        public Builder brandName(String brandName) {
            this.putQueryParameter("BrandName", brandName);
            this.brandName = brandName;
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
         * Manufacture.
         */
        public Builder manufacture(String manufacture) {
            this.putQueryParameter("Manufacture", manufacture);
            this.manufacture = manufacture;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
        public CreateDeviceBrandRequest build() {
            return new CreateDeviceBrandRequest(this);
        } 

    } 

}
