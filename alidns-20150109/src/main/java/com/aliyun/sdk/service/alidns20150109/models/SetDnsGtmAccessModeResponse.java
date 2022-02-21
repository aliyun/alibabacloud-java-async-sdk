// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDnsGtmAccessModeResponse} extends {@link TeaModel}
 *
 * <p>SetDnsGtmAccessModeResponse</p>
 */
public class SetDnsGtmAccessModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDnsGtmAccessModeResponseBody body;

    private SetDnsGtmAccessModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDnsGtmAccessModeResponse create() {
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
    public SetDnsGtmAccessModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDnsGtmAccessModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDnsGtmAccessModeResponseBody body);

        @Override
        SetDnsGtmAccessModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDnsGtmAccessModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDnsGtmAccessModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDnsGtmAccessModeResponse response) {
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
        public Builder body(SetDnsGtmAccessModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDnsGtmAccessModeResponse build() {
            return new SetDnsGtmAccessModeResponse(this);
        } 

    } 

}
