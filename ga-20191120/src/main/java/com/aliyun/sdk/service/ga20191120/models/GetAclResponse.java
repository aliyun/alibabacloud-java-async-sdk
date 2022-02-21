// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAclResponse} extends {@link TeaModel}
 *
 * <p>GetAclResponse</p>
 */
public class GetAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAclResponseBody body;

    private GetAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAclResponse create() {
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
    public GetAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAclResponseBody body);

        @Override
        GetAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAclResponse response) {
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
        public Builder body(GetAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAclResponse build() {
            return new GetAclResponse(this);
        } 

    } 

}
