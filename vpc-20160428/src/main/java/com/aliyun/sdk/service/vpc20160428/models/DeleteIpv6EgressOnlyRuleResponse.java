// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpv6EgressOnlyRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteIpv6EgressOnlyRuleResponse</p>
 */
public class DeleteIpv6EgressOnlyRuleResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DeleteIpv6EgressOnlyRuleResponseBody body;

    private DeleteIpv6EgressOnlyRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteIpv6EgressOnlyRuleResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DeleteIpv6EgressOnlyRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIpv6EgressOnlyRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteIpv6EgressOnlyRuleResponseBody body);

        @Override
        DeleteIpv6EgressOnlyRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIpv6EgressOnlyRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteIpv6EgressOnlyRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIpv6EgressOnlyRuleResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DeleteIpv6EgressOnlyRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIpv6EgressOnlyRuleResponse build() {
            return new DeleteIpv6EgressOnlyRuleResponse(this);
        } 

    } 

}
