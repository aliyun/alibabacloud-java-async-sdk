// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStandardRoomHttpsCertificateRequest} extends {@link RequestModel}
 *
 * <p>GetStandardRoomHttpsCertificateRequest</p>
 */
public class GetStandardRoomHttpsCertificateRequest extends Request {
    @Body
    @NameInMap("CertificateId")
    @Validation(required = true)
    private String certificateId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetStandardRoomHttpsCertificateRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardRoomHttpsCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetStandardRoomHttpsCertificateRequest, Builder> {
        private String certificateId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetStandardRoomHttpsCertificateRequest request) {
            super(request);
            this.certificateId = request.certificateId;
            this.regionId = request.regionId;
        } 

        /**
         * 证书ID
         */
        public Builder certificateId(String certificateId) {
            this.putBodyParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetStandardRoomHttpsCertificateRequest build() {
            return new GetStandardRoomHttpsCertificateRequest(this);
        } 

    } 

}
