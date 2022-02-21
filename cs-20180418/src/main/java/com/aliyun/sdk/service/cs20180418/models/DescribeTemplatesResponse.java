// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplatesResponse} extends {@link TeaModel}
 *
 * <p>DescribeTemplatesResponse</p>
 */
public class DescribeTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private DescribeTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static DescribeTemplatesResponse create() {
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

    public interface Builder extends Response.Builder<DescribeTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        DescribeTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTemplatesResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public DescribeTemplatesResponse build() {
            return new DescribeTemplatesResponse(this);
        } 

    } 

}
