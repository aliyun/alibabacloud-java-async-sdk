// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ciomarketpop20250709.models;

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
 * {@link GetEveryOneSellsFormListRequest} extends {@link RequestModel}
 *
 * <p>GetEveryOneSellsFormListRequest</p>
 */
public class GetEveryOneSellsFormListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Auth")
    private String auth;

    private GetEveryOneSellsFormListRequest(Builder builder) {
        super(builder);
        this.auth = builder.auth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEveryOneSellsFormListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auth
     */
    public String getAuth() {
        return this.auth;
    }

    public static final class Builder extends Request.Builder<GetEveryOneSellsFormListRequest, Builder> {
        private String auth; 

        private Builder() {
            super();
        } 

        private Builder(GetEveryOneSellsFormListRequest request) {
            super(request);
            this.auth = request.auth;
        } 

        /**
         * Auth.
         */
        public Builder auth(String auth) {
            this.putQueryParameter("Auth", auth);
            this.auth = auth;
            return this;
        }

        @Override
        public GetEveryOneSellsFormListRequest build() {
            return new GetEveryOneSellsFormListRequest(this);
        } 

    } 

}
