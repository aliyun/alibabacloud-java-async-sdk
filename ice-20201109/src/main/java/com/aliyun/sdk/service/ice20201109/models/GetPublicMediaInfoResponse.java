// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPublicMediaInfoResponse} extends {@link TeaModel}
 *
 * <p>GetPublicMediaInfoResponse</p>
 */
public class GetPublicMediaInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetPublicMediaInfoResponseBody body;

    private GetPublicMediaInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetPublicMediaInfoResponse create() {
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
    public GetPublicMediaInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPublicMediaInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetPublicMediaInfoResponseBody body);

        @Override
        GetPublicMediaInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPublicMediaInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetPublicMediaInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPublicMediaInfoResponse response) {
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
        public Builder body(GetPublicMediaInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPublicMediaInfoResponse build() {
            return new GetPublicMediaInfoResponse(this);
        } 

    } 

}
