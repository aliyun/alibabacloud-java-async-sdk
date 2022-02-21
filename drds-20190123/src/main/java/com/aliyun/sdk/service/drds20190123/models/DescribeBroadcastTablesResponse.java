// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBroadcastTablesResponse} extends {@link TeaModel}
 *
 * <p>DescribeBroadcastTablesResponse</p>
 */
public class DescribeBroadcastTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBroadcastTablesResponseBody body;

    private DescribeBroadcastTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBroadcastTablesResponse create() {
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
    public DescribeBroadcastTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBroadcastTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBroadcastTablesResponseBody body);

        @Override
        DescribeBroadcastTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBroadcastTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBroadcastTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBroadcastTablesResponse response) {
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
        public Builder body(DescribeBroadcastTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBroadcastTablesResponse build() {
            return new DescribeBroadcastTablesResponse(this);
        } 

    } 

}
