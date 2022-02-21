// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrafficMirrorSessionResponse} extends {@link TeaModel}
 *
 * <p>DeleteTrafficMirrorSessionResponse</p>
 */
public class DeleteTrafficMirrorSessionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTrafficMirrorSessionResponseBody body;

    private DeleteTrafficMirrorSessionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTrafficMirrorSessionResponse create() {
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
    public DeleteTrafficMirrorSessionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTrafficMirrorSessionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTrafficMirrorSessionResponseBody body);

        @Override
        DeleteTrafficMirrorSessionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTrafficMirrorSessionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTrafficMirrorSessionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTrafficMirrorSessionResponse response) {
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
        public Builder body(DeleteTrafficMirrorSessionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTrafficMirrorSessionResponse build() {
            return new DeleteTrafficMirrorSessionResponse(this);
        } 

    } 

}
