// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyCronItemResponse} extends {@link TeaModel}
 *
 * <p>DescribePropertyCronItemResponse</p>
 */
public class DescribePropertyCronItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePropertyCronItemResponseBody body;

    private DescribePropertyCronItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePropertyCronItemResponse create() {
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
    public DescribePropertyCronItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePropertyCronItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePropertyCronItemResponseBody body);

        @Override
        DescribePropertyCronItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePropertyCronItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePropertyCronItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePropertyCronItemResponse response) {
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
        public Builder body(DescribePropertyCronItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePropertyCronItemResponse build() {
            return new DescribePropertyCronItemResponse(this);
        } 

    } 

}
