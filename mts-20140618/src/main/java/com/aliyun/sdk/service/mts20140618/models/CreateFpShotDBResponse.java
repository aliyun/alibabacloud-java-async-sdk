// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFpShotDBResponse} extends {@link TeaModel}
 *
 * <p>CreateFpShotDBResponse</p>
 */
public class CreateFpShotDBResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFpShotDBResponseBody body;

    private CreateFpShotDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFpShotDBResponse create() {
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
    public CreateFpShotDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFpShotDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFpShotDBResponseBody body);

        @Override
        CreateFpShotDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFpShotDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFpShotDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFpShotDBResponse response) {
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
        public Builder body(CreateFpShotDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFpShotDBResponse build() {
            return new CreateFpShotDBResponse(this);
        } 

    } 

}
