// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyProcDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribePropertyProcDetailResponse</p>
 */
public class DescribePropertyProcDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePropertyProcDetailResponseBody body;

    private DescribePropertyProcDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePropertyProcDetailResponse create() {
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
    public DescribePropertyProcDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePropertyProcDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePropertyProcDetailResponseBody body);

        @Override
        DescribePropertyProcDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePropertyProcDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePropertyProcDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePropertyProcDetailResponse response) {
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
        public Builder body(DescribePropertyProcDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePropertyProcDetailResponse build() {
            return new DescribePropertyProcDetailResponse(this);
        } 

    } 

}
