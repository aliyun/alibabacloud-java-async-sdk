// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFirstRankResponse} extends {@link TeaModel}
 *
 * <p>CreateFirstRankResponse</p>
 */
public class CreateFirstRankResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFirstRankResponseBody body;

    private CreateFirstRankResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFirstRankResponse create() {
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
    public CreateFirstRankResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFirstRankResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFirstRankResponseBody body);

        @Override
        CreateFirstRankResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFirstRankResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFirstRankResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFirstRankResponse response) {
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
        public Builder body(CreateFirstRankResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFirstRankResponse build() {
            return new CreateFirstRankResponse(this);
        } 

    } 

}
