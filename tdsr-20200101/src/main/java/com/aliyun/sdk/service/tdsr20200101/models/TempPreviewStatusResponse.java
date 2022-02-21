// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TempPreviewStatusResponse} extends {@link TeaModel}
 *
 * <p>TempPreviewStatusResponse</p>
 */
public class TempPreviewStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TempPreviewStatusResponseBody body;

    private TempPreviewStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TempPreviewStatusResponse create() {
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
    public TempPreviewStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TempPreviewStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TempPreviewStatusResponseBody body);

        @Override
        TempPreviewStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TempPreviewStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TempPreviewStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TempPreviewStatusResponse response) {
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
        public Builder body(TempPreviewStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TempPreviewStatusResponse build() {
            return new TempPreviewStatusResponse(this);
        } 

    } 

}
