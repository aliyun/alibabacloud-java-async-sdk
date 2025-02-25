// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAntChainMiniAppQRCodeAuthorizedUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteAntChainMiniAppQRCodeAuthorizedUserRequest</p>
 */
public class DeleteAntChainMiniAppQRCodeAuthorizedUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Phone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phone;

    private DeleteAntChainMiniAppQRCodeAuthorizedUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.phone = builder.phone;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DeleteAntChainMiniAppQRCodeAuthorizedUserRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String phone; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAntChainMiniAppQRCodeAuthorizedUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.phone = request.phone;
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

        @Override
        public DeleteAntChainMiniAppQRCodeAuthorizedUserRequest build() {
            return new DeleteAntChainMiniAppQRCodeAuthorizedUserRequest(this);
        } 

    } 

}
