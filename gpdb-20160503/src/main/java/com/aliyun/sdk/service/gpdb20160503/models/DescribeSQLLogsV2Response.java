// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLLogsV2Response} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogsV2Response</p>
 */
public class DescribeSQLLogsV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSQLLogsV2ResponseBody body;

    private DescribeSQLLogsV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSQLLogsV2Response create() {
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
    public DescribeSQLLogsV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSQLLogsV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSQLLogsV2ResponseBody body);

        @Override
        DescribeSQLLogsV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSQLLogsV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSQLLogsV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSQLLogsV2Response response) {
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
        public Builder body(DescribeSQLLogsV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSQLLogsV2Response build() {
            return new DescribeSQLLogsV2Response(this);
        } 

    } 

}
