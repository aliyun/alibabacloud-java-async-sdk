// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNoticeConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeNoticeConfigResponse</p>
 */
public class DescribeNoticeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNoticeConfigResponseBody body;

    private DescribeNoticeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNoticeConfigResponse create() {
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
    public DescribeNoticeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNoticeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNoticeConfigResponseBody body);

        @Override
        DescribeNoticeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNoticeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNoticeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNoticeConfigResponse response) {
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
        public Builder body(DescribeNoticeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNoticeConfigResponse build() {
            return new DescribeNoticeConfigResponse(this);
        } 

    } 

}
