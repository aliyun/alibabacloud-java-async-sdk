// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportImageResponse} extends {@link TeaModel}
 *
 * <p>ExportImageResponse</p>
 */
public class ExportImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportImageResponseBody body;

    private ExportImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportImageResponse create() {
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
    public ExportImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportImageResponseBody body);

        @Override
        ExportImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportImageResponse response) {
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
        public Builder body(ExportImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportImageResponse build() {
            return new ExportImageResponse(this);
        } 

    } 

}
