// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baasdis20200509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVCRequest} extends {@link RequestModel}
 *
 * <p>UpdateVCRequest</p>
 */
public class UpdateVCRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IssuerDid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String issuerDid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VCId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String VCId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VCStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String VCStatus;

    private UpdateVCRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.issuerDid = builder.issuerDid;
        this.VCId = builder.VCId;
        this.VCStatus = builder.VCStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVCRequest create() {
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
     * @return issuerDid
     */
    public String getIssuerDid() {
        return this.issuerDid;
    }

    /**
     * @return VCId
     */
    public String getVCId() {
        return this.VCId;
    }

    /**
     * @return VCStatus
     */
    public String getVCStatus() {
        return this.VCStatus;
    }

    public static final class Builder extends Request.Builder<UpdateVCRequest, Builder> {
        private String regionId; 
        private String issuerDid; 
        private String VCId; 
        private String VCStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVCRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.issuerDid = request.issuerDid;
            this.VCId = request.VCId;
            this.VCStatus = request.VCStatus;
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
         * IssuerDid.
         */
        public Builder issuerDid(String issuerDid) {
            this.putBodyParameter("IssuerDid", issuerDid);
            this.issuerDid = issuerDid;
            return this;
        }

        /**
         * VCId.
         */
        public Builder VCId(String VCId) {
            this.putBodyParameter("VCId", VCId);
            this.VCId = VCId;
            return this;
        }

        /**
         * VCStatus.
         */
        public Builder VCStatus(String VCStatus) {
            this.putBodyParameter("VCStatus", VCStatus);
            this.VCStatus = VCStatus;
            return this;
        }

        @Override
        public UpdateVCRequest build() {
            return new UpdateVCRequest(this);
        } 

    } 

}
