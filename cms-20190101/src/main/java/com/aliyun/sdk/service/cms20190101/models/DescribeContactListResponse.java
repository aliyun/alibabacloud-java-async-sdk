// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactListResponse} extends {@link TeaModel}
 *
 * <p>DescribeContactListResponse</p>
 */
public class DescribeContactListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeContactListResponseBody body;

    private DescribeContactListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeContactListResponse create() {
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
    public DescribeContactListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeContactListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeContactListResponseBody body);

        @Override
        DescribeContactListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeContactListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeContactListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeContactListResponse response) {
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
        public Builder body(DescribeContactListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeContactListResponse build() {
            return new DescribeContactListResponse(this);
        } 

    } 

}
