// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSecondRankResponse} extends {@link TeaModel}
 *
 * <p>RemoveSecondRankResponse</p>
 */
public class RemoveSecondRankResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveSecondRankResponseBody body;

    private RemoveSecondRankResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveSecondRankResponse create() {
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
    public RemoveSecondRankResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveSecondRankResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveSecondRankResponseBody body);

        @Override
        RemoveSecondRankResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveSecondRankResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveSecondRankResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveSecondRankResponse response) {
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
        public Builder body(RemoveSecondRankResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveSecondRankResponse build() {
            return new RemoveSecondRankResponse(this);
        } 

    } 

}
