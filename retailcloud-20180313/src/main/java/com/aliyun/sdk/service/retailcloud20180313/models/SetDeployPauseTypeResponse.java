// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDeployPauseTypeResponse} extends {@link TeaModel}
 *
 * <p>SetDeployPauseTypeResponse</p>
 */
public class SetDeployPauseTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDeployPauseTypeResponseBody body;

    private SetDeployPauseTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDeployPauseTypeResponse create() {
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
    public SetDeployPauseTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDeployPauseTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDeployPauseTypeResponseBody body);

        @Override
        SetDeployPauseTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDeployPauseTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDeployPauseTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDeployPauseTypeResponse response) {
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
        public Builder body(SetDeployPauseTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDeployPauseTypeResponse build() {
            return new SetDeployPauseTypeResponse(this);
        } 

    } 

}
