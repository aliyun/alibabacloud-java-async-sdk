// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseTemplateResponse} extends {@link TeaModel}
 *
 * <p>DescribeDefenseTemplateResponse</p>
 */
public class DescribeDefenseTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDefenseTemplateResponseBody body;

    private DescribeDefenseTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDefenseTemplateResponse create() {
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
    public DescribeDefenseTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDefenseTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDefenseTemplateResponseBody body);

        @Override
        DescribeDefenseTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDefenseTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDefenseTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDefenseTemplateResponse response) {
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
        public Builder body(DescribeDefenseTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDefenseTemplateResponse build() {
            return new DescribeDefenseTemplateResponse(this);
        } 

    } 

}
