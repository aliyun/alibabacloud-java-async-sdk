// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerInstanceIdResponse} extends {@link TeaModel}
 *
 * <p>DescribeContainerInstanceIdResponse</p>
 */
public class DescribeContainerInstanceIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeContainerInstanceIdResponseBody body;

    private DescribeContainerInstanceIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeContainerInstanceIdResponse create() {
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
    public DescribeContainerInstanceIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeContainerInstanceIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeContainerInstanceIdResponseBody body);

        @Override
        DescribeContainerInstanceIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeContainerInstanceIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeContainerInstanceIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeContainerInstanceIdResponse response) {
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
        public Builder body(DescribeContainerInstanceIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeContainerInstanceIdResponse build() {
            return new DescribeContainerInstanceIdResponse(this);
        } 

    } 

}
