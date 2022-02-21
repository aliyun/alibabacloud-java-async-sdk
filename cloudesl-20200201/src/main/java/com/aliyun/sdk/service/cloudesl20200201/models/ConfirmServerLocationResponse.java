// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmServerLocationResponse} extends {@link TeaModel}
 *
 * <p>ConfirmServerLocationResponse</p>
 */
public class ConfirmServerLocationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfirmServerLocationResponseBody body;

    private ConfirmServerLocationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfirmServerLocationResponse create() {
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
    public ConfirmServerLocationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfirmServerLocationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfirmServerLocationResponseBody body);

        @Override
        ConfirmServerLocationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfirmServerLocationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfirmServerLocationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfirmServerLocationResponse response) {
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
        public Builder body(ConfirmServerLocationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfirmServerLocationResponse build() {
            return new ConfirmServerLocationResponse(this);
        } 

    } 

}
