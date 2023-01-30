// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppInstanceGroupImageRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppInstanceGroupImageRequest</p>
 */
public class UpdateAppInstanceGroupImageRequest extends Request {
    @Query
    @NameInMap("AppCenterImageId")
    @Validation(required = true)
    private String appCenterImageId;

    @Query
    @NameInMap("AppInstanceGroupId")
    @Validation(required = true)
    private String appInstanceGroupId;

    @Query
    @NameInMap("BizRegionId")
    @Validation(required = true)
    private String bizRegionId;

    @Query
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    @Query
    @NameInMap("UpdateMode")
    private String updateMode;

    private UpdateAppInstanceGroupImageRequest(Builder builder) {
        super(builder);
        this.appCenterImageId = builder.appCenterImageId;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.bizRegionId = builder.bizRegionId;
        this.productType = builder.productType;
        this.updateMode = builder.updateMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppInstanceGroupImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCenterImageId
     */
    public String getAppCenterImageId() {
        return this.appCenterImageId;
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return updateMode
     */
    public String getUpdateMode() {
        return this.updateMode;
    }

    public static final class Builder extends Request.Builder<UpdateAppInstanceGroupImageRequest, Builder> {
        private String appCenterImageId; 
        private String appInstanceGroupId; 
        private String bizRegionId; 
        private String productType; 
        private String updateMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppInstanceGroupImageRequest request) {
            super(request);
            this.appCenterImageId = request.appCenterImageId;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.bizRegionId = request.bizRegionId;
            this.productType = request.productType;
            this.updateMode = request.updateMode;
        } 

        /**
         * AppCenterImageId.
         */
        public Builder appCenterImageId(String appCenterImageId) {
            this.putQueryParameter("AppCenterImageId", appCenterImageId);
            this.appCenterImageId = appCenterImageId;
            return this;
        }

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * UpdateMode.
         */
        public Builder updateMode(String updateMode) {
            this.putQueryParameter("UpdateMode", updateMode);
            this.updateMode = updateMode;
            return this;
        }

        @Override
        public UpdateAppInstanceGroupImageRequest build() {
            return new UpdateAppInstanceGroupImageRequest(this);
        } 

    } 

}
