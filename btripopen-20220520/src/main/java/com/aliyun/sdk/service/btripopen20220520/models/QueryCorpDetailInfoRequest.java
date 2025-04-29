// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCorpDetailInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryCorpDetailInfoRequest</p>
 */
public class QueryCorpDetailInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("account_id")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("target_corp_id")
    private String targetCorpId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("target_third_corp_id")
    private String targetThirdCorpId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private QueryCorpDetailInfoRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.targetCorpId = builder.targetCorpId;
        this.targetThirdCorpId = builder.targetThirdCorpId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCorpDetailInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return targetCorpId
     */
    public String getTargetCorpId() {
        return this.targetCorpId;
    }

    /**
     * @return targetThirdCorpId
     */
    public String getTargetThirdCorpId() {
        return this.targetThirdCorpId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<QueryCorpDetailInfoRequest, Builder> {
        private String accountId; 
        private String targetCorpId; 
        private String targetThirdCorpId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(QueryCorpDetailInfoRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.targetCorpId = request.targetCorpId;
            this.targetThirdCorpId = request.targetThirdCorpId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * account_id.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("account_id", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * target_corp_id.
         */
        public Builder targetCorpId(String targetCorpId) {
            this.putQueryParameter("target_corp_id", targetCorpId);
            this.targetCorpId = targetCorpId;
            return this;
        }

        /**
         * target_third_corp_id.
         */
        public Builder targetThirdCorpId(String targetThirdCorpId) {
            this.putQueryParameter("target_third_corp_id", targetThirdCorpId);
            this.targetThirdCorpId = targetThirdCorpId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public QueryCorpDetailInfoRequest build() {
            return new QueryCorpDetailInfoRequest(this);
        } 

    } 

}
