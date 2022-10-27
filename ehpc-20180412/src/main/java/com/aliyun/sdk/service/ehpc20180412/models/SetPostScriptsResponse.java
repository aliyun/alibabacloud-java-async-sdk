// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPostScriptsResponse} extends {@link TeaModel}
 *
 * <p>SetPostScriptsResponse</p>
 */
public class SetPostScriptsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetPostScriptsResponseBody body;

    private SetPostScriptsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetPostScriptsResponse create() {
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
    public SetPostScriptsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetPostScriptsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetPostScriptsResponseBody body);

        @Override
        SetPostScriptsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetPostScriptsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetPostScriptsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetPostScriptsResponse response) {
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
        public Builder body(SetPostScriptsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetPostScriptsResponse build() {
            return new SetPostScriptsResponse(this);
        } 

    } 

}
