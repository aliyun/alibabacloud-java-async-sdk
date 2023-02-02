// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsInstanceCreateResponse} extends {@link TeaModel}
 *
 * <p>OnsInstanceCreateResponse</p>
 */
public class OnsInstanceCreateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsInstanceCreateResponseBody body;

    private OnsInstanceCreateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsInstanceCreateResponse create() {
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
    public OnsInstanceCreateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsInstanceCreateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsInstanceCreateResponseBody body);

        @Override
        OnsInstanceCreateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsInstanceCreateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsInstanceCreateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsInstanceCreateResponse response) {
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
        public Builder body(OnsInstanceCreateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsInstanceCreateResponse build() {
            return new OnsInstanceCreateResponse(this);
        } 

    } 

}
