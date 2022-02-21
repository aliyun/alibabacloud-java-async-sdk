// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelPickUpWaybillResponse} extends {@link TeaModel}
 *
 * <p>CancelPickUpWaybillResponse</p>
 */
public class CancelPickUpWaybillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelPickUpWaybillResponseBody body;

    private CancelPickUpWaybillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelPickUpWaybillResponse create() {
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
    public CancelPickUpWaybillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelPickUpWaybillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelPickUpWaybillResponseBody body);

        @Override
        CancelPickUpWaybillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelPickUpWaybillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelPickUpWaybillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelPickUpWaybillResponse response) {
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
        public Builder body(CancelPickUpWaybillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelPickUpWaybillResponse build() {
            return new CancelPickUpWaybillResponse(this);
        } 

    } 

}
