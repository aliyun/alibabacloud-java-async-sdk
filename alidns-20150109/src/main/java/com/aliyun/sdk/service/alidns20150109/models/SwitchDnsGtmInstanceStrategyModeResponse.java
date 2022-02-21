// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchDnsGtmInstanceStrategyModeResponse} extends {@link TeaModel}
 *
 * <p>SwitchDnsGtmInstanceStrategyModeResponse</p>
 */
public class SwitchDnsGtmInstanceStrategyModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchDnsGtmInstanceStrategyModeResponseBody body;

    private SwitchDnsGtmInstanceStrategyModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchDnsGtmInstanceStrategyModeResponse create() {
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
    public SwitchDnsGtmInstanceStrategyModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchDnsGtmInstanceStrategyModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchDnsGtmInstanceStrategyModeResponseBody body);

        @Override
        SwitchDnsGtmInstanceStrategyModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchDnsGtmInstanceStrategyModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchDnsGtmInstanceStrategyModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchDnsGtmInstanceStrategyModeResponse response) {
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
        public Builder body(SwitchDnsGtmInstanceStrategyModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchDnsGtmInstanceStrategyModeResponse build() {
            return new SwitchDnsGtmInstanceStrategyModeResponse(this);
        } 

    } 

}
