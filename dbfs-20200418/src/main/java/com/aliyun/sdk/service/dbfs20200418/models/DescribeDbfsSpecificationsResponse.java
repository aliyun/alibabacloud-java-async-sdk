// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbfsSpecificationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDbfsSpecificationsResponse</p>
 */
public class DescribeDbfsSpecificationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDbfsSpecificationsResponseBody body;

    private DescribeDbfsSpecificationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDbfsSpecificationsResponse create() {
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
    public DescribeDbfsSpecificationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDbfsSpecificationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDbfsSpecificationsResponseBody body);

        @Override
        DescribeDbfsSpecificationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDbfsSpecificationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDbfsSpecificationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDbfsSpecificationsResponse response) {
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
        public Builder body(DescribeDbfsSpecificationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDbfsSpecificationsResponse build() {
            return new DescribeDbfsSpecificationsResponse(this);
        } 

    } 

}
