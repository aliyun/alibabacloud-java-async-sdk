// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WearOrgHonorResponse} extends {@link TeaModel}
 *
 * <p>WearOrgHonorResponse</p>
 */
public class WearOrgHonorResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private WearOrgHonorResponseBody body;

    private WearOrgHonorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static WearOrgHonorResponse create() {
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
    public WearOrgHonorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<WearOrgHonorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(WearOrgHonorResponseBody body);

        @Override
        WearOrgHonorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<WearOrgHonorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private WearOrgHonorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(WearOrgHonorResponse response) {
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
        public Builder body(WearOrgHonorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public WearOrgHonorResponse build() {
            return new WearOrgHonorResponse(this);
        } 

    } 

}
