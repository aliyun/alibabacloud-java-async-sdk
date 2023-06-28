// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProvisionConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListProvisionConfigsResponse</p>
 */
public class ListProvisionConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProvisionConfigsOutput body;

    private ListProvisionConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProvisionConfigsResponse create() {
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
    public ListProvisionConfigsOutput getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProvisionConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProvisionConfigsOutput body);

        @Override
        ListProvisionConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProvisionConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProvisionConfigsOutput body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProvisionConfigsResponse response) {
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
        public Builder body(ListProvisionConfigsOutput body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProvisionConfigsResponse build() {
            return new ListProvisionConfigsResponse(this);
        } 

    } 

}
