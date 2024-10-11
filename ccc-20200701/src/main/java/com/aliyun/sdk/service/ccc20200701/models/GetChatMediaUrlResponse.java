// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetChatMediaUrlResponse} extends {@link TeaModel}
 *
 * <p>GetChatMediaUrlResponse</p>
 */
public class GetChatMediaUrlResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetChatMediaUrlResponseBody body;

    private GetChatMediaUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetChatMediaUrlResponse create() {
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
    public GetChatMediaUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetChatMediaUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetChatMediaUrlResponseBody body);

        @Override
        GetChatMediaUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetChatMediaUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetChatMediaUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetChatMediaUrlResponse response) {
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
        public Builder body(GetChatMediaUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetChatMediaUrlResponse build() {
            return new GetChatMediaUrlResponse(this);
        } 

    } 

}
