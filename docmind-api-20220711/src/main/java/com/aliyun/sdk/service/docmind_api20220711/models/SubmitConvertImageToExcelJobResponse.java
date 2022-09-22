// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitConvertImageToExcelJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitConvertImageToExcelJobResponse</p>
 */
public class SubmitConvertImageToExcelJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitConvertImageToExcelJobResponseBody body;

    private SubmitConvertImageToExcelJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitConvertImageToExcelJobResponse create() {
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
    public SubmitConvertImageToExcelJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitConvertImageToExcelJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitConvertImageToExcelJobResponseBody body);

        @Override
        SubmitConvertImageToExcelJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitConvertImageToExcelJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitConvertImageToExcelJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitConvertImageToExcelJobResponse response) {
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
        public Builder body(SubmitConvertImageToExcelJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitConvertImageToExcelJobResponse build() {
            return new SubmitConvertImageToExcelJobResponse(this);
        } 

    } 

}
