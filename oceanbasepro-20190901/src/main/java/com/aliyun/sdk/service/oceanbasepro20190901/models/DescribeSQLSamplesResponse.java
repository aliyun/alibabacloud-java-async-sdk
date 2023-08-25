// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLSamplesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSQLSamplesResponse</p>
 */
public class DescribeSQLSamplesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSQLSamplesResponseBody body;

    private DescribeSQLSamplesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSQLSamplesResponse create() {
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
    public DescribeSQLSamplesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSQLSamplesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSQLSamplesResponseBody body);

        @Override
        DescribeSQLSamplesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSQLSamplesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSQLSamplesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSQLSamplesResponse response) {
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
        public Builder body(DescribeSQLSamplesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSQLSamplesResponse build() {
            return new DescribeSQLSamplesResponse(this);
        } 

    } 

}
