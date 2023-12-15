// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyPublicAntChainRequest} extends {@link RequestModel}
 *
 * <p>ApplyPublicAntChainRequest</p>
 */
public class ApplyPublicAntChainRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("ConsortiumId")
    private String consortiumId;

    @Body
    @NameInMap("UploadReq")
    private String uploadReq;

    private ApplyPublicAntChainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.consortiumId = builder.consortiumId;
        this.uploadReq = builder.uploadReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyPublicAntChainRequest create() {
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

    public static final class Builder extends Request.Builder<ApplyPublicAntChainRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private String consortiumId; 
        private String uploadReq; 

        private Builder() {
            super();
        } 

        private Builder(ApplyPublicAntChainRequest request) {
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
        public ApplyPublicAntChainRequest build() {
            return new ApplyPublicAntChainRequest(this);
        } 

    } 

}
