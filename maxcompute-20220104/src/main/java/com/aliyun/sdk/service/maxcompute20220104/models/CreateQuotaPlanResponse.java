// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQuotaPlanResponse} extends {@link TeaModel}
 *
 * <p>CreateQuotaPlanResponse</p>
 */
public class CreateQuotaPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateQuotaPlanResponseBody body;

    private CreateQuotaPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateQuotaPlanResponse create() {
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
    public CreateQuotaPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateQuotaPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateQuotaPlanResponseBody body);

        @Override
        CreateQuotaPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateQuotaPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateQuotaPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateQuotaPlanResponse response) {
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
        public Builder body(CreateQuotaPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateQuotaPlanResponse build() {
            return new CreateQuotaPlanResponse(this);
        } 

    } 

}
