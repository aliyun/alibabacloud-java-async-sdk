// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachApplication2ConnectorResponse} extends {@link TeaModel}
 *
 * <p>AttachApplication2ConnectorResponse</p>
 */
public class AttachApplication2ConnectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachApplication2ConnectorResponseBody body;

    private AttachApplication2ConnectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachApplication2ConnectorResponse create() {
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
    public AttachApplication2ConnectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachApplication2ConnectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachApplication2ConnectorResponseBody body);

        @Override
        AttachApplication2ConnectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachApplication2ConnectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachApplication2ConnectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachApplication2ConnectorResponse response) {
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
        public Builder body(AttachApplication2ConnectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachApplication2ConnectorResponse build() {
            return new AttachApplication2ConnectorResponse(this);
        } 

    } 

}
