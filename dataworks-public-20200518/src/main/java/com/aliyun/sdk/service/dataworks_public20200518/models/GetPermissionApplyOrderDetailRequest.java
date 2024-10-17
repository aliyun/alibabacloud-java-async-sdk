// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the permission request order. You can call the <a href="https://help.aliyun.com/document_detail/211008.html">ListPermissionApplyOrders</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>48f36729-05f9-4a40-9286-933fd940f30a</p>
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
