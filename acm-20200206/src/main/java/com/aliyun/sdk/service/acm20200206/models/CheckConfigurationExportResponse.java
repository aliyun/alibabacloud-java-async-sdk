// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckConfigurationExportResponse} extends {@link TeaModel}
 *
 * <p>CheckConfigurationExportResponse</p>
 */
public class CheckConfigurationExportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckConfigurationExportResponseBody body;

    private CheckConfigurationExportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckConfigurationExportResponse create() {
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
    public CheckConfigurationExportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckConfigurationExportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckConfigurationExportResponseBody body);

        @Override
        CheckConfigurationExportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckConfigurationExportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckConfigurationExportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckConfigurationExportResponse response) {
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
        public Builder body(CheckConfigurationExportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckConfigurationExportResponse build() {
            return new CheckConfigurationExportResponse(this);
        } 

    } 

}
