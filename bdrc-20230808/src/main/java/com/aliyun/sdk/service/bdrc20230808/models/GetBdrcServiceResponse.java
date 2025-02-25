// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetBdrcServiceResponse} extends {@link TeaModel}
 *
 * <p>GetBdrcServiceResponse</p>
 */
public class GetBdrcServiceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetBdrcServiceResponseBody body;

    private GetBdrcServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetBdrcServiceResponse create() {
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
    public GetBdrcServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBdrcServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetBdrcServiceResponseBody body);

        @Override
        GetBdrcServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBdrcServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetBdrcServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBdrcServiceResponse response) {
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
        public Builder body(GetBdrcServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBdrcServiceResponse build() {
            return new GetBdrcServiceResponse(this);
        } 

    } 

}
