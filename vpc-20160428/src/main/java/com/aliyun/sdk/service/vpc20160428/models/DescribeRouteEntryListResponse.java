// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouteEntryListResponse} extends {@link TeaModel}
 *
 * <p>DescribeRouteEntryListResponse</p>
 */
public class DescribeRouteEntryListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRouteEntryListResponseBody body;

    private DescribeRouteEntryListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRouteEntryListResponse create() {
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
    public DescribeRouteEntryListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRouteEntryListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRouteEntryListResponseBody body);

        @Override
        DescribeRouteEntryListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRouteEntryListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRouteEntryListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRouteEntryListResponse response) {
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
        public Builder body(DescribeRouteEntryListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRouteEntryListResponse build() {
            return new DescribeRouteEntryListResponse(this);
        } 

    } 

}
