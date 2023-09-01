// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEaiJupyterResponse} extends {@link TeaModel}
 *
 * <p>CreateEaiJupyterResponse</p>
 */
public class CreateEaiJupyterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEaiJupyterResponseBody body;

    private CreateEaiJupyterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEaiJupyterResponse create() {
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
    public CreateEaiJupyterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEaiJupyterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEaiJupyterResponseBody body);

        @Override
        CreateEaiJupyterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEaiJupyterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEaiJupyterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEaiJupyterResponse response) {
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
        public Builder body(CreateEaiJupyterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEaiJupyterResponse build() {
            return new CreateEaiJupyterResponse(this);
        } 

    } 

}
