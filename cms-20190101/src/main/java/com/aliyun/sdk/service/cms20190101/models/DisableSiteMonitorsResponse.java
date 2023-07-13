// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableSiteMonitorsResponse} extends {@link TeaModel}
 *
 * <p>DisableSiteMonitorsResponse</p>
 */
public class DisableSiteMonitorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableSiteMonitorsResponseBody body;

    private DisableSiteMonitorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableSiteMonitorsResponse create() {
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
    public DisableSiteMonitorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableSiteMonitorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableSiteMonitorsResponseBody body);

        @Override
        DisableSiteMonitorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableSiteMonitorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableSiteMonitorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableSiteMonitorsResponse response) {
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
        public Builder body(DisableSiteMonitorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableSiteMonitorsResponse build() {
            return new DisableSiteMonitorsResponse(this);
        } 

    } 

}
