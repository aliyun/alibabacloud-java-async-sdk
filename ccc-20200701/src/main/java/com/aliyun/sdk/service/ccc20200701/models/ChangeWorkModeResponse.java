// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeWorkModeResponse} extends {@link TeaModel}
 *
 * <p>ChangeWorkModeResponse</p>
 */
public class ChangeWorkModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeWorkModeResponseBody body;

    private ChangeWorkModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeWorkModeResponse create() {
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
    public ChangeWorkModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeWorkModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeWorkModeResponseBody body);

        @Override
        ChangeWorkModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeWorkModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeWorkModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeWorkModeResponse response) {
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
        public Builder body(ChangeWorkModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeWorkModeResponse build() {
            return new ChangeWorkModeResponse(this);
        } 

    } 

}
