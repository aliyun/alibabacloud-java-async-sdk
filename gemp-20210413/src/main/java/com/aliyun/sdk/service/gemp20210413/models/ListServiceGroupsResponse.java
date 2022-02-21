// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListServiceGroupsResponse</p>
 */
public class ListServiceGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceGroupsResponseBody body;

    private ListServiceGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceGroupsResponse create() {
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
    public ListServiceGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceGroupsResponseBody body);

        @Override
        ListServiceGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceGroupsResponse response) {
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
        public Builder body(ListServiceGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceGroupsResponse build() {
            return new ListServiceGroupsResponse(this);
        } 

    } 

}
