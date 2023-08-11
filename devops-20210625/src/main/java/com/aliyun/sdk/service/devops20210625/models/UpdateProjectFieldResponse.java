// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProjectFieldResponse} extends {@link TeaModel}
 *
 * <p>UpdateProjectFieldResponse</p>
 */
public class UpdateProjectFieldResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProjectFieldResponseBody body;

    private UpdateProjectFieldResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProjectFieldResponse create() {
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
    public UpdateProjectFieldResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProjectFieldResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProjectFieldResponseBody body);

        @Override
        UpdateProjectFieldResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProjectFieldResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProjectFieldResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProjectFieldResponse response) {
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
        public Builder body(UpdateProjectFieldResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProjectFieldResponse build() {
            return new UpdateProjectFieldResponse(this);
        } 

    } 

}
