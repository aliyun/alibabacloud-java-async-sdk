// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUninstallAegisMachinesResponse} extends {@link TeaModel}
 *
 * <p>ListUninstallAegisMachinesResponse</p>
 */
public class ListUninstallAegisMachinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUninstallAegisMachinesResponseBody body;

    private ListUninstallAegisMachinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUninstallAegisMachinesResponse create() {
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
    public ListUninstallAegisMachinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUninstallAegisMachinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUninstallAegisMachinesResponseBody body);

        @Override
        ListUninstallAegisMachinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUninstallAegisMachinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUninstallAegisMachinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUninstallAegisMachinesResponse response) {
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
        public Builder body(ListUninstallAegisMachinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUninstallAegisMachinesResponse build() {
            return new ListUninstallAegisMachinesResponse(this);
        } 

    } 

}
