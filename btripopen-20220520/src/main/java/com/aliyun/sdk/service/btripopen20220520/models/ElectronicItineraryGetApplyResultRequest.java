// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ElectronicItineraryGetApplyResultRequest} extends {@link RequestModel}
 *
 * <p>ElectronicItineraryGetApplyResultRequest</p>
 */
public class ElectronicItineraryGetApplyResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batch_apply_no")
    @com.aliyun.core.annotation.Validation(required = true)
    private String batchApplyNo;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private ElectronicItineraryGetApplyResultRequest(Builder builder) {
        super(builder);
        this.batchApplyNo = builder.batchApplyNo;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ElectronicItineraryGetApplyResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchApplyNo
     */
    public String getBatchApplyNo() {
        return this.batchApplyNo;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<ElectronicItineraryGetApplyResultRequest, Builder> {
        private String batchApplyNo; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ElectronicItineraryGetApplyResultRequest request) {
            super(request);
            this.batchApplyNo = request.batchApplyNo;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0c7d5944608943479a9a4d40c1eec618</p>
         */
        public Builder batchApplyNo(String batchApplyNo) {
            this.putQueryParameter("batch_apply_no", batchApplyNo);
            this.batchApplyNo = batchApplyNo;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public ElectronicItineraryGetApplyResultRequest build() {
            return new ElectronicItineraryGetApplyResultRequest(this);
        } 

    } 

}
