// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricChaincodePackageRequest} extends {@link RequestModel}
 *
 * <p>CreateFabricChaincodePackageRequest</p>
 */
public class CreateFabricChaincodePackageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Location")
    private String location;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("OssBucket")
    @Validation(required = true)
    private String ossBucket;

    @Body
    @NameInMap("OssUrl")
    @Validation(required = true)
    private String ossUrl;

    private CreateFabricChaincodePackageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.location = builder.location;
        this.organizationId = builder.organizationId;
        this.ossBucket = builder.ossBucket;
        this.ossUrl = builder.ossUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFabricChaincodePackageRequest create() {
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
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossUrl
     */
    public String getOssUrl() {
        return this.ossUrl;
    }

    public static final class Builder extends Request.Builder<CreateFabricChaincodePackageRequest, Builder> {
        private String regionId; 
        private String location; 
        private String organizationId; 
        private String ossBucket; 
        private String ossUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateFabricChaincodePackageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.location = request.location;
            this.organizationId = request.organizationId;
            this.ossBucket = request.ossBucket;
            this.ossUrl = request.ossUrl;
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
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.putBodyParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssUrl.
         */
        public Builder ossUrl(String ossUrl) {
            this.putBodyParameter("OssUrl", ossUrl);
            this.ossUrl = ossUrl;
            return this;
        }

        @Override
        public CreateFabricChaincodePackageRequest build() {
            return new CreateFabricChaincodePackageRequest(this);
        } 

    } 

}
