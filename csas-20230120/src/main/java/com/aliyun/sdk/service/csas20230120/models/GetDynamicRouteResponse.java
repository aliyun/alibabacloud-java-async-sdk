// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDynamicRouteResponse} extends {@link TeaModel}
 *
 * <p>GetDynamicRouteResponse</p>
 */
public class GetDynamicRouteResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetDynamicRouteResponseBody body;

    private GetDynamicRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDynamicRouteResponse create() {
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
    public GetDynamicRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDynamicRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDynamicRouteResponseBody body);

        @Override
        GetDynamicRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDynamicRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetDynamicRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDynamicRouteResponse response) {
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
        public Builder body(GetDynamicRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDynamicRouteResponse build() {
            return new GetDynamicRouteResponse(this);
        } 

    } 

}
