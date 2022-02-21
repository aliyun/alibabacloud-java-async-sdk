// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAntChainCertificateRequest} extends {@link RequestModel}
 *
 * <p>ApplyAntChainCertificateRequest</p>
 */
public class ApplyAntChainCertificateRequest extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("UploadReq")
    @Validation(required = true)
    private String uploadReq;

    private ApplyAntChainCertificateRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.regionId = builder.regionId;
        this.uploadReq = builder.uploadReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyAntChainCertificateRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return uploadReq
     */
    public String getUploadReq() {
        return this.uploadReq;
    }

    public static final class Builder extends Request.Builder<ApplyAntChainCertificateRequest, Builder> {
        private String antChainId; 
        private String regionId; 
        private String uploadReq; 

        private Builder() {
            super();
        } 

        private Builder(ApplyAntChainCertificateRequest response) {
            super(response);
            this.antChainId = response.antChainId;
            this.regionId = response.regionId;
            this.uploadReq = response.uploadReq;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UploadReq.
         */
        public Builder uploadReq(String uploadReq) {
            this.putBodyParameter("UploadReq", uploadReq);
            this.uploadReq = uploadReq;
            return this;
        }

        @Override
        public ApplyAntChainCertificateRequest build() {
            return new ApplyAntChainCertificateRequest(this);
        } 

    } 

}
