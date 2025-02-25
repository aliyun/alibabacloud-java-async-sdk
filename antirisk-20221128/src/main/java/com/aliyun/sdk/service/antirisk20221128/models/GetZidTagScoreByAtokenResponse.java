// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antirisk20221128.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetZidTagScoreByAtokenResponse} extends {@link TeaModel}
 *
 * <p>GetZidTagScoreByAtokenResponse</p>
 */
public class GetZidTagScoreByAtokenResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetZidTagScoreByAtokenResponseBody body;

    private GetZidTagScoreByAtokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetZidTagScoreByAtokenResponse create() {
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
    public GetZidTagScoreByAtokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetZidTagScoreByAtokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetZidTagScoreByAtokenResponseBody body);

        @Override
        GetZidTagScoreByAtokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetZidTagScoreByAtokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetZidTagScoreByAtokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetZidTagScoreByAtokenResponse response) {
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
        public Builder body(GetZidTagScoreByAtokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetZidTagScoreByAtokenResponse build() {
            return new GetZidTagScoreByAtokenResponse(this);
        } 

    } 

}
