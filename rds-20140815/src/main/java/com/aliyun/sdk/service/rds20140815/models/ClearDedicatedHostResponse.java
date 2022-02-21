// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearDedicatedHostResponse} extends {@link TeaModel}
 *
 * <p>ClearDedicatedHostResponse</p>
 */
public class ClearDedicatedHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ClearDedicatedHostResponseBody body;

    private ClearDedicatedHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ClearDedicatedHostResponse create() {
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
    public ClearDedicatedHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ClearDedicatedHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ClearDedicatedHostResponseBody body);

        @Override
        ClearDedicatedHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ClearDedicatedHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ClearDedicatedHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ClearDedicatedHostResponse response) {
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
        public Builder body(ClearDedicatedHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ClearDedicatedHostResponse build() {
            return new ClearDedicatedHostResponse(this);
        } 

    } 

}
