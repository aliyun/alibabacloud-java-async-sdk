// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModifyParameterLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeModifyParameterLogResponse</p>
 */
public class DescribeModifyParameterLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeModifyParameterLogResponseBody body;

    private DescribeModifyParameterLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeModifyParameterLogResponse create() {
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
    public DescribeModifyParameterLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeModifyParameterLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeModifyParameterLogResponseBody body);

        @Override
        DescribeModifyParameterLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeModifyParameterLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeModifyParameterLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeModifyParameterLogResponse response) {
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
        public Builder body(DescribeModifyParameterLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeModifyParameterLogResponse build() {
            return new DescribeModifyParameterLogResponse(this);
        } 

    } 

}
