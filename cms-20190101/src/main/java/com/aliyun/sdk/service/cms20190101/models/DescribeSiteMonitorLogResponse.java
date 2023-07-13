// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorLogResponse</p>
 */
public class DescribeSiteMonitorLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSiteMonitorLogResponseBody body;

    private DescribeSiteMonitorLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSiteMonitorLogResponse create() {
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
    public DescribeSiteMonitorLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSiteMonitorLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSiteMonitorLogResponseBody body);

        @Override
        DescribeSiteMonitorLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSiteMonitorLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSiteMonitorLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSiteMonitorLogResponse response) {
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
        public Builder body(DescribeSiteMonitorLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSiteMonitorLogResponse build() {
            return new DescribeSiteMonitorLogResponse(this);
        } 

    } 

}
