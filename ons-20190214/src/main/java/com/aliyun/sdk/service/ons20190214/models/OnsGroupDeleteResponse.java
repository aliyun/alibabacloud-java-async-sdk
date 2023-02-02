// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsGroupDeleteResponse} extends {@link TeaModel}
 *
 * <p>OnsGroupDeleteResponse</p>
 */
public class OnsGroupDeleteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsGroupDeleteResponseBody body;

    private OnsGroupDeleteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsGroupDeleteResponse create() {
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
    public OnsGroupDeleteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsGroupDeleteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsGroupDeleteResponseBody body);

        @Override
        OnsGroupDeleteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsGroupDeleteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsGroupDeleteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsGroupDeleteResponse response) {
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
        public Builder body(OnsGroupDeleteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsGroupDeleteResponse build() {
            return new OnsGroupDeleteResponse(this);
        } 

    } 

}
