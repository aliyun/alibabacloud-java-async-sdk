// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGatewayRegionRequest} extends {@link RequestModel}
 *
 * <p>QueryGatewayRegionRequest</p>
 */
public class QueryGatewayRegionRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    private QueryGatewayRegionRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGatewayRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public static final class Builder extends Request.Builder<QueryGatewayRegionRequest, Builder> {
        private String acceptLanguage; 

        private Builder() {
            super();
        } 

        private Builder(QueryGatewayRegionRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        @Override
        public QueryGatewayRegionRequest build() {
            return new QueryGatewayRegionRequest(this);
        } 

    } 

}
