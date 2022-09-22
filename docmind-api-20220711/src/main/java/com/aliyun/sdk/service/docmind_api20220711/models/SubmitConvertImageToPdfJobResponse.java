// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitConvertImageToPdfJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitConvertImageToPdfJobResponse</p>
 */
public class SubmitConvertImageToPdfJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitConvertImageToPdfJobResponseBody body;

    private SubmitConvertImageToPdfJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitConvertImageToPdfJobResponse create() {
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
    public SubmitConvertImageToPdfJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitConvertImageToPdfJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitConvertImageToPdfJobResponseBody body);

        @Override
        SubmitConvertImageToPdfJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitConvertImageToPdfJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitConvertImageToPdfJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitConvertImageToPdfJobResponse response) {
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
        public Builder body(SubmitConvertImageToPdfJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitConvertImageToPdfJobResponse build() {
            return new SubmitConvertImageToPdfJobResponse(this);
        } 

    } 

}
