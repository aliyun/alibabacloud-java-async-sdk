// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeContainerLogResponse</p>
 */
public class DescribeContainerLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeContainerLogResponseBody body;

    private DescribeContainerLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeContainerLogResponse create() {
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
    public DescribeContainerLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeContainerLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeContainerLogResponseBody body);

        @Override
        DescribeContainerLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeContainerLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeContainerLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeContainerLogResponse response) {
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
        public Builder body(DescribeContainerLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeContainerLogResponse build() {
            return new DescribeContainerLogResponse(this);
        } 

    } 

}
