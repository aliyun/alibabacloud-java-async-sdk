// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnterStandbyResponse} extends {@link TeaModel}
 *
 * <p>EnterStandbyResponse</p>
 */
public class EnterStandbyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnterStandbyResponseBody body;

    private EnterStandbyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnterStandbyResponse create() {
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
    public EnterStandbyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnterStandbyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnterStandbyResponseBody body);

        @Override
        EnterStandbyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnterStandbyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnterStandbyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnterStandbyResponse response) {
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
        public Builder body(EnterStandbyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnterStandbyResponse build() {
            return new EnterStandbyResponse(this);
        } 

    } 

}
