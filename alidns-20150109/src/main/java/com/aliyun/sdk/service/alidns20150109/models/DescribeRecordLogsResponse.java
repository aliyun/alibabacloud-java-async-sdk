// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeRecordLogsResponse</p>
 */
public class DescribeRecordLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRecordLogsResponseBody body;

    private DescribeRecordLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRecordLogsResponse create() {
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
    public DescribeRecordLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRecordLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRecordLogsResponseBody body);

        @Override
        DescribeRecordLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRecordLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRecordLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRecordLogsResponse response) {
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
        public Builder body(DescribeRecordLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRecordLogsResponse build() {
            return new DescribeRecordLogsResponse(this);
        } 

    } 

}
