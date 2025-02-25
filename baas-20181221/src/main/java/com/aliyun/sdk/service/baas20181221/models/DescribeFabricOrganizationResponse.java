// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricOrganizationResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricOrganizationResponse</p>
 */
public class DescribeFabricOrganizationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeFabricOrganizationResponseBody body;

    private DescribeFabricOrganizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeFabricOrganizationResponse create() {
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
    public DescribeFabricOrganizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricOrganizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeFabricOrganizationResponseBody body);

        @Override
        DescribeFabricOrganizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricOrganizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeFabricOrganizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricOrganizationResponse response) {
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
        public Builder body(DescribeFabricOrganizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricOrganizationResponse build() {
            return new DescribeFabricOrganizationResponse(this);
        } 

    } 

}
