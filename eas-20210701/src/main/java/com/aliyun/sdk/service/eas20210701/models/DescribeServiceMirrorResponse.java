// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMirrorResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceMirrorResponse</p>
 */
public class DescribeServiceMirrorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServiceMirrorResponseBody body;

    private DescribeServiceMirrorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceMirrorResponse create() {
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
    public DescribeServiceMirrorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceMirrorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServiceMirrorResponseBody body);

        @Override
        DescribeServiceMirrorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceMirrorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServiceMirrorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceMirrorResponse response) {
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
        public Builder body(DescribeServiceMirrorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceMirrorResponse build() {
            return new DescribeServiceMirrorResponse(this);
        } 

    } 

}
