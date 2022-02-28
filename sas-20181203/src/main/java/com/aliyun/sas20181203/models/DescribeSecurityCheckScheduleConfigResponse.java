// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityCheckScheduleConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeSecurityCheckScheduleConfigResponse</p>
 */
public class DescribeSecurityCheckScheduleConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSecurityCheckScheduleConfigResponseBody body;

    private DescribeSecurityCheckScheduleConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSecurityCheckScheduleConfigResponse create() {
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
    public DescribeSecurityCheckScheduleConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSecurityCheckScheduleConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSecurityCheckScheduleConfigResponseBody body);

        @Override
        DescribeSecurityCheckScheduleConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSecurityCheckScheduleConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSecurityCheckScheduleConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSecurityCheckScheduleConfigResponse response) {
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
        public Builder body(DescribeSecurityCheckScheduleConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSecurityCheckScheduleConfigResponse build() {
            return new DescribeSecurityCheckScheduleConfigResponse(this);
        } 

    } 

}
