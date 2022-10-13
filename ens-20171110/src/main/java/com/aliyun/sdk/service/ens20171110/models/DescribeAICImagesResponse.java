// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAICImagesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAICImagesResponse</p>
 */
public class DescribeAICImagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAICImagesResponseBody body;

    private DescribeAICImagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAICImagesResponse create() {
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
    public DescribeAICImagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAICImagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAICImagesResponseBody body);

        @Override
        DescribeAICImagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAICImagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAICImagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAICImagesResponse response) {
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
        public Builder body(DescribeAICImagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAICImagesResponse build() {
            return new DescribeAICImagesResponse(this);
        } 

    } 

}
