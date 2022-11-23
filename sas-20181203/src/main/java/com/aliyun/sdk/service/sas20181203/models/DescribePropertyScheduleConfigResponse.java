// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyScheduleConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribePropertyScheduleConfigResponse</p>
 */
public class DescribePropertyScheduleConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePropertyScheduleConfigResponseBody body;

    private DescribePropertyScheduleConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePropertyScheduleConfigResponse create() {
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
    public DescribePropertyScheduleConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePropertyScheduleConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePropertyScheduleConfigResponseBody body);

        @Override
        DescribePropertyScheduleConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePropertyScheduleConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePropertyScheduleConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePropertyScheduleConfigResponse response) {
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
        public Builder body(DescribePropertyScheduleConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePropertyScheduleConfigResponse build() {
            return new DescribePropertyScheduleConfigResponse(this);
        } 

    } 

}
