// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageFromFamilyResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageFromFamilyResponse</p>
 */
public class DescribeImageFromFamilyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageFromFamilyResponseBody body;

    private DescribeImageFromFamilyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageFromFamilyResponse create() {
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
    public DescribeImageFromFamilyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageFromFamilyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageFromFamilyResponseBody body);

        @Override
        DescribeImageFromFamilyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageFromFamilyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageFromFamilyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageFromFamilyResponse response) {
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
        public Builder body(DescribeImageFromFamilyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageFromFamilyResponse build() {
            return new DescribeImageFromFamilyResponse(this);
        } 

    } 

}
