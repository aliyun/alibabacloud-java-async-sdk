// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLLogByQueryIdResponse} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogByQueryIdResponse</p>
 */
public class DescribeSQLLogByQueryIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSQLLogByQueryIdResponseBody body;

    private DescribeSQLLogByQueryIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSQLLogByQueryIdResponse create() {
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
    public DescribeSQLLogByQueryIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSQLLogByQueryIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSQLLogByQueryIdResponseBody body);

        @Override
        DescribeSQLLogByQueryIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSQLLogByQueryIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSQLLogByQueryIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSQLLogByQueryIdResponse response) {
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
        public Builder body(DescribeSQLLogByQueryIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSQLLogByQueryIdResponse build() {
            return new DescribeSQLLogByQueryIdResponse(this);
        } 

    } 

}
