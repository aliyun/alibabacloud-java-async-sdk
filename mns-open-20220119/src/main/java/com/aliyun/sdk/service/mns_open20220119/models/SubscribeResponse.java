// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscribeResponse} extends {@link TeaModel}
 *
 * <p>SubscribeResponse</p>
 */
public class SubscribeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubscribeResponseBody body;

    private SubscribeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubscribeResponse create() {
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
    public SubscribeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubscribeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubscribeResponseBody body);

        @Override
        SubscribeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubscribeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubscribeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubscribeResponse response) {
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
        public Builder body(SubscribeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubscribeResponse build() {
            return new SubscribeResponse(this);
        } 

    } 

}
