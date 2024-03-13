// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealPersonVerificationResultResponse} extends {@link TeaModel}
 *
 * <p>GetRealPersonVerificationResultResponse</p>
 */
public class GetRealPersonVerificationResultResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetRealPersonVerificationResultResponseBody body;

    private GetRealPersonVerificationResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetRealPersonVerificationResultResponse create() {
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
    public GetRealPersonVerificationResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRealPersonVerificationResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetRealPersonVerificationResultResponseBody body);

        @Override
        GetRealPersonVerificationResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRealPersonVerificationResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetRealPersonVerificationResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRealPersonVerificationResultResponse response) {
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
        public Builder body(GetRealPersonVerificationResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRealPersonVerificationResultResponse build() {
            return new GetRealPersonVerificationResultResponse(this);
        } 

    } 

}
