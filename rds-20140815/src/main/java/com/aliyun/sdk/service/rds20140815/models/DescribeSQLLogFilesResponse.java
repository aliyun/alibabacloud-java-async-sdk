// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLLogFilesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogFilesResponse</p>
 */
public class DescribeSQLLogFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSQLLogFilesResponseBody body;

    private DescribeSQLLogFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSQLLogFilesResponse create() {
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
    public DescribeSQLLogFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSQLLogFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSQLLogFilesResponseBody body);

        @Override
        DescribeSQLLogFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSQLLogFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSQLLogFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSQLLogFilesResponse response) {
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
        public Builder body(DescribeSQLLogFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSQLLogFilesResponse build() {
            return new DescribeSQLLogFilesResponse(this);
        } 

    } 

}
