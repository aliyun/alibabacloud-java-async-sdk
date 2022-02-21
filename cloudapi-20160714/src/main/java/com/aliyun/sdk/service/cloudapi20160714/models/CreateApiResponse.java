// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApiResponse} extends {@link TeaModel}
 *
 * <p>CreateApiResponse</p>
 */
public class CreateApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateApiResponseBody body;

    private CreateApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateApiResponse create() {
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
    public CreateApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateApiResponseBody body);

        @Override
        CreateApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateApiResponse response) {
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
        public Builder body(CreateApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateApiResponse build() {
            return new CreateApiResponse(this);
        } 

    } 

}
