// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDesktopGroupInfoResponse} extends {@link TeaModel}
 *
 * <p>ExportDesktopGroupInfoResponse</p>
 */
public class ExportDesktopGroupInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportDesktopGroupInfoResponseBody body;

    private ExportDesktopGroupInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportDesktopGroupInfoResponse create() {
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
    public ExportDesktopGroupInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportDesktopGroupInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportDesktopGroupInfoResponseBody body);

        @Override
        ExportDesktopGroupInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportDesktopGroupInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportDesktopGroupInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportDesktopGroupInfoResponse response) {
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
        public Builder body(ExportDesktopGroupInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportDesktopGroupInfoResponse build() {
            return new ExportDesktopGroupInfoResponse(this);
        } 

    } 

}
