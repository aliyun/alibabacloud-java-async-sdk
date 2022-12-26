// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyTypeScaItemResponse} extends {@link TeaModel}
 *
 * <p>DescribePropertyTypeScaItemResponse</p>
 */
public class DescribePropertyTypeScaItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePropertyTypeScaItemResponseBody body;

    private DescribePropertyTypeScaItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePropertyTypeScaItemResponse create() {
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
    public DescribePropertyTypeScaItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePropertyTypeScaItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePropertyTypeScaItemResponseBody body);

        @Override
        DescribePropertyTypeScaItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePropertyTypeScaItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePropertyTypeScaItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePropertyTypeScaItemResponse response) {
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
        public Builder body(DescribePropertyTypeScaItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePropertyTypeScaItemResponse build() {
            return new DescribePropertyTypeScaItemResponse(this);
        } 

    } 

}
