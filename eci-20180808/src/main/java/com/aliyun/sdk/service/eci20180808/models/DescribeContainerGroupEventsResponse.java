// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerGroupEventsResponse} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupEventsResponse</p>
 */
public class DescribeContainerGroupEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeContainerGroupEventsResponseBody body;

    private DescribeContainerGroupEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeContainerGroupEventsResponse create() {
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
    public DescribeContainerGroupEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeContainerGroupEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeContainerGroupEventsResponseBody body);

        @Override
        DescribeContainerGroupEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeContainerGroupEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeContainerGroupEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeContainerGroupEventsResponse response) {
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
        public Builder body(DescribeContainerGroupEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeContainerGroupEventsResponse build() {
            return new DescribeContainerGroupEventsResponse(this);
        } 

    } 

}
