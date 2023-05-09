// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageFromAppInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateImageFromAppInstanceGroupRequest</p>
 */
public class CreateImageFromAppInstanceGroupRequest extends Request {
    @Body
    @NameInMap("AppCenterImageName")
    @Validation(required = true)
    private String appCenterImageName;

    @Body
    @NameInMap("AppInstanceGroupId")
    @Validation(required = true)
    private String appInstanceGroupId;

    @Body
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    private CreateImageFromAppInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appCenterImageName = builder.appCenterImageName;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageFromAppInstanceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCenterImageName
     */
    public String getAppCenterImageName() {
        return this.appCenterImageName;
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<CreateImageFromAppInstanceGroupRequest, Builder> {
        private String appCenterImageName; 
        private String appInstanceGroupId; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageFromAppInstanceGroupRequest request) {
            super(request);
            this.appCenterImageName = request.appCenterImageName;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.productType = request.productType;
        } 

        /**
         * AppCenterImageName.
         */
        public Builder appCenterImageName(String appCenterImageName) {
            this.putBodyParameter("AppCenterImageName", appCenterImageName);
            this.appCenterImageName = appCenterImageName;
            return this;
        }

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public CreateImageFromAppInstanceGroupRequest build() {
            return new CreateImageFromAppInstanceGroupRequest(this);
        } 

    } 

}
