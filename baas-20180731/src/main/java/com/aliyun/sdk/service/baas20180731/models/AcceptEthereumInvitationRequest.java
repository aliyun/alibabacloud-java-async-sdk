// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptEthereumInvitationRequest} extends {@link RequestModel}
 *
 * <p>AcceptEthereumInvitationRequest</p>
 */
public class AcceptEthereumInvitationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Body
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    private AcceptEthereumInvitationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.code = builder.code;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptEthereumInvitationRequest create() {
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<AcceptEthereumInvitationRequest, Builder> {
        private String regionId; 
        private String code; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(AcceptEthereumInvitationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.code = request.code;
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
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
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
        public AcceptEthereumInvitationRequest build() {
            return new AcceptEthereumInvitationRequest(this);
        } 

    } 

}
