// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link PutWebtrackingResponse} extends {@link TeaModel}
 *
 * <p>PutWebtrackingResponse</p>
 */
public class PutWebtrackingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private PutWebtrackingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static PutWebtrackingResponse create() {
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

    public interface Builder extends Response.Builder<PutWebtrackingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        PutWebtrackingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutWebtrackingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutWebtrackingResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public PutWebtrackingResponse build() {
            return new PutWebtrackingResponse(this);
        } 

    } 

}
