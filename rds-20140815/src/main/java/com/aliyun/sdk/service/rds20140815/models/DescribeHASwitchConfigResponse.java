// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHASwitchConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeHASwitchConfigResponse</p>
 */
public class DescribeHASwitchConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHASwitchConfigResponseBody body;

    private DescribeHASwitchConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHASwitchConfigResponse create() {
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
    public DescribeHASwitchConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHASwitchConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHASwitchConfigResponseBody body);

        @Override
        DescribeHASwitchConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHASwitchConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHASwitchConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHASwitchConfigResponse response) {
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
        public Builder body(DescribeHASwitchConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHASwitchConfigResponse build() {
            return new DescribeHASwitchConfigResponse(this);
        } 

    } 

}
