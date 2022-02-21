// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSortScriptResponse} extends {@link TeaModel}
 *
 * <p>CreateSortScriptResponse</p>
 */
public class CreateSortScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSortScriptResponseBody body;

    private CreateSortScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSortScriptResponse create() {
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
    public CreateSortScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSortScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSortScriptResponseBody body);

        @Override
        CreateSortScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSortScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSortScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSortScriptResponse response) {
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
        public Builder body(CreateSortScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSortScriptResponse build() {
            return new CreateSortScriptResponse(this);
        } 

    } 

}
