// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitConvertImageToWordJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitConvertImageToWordJobResponse</p>
 */
public class SubmitConvertImageToWordJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitConvertImageToWordJobResponseBody body;

    private SubmitConvertImageToWordJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitConvertImageToWordJobResponse create() {
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
    public SubmitConvertImageToWordJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitConvertImageToWordJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitConvertImageToWordJobResponseBody body);

        @Override
        SubmitConvertImageToWordJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitConvertImageToWordJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitConvertImageToWordJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitConvertImageToWordJobResponse response) {
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
        public Builder body(SubmitConvertImageToWordJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitConvertImageToWordJobResponse build() {
            return new SubmitConvertImageToWordJobResponse(this);
        } 

    } 

}
