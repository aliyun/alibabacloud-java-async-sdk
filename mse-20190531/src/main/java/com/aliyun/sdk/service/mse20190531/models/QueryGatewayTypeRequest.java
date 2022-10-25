// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGatewayTypeRequest} extends {@link RequestModel}
 *
 * <p>QueryGatewayTypeRequest</p>
 */
public class QueryGatewayTypeRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    private QueryGatewayTypeRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGatewayTypeRequest create() {
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

    public static final class Builder extends Request.Builder<QueryGatewayTypeRequest, Builder> {
        private String acceptLanguage; 

        private Builder() {
            super();
        } 

        private Builder(QueryGatewayTypeRequest request) {
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
        public QueryGatewayTypeRequest build() {
            return new QueryGatewayTypeRequest(this);
        } 

    } 

}
