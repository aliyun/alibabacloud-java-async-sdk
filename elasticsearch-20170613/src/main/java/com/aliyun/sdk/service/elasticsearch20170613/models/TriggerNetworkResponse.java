// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerNetworkResponse} extends {@link TeaModel}
 *
 * <p>TriggerNetworkResponse</p>
 */
public class TriggerNetworkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TriggerNetworkResponseBody body;

    private TriggerNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TriggerNetworkResponse create() {
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
    public TriggerNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TriggerNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TriggerNetworkResponseBody body);

        @Override
        TriggerNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TriggerNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TriggerNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TriggerNetworkResponse response) {
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
        public Builder body(TriggerNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TriggerNetworkResponse build() {
            return new TriggerNetworkResponse(this);
        } 

    } 

}
