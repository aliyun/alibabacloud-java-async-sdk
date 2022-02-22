// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSCIMSynchronizationStatusResponse} extends {@link TeaModel}
 *
 * <p>SetSCIMSynchronizationStatusResponse</p>
 */
public class SetSCIMSynchronizationStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetSCIMSynchronizationStatusResponseBody body;

    private SetSCIMSynchronizationStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetSCIMSynchronizationStatusResponse create() {
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
    public SetSCIMSynchronizationStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetSCIMSynchronizationStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetSCIMSynchronizationStatusResponseBody body);

        @Override
        SetSCIMSynchronizationStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetSCIMSynchronizationStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetSCIMSynchronizationStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetSCIMSynchronizationStatusResponse response) {
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
        public Builder body(SetSCIMSynchronizationStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetSCIMSynchronizationStatusResponse build() {
            return new SetSCIMSynchronizationStatusResponse(this);
        } 

    } 

}
