// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImportedServicesDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeImportedServicesDetailResponse</p>
 */
public class DescribeImportedServicesDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImportedServicesDetailResponseBody body;

    private DescribeImportedServicesDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImportedServicesDetailResponse create() {
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
    public DescribeImportedServicesDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImportedServicesDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImportedServicesDetailResponseBody body);

        @Override
        DescribeImportedServicesDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImportedServicesDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImportedServicesDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImportedServicesDetailResponse response) {
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
        public Builder body(DescribeImportedServicesDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImportedServicesDetailResponse build() {
            return new DescribeImportedServicesDetailResponse(this);
        } 

    } 

}
