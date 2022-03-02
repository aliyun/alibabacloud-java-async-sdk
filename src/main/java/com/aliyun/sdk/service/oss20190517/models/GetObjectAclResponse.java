// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetObjectAclResponse} extends {@link TeaModel}
 *
 * <p>GetObjectAclResponse</p>
 */
public class GetObjectAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetObjectAclResponseBody body;

    private GetObjectAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetObjectAclResponse create() {
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
    public GetObjectAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetObjectAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetObjectAclResponseBody body);

        @Override
        GetObjectAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetObjectAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetObjectAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetObjectAclResponse response) {
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
        public Builder body(GetObjectAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetObjectAclResponse build() {
            return new GetObjectAclResponse(this);
        } 

    } 

}
