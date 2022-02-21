// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkItemAllFieldsResponse} extends {@link TeaModel}
 *
 * <p>ListWorkItemAllFieldsResponse</p>
 */
public class ListWorkItemAllFieldsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWorkItemAllFieldsResponseBody body;

    private ListWorkItemAllFieldsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWorkItemAllFieldsResponse create() {
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
    public ListWorkItemAllFieldsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWorkItemAllFieldsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWorkItemAllFieldsResponseBody body);

        @Override
        ListWorkItemAllFieldsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWorkItemAllFieldsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWorkItemAllFieldsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWorkItemAllFieldsResponse response) {
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
        public Builder body(ListWorkItemAllFieldsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWorkItemAllFieldsResponse build() {
            return new ListWorkItemAllFieldsResponse(this);
        } 

    } 

}
