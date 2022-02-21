// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecondRankResponse} extends {@link TeaModel}
 *
 * <p>CreateSecondRankResponse</p>
 */
public class CreateSecondRankResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSecondRankResponseBody body;

    private CreateSecondRankResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSecondRankResponse create() {
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
    public CreateSecondRankResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSecondRankResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSecondRankResponseBody body);

        @Override
        CreateSecondRankResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSecondRankResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSecondRankResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSecondRankResponse response) {
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
        public Builder body(CreateSecondRankResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSecondRankResponse build() {
            return new CreateSecondRankResponse(this);
        } 

    } 

}
