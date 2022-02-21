// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAntChainQRCodeAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>UpdateAntChainQRCodeAuthorizationRequest</p>
 */
public class UpdateAntChainQRCodeAuthorizationRequest extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("AuthorizationType")
    @Validation(required = true)
    private String authorizationType;

    @Body
    @NameInMap("QRCodeType")
    @Validation(required = true)
    private String QRCodeType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateAntChainQRCodeAuthorizationRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.authorizationType = builder.authorizationType;
        this.QRCodeType = builder.QRCodeType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAntChainQRCodeAuthorizationRequest create() {
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
     * @return authorizationType
     */
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * @return QRCodeType
     */
    public String getQRCodeType() {
        return this.QRCodeType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAntChainQRCodeAuthorizationRequest, Builder> {
        private String antChainId; 
        private String authorizationType; 
        private String QRCodeType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAntChainQRCodeAuthorizationRequest response) {
            super(response);
            this.antChainId = response.antChainId;
            this.authorizationType = response.authorizationType;
            this.QRCodeType = response.QRCodeType;
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
         * AuthorizationType.
         */
        public Builder authorizationType(String authorizationType) {
            this.putBodyParameter("AuthorizationType", authorizationType);
            this.authorizationType = authorizationType;
            return this;
        }

        /**
         * QRCodeType.
         */
        public Builder QRCodeType(String QRCodeType) {
            this.putBodyParameter("QRCodeType", QRCodeType);
            this.QRCodeType = QRCodeType;
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
        public UpdateAntChainQRCodeAuthorizationRequest build() {
            return new UpdateAntChainQRCodeAuthorizationRequest(this);
        } 

    } 

}
