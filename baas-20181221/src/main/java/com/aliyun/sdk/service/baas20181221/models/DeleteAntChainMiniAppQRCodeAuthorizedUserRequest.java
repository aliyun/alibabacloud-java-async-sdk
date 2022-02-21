// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAntChainMiniAppQRCodeAuthorizedUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteAntChainMiniAppQRCodeAuthorizedUserRequest</p>
 */
public class DeleteAntChainMiniAppQRCodeAuthorizedUserRequest extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("Phone")
    @Validation(required = true)
    private String phone;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteAntChainMiniAppQRCodeAuthorizedUserRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.phone = builder.phone;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAntChainMiniAppQRCodeAuthorizedUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAntChainMiniAppQRCodeAuthorizedUserRequest, Builder> {
        private String antChainId; 
        private String phone; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAntChainMiniAppQRCodeAuthorizedUserRequest response) {
            super(response);
            this.antChainId = response.antChainId;
            this.phone = response.phone;
            this.regionId = response.regionId;
        } 

        /**
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("Phone", phone);
            this.phone = phone;
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
        public DeleteAntChainMiniAppQRCodeAuthorizedUserRequest build() {
            return new DeleteAntChainMiniAppQRCodeAuthorizedUserRequest(this);
        } 

    } 

}
