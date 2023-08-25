// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchoverInstanceResponse} extends {@link TeaModel}
 *
 * <p>SwitchoverInstanceResponse</p>
 */
public class SwitchoverInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchoverInstanceResponseBody body;

    private SwitchoverInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchoverInstanceResponse create() {
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
    public SwitchoverInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchoverInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchoverInstanceResponseBody body);

        @Override
        SwitchoverInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchoverInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchoverInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchoverInstanceResponse response) {
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
        public Builder body(SwitchoverInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchoverInstanceResponse build() {
            return new SwitchoverInstanceResponse(this);
        } 

    } 

}
