// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHiTSDBInstanceListResponse} extends {@link TeaModel}
 *
 * <p>DescribeHiTSDBInstanceListResponse</p>
 */
public class DescribeHiTSDBInstanceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHiTSDBInstanceListResponseBody body;

    private DescribeHiTSDBInstanceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHiTSDBInstanceListResponse create() {
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
    public DescribeHiTSDBInstanceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHiTSDBInstanceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHiTSDBInstanceListResponseBody body);

        @Override
        DescribeHiTSDBInstanceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHiTSDBInstanceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHiTSDBInstanceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHiTSDBInstanceListResponse response) {
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
        public Builder body(DescribeHiTSDBInstanceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHiTSDBInstanceListResponse build() {
            return new DescribeHiTSDBInstanceListResponse(this);
        } 

    } 

}
