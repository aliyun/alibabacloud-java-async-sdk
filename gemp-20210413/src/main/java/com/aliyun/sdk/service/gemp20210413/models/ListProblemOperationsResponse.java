// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemOperationsResponse} extends {@link TeaModel}
 *
 * <p>ListProblemOperationsResponse</p>
 */
public class ListProblemOperationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProblemOperationsResponseBody body;

    private ListProblemOperationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProblemOperationsResponse create() {
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
    public ListProblemOperationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProblemOperationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProblemOperationsResponseBody body);

        @Override
        ListProblemOperationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProblemOperationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProblemOperationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProblemOperationsResponse response) {
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
        public Builder body(ListProblemOperationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProblemOperationsResponse build() {
            return new ListProblemOperationsResponse(this);
        } 

    } 

}
