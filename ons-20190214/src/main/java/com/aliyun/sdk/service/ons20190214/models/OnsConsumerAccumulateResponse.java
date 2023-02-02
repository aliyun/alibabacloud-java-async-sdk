// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerAccumulateResponse} extends {@link TeaModel}
 *
 * <p>OnsConsumerAccumulateResponse</p>
 */
public class OnsConsumerAccumulateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsConsumerAccumulateResponseBody body;

    private OnsConsumerAccumulateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsConsumerAccumulateResponse create() {
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
    public OnsConsumerAccumulateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsConsumerAccumulateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsConsumerAccumulateResponseBody body);

        @Override
        OnsConsumerAccumulateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsConsumerAccumulateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsConsumerAccumulateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsConsumerAccumulateResponse response) {
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
        public Builder body(OnsConsumerAccumulateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsConsumerAccumulateResponse build() {
            return new OnsConsumerAccumulateResponse(this);
        } 

    } 

}
