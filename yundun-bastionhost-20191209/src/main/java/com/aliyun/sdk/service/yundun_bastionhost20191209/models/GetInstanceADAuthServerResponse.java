// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInstanceADAuthServerResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceADAuthServerResponse</p>
 */
public class GetInstanceADAuthServerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetInstanceADAuthServerResponseBody body;

    private GetInstanceADAuthServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetInstanceADAuthServerResponse create() {
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
    public GetInstanceADAuthServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceADAuthServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetInstanceADAuthServerResponseBody body);

        @Override
        GetInstanceADAuthServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceADAuthServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetInstanceADAuthServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceADAuthServerResponse response) {
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
        public Builder body(GetInstanceADAuthServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceADAuthServerResponse build() {
            return new GetInstanceADAuthServerResponse(this);
        } 

    } 

}
