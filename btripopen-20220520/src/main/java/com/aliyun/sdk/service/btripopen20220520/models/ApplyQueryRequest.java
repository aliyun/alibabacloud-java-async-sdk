// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyQueryRequest} extends {@link RequestModel}
 *
 * <p>ApplyQueryRequest</p>
 */
public class ApplyQueryRequest extends Request {
    @Query
    @NameInMap("apply_id")
    private Integer applyId;

    @Query
    @NameInMap("apply_show_id")
    private String applyShowId;

    @Query
    @NameInMap("sub_corp_id")
    private String subCorpId;

    @Query
    @NameInMap("thirdpart_apply_id")
    private String thirdpartApplyId;

    @Query
    @NameInMap("type")
    private Integer type;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private ApplyQueryRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.applyShowId = builder.applyShowId;
        this.subCorpId = builder.subCorpId;
        this.thirdpartApplyId = builder.thirdpartApplyId;
        this.type = builder.type;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public Integer getApplyId() {
        return this.applyId;
    }

    /**
     * @return applyShowId
     */
    public String getApplyShowId() {
        return this.applyShowId;
    }

    /**
     * @return subCorpId
     */
    public String getSubCorpId() {
        return this.subCorpId;
    }

    /**
     * @return thirdpartApplyId
     */
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<ApplyQueryRequest, Builder> {
        private Integer applyId; 
        private String applyShowId; 
        private String subCorpId; 
        private String thirdpartApplyId; 
        private Integer type; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ApplyQueryRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.applyShowId = request.applyShowId;
            this.subCorpId = request.subCorpId;
            this.thirdpartApplyId = request.thirdpartApplyId;
            this.type = request.type;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * apply_id.
         */
        public Builder applyId(Integer applyId) {
            this.putQueryParameter("apply_id", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * apply_show_id.
         */
        public Builder applyShowId(String applyShowId) {
            this.putQueryParameter("apply_show_id", applyShowId);
            this.applyShowId = applyShowId;
            return this;
        }

        /**
         * sub_corp_id.
         */
        public Builder subCorpId(String subCorpId) {
            this.putQueryParameter("sub_corp_id", subCorpId);
            this.subCorpId = subCorpId;
            return this;
        }

        /**
         * thirdpart_apply_id.
         */
        public Builder thirdpartApplyId(String thirdpartApplyId) {
            this.putQueryParameter("thirdpart_apply_id", thirdpartApplyId);
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
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
        public ApplyQueryRequest build() {
            return new ApplyQueryRequest(this);
        } 

    } 

}
