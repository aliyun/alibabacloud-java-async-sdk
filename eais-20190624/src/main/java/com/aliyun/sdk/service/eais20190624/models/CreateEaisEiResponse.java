// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEaisEiResponse} extends {@link TeaModel}
 *
 * <p>CreateEaisEiResponse</p>
 */
public class CreateEaisEiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEaisEiResponseBody body;

    private CreateEaisEiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEaisEiResponse create() {
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
    public CreateEaisEiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEaisEiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEaisEiResponseBody body);

        @Override
        CreateEaisEiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEaisEiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEaisEiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEaisEiResponse response) {
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
        public Builder body(CreateEaisEiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEaisEiResponse build() {
            return new CreateEaisEiResponse(this);
        } 

    } 

}
