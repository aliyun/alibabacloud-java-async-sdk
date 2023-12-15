// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQRCodeAuthorityRequest} extends {@link RequestModel}
 *
 * <p>UpdateQRCodeAuthorityRequest</p>
 */
public class UpdateQRCodeAuthorityRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Authorized")
    private Boolean authorized;

    @Body
    @NameInMap("Bizid")
    private String bizid;

    private UpdateQRCodeAuthorityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorized = builder.authorized;
        this.bizid = builder.bizid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQRCodeAuthorityRequest create() {
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
     * @return authorized
     */
    public Boolean getAuthorized() {
        return this.authorized;
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    public static final class Builder extends Request.Builder<UpdateQRCodeAuthorityRequest, Builder> {
        private String regionId; 
        private Boolean authorized; 
        private String bizid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQRCodeAuthorityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorized = request.authorized;
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
         * Authorized.
         */
        public Builder authorized(Boolean authorized) {
            this.putBodyParameter("Authorized", authorized);
            this.authorized = authorized;
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
        public UpdateQRCodeAuthorityRequest build() {
            return new UpdateQRCodeAuthorityRequest(this);
        } 

    } 

}
