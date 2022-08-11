// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermissionApplyOrderDetailRequest} extends {@link RequestModel}
 *
 * <p>GetPermissionApplyOrderDetailRequest</p>
 */
public class GetPermissionApplyOrderDetailRequest extends Request {
    @Query
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetPermissionApplyOrderDetailRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
        this.regionId = builder.regionId;
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
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetPermissionApplyOrderDetailRequest, Builder> {
        private String flowId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetPermissionApplyOrderDetailRequest request) {
            super(request);
            this.flowId = request.flowId;
            this.regionId = request.regionId;
        } 

        /**
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
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
        public GetPermissionApplyOrderDetailRequest build() {
            return new GetPermissionApplyOrderDetailRequest(this);
        } 

    } 

}
