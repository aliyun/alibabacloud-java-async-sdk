// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateAclsFromListenerResponse} extends {@link TeaModel}
 *
 * <p>DissociateAclsFromListenerResponse</p>
 */
public class DissociateAclsFromListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DissociateAclsFromListenerResponseBody body;

    private DissociateAclsFromListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DissociateAclsFromListenerResponse create() {
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
    public DissociateAclsFromListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DissociateAclsFromListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DissociateAclsFromListenerResponseBody body);

        @Override
        DissociateAclsFromListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DissociateAclsFromListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DissociateAclsFromListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DissociateAclsFromListenerResponse response) {
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
        public Builder body(DissociateAclsFromListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DissociateAclsFromListenerResponse build() {
            return new DissociateAclsFromListenerResponse(this);
        } 

    } 

}
