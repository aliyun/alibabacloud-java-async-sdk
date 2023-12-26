// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSummaryChEcomResponse} extends {@link TeaModel}
 *
 * <p>GetSummaryChEcomResponse</p>
 */
public class GetSummaryChEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private GetSummaryChEcomResponseBody body;

    private GetSummaryChEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetSummaryChEcomResponse create() {
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
    public GetSummaryChEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSummaryChEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetSummaryChEcomResponseBody body);

        @Override
        GetSummaryChEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSummaryChEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetSummaryChEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSummaryChEcomResponse response) {
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
        public Builder body(GetSummaryChEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSummaryChEcomResponse build() {
            return new GetSummaryChEcomResponse(this);
        } 

    } 

}
