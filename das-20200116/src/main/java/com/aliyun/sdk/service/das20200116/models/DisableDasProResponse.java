// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableDasProResponse} extends {@link TeaModel}
 *
 * <p>DisableDasProResponse</p>
 */
public class DisableDasProResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableDasProResponseBody body;

    private DisableDasProResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableDasProResponse create() {
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
    public DisableDasProResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableDasProResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableDasProResponseBody body);

        @Override
        DisableDasProResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableDasProResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableDasProResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableDasProResponse response) {
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
        public Builder body(DisableDasProResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableDasProResponse build() {
            return new DisableDasProResponse(this);
        } 

    } 

}
