// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrefixListResponse} extends {@link TeaModel}
 *
 * <p>CreatePrefixListResponse</p>
 */
public class CreatePrefixListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePrefixListResponseBody body;

    private CreatePrefixListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePrefixListResponse create() {
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
    public CreatePrefixListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePrefixListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePrefixListResponseBody body);

        @Override
        CreatePrefixListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePrefixListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePrefixListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePrefixListResponse response) {
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
        public Builder body(CreatePrefixListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePrefixListResponse build() {
            return new CreatePrefixListResponse(this);
        } 

    } 

}
