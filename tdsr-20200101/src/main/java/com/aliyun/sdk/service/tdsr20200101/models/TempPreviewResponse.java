// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TempPreviewResponse} extends {@link TeaModel}
 *
 * <p>TempPreviewResponse</p>
 */
public class TempPreviewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TempPreviewResponseBody body;

    private TempPreviewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TempPreviewResponse create() {
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
    public TempPreviewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TempPreviewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TempPreviewResponseBody body);

        @Override
        TempPreviewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TempPreviewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TempPreviewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TempPreviewResponse response) {
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
        public Builder body(TempPreviewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TempPreviewResponse build() {
            return new TempPreviewResponse(this);
        } 

    } 

}
