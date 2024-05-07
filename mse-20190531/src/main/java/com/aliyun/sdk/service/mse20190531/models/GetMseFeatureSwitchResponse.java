// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMseFeatureSwitchResponse} extends {@link TeaModel}
 *
 * <p>GetMseFeatureSwitchResponse</p>
 */
public class GetMseFeatureSwitchResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetMseFeatureSwitchResponseBody body;

    private GetMseFeatureSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetMseFeatureSwitchResponse create() {
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
    public GetMseFeatureSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMseFeatureSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetMseFeatureSwitchResponseBody body);

        @Override
        GetMseFeatureSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMseFeatureSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetMseFeatureSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMseFeatureSwitchResponse response) {
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
        public Builder body(GetMseFeatureSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMseFeatureSwitchResponse build() {
            return new GetMseFeatureSwitchResponse(this);
        } 

    } 

}
