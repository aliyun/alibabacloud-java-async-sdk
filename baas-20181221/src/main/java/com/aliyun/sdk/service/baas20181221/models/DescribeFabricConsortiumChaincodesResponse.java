// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumChaincodesResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumChaincodesResponse</p>
 */
public class DescribeFabricConsortiumChaincodesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeFabricConsortiumChaincodesResponseBody body;

    private DescribeFabricConsortiumChaincodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeFabricConsortiumChaincodesResponse create() {
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
    public DescribeFabricConsortiumChaincodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricConsortiumChaincodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeFabricConsortiumChaincodesResponseBody body);

        @Override
        DescribeFabricConsortiumChaincodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricConsortiumChaincodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeFabricConsortiumChaincodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricConsortiumChaincodesResponse response) {
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
        public Builder body(DescribeFabricConsortiumChaincodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricConsortiumChaincodesResponse build() {
            return new DescribeFabricConsortiumChaincodesResponse(this);
        } 

    } 

}
