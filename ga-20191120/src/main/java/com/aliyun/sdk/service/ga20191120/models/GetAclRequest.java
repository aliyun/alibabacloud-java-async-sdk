// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAclRequest} extends {@link RequestModel}
 *
 * <p>GetAclRequest</p>
 */
public class GetAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetAclRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetAclRequest, Builder> {
        private String aclId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAclRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **GetAcl**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetAclRequest build() {
            return new GetAclRequest(this);
        } 

    } 

}
