// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopEpnInstanceResponse} extends {@link TeaModel}
 *
 * <p>StopEpnInstanceResponse</p>
 */
public class StopEpnInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopEpnInstanceResponseBody body;

    private StopEpnInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopEpnInstanceResponse create() {
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
    public StopEpnInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopEpnInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopEpnInstanceResponseBody body);

        @Override
        StopEpnInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopEpnInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopEpnInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopEpnInstanceResponse response) {
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
        public Builder body(StopEpnInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopEpnInstanceResponse build() {
            return new StopEpnInstanceResponse(this);
        } 

    } 

}
