// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsResponse} extends {@link TeaModel}
 *
 * <p>ListApplicationsResponse</p>
 */
public class ListApplicationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApplicationsResponseBody body;

    private ListApplicationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApplicationsResponse create() {
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
    public ListApplicationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApplicationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApplicationsResponseBody body);

        @Override
        ListApplicationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApplicationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApplicationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApplicationsResponse response) {
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
        public Builder body(ListApplicationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApplicationsResponse build() {
            return new ListApplicationsResponse(this);
        } 

    } 

}
