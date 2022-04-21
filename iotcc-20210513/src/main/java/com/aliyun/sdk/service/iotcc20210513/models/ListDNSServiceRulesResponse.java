// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDNSServiceRulesResponse} extends {@link TeaModel}
 *
 * <p>ListDNSServiceRulesResponse</p>
 */
public class ListDNSServiceRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDNSServiceRulesResponseBody body;

    private ListDNSServiceRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDNSServiceRulesResponse create() {
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
    public ListDNSServiceRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDNSServiceRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDNSServiceRulesResponseBody body);

        @Override
        ListDNSServiceRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDNSServiceRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDNSServiceRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDNSServiceRulesResponse response) {
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
        public Builder body(ListDNSServiceRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDNSServiceRulesResponse build() {
            return new ListDNSServiceRulesResponse(this);
        } 

    } 

}
