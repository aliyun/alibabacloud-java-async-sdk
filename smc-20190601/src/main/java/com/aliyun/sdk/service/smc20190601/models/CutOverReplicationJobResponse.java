// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CutOverReplicationJobResponse} extends {@link TeaModel}
 *
 * <p>CutOverReplicationJobResponse</p>
 */
public class CutOverReplicationJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CutOverReplicationJobResponseBody body;

    private CutOverReplicationJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CutOverReplicationJobResponse create() {
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
    public CutOverReplicationJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CutOverReplicationJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CutOverReplicationJobResponseBody body);

        @Override
        CutOverReplicationJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CutOverReplicationJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CutOverReplicationJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CutOverReplicationJobResponse response) {
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
        public Builder body(CutOverReplicationJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CutOverReplicationJobResponse build() {
            return new CutOverReplicationJobResponse(this);
        } 

    } 

}
