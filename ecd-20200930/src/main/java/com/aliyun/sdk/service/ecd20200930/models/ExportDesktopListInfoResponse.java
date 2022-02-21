// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDesktopListInfoResponse} extends {@link TeaModel}
 *
 * <p>ExportDesktopListInfoResponse</p>
 */
public class ExportDesktopListInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportDesktopListInfoResponseBody body;

    private ExportDesktopListInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportDesktopListInfoResponse create() {
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
    public ExportDesktopListInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportDesktopListInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportDesktopListInfoResponseBody body);

        @Override
        ExportDesktopListInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportDesktopListInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportDesktopListInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportDesktopListInfoResponse response) {
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
        public Builder body(ExportDesktopListInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportDesktopListInfoResponse build() {
            return new ExportDesktopListInfoResponse(this);
        } 

    } 

}
