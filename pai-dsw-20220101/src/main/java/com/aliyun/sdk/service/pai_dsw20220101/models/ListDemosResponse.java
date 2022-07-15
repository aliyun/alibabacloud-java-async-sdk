// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDemosResponse} extends {@link TeaModel}
 *
 * <p>ListDemosResponse</p>
 */
public class ListDemosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDemosResponseBody body;

    private ListDemosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDemosResponse create() {
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
    public ListDemosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDemosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDemosResponseBody body);

        @Override
        ListDemosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDemosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDemosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDemosResponse response) {
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
        public Builder body(ListDemosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDemosResponse build() {
            return new ListDemosResponse(this);
        } 

    } 

}
