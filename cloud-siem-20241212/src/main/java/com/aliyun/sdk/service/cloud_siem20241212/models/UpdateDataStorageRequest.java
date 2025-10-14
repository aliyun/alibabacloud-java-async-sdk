// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateDataStorageRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataStorageRequest</p>
 */
public class UpdateDataStorageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataStorageRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataStorageRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String deliveryStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateDataStorageRequest(Builder builder) {
        super(builder);
        this.dataStorageRegionId = builder.dataStorageRegionId;
        this.deliveryStatus = builder.deliveryStatus;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataStorageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataStorageRegionId
     */
    public String getDataStorageRegionId() {
        return this.dataStorageRegionId;
    }

    /**
     * @return deliveryStatus
     */
    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<UpdateDataStorageRequest, Builder> {
        private String dataStorageRegionId; 
        private String deliveryStatus; 
        private String lang; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataStorageRequest request) {
            super(request);
            this.dataStorageRegionId = request.dataStorageRegionId;
            this.deliveryStatus = request.deliveryStatus;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataStorageRegionId(String dataStorageRegionId) {
            this.putBodyParameter("DataStorageRegionId", dataStorageRegionId);
            this.dataStorageRegionId = dataStorageRegionId;
            return this;
        }

        /**
         * DeliveryStatus.
         */
        public Builder deliveryStatus(String deliveryStatus) {
            this.putBodyParameter("DeliveryStatus", deliveryStatus);
            this.deliveryStatus = deliveryStatus;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public UpdateDataStorageRequest build() {
            return new UpdateDataStorageRequest(this);
        } 

    } 

}
