// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListDataServiceGroupsResponse</p>
 */
public class ListDataServiceGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataServiceGroupsResponseBody body;

    private ListDataServiceGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataServiceGroupsResponse create() {
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
    public ListDataServiceGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataServiceGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataServiceGroupsResponseBody body);

        @Override
        ListDataServiceGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataServiceGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataServiceGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataServiceGroupsResponse response) {
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
        public Builder body(ListDataServiceGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataServiceGroupsResponse build() {
            return new ListDataServiceGroupsResponse(this);
        } 

    } 

}
