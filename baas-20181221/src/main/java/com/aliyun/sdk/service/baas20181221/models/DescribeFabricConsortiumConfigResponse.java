// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumConfigResponse</p>
 */
public class DescribeFabricConsortiumConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeFabricConsortiumConfigResponseBody body;

    private DescribeFabricConsortiumConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeFabricConsortiumConfigResponse create() {
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
    public DescribeFabricConsortiumConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricConsortiumConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeFabricConsortiumConfigResponseBody body);

        @Override
        DescribeFabricConsortiumConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricConsortiumConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeFabricConsortiumConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricConsortiumConfigResponse response) {
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
        public Builder body(DescribeFabricConsortiumConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricConsortiumConfigResponse build() {
            return new DescribeFabricConsortiumConfigResponse(this);
        } 

    } 

}
