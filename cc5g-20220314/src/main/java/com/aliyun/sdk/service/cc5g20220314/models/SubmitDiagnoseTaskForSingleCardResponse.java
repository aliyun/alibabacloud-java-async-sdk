// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDiagnoseTaskForSingleCardResponse} extends {@link TeaModel}
 *
 * <p>SubmitDiagnoseTaskForSingleCardResponse</p>
 */
public class SubmitDiagnoseTaskForSingleCardResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SubmitDiagnoseTaskForSingleCardResponseBody body;

    private SubmitDiagnoseTaskForSingleCardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SubmitDiagnoseTaskForSingleCardResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public SubmitDiagnoseTaskForSingleCardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitDiagnoseTaskForSingleCardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SubmitDiagnoseTaskForSingleCardResponseBody body);

        @Override
        SubmitDiagnoseTaskForSingleCardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitDiagnoseTaskForSingleCardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SubmitDiagnoseTaskForSingleCardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitDiagnoseTaskForSingleCardResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(SubmitDiagnoseTaskForSingleCardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitDiagnoseTaskForSingleCardResponse build() {
            return new SubmitDiagnoseTaskForSingleCardResponse(this);
        } 

    } 

}
