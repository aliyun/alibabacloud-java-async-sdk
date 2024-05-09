// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainExceedApplyQueryRequest} extends {@link RequestModel}
 *
 * <p>TrainExceedApplyQueryRequest</p>
 */
public class TrainExceedApplyQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apply_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long applyId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private TrainExceedApplyQueryRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainExceedApplyQueryRequest create() {
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

    public static final class Builder extends Request.Builder<TrainExceedApplyQueryRequest, Builder> {
        private Long applyId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainExceedApplyQueryRequest request) {
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
        public TrainExceedApplyQueryRequest build() {
            return new TrainExceedApplyQueryRequest(this);
        } 

    } 

}
