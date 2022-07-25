// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopySceneResponse} extends {@link TeaModel}
 *
 * <p>CopySceneResponse</p>
 */
public class CopySceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopySceneResponseBody body;

    private CopySceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopySceneResponse create() {
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
    public CopySceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopySceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopySceneResponseBody body);

        @Override
        CopySceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopySceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopySceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopySceneResponse response) {
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
        public Builder body(CopySceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopySceneResponse build() {
            return new CopySceneResponse(this);
        } 

    } 

}
