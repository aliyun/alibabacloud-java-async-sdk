// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActivateApDeviceResponse} extends {@link TeaModel}
 *
 * <p>ActivateApDeviceResponse</p>
 */
public class ActivateApDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ActivateApDeviceResponseBody body;

    private ActivateApDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ActivateApDeviceResponse create() {
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
    public ActivateApDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ActivateApDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ActivateApDeviceResponseBody body);

        @Override
        ActivateApDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ActivateApDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ActivateApDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ActivateApDeviceResponse response) {
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
        public Builder body(ActivateApDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ActivateApDeviceResponse build() {
            return new ActivateApDeviceResponse(this);
        } 

    } 

}
