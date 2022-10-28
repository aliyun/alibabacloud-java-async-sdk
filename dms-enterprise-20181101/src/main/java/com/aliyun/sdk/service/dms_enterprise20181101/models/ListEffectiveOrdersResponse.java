// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEffectiveOrdersResponse} extends {@link TeaModel}
 *
 * <p>ListEffectiveOrdersResponse</p>
 */
public class ListEffectiveOrdersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEffectiveOrdersResponseBody body;

    private ListEffectiveOrdersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEffectiveOrdersResponse create() {
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
    public ListEffectiveOrdersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEffectiveOrdersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEffectiveOrdersResponseBody body);

        @Override
        ListEffectiveOrdersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEffectiveOrdersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEffectiveOrdersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEffectiveOrdersResponse response) {
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
        public Builder body(ListEffectiveOrdersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEffectiveOrdersResponse build() {
            return new ListEffectiveOrdersResponse(this);
        } 

    } 

}
