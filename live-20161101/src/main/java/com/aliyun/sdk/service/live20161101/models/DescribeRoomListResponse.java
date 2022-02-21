// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoomListResponse} extends {@link TeaModel}
 *
 * <p>DescribeRoomListResponse</p>
 */
public class DescribeRoomListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRoomListResponseBody body;

    private DescribeRoomListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRoomListResponse create() {
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
    public DescribeRoomListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRoomListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRoomListResponseBody body);

        @Override
        DescribeRoomListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRoomListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRoomListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRoomListResponse response) {
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
        public Builder body(DescribeRoomListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRoomListResponse build() {
            return new DescribeRoomListResponse(this);
        } 

    } 

}
