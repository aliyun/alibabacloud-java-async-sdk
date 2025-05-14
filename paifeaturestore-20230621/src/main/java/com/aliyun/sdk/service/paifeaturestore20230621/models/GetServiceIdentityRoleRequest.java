// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link GetServiceIdentityRoleRequest} extends {@link RequestModel}
 *
 * <p>GetServiceIdentityRoleRequest</p>
 */
public class GetServiceIdentityRoleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RoleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetServiceIdentityRoleRequest(Builder builder) {
        super(builder);
        this.roleName = builder.roleName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceIdentityRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetServiceIdentityRoleRequest, Builder> {
        private String roleName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceIdentityRoleRequest request) {
            super(request);
            this.roleName = request.roleName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForFeatureStore</p>
         */
        public Builder roleName(String roleName) {
            this.putPathParameter("RoleName", roleName);
            this.roleName = roleName;
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
        public GetServiceIdentityRoleRequest build() {
            return new GetServiceIdentityRoleRequest(this);
        } 

    } 

}
