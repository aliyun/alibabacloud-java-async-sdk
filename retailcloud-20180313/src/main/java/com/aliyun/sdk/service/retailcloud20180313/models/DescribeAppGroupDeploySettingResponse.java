// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppGroupDeploySettingResponse} extends {@link TeaModel}
 *
 * <p>DescribeAppGroupDeploySettingResponse</p>
 */
public class DescribeAppGroupDeploySettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAppGroupDeploySettingResponseBody body;

    private DescribeAppGroupDeploySettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAppGroupDeploySettingResponse create() {
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
    public DescribeAppGroupDeploySettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAppGroupDeploySettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAppGroupDeploySettingResponseBody body);

        @Override
        DescribeAppGroupDeploySettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAppGroupDeploySettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAppGroupDeploySettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAppGroupDeploySettingResponse response) {
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
        public Builder body(DescribeAppGroupDeploySettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAppGroupDeploySettingResponse build() {
            return new DescribeAppGroupDeploySettingResponse(this);
        } 

    } 

}
