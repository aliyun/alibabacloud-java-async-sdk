// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoleZoneInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeRoleZoneInfoResponse</p>
 */
public class DescribeRoleZoneInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRoleZoneInfoResponseBody body;

    private DescribeRoleZoneInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRoleZoneInfoResponse create() {
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
    public DescribeRoleZoneInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRoleZoneInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRoleZoneInfoResponseBody body);

        @Override
        DescribeRoleZoneInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRoleZoneInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRoleZoneInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRoleZoneInfoResponse response) {
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
        public Builder body(DescribeRoleZoneInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRoleZoneInfoResponse build() {
            return new DescribeRoleZoneInfoResponse(this);
        } 

    } 

}
