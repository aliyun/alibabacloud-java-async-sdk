// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasSQLDetailsResponse} extends {@link TeaModel}
 *
 * <p>DescribeOasSQLDetailsResponse</p>
 */
public class DescribeOasSQLDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOasSQLDetailsResponseBody body;

    private DescribeOasSQLDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOasSQLDetailsResponse create() {
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
    public DescribeOasSQLDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOasSQLDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOasSQLDetailsResponseBody body);

        @Override
        DescribeOasSQLDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOasSQLDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOasSQLDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOasSQLDetailsResponse response) {
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
        public Builder body(DescribeOasSQLDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOasSQLDetailsResponse build() {
            return new DescribeOasSQLDetailsResponse(this);
        } 

    } 

}
