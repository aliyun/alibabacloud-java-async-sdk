// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordingResponse} extends {@link TeaModel}
 *
 * <p>DescribeRecordingResponse</p>
 */
public class DescribeRecordingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRecordingResponseBody body;

    private DescribeRecordingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRecordingResponse create() {
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
    public DescribeRecordingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRecordingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRecordingResponseBody body);

        @Override
        DescribeRecordingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRecordingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRecordingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRecordingResponse response) {
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
        public Builder body(DescribeRecordingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRecordingResponse build() {
            return new DescribeRecordingResponse(this);
        } 

    } 

}
