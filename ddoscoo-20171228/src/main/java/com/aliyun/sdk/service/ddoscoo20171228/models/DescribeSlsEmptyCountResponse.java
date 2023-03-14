// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlsEmptyCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeSlsEmptyCountResponse</p>
 */
public class DescribeSlsEmptyCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSlsEmptyCountResponseBody body;

    private DescribeSlsEmptyCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSlsEmptyCountResponse create() {
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
    public DescribeSlsEmptyCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSlsEmptyCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSlsEmptyCountResponseBody body);

        @Override
        DescribeSlsEmptyCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSlsEmptyCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSlsEmptyCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSlsEmptyCountResponse response) {
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
        public Builder body(DescribeSlsEmptyCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSlsEmptyCountResponse build() {
            return new DescribeSlsEmptyCountResponse(this);
        } 

    } 

}
