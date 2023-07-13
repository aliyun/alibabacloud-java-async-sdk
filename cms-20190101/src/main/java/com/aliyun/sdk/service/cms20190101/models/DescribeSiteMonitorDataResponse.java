// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorDataResponse</p>
 */
public class DescribeSiteMonitorDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSiteMonitorDataResponseBody body;

    private DescribeSiteMonitorDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSiteMonitorDataResponse create() {
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
    public DescribeSiteMonitorDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSiteMonitorDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSiteMonitorDataResponseBody body);

        @Override
        DescribeSiteMonitorDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSiteMonitorDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSiteMonitorDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSiteMonitorDataResponse response) {
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
        public Builder body(DescribeSiteMonitorDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSiteMonitorDataResponse build() {
            return new DescribeSiteMonitorDataResponse(this);
        } 

    } 

}
