// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupsResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupsResponse</p>
 */
public class DescribeBackupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupsResponseBody body;

    private DescribeBackupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupsResponse create() {
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
    public DescribeBackupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupsResponseBody body);

        @Override
        DescribeBackupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupsResponse response) {
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
        public Builder body(DescribeBackupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupsResponse build() {
            return new DescribeBackupsResponse(this);
        } 

    } 

}
