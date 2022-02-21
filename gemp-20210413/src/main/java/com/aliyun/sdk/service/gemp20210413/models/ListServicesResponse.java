// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServicesResponse} extends {@link TeaModel}
 *
 * <p>ListServicesResponse</p>
 */
public class ListServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServicesResponseBody body;

    private ListServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServicesResponse create() {
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
    public ListServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServicesResponseBody body);

        @Override
        ListServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServicesResponse response) {
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
        public Builder body(ListServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServicesResponse build() {
            return new ListServicesResponse(this);
        } 

    } 

}
