// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePatchBaselineResponse} extends {@link TeaModel}
 *
 * <p>UpdatePatchBaselineResponse</p>
 */
public class UpdatePatchBaselineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePatchBaselineResponseBody body;

    private UpdatePatchBaselineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePatchBaselineResponse create() {
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
    public UpdatePatchBaselineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePatchBaselineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePatchBaselineResponseBody body);

        @Override
        UpdatePatchBaselineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePatchBaselineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePatchBaselineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePatchBaselineResponse response) {
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
        public Builder body(UpdatePatchBaselineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePatchBaselineResponse build() {
            return new UpdatePatchBaselineResponse(this);
        } 

    } 

}
