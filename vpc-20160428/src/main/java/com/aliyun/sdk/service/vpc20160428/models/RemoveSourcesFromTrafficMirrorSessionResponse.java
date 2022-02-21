// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSourcesFromTrafficMirrorSessionResponse} extends {@link TeaModel}
 *
 * <p>RemoveSourcesFromTrafficMirrorSessionResponse</p>
 */
public class RemoveSourcesFromTrafficMirrorSessionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveSourcesFromTrafficMirrorSessionResponseBody body;

    private RemoveSourcesFromTrafficMirrorSessionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveSourcesFromTrafficMirrorSessionResponse create() {
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
    public RemoveSourcesFromTrafficMirrorSessionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveSourcesFromTrafficMirrorSessionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveSourcesFromTrafficMirrorSessionResponseBody body);

        @Override
        RemoveSourcesFromTrafficMirrorSessionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveSourcesFromTrafficMirrorSessionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveSourcesFromTrafficMirrorSessionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveSourcesFromTrafficMirrorSessionResponse response) {
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
        public Builder body(RemoveSourcesFromTrafficMirrorSessionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveSourcesFromTrafficMirrorSessionResponse build() {
            return new RemoveSourcesFromTrafficMirrorSessionResponse(this);
        } 

    } 

}
