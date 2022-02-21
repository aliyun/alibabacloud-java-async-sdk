// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpandLogicTableInfoListResponse} extends {@link TeaModel}
 *
 * <p>DescribeExpandLogicTableInfoListResponse</p>
 */
public class DescribeExpandLogicTableInfoListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExpandLogicTableInfoListResponseBody body;

    private DescribeExpandLogicTableInfoListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExpandLogicTableInfoListResponse create() {
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
    public DescribeExpandLogicTableInfoListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExpandLogicTableInfoListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExpandLogicTableInfoListResponseBody body);

        @Override
        DescribeExpandLogicTableInfoListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExpandLogicTableInfoListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExpandLogicTableInfoListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExpandLogicTableInfoListResponse response) {
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
        public Builder body(DescribeExpandLogicTableInfoListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExpandLogicTableInfoListResponse build() {
            return new DescribeExpandLogicTableInfoListResponse(this);
        } 

    } 

}
