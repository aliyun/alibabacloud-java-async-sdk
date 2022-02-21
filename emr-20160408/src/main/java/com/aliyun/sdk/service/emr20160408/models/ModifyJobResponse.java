// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyJobResponse} extends {@link TeaModel}
 *
 * <p>ModifyJobResponse</p>
 */
public class ModifyJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyJobResponseBody body;

    private ModifyJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyJobResponse create() {
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
    public ModifyJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyJobResponseBody body);

        @Override
        ModifyJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyJobResponse response) {
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
        public Builder body(ModifyJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyJobResponse build() {
            return new ModifyJobResponse(this);
        } 

    } 

}
