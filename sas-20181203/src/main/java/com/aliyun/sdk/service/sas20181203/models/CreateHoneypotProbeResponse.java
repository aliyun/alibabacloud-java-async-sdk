// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHoneypotProbeResponse} extends {@link TeaModel}
 *
 * <p>CreateHoneypotProbeResponse</p>
 */
public class CreateHoneypotProbeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHoneypotProbeResponseBody body;

    private CreateHoneypotProbeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHoneypotProbeResponse create() {
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
    public CreateHoneypotProbeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHoneypotProbeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHoneypotProbeResponseBody body);

        @Override
        CreateHoneypotProbeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHoneypotProbeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHoneypotProbeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHoneypotProbeResponse response) {
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
        public Builder body(CreateHoneypotProbeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHoneypotProbeResponse build() {
            return new CreateHoneypotProbeResponse(this);
        } 

    } 

}
