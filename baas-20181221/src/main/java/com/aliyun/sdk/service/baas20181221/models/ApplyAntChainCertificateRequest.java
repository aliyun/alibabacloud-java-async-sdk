// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAntChainCertificateRequest} extends {@link RequestModel}
 *
 * <p>ApplyAntChainCertificateRequest</p>
 */
public class ApplyAntChainCertificateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UploadReq")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadReq;

    private ApplyAntChainCertificateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
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
     * @return uploadReq
     */
    public String getUploadReq() {
        return this.uploadReq;
    }

    public static final class Builder extends Request.Builder<ApplyAntChainCertificateRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String uploadReq; 

        private Builder() {
            super();
        } 

        private Builder(ApplyAntChainCertificateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.uploadReq = request.uploadReq;
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
