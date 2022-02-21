// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreRangeInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeRestoreRangeInfoResponse</p>
 */
public class DescribeRestoreRangeInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRestoreRangeInfoResponseBody body;

    private DescribeRestoreRangeInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRestoreRangeInfoResponse create() {
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
    public DescribeRestoreRangeInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRestoreRangeInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRestoreRangeInfoResponseBody body);

        @Override
        DescribeRestoreRangeInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRestoreRangeInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRestoreRangeInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRestoreRangeInfoResponse response) {
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
        public Builder body(DescribeRestoreRangeInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRestoreRangeInfoResponse build() {
            return new DescribeRestoreRangeInfoResponse(this);
        } 

    } 

}
