// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNotificationConfigurationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeNotificationConfigurationsResponse</p>
 */
public class DescribeNotificationConfigurationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNotificationConfigurationsResponseBody body;

    private DescribeNotificationConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNotificationConfigurationsResponse create() {
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
    public DescribeNotificationConfigurationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNotificationConfigurationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNotificationConfigurationsResponseBody body);

        @Override
        DescribeNotificationConfigurationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNotificationConfigurationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNotificationConfigurationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNotificationConfigurationsResponse response) {
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
        public Builder body(DescribeNotificationConfigurationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNotificationConfigurationsResponse build() {
            return new DescribeNotificationConfigurationsResponse(this);
        } 

    } 

}
