// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumInvitaionRequest} extends {@link RequestModel}
 *
 * <p>DescribeEthereumInvitaionRequest</p>
 */
public class DescribeEthereumInvitaionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    private DescribeEthereumInvitaionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEthereumInvitaionRequest create() {
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<DescribeEthereumInvitaionRequest, Builder> {
        private String regionId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEthereumInvitaionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.token = request.token;
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
         * Token.
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public DescribeEthereumInvitaionRequest build() {
            return new DescribeEthereumInvitaionRequest(this);
        } 

    } 

}
