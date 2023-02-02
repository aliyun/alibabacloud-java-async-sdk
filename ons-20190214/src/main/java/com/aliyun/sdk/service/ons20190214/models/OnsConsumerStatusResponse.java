// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerStatusResponse} extends {@link TeaModel}
 *
 * <p>OnsConsumerStatusResponse</p>
 */
public class OnsConsumerStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsConsumerStatusResponseBody body;

    private OnsConsumerStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsConsumerStatusResponse create() {
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
    public OnsConsumerStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsConsumerStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsConsumerStatusResponseBody body);

        @Override
        OnsConsumerStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsConsumerStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsConsumerStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsConsumerStatusResponse response) {
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
        public Builder body(OnsConsumerStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsConsumerStatusResponse build() {
            return new OnsConsumerStatusResponse(this);
        } 

    } 

}
