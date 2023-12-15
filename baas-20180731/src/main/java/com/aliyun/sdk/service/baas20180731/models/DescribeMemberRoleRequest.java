// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMemberRoleRequest} extends {@link RequestModel}
 *
 * <p>DescribeMemberRoleRequest</p>
 */
public class DescribeMemberRoleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Bizid")
    private String bizid;

    private DescribeMemberRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMemberRoleRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    public static final class Builder extends Request.Builder<DescribeMemberRoleRequest, Builder> {
        private String regionId; 
        private String bizid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMemberRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        @Override
        public DescribeMemberRoleRequest build() {
            return new DescribeMemberRoleRequest(this);
        } 

    } 

}
