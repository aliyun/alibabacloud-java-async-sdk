// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateAdvancedSearchFileResponse} extends {@link TeaModel}
 *
 * <p>GetAggregateAdvancedSearchFileResponse</p>
 */
public class GetAggregateAdvancedSearchFileResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetAggregateAdvancedSearchFileResponseBody body;

    private GetAggregateAdvancedSearchFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAggregateAdvancedSearchFileResponse create() {
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
    public GetAggregateAdvancedSearchFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAggregateAdvancedSearchFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAggregateAdvancedSearchFileResponseBody body);

        @Override
        GetAggregateAdvancedSearchFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAggregateAdvancedSearchFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetAggregateAdvancedSearchFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAggregateAdvancedSearchFileResponse response) {
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
        public Builder body(GetAggregateAdvancedSearchFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAggregateAdvancedSearchFileResponse build() {
            return new GetAggregateAdvancedSearchFileResponse(this);
        } 

    } 

}
