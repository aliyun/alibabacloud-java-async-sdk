// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNotificationTypesResponse} extends {@link TeaModel}
 *
 * <p>DescribeNotificationTypesResponse</p>
 */
public class DescribeNotificationTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNotificationTypesResponseBody body;

    private DescribeNotificationTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNotificationTypesResponse create() {
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
    public DescribeNotificationTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNotificationTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNotificationTypesResponseBody body);

        @Override
        DescribeNotificationTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNotificationTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNotificationTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNotificationTypesResponse response) {
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
        public Builder body(DescribeNotificationTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNotificationTypesResponse build() {
            return new DescribeNotificationTypesResponse(this);
        } 

    } 

}
