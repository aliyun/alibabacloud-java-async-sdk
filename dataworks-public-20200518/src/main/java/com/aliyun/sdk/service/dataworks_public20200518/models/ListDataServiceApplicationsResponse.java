// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceApplicationsResponse} extends {@link TeaModel}
 *
 * <p>ListDataServiceApplicationsResponse</p>
 */
public class ListDataServiceApplicationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataServiceApplicationsResponseBody body;

    private ListDataServiceApplicationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataServiceApplicationsResponse create() {
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
    public ListDataServiceApplicationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataServiceApplicationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataServiceApplicationsResponseBody body);

        @Override
        ListDataServiceApplicationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataServiceApplicationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataServiceApplicationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataServiceApplicationsResponse response) {
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
        public Builder body(ListDataServiceApplicationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataServiceApplicationsResponse build() {
            return new ListDataServiceApplicationsResponse(this);
        } 

    } 

}
