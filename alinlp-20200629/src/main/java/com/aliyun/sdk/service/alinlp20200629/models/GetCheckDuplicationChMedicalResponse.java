// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckDuplicationChMedicalResponse} extends {@link TeaModel}
 *
 * <p>GetCheckDuplicationChMedicalResponse</p>
 */
public class GetCheckDuplicationChMedicalResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetCheckDuplicationChMedicalResponseBody body;

    private GetCheckDuplicationChMedicalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetCheckDuplicationChMedicalResponse create() {
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
    public GetCheckDuplicationChMedicalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCheckDuplicationChMedicalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetCheckDuplicationChMedicalResponseBody body);

        @Override
        GetCheckDuplicationChMedicalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCheckDuplicationChMedicalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetCheckDuplicationChMedicalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCheckDuplicationChMedicalResponse response) {
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
        public Builder body(GetCheckDuplicationChMedicalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCheckDuplicationChMedicalResponse build() {
            return new GetCheckDuplicationChMedicalResponse(this);
        } 

    } 

}
