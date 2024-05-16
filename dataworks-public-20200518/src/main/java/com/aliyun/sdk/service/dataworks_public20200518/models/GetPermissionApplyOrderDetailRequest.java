// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermissionApplyOrderDetailRequest} extends {@link RequestModel}
 *
 * <p>GetPermissionApplyOrderDetailRequest</p>
 */
public class GetPermissionApplyOrderDetailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    private GetPermissionApplyOrderDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.flowId = builder.flowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPermissionApplyOrderDetailRequest create() {
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
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    public static final class Builder extends Request.Builder<GetPermissionApplyOrderDetailRequest, Builder> {
        private String regionId; 
        private String flowId; 

        private Builder() {
            super();
        } 

        private Builder(GetPermissionApplyOrderDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.flowId = request.flowId;
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
         * The ID of the permission request order. You can call the ListPermissionApplyOrders operation to obtain the order ID.
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        @Override
        public GetPermissionApplyOrderDetailRequest build() {
            return new GetPermissionApplyOrderDetailRequest(this);
        } 

    } 

}
