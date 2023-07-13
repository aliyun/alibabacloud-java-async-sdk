// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemEventMetaListResponse} extends {@link TeaModel}
 *
 * <p>DescribeSystemEventMetaListResponse</p>
 */
public class DescribeSystemEventMetaListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSystemEventMetaListResponseBody body;

    private DescribeSystemEventMetaListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSystemEventMetaListResponse create() {
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
    public DescribeSystemEventMetaListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSystemEventMetaListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSystemEventMetaListResponseBody body);

        @Override
        DescribeSystemEventMetaListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSystemEventMetaListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSystemEventMetaListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSystemEventMetaListResponse response) {
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
        public Builder body(DescribeSystemEventMetaListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSystemEventMetaListResponse build() {
            return new DescribeSystemEventMetaListResponse(this);
        } 

    } 

}
