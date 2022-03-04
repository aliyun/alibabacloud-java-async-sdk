// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudAssistantStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeCloudAssistantStatusResponse</p>
 */
public class DescribeCloudAssistantStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCloudAssistantStatusResponseBody body;

    private DescribeCloudAssistantStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCloudAssistantStatusResponse create() {
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
    public DescribeCloudAssistantStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCloudAssistantStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCloudAssistantStatusResponseBody body);

        @Override
        DescribeCloudAssistantStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCloudAssistantStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCloudAssistantStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCloudAssistantStatusResponse response) {
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
        public Builder body(DescribeCloudAssistantStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCloudAssistantStatusResponse build() {
            return new DescribeCloudAssistantStatusResponse(this);
        } 

    } 

}
