// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAccessControlListEntryResponse} extends {@link TeaModel}
 *
 * <p>RemoveAccessControlListEntryResponse</p>
 */
public class RemoveAccessControlListEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveAccessControlListEntryResponseBody body;

    private RemoveAccessControlListEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveAccessControlListEntryResponse create() {
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
    public RemoveAccessControlListEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveAccessControlListEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveAccessControlListEntryResponseBody body);

        @Override
        RemoveAccessControlListEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveAccessControlListEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveAccessControlListEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveAccessControlListEntryResponse response) {
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
        public Builder body(RemoveAccessControlListEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveAccessControlListEntryResponse build() {
            return new RemoveAccessControlListEntryResponse(this);
        } 

    } 

}
