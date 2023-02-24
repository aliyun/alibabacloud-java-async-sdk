// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkitemFieldResponse} extends {@link TeaModel}
 *
 * <p>UpdateWorkitemFieldResponse</p>
 */
public class UpdateWorkitemFieldResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWorkitemFieldResponseBody body;

    private UpdateWorkitemFieldResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWorkitemFieldResponse create() {
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
    public UpdateWorkitemFieldResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWorkitemFieldResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWorkitemFieldResponseBody body);

        @Override
        UpdateWorkitemFieldResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWorkitemFieldResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWorkitemFieldResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWorkitemFieldResponse response) {
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
        public Builder body(UpdateWorkitemFieldResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWorkitemFieldResponse build() {
            return new UpdateWorkitemFieldResponse(this);
        } 

    } 

}
