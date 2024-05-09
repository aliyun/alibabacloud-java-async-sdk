// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelExceedApplyQueryRequest} extends {@link RequestModel}
 *
 * <p>HotelExceedApplyQueryRequest</p>
 */
public class HotelExceedApplyQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apply_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long applyId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private HotelExceedApplyQueryRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelExceedApplyQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public Long getApplyId() {
        return this.applyId;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelExceedApplyQueryRequest, Builder> {
        private Long applyId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelExceedApplyQueryRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * apply_id.
         */
        public Builder applyId(Long applyId) {
            this.putQueryParameter("apply_id", applyId);
            this.applyId = applyId;
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
        public HotelExceedApplyQueryRequest build() {
            return new HotelExceedApplyQueryRequest(this);
        } 

    } 

}
