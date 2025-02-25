// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumSpecsResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumSpecsResponse</p>
 */
public class DescribeFabricConsortiumSpecsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeFabricConsortiumSpecsResponseBody body;

    private DescribeFabricConsortiumSpecsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeFabricConsortiumSpecsResponse create() {
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
    public DescribeFabricConsortiumSpecsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricConsortiumSpecsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeFabricConsortiumSpecsResponseBody body);

        @Override
        DescribeFabricConsortiumSpecsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricConsortiumSpecsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeFabricConsortiumSpecsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricConsortiumSpecsResponse response) {
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
        public Builder body(DescribeFabricConsortiumSpecsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricConsortiumSpecsResponse build() {
            return new DescribeFabricConsortiumSpecsResponse(this);
        } 

    } 

}
