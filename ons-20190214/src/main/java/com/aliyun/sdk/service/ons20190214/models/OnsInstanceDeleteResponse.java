// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsInstanceDeleteResponse} extends {@link TeaModel}
 *
 * <p>OnsInstanceDeleteResponse</p>
 */
public class OnsInstanceDeleteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsInstanceDeleteResponseBody body;

    private OnsInstanceDeleteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsInstanceDeleteResponse create() {
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
    public OnsInstanceDeleteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsInstanceDeleteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsInstanceDeleteResponseBody body);

        @Override
        OnsInstanceDeleteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsInstanceDeleteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsInstanceDeleteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsInstanceDeleteResponse response) {
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
        public Builder body(OnsInstanceDeleteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsInstanceDeleteResponse build() {
            return new OnsInstanceDeleteResponse(this);
        } 

    } 

}
