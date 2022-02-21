// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLLogRecordsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogRecordsResponse</p>
 */
public class DescribeSQLLogRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSQLLogRecordsResponseBody body;

    private DescribeSQLLogRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSQLLogRecordsResponse create() {
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
    public DescribeSQLLogRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSQLLogRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSQLLogRecordsResponseBody body);

        @Override
        DescribeSQLLogRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSQLLogRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSQLLogRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSQLLogRecordsResponse response) {
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
        public Builder body(DescribeSQLLogRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSQLLogRecordsResponse build() {
            return new DescribeSQLLogRecordsResponse(this);
        } 

    } 

}
