// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSparkTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateSparkTemplateResponse</p>
 */
public class CreateSparkTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSparkTemplateResponseBody body;

    private CreateSparkTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSparkTemplateResponse create() {
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
    public CreateSparkTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSparkTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSparkTemplateResponseBody body);

        @Override
        CreateSparkTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSparkTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSparkTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSparkTemplateResponse response) {
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
        public Builder body(CreateSparkTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSparkTemplateResponse build() {
            return new CreateSparkTemplateResponse(this);
        } 

    } 

}
