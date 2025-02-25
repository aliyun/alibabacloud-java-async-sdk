// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsDLQMessagePageQueryByGroupIdResponse} extends {@link TeaModel}
 *
 * <p>OnsDLQMessagePageQueryByGroupIdResponse</p>
 */
public class OnsDLQMessagePageQueryByGroupIdResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OnsDLQMessagePageQueryByGroupIdResponseBody body;

    private OnsDLQMessagePageQueryByGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OnsDLQMessagePageQueryByGroupIdResponse create() {
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
    public OnsDLQMessagePageQueryByGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsDLQMessagePageQueryByGroupIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(OnsDLQMessagePageQueryByGroupIdResponseBody body);

        @Override
        OnsDLQMessagePageQueryByGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsDLQMessagePageQueryByGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private OnsDLQMessagePageQueryByGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsDLQMessagePageQueryByGroupIdResponse response) {
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
        public Builder body(OnsDLQMessagePageQueryByGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsDLQMessagePageQueryByGroupIdResponse build() {
            return new OnsDLQMessagePageQueryByGroupIdResponse(this);
        } 

    } 

}
