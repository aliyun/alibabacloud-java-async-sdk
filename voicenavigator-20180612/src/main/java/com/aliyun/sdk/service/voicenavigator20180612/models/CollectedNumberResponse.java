// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CollectedNumberResponse} extends {@link TeaModel}
 *
 * <p>CollectedNumberResponse</p>
 */
public class CollectedNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CollectedNumberResponseBody body;

    private CollectedNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CollectedNumberResponse create() {
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
    public CollectedNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CollectedNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CollectedNumberResponseBody body);

        @Override
        CollectedNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CollectedNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CollectedNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CollectedNumberResponse response) {
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
        public Builder body(CollectedNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CollectedNumberResponse build() {
            return new CollectedNumberResponse(this);
        } 

    } 

}
