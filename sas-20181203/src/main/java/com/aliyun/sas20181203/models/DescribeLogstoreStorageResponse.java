// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogstoreStorageResponse} extends {@link TeaModel}
 *
 * <p>DescribeLogstoreStorageResponse</p>
 */
public class DescribeLogstoreStorageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLogstoreStorageResponseBody body;

    private DescribeLogstoreStorageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLogstoreStorageResponse create() {
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
    public DescribeLogstoreStorageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLogstoreStorageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLogstoreStorageResponseBody body);

        @Override
        DescribeLogstoreStorageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLogstoreStorageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLogstoreStorageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLogstoreStorageResponse response) {
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
        public Builder body(DescribeLogstoreStorageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLogstoreStorageResponse build() {
            return new DescribeLogstoreStorageResponse(this);
        } 

    } 

}
