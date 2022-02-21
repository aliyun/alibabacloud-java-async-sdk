// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExitStandbyResponse} extends {@link TeaModel}
 *
 * <p>ExitStandbyResponse</p>
 */
public class ExitStandbyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExitStandbyResponseBody body;

    private ExitStandbyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExitStandbyResponse create() {
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
    public ExitStandbyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExitStandbyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExitStandbyResponseBody body);

        @Override
        ExitStandbyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExitStandbyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExitStandbyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExitStandbyResponse response) {
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
        public Builder body(ExitStandbyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExitStandbyResponse build() {
            return new ExitStandbyResponse(this);
        } 

    } 

}
