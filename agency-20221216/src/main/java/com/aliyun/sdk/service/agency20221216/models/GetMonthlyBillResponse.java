// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonthlyBillResponse} extends {@link TeaModel}
 *
 * <p>GetMonthlyBillResponse</p>
 */
public class GetMonthlyBillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private GetMonthlyBillResponseBody body;

    private GetMonthlyBillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetMonthlyBillResponse create() {
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
    public GetMonthlyBillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMonthlyBillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetMonthlyBillResponseBody body);

        @Override
        GetMonthlyBillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMonthlyBillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetMonthlyBillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMonthlyBillResponse response) {
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
        public Builder body(GetMonthlyBillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMonthlyBillResponse build() {
            return new GetMonthlyBillResponse(this);
        } 

    } 

}
