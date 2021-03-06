// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportVulResponse} extends {@link TeaModel}
 *
 * <p>ExportVulResponse</p>
 */
public class ExportVulResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportVulResponseBody body;

    private ExportVulResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportVulResponse create() {
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
    public ExportVulResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportVulResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportVulResponseBody body);

        @Override
        ExportVulResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportVulResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportVulResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportVulResponse response) {
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
        public Builder body(ExportVulResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportVulResponse build() {
            return new ExportVulResponse(this);
        } 

    } 

}
