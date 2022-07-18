// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceMirrorResponse} extends {@link TeaModel}
 *
 * <p>UpdateServiceMirrorResponse</p>
 */
public class UpdateServiceMirrorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateServiceMirrorResponseBody body;

    private UpdateServiceMirrorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateServiceMirrorResponse create() {
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
    public UpdateServiceMirrorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateServiceMirrorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateServiceMirrorResponseBody body);

        @Override
        UpdateServiceMirrorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateServiceMirrorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateServiceMirrorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateServiceMirrorResponse response) {
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
        public Builder body(UpdateServiceMirrorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateServiceMirrorResponse build() {
            return new UpdateServiceMirrorResponse(this);
        } 

    } 

}
