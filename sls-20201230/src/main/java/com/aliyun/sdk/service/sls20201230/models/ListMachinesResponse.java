// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListMachinesResponse} extends {@link TeaModel}
 *
 * <p>ListMachinesResponse</p>
 */
public class ListMachinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMachinesResponseBody body;

    private ListMachinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMachinesResponse create() {
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
    public ListMachinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMachinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMachinesResponseBody body);

        @Override
        ListMachinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMachinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMachinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMachinesResponse response) {
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
        public Builder body(ListMachinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMachinesResponse build() {
            return new ListMachinesResponse(this);
        } 

    } 

}
