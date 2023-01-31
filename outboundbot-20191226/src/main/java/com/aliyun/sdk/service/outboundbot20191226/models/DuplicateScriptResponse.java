// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DuplicateScriptResponse} extends {@link TeaModel}
 *
 * <p>DuplicateScriptResponse</p>
 */
public class DuplicateScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DuplicateScriptResponseBody body;

    private DuplicateScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DuplicateScriptResponse create() {
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
    public DuplicateScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DuplicateScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DuplicateScriptResponseBody body);

        @Override
        DuplicateScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DuplicateScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DuplicateScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DuplicateScriptResponse response) {
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
        public Builder body(DuplicateScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DuplicateScriptResponse build() {
            return new DuplicateScriptResponse(this);
        } 

    } 

}
