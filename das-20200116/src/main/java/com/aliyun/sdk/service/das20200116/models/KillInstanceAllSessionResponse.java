// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link KillInstanceAllSessionResponse} extends {@link TeaModel}
 *
 * <p>KillInstanceAllSessionResponse</p>
 */
public class KillInstanceAllSessionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private KillInstanceAllSessionResponseBody body;

    private KillInstanceAllSessionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static KillInstanceAllSessionResponse create() {
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
    public KillInstanceAllSessionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<KillInstanceAllSessionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(KillInstanceAllSessionResponseBody body);

        @Override
        KillInstanceAllSessionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<KillInstanceAllSessionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private KillInstanceAllSessionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(KillInstanceAllSessionResponse response) {
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
        public Builder body(KillInstanceAllSessionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public KillInstanceAllSessionResponse build() {
            return new KillInstanceAllSessionResponse(this);
        } 

    } 

}
