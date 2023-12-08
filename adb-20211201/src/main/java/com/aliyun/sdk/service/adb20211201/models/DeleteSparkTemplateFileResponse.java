// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSparkTemplateFileResponse} extends {@link TeaModel}
 *
 * <p>DeleteSparkTemplateFileResponse</p>
 */
public class DeleteSparkTemplateFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSparkTemplateFileResponseBody body;

    private DeleteSparkTemplateFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSparkTemplateFileResponse create() {
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
    public DeleteSparkTemplateFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSparkTemplateFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSparkTemplateFileResponseBody body);

        @Override
        DeleteSparkTemplateFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSparkTemplateFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSparkTemplateFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSparkTemplateFileResponse response) {
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
        public Builder body(DeleteSparkTemplateFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSparkTemplateFileResponse build() {
            return new DeleteSparkTemplateFileResponse(this);
        } 

    } 

}
