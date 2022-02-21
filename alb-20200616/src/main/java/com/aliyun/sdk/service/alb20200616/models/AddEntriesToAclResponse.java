// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEntriesToAclResponse} extends {@link TeaModel}
 *
 * <p>AddEntriesToAclResponse</p>
 */
public class AddEntriesToAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddEntriesToAclResponseBody body;

    private AddEntriesToAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddEntriesToAclResponse create() {
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
    public AddEntriesToAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddEntriesToAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddEntriesToAclResponseBody body);

        @Override
        AddEntriesToAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddEntriesToAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddEntriesToAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddEntriesToAclResponse response) {
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
        public Builder body(AddEntriesToAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddEntriesToAclResponse build() {
            return new AddEntriesToAclResponse(this);
        } 

    } 

}
