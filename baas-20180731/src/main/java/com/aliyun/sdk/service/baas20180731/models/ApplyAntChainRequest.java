// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAntChainRequest} extends {@link RequestModel}
 *
 * <p>ApplyAntChainRequest</p>
 */
public class ApplyAntChainRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizid")
    private String bizid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConsortiumId")
    private String consortiumId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UploadReq")
    private String uploadReq;

    private ApplyAntChainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.consortiumId = builder.consortiumId;
        this.uploadReq = builder.uploadReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyAntChainRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return uploadReq
     */
    public String getUploadReq() {
        return this.uploadReq;
    }

    public static final class Builder extends Request.Builder<ApplyAntChainRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private String consortiumId; 
        private String uploadReq; 

        private Builder() {
            super();
        } 

        private Builder(ApplyAntChainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
            this.consortiumId = request.consortiumId;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
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
        public ApplyAntChainRequest build() {
            return new ApplyAntChainRequest(this);
        } 

    } 

}
