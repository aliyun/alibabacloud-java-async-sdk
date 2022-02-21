// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableInstanceResponse} extends {@link TeaModel}
 *
 * <p>EnableInstanceResponse</p>
 */
public class EnableInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableInstanceResponseBody body;

    private EnableInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableInstanceResponse create() {
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
    public EnableInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableInstanceResponseBody body);

        @Override
        EnableInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableInstanceResponse response) {
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
        public Builder body(EnableInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableInstanceResponse build() {
            return new EnableInstanceResponse(this);
        } 

    } 

}
