// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateMergedTableResponse} extends {@link TeaModel}
 *
 * <p>GenerateMergedTableResponse</p>
 */
public class GenerateMergedTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateMergedTableResponseBody body;

    private GenerateMergedTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateMergedTableResponse create() {
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
    public GenerateMergedTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateMergedTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateMergedTableResponseBody body);

        @Override
        GenerateMergedTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateMergedTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateMergedTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateMergedTableResponse response) {
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
        public Builder body(GenerateMergedTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateMergedTableResponse build() {
            return new GenerateMergedTableResponse(this);
        } 

    } 

}
