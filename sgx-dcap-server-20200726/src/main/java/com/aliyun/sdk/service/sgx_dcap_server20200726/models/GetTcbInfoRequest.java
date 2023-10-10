// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgx_dcap_server20200726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTcbInfoRequest} extends {@link RequestModel}
 *
 * <p>GetTcbInfoRequest</p>
 */
public class GetTcbInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AcsHost")
    private String acsHost;

    @Query
    @NameInMap("ClientVpcId")
    private String clientVpcId;

    @Query
    @NameInMap("fmspc")
    @Validation(required = true)
    private String fmspc;

    private GetTcbInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.acsHost = builder.acsHost;
        this.clientVpcId = builder.clientVpcId;
        this.fmspc = builder.fmspc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTcbInfoRequest create() {
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

    /**
     * @return fmspc
     */
    public String getFmspc() {
        return this.fmspc;
    }

    public static final class Builder extends Request.Builder<GetTcbInfoRequest, Builder> {
        private String regionId; 
        private String acsHost; 
        private String clientVpcId; 
        private String fmspc; 

        private Builder() {
            super();
        } 

        private Builder(GetTcbInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.acsHost = request.acsHost;
            this.clientVpcId = request.clientVpcId;
            this.fmspc = request.fmspc;
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

        /**
         * fmspc.
         */
        public Builder fmspc(String fmspc) {
            this.putQueryParameter("fmspc", fmspc);
            this.fmspc = fmspc;
            return this;
        }

        @Override
        public GetTcbInfoRequest build() {
            return new GetTcbInfoRequest(this);
        } 

    } 

}
