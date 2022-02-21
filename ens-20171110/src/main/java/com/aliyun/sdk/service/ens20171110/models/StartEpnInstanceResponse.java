// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartEpnInstanceResponse} extends {@link TeaModel}
 *
 * <p>StartEpnInstanceResponse</p>
 */
public class StartEpnInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartEpnInstanceResponseBody body;

    private StartEpnInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartEpnInstanceResponse create() {
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
    public StartEpnInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartEpnInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartEpnInstanceResponseBody body);

        @Override
        StartEpnInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartEpnInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartEpnInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartEpnInstanceResponse response) {
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
        public Builder body(StartEpnInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartEpnInstanceResponse build() {
            return new StartEpnInstanceResponse(this);
        } 

    } 

}
