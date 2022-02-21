// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServcieScheduleResponse} extends {@link TeaModel}
 *
 * <p>DescribeServcieScheduleResponse</p>
 */
public class DescribeServcieScheduleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServcieScheduleResponseBody body;

    private DescribeServcieScheduleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServcieScheduleResponse create() {
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
    public DescribeServcieScheduleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServcieScheduleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServcieScheduleResponseBody body);

        @Override
        DescribeServcieScheduleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServcieScheduleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServcieScheduleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServcieScheduleResponse response) {
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
        public Builder body(DescribeServcieScheduleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServcieScheduleResponse build() {
            return new DescribeServcieScheduleResponse(this);
        } 

    } 

}
