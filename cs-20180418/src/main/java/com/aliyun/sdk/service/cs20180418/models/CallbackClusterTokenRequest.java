// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CallbackClusterTokenRequest} extends {@link RequestModel}
 *
 * <p>CallbackClusterTokenRequest</p>
 */
public class CallbackClusterTokenRequest extends Request {
    @Path
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    @Path
    @NameInMap("ReqOnce")
    @Validation(required = true)
    private String reqOnce;

    private CallbackClusterTokenRequest(Builder builder) {
        super(builder);
        this.token = builder.token;
        this.reqOnce = builder.reqOnce;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CallbackClusterTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return reqOnce
     */
    public String getReqOnce() {
        return this.reqOnce;
    }

    public static final class Builder extends Request.Builder<CallbackClusterTokenRequest, Builder> {
        private String token; 
        private String reqOnce; 

        private Builder() {
            super();
        } 

        private Builder(CallbackClusterTokenRequest response) {
            super(response);
            this.token = response.token;
            this.reqOnce = response.reqOnce;
        } 

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putPathParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * ReqOnce.
         */
        public Builder reqOnce(String reqOnce) {
            this.putPathParameter("ReqOnce", reqOnce);
            this.reqOnce = reqOnce;
            return this;
        }

        @Override
        public CallbackClusterTokenRequest build() {
            return new CallbackClusterTokenRequest(this);
        } 

    } 

}
