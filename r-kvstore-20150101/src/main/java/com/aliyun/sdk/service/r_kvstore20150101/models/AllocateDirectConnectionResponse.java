// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AllocateDirectConnectionResponse} extends {@link TeaModel}
 *
 * <p>AllocateDirectConnectionResponse</p>
 */
public class AllocateDirectConnectionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AllocateDirectConnectionResponseBody body;

    private AllocateDirectConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AllocateDirectConnectionResponse create() {
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
    public AllocateDirectConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateDirectConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AllocateDirectConnectionResponseBody body);

        @Override
        AllocateDirectConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateDirectConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AllocateDirectConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateDirectConnectionResponse response) {
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
        public Builder body(AllocateDirectConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateDirectConnectionResponse build() {
            return new AllocateDirectConnectionResponse(this);
        } 

    } 

}
