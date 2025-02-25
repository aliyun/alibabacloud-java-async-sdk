// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBatchTranslateByVPCResponse} extends {@link TeaModel}
 *
 * <p>GetBatchTranslateByVPCResponse</p>
 */
public class GetBatchTranslateByVPCResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetBatchTranslateByVPCResponseBody body;

    private GetBatchTranslateByVPCResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetBatchTranslateByVPCResponse create() {
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
    public GetBatchTranslateByVPCResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBatchTranslateByVPCResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetBatchTranslateByVPCResponseBody body);

        @Override
        GetBatchTranslateByVPCResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBatchTranslateByVPCResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetBatchTranslateByVPCResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBatchTranslateByVPCResponse response) {
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
        public Builder body(GetBatchTranslateByVPCResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBatchTranslateByVPCResponse build() {
            return new GetBatchTranslateByVPCResponse(this);
        } 

    } 

}
