// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGWSInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateGWSInstanceResponse</p>
 */
public class CreateGWSInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateGWSInstanceResponseBody body;

    private CreateGWSInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateGWSInstanceResponse create() {
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
    public CreateGWSInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGWSInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateGWSInstanceResponseBody body);

        @Override
        CreateGWSInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGWSInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateGWSInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGWSInstanceResponse response) {
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
        public Builder body(CreateGWSInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGWSInstanceResponse build() {
            return new CreateGWSInstanceResponse(this);
        } 

    } 

}
