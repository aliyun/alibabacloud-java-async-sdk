// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHoneypotResponse} extends {@link TeaModel}
 *
 * <p>UpdateHoneypotResponse</p>
 */
public class UpdateHoneypotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateHoneypotResponseBody body;

    private UpdateHoneypotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateHoneypotResponse create() {
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
    public UpdateHoneypotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateHoneypotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateHoneypotResponseBody body);

        @Override
        UpdateHoneypotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateHoneypotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateHoneypotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateHoneypotResponse response) {
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
        public Builder body(UpdateHoneypotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateHoneypotResponse build() {
            return new UpdateHoneypotResponse(this);
        } 

    } 

}
