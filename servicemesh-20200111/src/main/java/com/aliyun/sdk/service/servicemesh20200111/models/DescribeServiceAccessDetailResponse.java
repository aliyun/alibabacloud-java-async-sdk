// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceAccessDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceAccessDetailResponse</p>
 */
public class DescribeServiceAccessDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServiceAccessDetailResponseBody body;

    private DescribeServiceAccessDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceAccessDetailResponse create() {
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
    public DescribeServiceAccessDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceAccessDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServiceAccessDetailResponseBody body);

        @Override
        DescribeServiceAccessDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceAccessDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServiceAccessDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceAccessDetailResponse response) {
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
        public Builder body(DescribeServiceAccessDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceAccessDetailResponse build() {
            return new DescribeServiceAccessDetailResponse(this);
        } 

    } 

}
