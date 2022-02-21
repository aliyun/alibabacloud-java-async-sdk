// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigSettingsResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigSettingsResponse</p>
 */
public class DescribeConfigSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigSettingsResponseBody body;

    private DescribeConfigSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigSettingsResponse create() {
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
    public DescribeConfigSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigSettingsResponseBody body);

        @Override
        DescribeConfigSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigSettingsResponse response) {
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
        public Builder body(DescribeConfigSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigSettingsResponse build() {
            return new DescribeConfigSettingsResponse(this);
        } 

    } 

}
