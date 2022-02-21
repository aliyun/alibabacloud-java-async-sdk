// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearFaceDeviceDBResponse} extends {@link TeaModel}
 *
 * <p>ClearFaceDeviceDBResponse</p>
 */
public class ClearFaceDeviceDBResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ClearFaceDeviceDBResponseBody body;

    private ClearFaceDeviceDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ClearFaceDeviceDBResponse create() {
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
    public ClearFaceDeviceDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ClearFaceDeviceDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ClearFaceDeviceDBResponseBody body);

        @Override
        ClearFaceDeviceDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ClearFaceDeviceDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ClearFaceDeviceDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ClearFaceDeviceDBResponse response) {
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
        public Builder body(ClearFaceDeviceDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ClearFaceDeviceDBResponse build() {
            return new ClearFaceDeviceDBResponse(this);
        } 

    } 

}
