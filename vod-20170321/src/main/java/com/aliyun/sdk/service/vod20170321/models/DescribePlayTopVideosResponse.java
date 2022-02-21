// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayTopVideosResponse} extends {@link TeaModel}
 *
 * <p>DescribePlayTopVideosResponse</p>
 */
public class DescribePlayTopVideosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePlayTopVideosResponseBody body;

    private DescribePlayTopVideosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePlayTopVideosResponse create() {
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
    public DescribePlayTopVideosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePlayTopVideosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePlayTopVideosResponseBody body);

        @Override
        DescribePlayTopVideosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePlayTopVideosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePlayTopVideosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePlayTopVideosResponse response) {
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
        public Builder body(DescribePlayTopVideosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePlayTopVideosResponse build() {
            return new DescribePlayTopVideosResponse(this);
        } 

    } 

}
