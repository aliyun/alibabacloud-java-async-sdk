// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessAssignmentsResponse} extends {@link TeaModel}
 *
 * <p>ListAccessAssignmentsResponse</p>
 */
public class ListAccessAssignmentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAccessAssignmentsResponseBody body;

    private ListAccessAssignmentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAccessAssignmentsResponse create() {
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
    public ListAccessAssignmentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAccessAssignmentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAccessAssignmentsResponseBody body);

        @Override
        ListAccessAssignmentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAccessAssignmentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAccessAssignmentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAccessAssignmentsResponse response) {
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
        public Builder body(ListAccessAssignmentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAccessAssignmentsResponse build() {
            return new ListAccessAssignmentsResponse(this);
        } 

    } 

}
