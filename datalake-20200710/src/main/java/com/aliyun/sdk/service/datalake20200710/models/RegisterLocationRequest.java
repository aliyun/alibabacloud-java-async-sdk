// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterLocationRequest} extends {@link RequestModel}
 *
 * <p>RegisterLocationRequest</p>
 */
public class RegisterLocationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InventoryCollectEnabled")
    private Boolean inventoryCollectEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    @com.aliyun.core.annotation.Validation(required = true)
    private String location;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssLogCollectEnabled")
    private Boolean ossLogCollectEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    private RegisterLocationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.inventoryCollectEnabled = builder.inventoryCollectEnabled;
        this.location = builder.location;
        this.ossLogCollectEnabled = builder.ossLogCollectEnabled;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterLocationRequest create() {
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
     * @return inventoryCollectEnabled
     */
    public Boolean getInventoryCollectEnabled() {
        return this.inventoryCollectEnabled;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return ossLogCollectEnabled
     */
    public Boolean getOssLogCollectEnabled() {
        return this.ossLogCollectEnabled;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<RegisterLocationRequest, Builder> {
        private String regionId; 
        private Boolean inventoryCollectEnabled; 
        private String location; 
        private Boolean ossLogCollectEnabled; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(RegisterLocationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.inventoryCollectEnabled = request.inventoryCollectEnabled;
            this.location = request.location;
            this.ossLogCollectEnabled = request.ossLogCollectEnabled;
            this.roleName = request.roleName;
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
         * InventoryCollectEnabled.
         */
        public Builder inventoryCollectEnabled(Boolean inventoryCollectEnabled) {
            this.putBodyParameter("InventoryCollectEnabled", inventoryCollectEnabled);
            this.inventoryCollectEnabled = inventoryCollectEnabled;
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
         * OssLogCollectEnabled.
         */
        public Builder ossLogCollectEnabled(Boolean ossLogCollectEnabled) {
            this.putBodyParameter("OssLogCollectEnabled", ossLogCollectEnabled);
            this.ossLogCollectEnabled = ossLogCollectEnabled;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public RegisterLocationRequest build() {
            return new RegisterLocationRequest(this);
        } 

    } 

}
