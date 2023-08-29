// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyMcdpGroupResponse} extends {@link TeaModel}
 *
 * <p>CopyMcdpGroupResponse</p>
 */
public class CopyMcdpGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopyMcdpGroupResponseBody body;

    private CopyMcdpGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopyMcdpGroupResponse create() {
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
    public CopyMcdpGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopyMcdpGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopyMcdpGroupResponseBody body);

        @Override
        CopyMcdpGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopyMcdpGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopyMcdpGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopyMcdpGroupResponse response) {
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
        public Builder body(CopyMcdpGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopyMcdpGroupResponse build() {
            return new CopyMcdpGroupResponse(this);
        } 

    } 

}
