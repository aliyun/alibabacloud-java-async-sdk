// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancePasswordsSettingResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstancePasswordsSettingResponse</p>
 */
public class DescribeInstancePasswordsSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstancePasswordsSettingResponseBody body;

    private DescribeInstancePasswordsSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstancePasswordsSettingResponse create() {
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
    public DescribeInstancePasswordsSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstancePasswordsSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstancePasswordsSettingResponseBody body);

        @Override
        DescribeInstancePasswordsSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstancePasswordsSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstancePasswordsSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstancePasswordsSettingResponse response) {
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
        public Builder body(DescribeInstancePasswordsSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstancePasswordsSettingResponse build() {
            return new DescribeInstancePasswordsSettingResponse(this);
        } 

    } 

}
