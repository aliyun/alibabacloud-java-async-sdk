// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerAppResponse} extends {@link TeaModel}
 *
 * <p>DescribeContainerAppResponse</p>
 */
public class DescribeContainerAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeContainerAppResponseBody body;

    private DescribeContainerAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeContainerAppResponse create() {
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
    public DescribeContainerAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeContainerAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeContainerAppResponseBody body);

        @Override
        DescribeContainerAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeContainerAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeContainerAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeContainerAppResponse response) {
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
        public Builder body(DescribeContainerAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeContainerAppResponse build() {
            return new DescribeContainerAppResponse(this);
        } 

    } 

}
