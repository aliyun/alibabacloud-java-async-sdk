// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundInstanceResponse} extends {@link TeaModel}
 *
 * <p>RefundInstanceResponse</p>
 */
public class RefundInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefundInstanceResponseBody body;

    private RefundInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefundInstanceResponse create() {
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
    public RefundInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefundInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefundInstanceResponseBody body);

        @Override
        RefundInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefundInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefundInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefundInstanceResponse response) {
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
        public Builder body(RefundInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefundInstanceResponse build() {
            return new RefundInstanceResponse(this);
        } 

    } 

}
