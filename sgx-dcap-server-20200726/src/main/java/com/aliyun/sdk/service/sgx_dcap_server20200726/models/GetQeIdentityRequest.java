// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgx_dcap_server20200726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQeIdentityRequest} extends {@link RequestModel}
 *
 * <p>GetQeIdentityRequest</p>
 */
public class GetQeIdentityRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AcsHost")
    private String acsHost;

    @Query
    @NameInMap("ClientVpcId")
    private String clientVpcId;

    private GetQeIdentityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.acsHost = builder.acsHost;
        this.clientVpcId = builder.clientVpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQeIdentityRequest create() {
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
     * @return acsHost
     */
    public String getAcsHost() {
        return this.acsHost;
    }

    /**
     * @return clientVpcId
     */
    public String getClientVpcId() {
        return this.clientVpcId;
    }

    public static final class Builder extends Request.Builder<GetQeIdentityRequest, Builder> {
        private String regionId; 
        private String acsHost; 
        private String clientVpcId; 

        private Builder() {
            super();
        } 

        private Builder(GetQeIdentityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.acsHost = request.acsHost;
            this.clientVpcId = request.clientVpcId;
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
         * AcsHost.
         */
        public Builder acsHost(String acsHost) {
            this.putQueryParameter("AcsHost", acsHost);
            this.acsHost = acsHost;
            return this;
        }

        /**
         * ClientVpcId.
         */
        public Builder clientVpcId(String clientVpcId) {
            this.putQueryParameter("ClientVpcId", clientVpcId);
            this.clientVpcId = clientVpcId;
            return this;
        }

        @Override
        public GetQeIdentityRequest build() {
            return new GetQeIdentityRequest(this);
        } 

    } 

}
