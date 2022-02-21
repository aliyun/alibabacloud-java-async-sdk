// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainDnssecStatusResponse} extends {@link TeaModel}
 *
 * <p>SetDomainDnssecStatusResponse</p>
 */
public class SetDomainDnssecStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDomainDnssecStatusResponseBody body;

    private SetDomainDnssecStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDomainDnssecStatusResponse create() {
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
    public SetDomainDnssecStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDomainDnssecStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDomainDnssecStatusResponseBody body);

        @Override
        SetDomainDnssecStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDomainDnssecStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDomainDnssecStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDomainDnssecStatusResponse response) {
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
        public Builder body(SetDomainDnssecStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDomainDnssecStatusResponse build() {
            return new SetDomainDnssecStatusResponse(this);
        } 

    } 

}
