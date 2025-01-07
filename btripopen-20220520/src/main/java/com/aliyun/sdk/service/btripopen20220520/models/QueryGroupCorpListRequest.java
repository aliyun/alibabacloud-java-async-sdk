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
 * {@link QueryGroupCorpListRequest} extends {@link RequestModel}
 *
 * <p>QueryGroupCorpListRequest</p>
 */
public class QueryGroupCorpListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private QueryGroupCorpListRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGroupCorpListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<QueryGroupCorpListRequest, Builder> {
        private String userId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(QueryGroupCorpListRequest request) {
            super(request);
            this.userId = request.userId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
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
        public QueryGroupCorpListRequest build() {
            return new QueryGroupCorpListRequest(this);
        } 

    } 

}
