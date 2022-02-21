// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshDrdsAtomUrlResponse} extends {@link TeaModel}
 *
 * <p>RefreshDrdsAtomUrlResponse</p>
 */
public class RefreshDrdsAtomUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshDrdsAtomUrlResponseBody body;

    private RefreshDrdsAtomUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshDrdsAtomUrlResponse create() {
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
    public RefreshDrdsAtomUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshDrdsAtomUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshDrdsAtomUrlResponseBody body);

        @Override
        RefreshDrdsAtomUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshDrdsAtomUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshDrdsAtomUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshDrdsAtomUrlResponse response) {
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
        public Builder body(RefreshDrdsAtomUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshDrdsAtomUrlResponse build() {
            return new RefreshDrdsAtomUrlResponse(this);
        } 

    } 

}
