// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baasdis20200509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyVerifiableClaimRequest} extends {@link RequestModel}
 *
 * <p>VerifyVerifiableClaimRequest</p>
 */
public class VerifyVerifiableClaimRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VCContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String VCContent;

    private VerifyVerifiableClaimRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.VCContent = builder.VCContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyVerifiableClaimRequest create() {
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
     * @return VCContent
     */
    public String getVCContent() {
        return this.VCContent;
    }

    public static final class Builder extends Request.Builder<VerifyVerifiableClaimRequest, Builder> {
        private String regionId; 
        private String VCContent; 

        private Builder() {
            super();
        } 

        private Builder(VerifyVerifiableClaimRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.VCContent = request.VCContent;
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
         * VCContent.
         */
        public Builder VCContent(String VCContent) {
            this.putBodyParameter("VCContent", VCContent);
            this.VCContent = VCContent;
            return this;
        }

        @Override
        public VerifyVerifiableClaimRequest build() {
            return new VerifyVerifiableClaimRequest(this);
        } 

    } 

}
