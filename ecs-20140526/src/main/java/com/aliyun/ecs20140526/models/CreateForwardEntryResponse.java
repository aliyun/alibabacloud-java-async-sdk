// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateForwardEntryResponse} extends {@link TeaModel}
 *
 * <p>CreateForwardEntryResponse</p>
 */
public class CreateForwardEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateForwardEntryResponseBody body;

    private CreateForwardEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateForwardEntryResponse create() {
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
    public CreateForwardEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateForwardEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateForwardEntryResponseBody body);

        @Override
        CreateForwardEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateForwardEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateForwardEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateForwardEntryResponse response) {
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
        public Builder body(CreateForwardEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateForwardEntryResponse build() {
            return new CreateForwardEntryResponse(this);
        } 

    } 

}
