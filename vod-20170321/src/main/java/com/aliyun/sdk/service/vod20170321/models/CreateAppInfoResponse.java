// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppInfoResponse} extends {@link TeaModel}
 *
 * <p>CreateAppInfoResponse</p>
 */
public class CreateAppInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAppInfoResponseBody body;

    private CreateAppInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAppInfoResponse create() {
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
    public CreateAppInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAppInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAppInfoResponseBody body);

        @Override
        CreateAppInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAppInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAppInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAppInfoResponse response) {
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
        public Builder body(CreateAppInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAppInfoResponse build() {
            return new CreateAppInfoResponse(this);
        } 

    } 

}
