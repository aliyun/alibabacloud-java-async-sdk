// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAclEntriesResponse} extends {@link TeaModel}
 *
 * <p>ModifyAclEntriesResponse</p>
 */
public class ModifyAclEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAclEntriesResponseBody body;

    private ModifyAclEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAclEntriesResponse create() {
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
    public ModifyAclEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAclEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAclEntriesResponseBody body);

        @Override
        ModifyAclEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAclEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAclEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAclEntriesResponse response) {
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
        public Builder body(ModifyAclEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAclEntriesResponse build() {
            return new ModifyAclEntriesResponse(this);
        } 

    } 

}
