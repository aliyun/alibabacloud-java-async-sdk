// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoomStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeRoomStatusResponse</p>
 */
public class DescribeRoomStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRoomStatusResponseBody body;

    private DescribeRoomStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRoomStatusResponse create() {
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
    public DescribeRoomStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRoomStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRoomStatusResponseBody body);

        @Override
        DescribeRoomStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRoomStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRoomStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRoomStatusResponse response) {
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
        public Builder body(DescribeRoomStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRoomStatusResponse build() {
            return new DescribeRoomStatusResponse(this);
        } 

    } 

}
