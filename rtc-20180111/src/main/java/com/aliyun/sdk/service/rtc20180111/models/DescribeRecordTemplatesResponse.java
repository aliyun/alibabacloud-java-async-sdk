// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordTemplatesResponse} extends {@link TeaModel}
 *
 * <p>DescribeRecordTemplatesResponse</p>
 */
public class DescribeRecordTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRecordTemplatesResponseBody body;

    private DescribeRecordTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRecordTemplatesResponse create() {
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
    public DescribeRecordTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRecordTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRecordTemplatesResponseBody body);

        @Override
        DescribeRecordTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRecordTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRecordTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRecordTemplatesResponse response) {
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
        public Builder body(DescribeRecordTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRecordTemplatesResponse build() {
            return new DescribeRecordTemplatesResponse(this);
        } 

    } 

}
