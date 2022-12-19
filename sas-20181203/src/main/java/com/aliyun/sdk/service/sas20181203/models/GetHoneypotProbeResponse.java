// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotProbeResponse} extends {@link TeaModel}
 *
 * <p>GetHoneypotProbeResponse</p>
 */
public class GetHoneypotProbeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHoneypotProbeResponseBody body;

    private GetHoneypotProbeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHoneypotProbeResponse create() {
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
    public GetHoneypotProbeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHoneypotProbeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHoneypotProbeResponseBody body);

        @Override
        GetHoneypotProbeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHoneypotProbeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHoneypotProbeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHoneypotProbeResponse response) {
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
        public Builder body(GetHoneypotProbeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHoneypotProbeResponse build() {
            return new GetHoneypotProbeResponse(this);
        } 

    } 

}
