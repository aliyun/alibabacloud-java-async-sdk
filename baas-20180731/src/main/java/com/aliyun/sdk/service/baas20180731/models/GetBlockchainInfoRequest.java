// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBlockchainInfoRequest} extends {@link RequestModel}
 *
 * <p>GetBlockchainInfoRequest</p>
 */
public class GetBlockchainInfoRequest extends Request {
    @Body
    @NameInMap("Bizid")
    private String bizid;

    private GetBlockchainInfoRequest(Builder builder) {
        super(builder);
        this.bizid = builder.bizid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBlockchainInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    public static final class Builder extends Request.Builder<GetBlockchainInfoRequest, Builder> {
        private String bizid; 

        private Builder() {
            super();
        } 

        private Builder(GetBlockchainInfoRequest request) {
            super(request);
            this.bizid = request.bizid;
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
        public GetBlockchainInfoRequest build() {
            return new GetBlockchainInfoRequest(this);
        } 

    } 

}
