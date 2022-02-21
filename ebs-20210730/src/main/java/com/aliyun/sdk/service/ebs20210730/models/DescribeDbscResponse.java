// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbscResponse} extends {@link TeaModel}
 *
 * <p>DescribeDbscResponse</p>
 */
public class DescribeDbscResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDbscResponseBody body;

    private DescribeDbscResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDbscResponse create() {
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
    public DescribeDbscResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDbscResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDbscResponseBody body);

        @Override
        DescribeDbscResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDbscResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDbscResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDbscResponse response) {
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
        public Builder body(DescribeDbscResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDbscResponse build() {
            return new DescribeDbscResponse(this);
        } 

    } 

}
