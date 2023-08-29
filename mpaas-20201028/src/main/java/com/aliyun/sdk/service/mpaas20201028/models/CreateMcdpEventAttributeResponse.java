// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcdpEventAttributeResponse} extends {@link TeaModel}
 *
 * <p>CreateMcdpEventAttributeResponse</p>
 */
public class CreateMcdpEventAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcdpEventAttributeResponseBody body;

    private CreateMcdpEventAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcdpEventAttributeResponse create() {
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
    public CreateMcdpEventAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcdpEventAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcdpEventAttributeResponseBody body);

        @Override
        CreateMcdpEventAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcdpEventAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcdpEventAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcdpEventAttributeResponse response) {
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
        public Builder body(CreateMcdpEventAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcdpEventAttributeResponse build() {
            return new CreateMcdpEventAttributeResponse(this);
        } 

    } 

}
