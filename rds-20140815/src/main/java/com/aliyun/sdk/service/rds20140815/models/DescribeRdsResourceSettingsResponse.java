// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsResourceSettingsResponse} extends {@link TeaModel}
 *
 * <p>DescribeRdsResourceSettingsResponse</p>
 */
public class DescribeRdsResourceSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRdsResourceSettingsResponseBody body;

    private DescribeRdsResourceSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRdsResourceSettingsResponse create() {
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
    public DescribeRdsResourceSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRdsResourceSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRdsResourceSettingsResponseBody body);

        @Override
        DescribeRdsResourceSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRdsResourceSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRdsResourceSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRdsResourceSettingsResponse response) {
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
        public Builder body(DescribeRdsResourceSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRdsResourceSettingsResponse build() {
            return new DescribeRdsResourceSettingsResponse(this);
        } 

    } 

}
