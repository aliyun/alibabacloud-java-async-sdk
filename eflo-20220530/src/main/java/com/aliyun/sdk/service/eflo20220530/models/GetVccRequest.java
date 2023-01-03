// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVccRequest} extends {@link RequestModel}
 *
 * <p>GetVccRequest</p>
 */
public class GetVccRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("VccId")
    private String vccId;

    private GetVccRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.vccId = builder.vccId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVccRequest create() {
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
     * @return vccId
     */
    public String getVccId() {
        return this.vccId;
    }

    public static final class Builder extends Request.Builder<GetVccRequest, Builder> {
        private String regionId; 
        private String vccId; 

        private Builder() {
            super();
        } 

        private Builder(GetVccRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.vccId = request.vccId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VccId.
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        @Override
        public GetVccRequest build() {
            return new GetVccRequest(this);
        } 

    } 

}
