// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWsChGeneralResponse} extends {@link TeaModel}
 *
 * <p>GetWsChGeneralResponse</p>
 */
public class GetWsChGeneralResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetWsChGeneralResponseBody body;

    private GetWsChGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetWsChGeneralResponse create() {
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
    public GetWsChGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWsChGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetWsChGeneralResponseBody body);

        @Override
        GetWsChGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWsChGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetWsChGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWsChGeneralResponse response) {
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
        public Builder body(GetWsChGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWsChGeneralResponse build() {
            return new GetWsChGeneralResponse(this);
        } 

    } 

}
