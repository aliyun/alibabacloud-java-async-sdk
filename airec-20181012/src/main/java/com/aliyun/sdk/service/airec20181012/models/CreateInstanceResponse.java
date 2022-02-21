// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateInstanceResponse</p>
 */
public class CreateInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInstanceResponseBody body;

    private CreateInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInstanceResponse create() {
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
    public CreateInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInstanceResponseBody body);

        @Override
        CreateInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInstanceResponse response) {
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
        public Builder body(CreateInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInstanceResponse build() {
            return new CreateInstanceResponse(this);
        } 

    } 

}
