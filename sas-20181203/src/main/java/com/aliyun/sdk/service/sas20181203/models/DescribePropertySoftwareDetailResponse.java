// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertySoftwareDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribePropertySoftwareDetailResponse</p>
 */
public class DescribePropertySoftwareDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePropertySoftwareDetailResponseBody body;

    private DescribePropertySoftwareDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePropertySoftwareDetailResponse create() {
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
    public DescribePropertySoftwareDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePropertySoftwareDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePropertySoftwareDetailResponseBody body);

        @Override
        DescribePropertySoftwareDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePropertySoftwareDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePropertySoftwareDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePropertySoftwareDetailResponse response) {
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
        public Builder body(DescribePropertySoftwareDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePropertySoftwareDetailResponse build() {
            return new DescribePropertySoftwareDetailResponse(this);
        } 

    } 

}
