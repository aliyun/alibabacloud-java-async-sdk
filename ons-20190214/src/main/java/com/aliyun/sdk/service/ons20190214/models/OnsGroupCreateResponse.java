// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsGroupCreateResponse} extends {@link TeaModel}
 *
 * <p>OnsGroupCreateResponse</p>
 */
public class OnsGroupCreateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsGroupCreateResponseBody body;

    private OnsGroupCreateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsGroupCreateResponse create() {
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
    public OnsGroupCreateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsGroupCreateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsGroupCreateResponseBody body);

        @Override
        OnsGroupCreateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsGroupCreateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsGroupCreateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsGroupCreateResponse response) {
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
        public Builder body(OnsGroupCreateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsGroupCreateResponse build() {
            return new OnsGroupCreateResponse(this);
        } 

    } 

}
