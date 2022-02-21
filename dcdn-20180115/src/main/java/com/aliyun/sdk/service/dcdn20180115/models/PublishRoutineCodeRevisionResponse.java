// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishRoutineCodeRevisionResponse} extends {@link TeaModel}
 *
 * <p>PublishRoutineCodeRevisionResponse</p>
 */
public class PublishRoutineCodeRevisionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishRoutineCodeRevisionResponseBody body;

    private PublishRoutineCodeRevisionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishRoutineCodeRevisionResponse create() {
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
    public PublishRoutineCodeRevisionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishRoutineCodeRevisionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishRoutineCodeRevisionResponseBody body);

        @Override
        PublishRoutineCodeRevisionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishRoutineCodeRevisionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishRoutineCodeRevisionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishRoutineCodeRevisionResponse response) {
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
        public Builder body(PublishRoutineCodeRevisionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishRoutineCodeRevisionResponse build() {
            return new PublishRoutineCodeRevisionResponse(this);
        } 

    } 

}
