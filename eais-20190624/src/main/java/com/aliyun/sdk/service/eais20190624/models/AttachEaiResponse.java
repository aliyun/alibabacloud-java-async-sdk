// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachEaiResponse} extends {@link TeaModel}
 *
 * <p>AttachEaiResponse</p>
 */
public class AttachEaiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachEaiResponseBody body;

    private AttachEaiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachEaiResponse create() {
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
    public AttachEaiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachEaiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachEaiResponseBody body);

        @Override
        AttachEaiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachEaiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachEaiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachEaiResponse response) {
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
        public Builder body(AttachEaiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachEaiResponse build() {
            return new AttachEaiResponse(this);
        } 

    } 

}
