// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllWhitelistTemplateResponse} extends {@link TeaModel}
 *
 * <p>DescribeAllWhitelistTemplateResponse</p>
 */
public class DescribeAllWhitelistTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAllWhitelistTemplateResponseBody body;

    private DescribeAllWhitelistTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAllWhitelistTemplateResponse create() {
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
    public DescribeAllWhitelistTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAllWhitelistTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAllWhitelistTemplateResponseBody body);

        @Override
        DescribeAllWhitelistTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAllWhitelistTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAllWhitelistTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAllWhitelistTemplateResponse response) {
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
        public Builder body(DescribeAllWhitelistTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAllWhitelistTemplateResponse build() {
            return new DescribeAllWhitelistTemplateResponse(this);
        } 

    } 

}
