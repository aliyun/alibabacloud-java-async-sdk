// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportWarningResponse} extends {@link TeaModel}
 *
 * <p>ExportWarningResponse</p>
 */
public class ExportWarningResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportWarningResponseBody body;

    private ExportWarningResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportWarningResponse create() {
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
    public ExportWarningResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportWarningResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportWarningResponseBody body);

        @Override
        ExportWarningResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportWarningResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportWarningResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportWarningResponse response) {
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
        public Builder body(ExportWarningResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportWarningResponse build() {
            return new ExportWarningResponse(this);
        } 

    } 

}
