// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetServiceLinkedRoleRequest} extends {@link RequestModel}
 *
 * <p>GetServiceLinkedRoleRequest</p>
 */
public class GetServiceLinkedRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetServiceLinkedRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceLinkedRoleRequest create() {
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

    public static final class Builder extends Request.Builder<GetServiceLinkedRoleRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceLinkedRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetServiceLinkedRoleRequest build() {
            return new GetServiceLinkedRoleRequest(this);
        } 

    } 

}
