// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDbfsResponse} extends {@link TeaModel}
 *
 * <p>AttachDbfsResponse</p>
 */
public class AttachDbfsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachDbfsResponseBody body;

    private AttachDbfsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachDbfsResponse create() {
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
    public AttachDbfsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachDbfsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachDbfsResponseBody body);

        @Override
        AttachDbfsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachDbfsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachDbfsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachDbfsResponse response) {
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
        public Builder body(AttachDbfsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachDbfsResponse build() {
            return new AttachDbfsResponse(this);
        } 

    } 

}
