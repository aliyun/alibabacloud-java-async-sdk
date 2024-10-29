// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetWmExtractTaskResponse} extends {@link TeaModel}
 *
 * <p>GetWmExtractTaskResponse</p>
 */
public class GetWmExtractTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetWmExtractTaskResponseBody body;

    private GetWmExtractTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetWmExtractTaskResponse create() {
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
    public GetWmExtractTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWmExtractTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetWmExtractTaskResponseBody body);

        @Override
        GetWmExtractTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWmExtractTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetWmExtractTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWmExtractTaskResponse response) {
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
        public Builder body(GetWmExtractTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWmExtractTaskResponse build() {
            return new GetWmExtractTaskResponse(this);
        } 

    } 

}
