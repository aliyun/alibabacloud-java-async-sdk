// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDnsGtmMonitorStatusResponse} extends {@link TeaModel}
 *
 * <p>SetDnsGtmMonitorStatusResponse</p>
 */
public class SetDnsGtmMonitorStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDnsGtmMonitorStatusResponseBody body;

    private SetDnsGtmMonitorStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDnsGtmMonitorStatusResponse create() {
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
    public SetDnsGtmMonitorStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDnsGtmMonitorStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDnsGtmMonitorStatusResponseBody body);

        @Override
        SetDnsGtmMonitorStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDnsGtmMonitorStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDnsGtmMonitorStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDnsGtmMonitorStatusResponse response) {
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
        public Builder body(SetDnsGtmMonitorStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDnsGtmMonitorStatusResponse build() {
            return new SetDnsGtmMonitorStatusResponse(this);
        } 

    } 

}
