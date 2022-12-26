// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateRegistryTypeResponse} extends {@link TeaModel}
 *
 * <p>ListPrivateRegistryTypeResponse</p>
 */
public class ListPrivateRegistryTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrivateRegistryTypeResponseBody body;

    private ListPrivateRegistryTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPrivateRegistryTypeResponse create() {
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
    public ListPrivateRegistryTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrivateRegistryTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPrivateRegistryTypeResponseBody body);

        @Override
        ListPrivateRegistryTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrivateRegistryTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPrivateRegistryTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrivateRegistryTypeResponse response) {
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
        public Builder body(ListPrivateRegistryTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrivateRegistryTypeResponse build() {
            return new ListPrivateRegistryTypeResponse(this);
        } 

    } 

}
