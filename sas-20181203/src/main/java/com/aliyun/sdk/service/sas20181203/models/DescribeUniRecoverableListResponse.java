// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniRecoverableListResponse} extends {@link TeaModel}
 *
 * <p>DescribeUniRecoverableListResponse</p>
 */
public class DescribeUniRecoverableListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUniRecoverableListResponseBody body;

    private DescribeUniRecoverableListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUniRecoverableListResponse create() {
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
    public DescribeUniRecoverableListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUniRecoverableListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUniRecoverableListResponseBody body);

        @Override
        DescribeUniRecoverableListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUniRecoverableListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUniRecoverableListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUniRecoverableListResponse response) {
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
        public Builder body(DescribeUniRecoverableListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUniRecoverableListResponse build() {
            return new DescribeUniRecoverableListResponse(this);
        } 

    } 

}
