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
    @com.aliyun.core.annotation.NameInMap("target_corp_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetCorpId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private QueryCorpDetailInfoRequest(Builder builder) {
        super(builder);
        this.targetCorpId = builder.targetCorpId;
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
     * @return targetCorpId
     */
    public String getTargetCorpId() {
        return this.targetCorpId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<QueryCorpDetailInfoRequest, Builder> {
        private String targetCorpId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(QueryCorpDetailInfoRequest request) {
            super(request);
            this.targetCorpId = request.targetCorpId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>btripxxxxxx</p>
         */
        public Builder targetCorpId(String targetCorpId) {
            this.putQueryParameter("target_corp_id", targetCorpId);
            this.targetCorpId = targetCorpId;
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
