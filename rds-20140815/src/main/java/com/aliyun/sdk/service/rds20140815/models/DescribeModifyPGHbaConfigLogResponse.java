// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModifyPGHbaConfigLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeModifyPGHbaConfigLogResponse</p>
 */
public class DescribeModifyPGHbaConfigLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeModifyPGHbaConfigLogResponseBody body;

    private DescribeModifyPGHbaConfigLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeModifyPGHbaConfigLogResponse create() {
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
    public DescribeModifyPGHbaConfigLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeModifyPGHbaConfigLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeModifyPGHbaConfigLogResponseBody body);

        @Override
        DescribeModifyPGHbaConfigLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeModifyPGHbaConfigLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeModifyPGHbaConfigLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeModifyPGHbaConfigLogResponse response) {
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
        public Builder body(DescribeModifyPGHbaConfigLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeModifyPGHbaConfigLogResponse build() {
            return new DescribeModifyPGHbaConfigLogResponse(this);
        } 

    } 

}
