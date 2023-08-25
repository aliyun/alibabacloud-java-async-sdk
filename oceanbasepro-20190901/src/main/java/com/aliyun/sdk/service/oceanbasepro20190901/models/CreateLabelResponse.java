// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLabelResponse} extends {@link TeaModel}
 *
 * <p>CreateLabelResponse</p>
 */
public class CreateLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLabelResponseBody body;

    private CreateLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLabelResponse create() {
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
    public CreateLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLabelResponseBody body);

        @Override
        CreateLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLabelResponse response) {
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
        public Builder body(CreateLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLabelResponse build() {
            return new CreateLabelResponse(this);
        } 

    } 

}
