// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGroupDNSServiceRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteGroupDNSServiceRuleResponse</p>
 */
public class DeleteGroupDNSServiceRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGroupDNSServiceRuleResponseBody body;

    private DeleteGroupDNSServiceRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGroupDNSServiceRuleResponse create() {
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
     * @return body
     */
    public DeleteGroupDNSServiceRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGroupDNSServiceRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGroupDNSServiceRuleResponseBody body);

        @Override
        DeleteGroupDNSServiceRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGroupDNSServiceRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGroupDNSServiceRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGroupDNSServiceRuleResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(DeleteGroupDNSServiceRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGroupDNSServiceRuleResponse build() {
            return new DeleteGroupDNSServiceRuleResponse(this);
        } 

    } 

}
