// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeWhitelistForIdeResponse} extends {@link TeaModel}
 *
 * <p>CreateMcubeWhitelistForIdeResponse</p>
 */
public class CreateMcubeWhitelistForIdeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcubeWhitelistForIdeResponseBody body;

    private CreateMcubeWhitelistForIdeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcubeWhitelistForIdeResponse create() {
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
    public CreateMcubeWhitelistForIdeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcubeWhitelistForIdeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcubeWhitelistForIdeResponseBody body);

        @Override
        CreateMcubeWhitelistForIdeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcubeWhitelistForIdeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcubeWhitelistForIdeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcubeWhitelistForIdeResponse response) {
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
        public Builder body(CreateMcubeWhitelistForIdeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcubeWhitelistForIdeResponse build() {
            return new CreateMcubeWhitelistForIdeResponse(this);
        } 

    } 

}
