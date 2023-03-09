// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppInstancesRequest</p>
 */
public class DeleteAppInstancesRequest extends Request {
    @Body
    @NameInMap("AppInstanceGroupId")
    @Validation(required = true)
    private String appInstanceGroupId;

    @Body
    @NameInMap("AppInstanceIds")
    @Validation(required = true)
    private java.util.List < String > appInstanceIds;

    @Body
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    private DeleteAppInstancesRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceIds = builder.appInstanceIds;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceIds
     */
    public java.util.List < String > getAppInstanceIds() {
        return this.appInstanceIds;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<DeleteAppInstancesRequest, Builder> {
        private String appInstanceGroupId; 
        private java.util.List < String > appInstanceIds; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppInstancesRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceIds = request.appInstanceIds;
            this.productType = request.productType;
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
         * AppInstanceIds.
         */
        public Builder appInstanceIds(java.util.List < String > appInstanceIds) {
            this.putBodyParameter("AppInstanceIds", appInstanceIds);
            this.appInstanceIds = appInstanceIds;
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
        public DeleteAppInstancesRequest build() {
            return new DeleteAppInstancesRequest(this);
        } 

    } 

}
