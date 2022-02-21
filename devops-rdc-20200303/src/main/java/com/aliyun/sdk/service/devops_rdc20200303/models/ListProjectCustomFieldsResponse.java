// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectCustomFieldsResponse} extends {@link TeaModel}
 *
 * <p>ListProjectCustomFieldsResponse</p>
 */
public class ListProjectCustomFieldsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProjectCustomFieldsResponseBody body;

    private ListProjectCustomFieldsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProjectCustomFieldsResponse create() {
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
    public ListProjectCustomFieldsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProjectCustomFieldsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProjectCustomFieldsResponseBody body);

        @Override
        ListProjectCustomFieldsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProjectCustomFieldsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProjectCustomFieldsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProjectCustomFieldsResponse response) {
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
        public Builder body(ListProjectCustomFieldsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProjectCustomFieldsResponse build() {
            return new ListProjectCustomFieldsResponse(this);
        } 

    } 

}
