// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnrolledAccountResponse} extends {@link TeaModel}
 *
 * <p>GetEnrolledAccountResponse</p>
 */
public class GetEnrolledAccountResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetEnrolledAccountResponseBody body;

    private GetEnrolledAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetEnrolledAccountResponse create() {
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
    public GetEnrolledAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEnrolledAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetEnrolledAccountResponseBody body);

        @Override
        GetEnrolledAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEnrolledAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetEnrolledAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEnrolledAccountResponse response) {
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
        public Builder body(GetEnrolledAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEnrolledAccountResponse build() {
            return new GetEnrolledAccountResponse(this);
        } 

    } 

}
