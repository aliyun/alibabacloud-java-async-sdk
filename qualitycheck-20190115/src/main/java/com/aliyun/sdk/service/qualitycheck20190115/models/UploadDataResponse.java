// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadDataResponse} extends {@link TeaModel}
 *
 * <p>UploadDataResponse</p>
 */
public class UploadDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadDataResponseBody body;

    private UploadDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadDataResponse create() {
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
    public UploadDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadDataResponseBody body);

        @Override
        UploadDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadDataResponse response) {
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
        public Builder body(UploadDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadDataResponse build() {
            return new UploadDataResponse(this);
        } 

    } 

}
