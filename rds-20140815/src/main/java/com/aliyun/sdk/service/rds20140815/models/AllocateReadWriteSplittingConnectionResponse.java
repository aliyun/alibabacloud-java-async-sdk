// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AllocateReadWriteSplittingConnectionResponse} extends {@link TeaModel}
 *
 * <p>AllocateReadWriteSplittingConnectionResponse</p>
 */
public class AllocateReadWriteSplittingConnectionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AllocateReadWriteSplittingConnectionResponseBody body;

    private AllocateReadWriteSplittingConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AllocateReadWriteSplittingConnectionResponse create() {
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
    public AllocateReadWriteSplittingConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateReadWriteSplittingConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AllocateReadWriteSplittingConnectionResponseBody body);

        @Override
        AllocateReadWriteSplittingConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateReadWriteSplittingConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AllocateReadWriteSplittingConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateReadWriteSplittingConnectionResponse response) {
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
        public Builder body(AllocateReadWriteSplittingConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateReadWriteSplittingConnectionResponse build() {
            return new AllocateReadWriteSplittingConnectionResponse(this);
        } 

    } 

}
