// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordFilesResponse} extends {@link TeaModel}
 *
 * <p>DescribeRecordFilesResponse</p>
 */
public class DescribeRecordFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRecordFilesResponseBody body;

    private DescribeRecordFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRecordFilesResponse create() {
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
    public DescribeRecordFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRecordFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRecordFilesResponseBody body);

        @Override
        DescribeRecordFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRecordFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRecordFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRecordFilesResponse response) {
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
        public Builder body(DescribeRecordFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRecordFilesResponse build() {
            return new DescribeRecordFilesResponse(this);
        } 

    } 

}
