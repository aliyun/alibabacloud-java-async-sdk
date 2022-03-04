// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticityAssurancesResponse} extends {@link TeaModel}
 *
 * <p>DescribeElasticityAssurancesResponse</p>
 */
public class DescribeElasticityAssurancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeElasticityAssurancesResponseBody body;

    private DescribeElasticityAssurancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeElasticityAssurancesResponse create() {
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
     * @return body
     */
    public DescribeElasticityAssurancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeElasticityAssurancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeElasticityAssurancesResponseBody body);

        @Override
        DescribeElasticityAssurancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeElasticityAssurancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeElasticityAssurancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeElasticityAssurancesResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(DescribeElasticityAssurancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeElasticityAssurancesResponse build() {
            return new DescribeElasticityAssurancesResponse(this);
        } 

    } 

}
