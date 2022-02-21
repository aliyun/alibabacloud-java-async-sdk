// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrafficMirrorFilterResponse} extends {@link TeaModel}
 *
 * <p>DeleteTrafficMirrorFilterResponse</p>
 */
public class DeleteTrafficMirrorFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTrafficMirrorFilterResponseBody body;

    private DeleteTrafficMirrorFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTrafficMirrorFilterResponse create() {
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
    public DeleteTrafficMirrorFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTrafficMirrorFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTrafficMirrorFilterResponseBody body);

        @Override
        DeleteTrafficMirrorFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTrafficMirrorFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTrafficMirrorFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTrafficMirrorFilterResponse response) {
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
        public Builder body(DeleteTrafficMirrorFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTrafficMirrorFilterResponse build() {
            return new DeleteTrafficMirrorFilterResponse(this);
        } 

    } 

}
