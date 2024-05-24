// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopLoadBalancerListenerResponse} extends {@link TeaModel}
 *
 * <p>StopLoadBalancerListenerResponse</p>
 */
public class StopLoadBalancerListenerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private StopLoadBalancerListenerResponseBody body;

    private StopLoadBalancerListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static StopLoadBalancerListenerResponse create() {
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
    public StopLoadBalancerListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopLoadBalancerListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(StopLoadBalancerListenerResponseBody body);

        @Override
        StopLoadBalancerListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopLoadBalancerListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private StopLoadBalancerListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopLoadBalancerListenerResponse response) {
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
        public Builder body(StopLoadBalancerListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopLoadBalancerListenerResponse build() {
            return new StopLoadBalancerListenerResponse(this);
        } 

    } 

}
