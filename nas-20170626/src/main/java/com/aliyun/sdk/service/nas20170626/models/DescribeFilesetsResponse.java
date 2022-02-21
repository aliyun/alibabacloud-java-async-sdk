// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFilesetsResponse} extends {@link TeaModel}
 *
 * <p>DescribeFilesetsResponse</p>
 */
public class DescribeFilesetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFilesetsResponseBody body;

    private DescribeFilesetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFilesetsResponse create() {
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
    public DescribeFilesetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFilesetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFilesetsResponseBody body);

        @Override
        DescribeFilesetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFilesetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFilesetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFilesetsResponse response) {
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
        public Builder body(DescribeFilesetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFilesetsResponse build() {
            return new DescribeFilesetsResponse(this);
        } 

    } 

}
