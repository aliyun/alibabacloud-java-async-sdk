// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelExpressCloudConnectionResponse} extends {@link TeaModel}
 *
 * <p>CancelExpressCloudConnectionResponse</p>
 */
public class CancelExpressCloudConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelExpressCloudConnectionResponseBody body;

    private CancelExpressCloudConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelExpressCloudConnectionResponse create() {
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
    public CancelExpressCloudConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelExpressCloudConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelExpressCloudConnectionResponseBody body);

        @Override
        CancelExpressCloudConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelExpressCloudConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelExpressCloudConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelExpressCloudConnectionResponse response) {
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
        public Builder body(CancelExpressCloudConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelExpressCloudConnectionResponse build() {
            return new CancelExpressCloudConnectionResponse(this);
        } 

    } 

}
