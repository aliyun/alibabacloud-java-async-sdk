// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDataSourcesResponse} extends {@link TeaModel}
 *
 * <p>ExportDataSourcesResponse</p>
 */
public class ExportDataSourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportDataSourcesResponseBody body;

    private ExportDataSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportDataSourcesResponse create() {
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
    public ExportDataSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportDataSourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportDataSourcesResponseBody body);

        @Override
        ExportDataSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportDataSourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportDataSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportDataSourcesResponse response) {
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
        public Builder body(ExportDataSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportDataSourcesResponse build() {
            return new ExportDataSourcesResponse(this);
        } 

    } 

}
