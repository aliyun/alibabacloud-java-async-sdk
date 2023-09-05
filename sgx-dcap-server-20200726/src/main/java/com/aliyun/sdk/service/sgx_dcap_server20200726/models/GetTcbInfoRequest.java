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
    @NameInMap("fmspc")
    @Validation(required = true)
    private String fmspc;

    private GetTcbInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
     * @return fmspc
     */
    public String getFmspc() {
        return this.fmspc;
    }

    public static final class Builder extends Request.Builder<GetTcbInfoRequest, Builder> {
        private String regionId; 
        private String fmspc; 

        private Builder() {
            super();
        } 

        private Builder(GetTcbInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
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
