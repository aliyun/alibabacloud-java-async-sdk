// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WalkingDirectionResponse} extends {@link TeaModel}
 *
 * <p>WalkingDirectionResponse</p>
 */
public class WalkingDirectionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private WalkingDirectionResponseBody body;

    private WalkingDirectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static WalkingDirectionResponse create() {
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
    public WalkingDirectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<WalkingDirectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(WalkingDirectionResponseBody body);

        @Override
        WalkingDirectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<WalkingDirectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private WalkingDirectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(WalkingDirectionResponse response) {
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
        public Builder body(WalkingDirectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public WalkingDirectionResponse build() {
            return new WalkingDirectionResponse(this);
        } 

    } 

}
