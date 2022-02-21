// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDcdnRealTimeDeliveryProjectResponse} extends {@link TeaModel}
 *
 * <p>ListDcdnRealTimeDeliveryProjectResponse</p>
 */
public class ListDcdnRealTimeDeliveryProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDcdnRealTimeDeliveryProjectResponseBody body;

    private ListDcdnRealTimeDeliveryProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDcdnRealTimeDeliveryProjectResponse create() {
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
    public ListDcdnRealTimeDeliveryProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDcdnRealTimeDeliveryProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDcdnRealTimeDeliveryProjectResponseBody body);

        @Override
        ListDcdnRealTimeDeliveryProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDcdnRealTimeDeliveryProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDcdnRealTimeDeliveryProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDcdnRealTimeDeliveryProjectResponse response) {
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
        public Builder body(ListDcdnRealTimeDeliveryProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDcdnRealTimeDeliveryProjectResponse build() {
            return new ListDcdnRealTimeDeliveryProjectResponse(this);
        } 

    } 

}
