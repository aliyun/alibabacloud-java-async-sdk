// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDagComplementResponse} extends {@link TeaModel}
 *
 * <p>CreateDagComplementResponse</p>
 */
public class CreateDagComplementResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDagComplementResponseBody body;

    private CreateDagComplementResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDagComplementResponse create() {
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
    public CreateDagComplementResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDagComplementResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDagComplementResponseBody body);

        @Override
        CreateDagComplementResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDagComplementResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDagComplementResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDagComplementResponse response) {
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
        public Builder body(CreateDagComplementResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDagComplementResponse build() {
            return new CreateDagComplementResponse(this);
        } 

    } 

}
