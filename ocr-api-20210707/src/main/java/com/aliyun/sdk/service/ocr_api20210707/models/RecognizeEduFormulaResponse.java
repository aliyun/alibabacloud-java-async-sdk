// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeEduFormulaResponse} extends {@link TeaModel}
 *
 * <p>RecognizeEduFormulaResponse</p>
 */
public class RecognizeEduFormulaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeEduFormulaResponseBody body;

    private RecognizeEduFormulaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeEduFormulaResponse create() {
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
    public RecognizeEduFormulaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeEduFormulaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeEduFormulaResponseBody body);

        @Override
        RecognizeEduFormulaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeEduFormulaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeEduFormulaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeEduFormulaResponse response) {
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
        public Builder body(RecognizeEduFormulaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeEduFormulaResponse build() {
            return new RecognizeEduFormulaResponse(this);
        } 

    } 

}
