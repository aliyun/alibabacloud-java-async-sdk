// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExpandGroupCapacityResponse} extends {@link TeaModel}
 *
 * <p>ExpandGroupCapacityResponse</p>
 */
public class ExpandGroupCapacityResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ExpandGroupCapacityResponseBody body;

    private ExpandGroupCapacityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ExpandGroupCapacityResponse create() {
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
    public ExpandGroupCapacityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExpandGroupCapacityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ExpandGroupCapacityResponseBody body);

        @Override
        ExpandGroupCapacityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExpandGroupCapacityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ExpandGroupCapacityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExpandGroupCapacityResponse response) {
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
        public Builder body(ExpandGroupCapacityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExpandGroupCapacityResponse build() {
            return new ExpandGroupCapacityResponse(this);
        } 

    } 

}
