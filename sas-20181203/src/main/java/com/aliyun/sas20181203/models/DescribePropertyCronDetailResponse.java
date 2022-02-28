// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyCronDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribePropertyCronDetailResponse</p>
 */
public class DescribePropertyCronDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePropertyCronDetailResponseBody body;

    private DescribePropertyCronDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePropertyCronDetailResponse create() {
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
    public DescribePropertyCronDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePropertyCronDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePropertyCronDetailResponseBody body);

        @Override
        DescribePropertyCronDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePropertyCronDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePropertyCronDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePropertyCronDetailResponse response) {
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
        public Builder body(DescribePropertyCronDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePropertyCronDetailResponse build() {
            return new DescribePropertyCronDetailResponse(this);
        } 

    } 

}
