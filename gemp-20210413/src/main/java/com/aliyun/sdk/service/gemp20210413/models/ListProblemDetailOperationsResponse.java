// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemDetailOperationsResponse} extends {@link TeaModel}
 *
 * <p>ListProblemDetailOperationsResponse</p>
 */
public class ListProblemDetailOperationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProblemDetailOperationsResponseBody body;

    private ListProblemDetailOperationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProblemDetailOperationsResponse create() {
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
    public ListProblemDetailOperationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProblemDetailOperationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProblemDetailOperationsResponseBody body);

        @Override
        ListProblemDetailOperationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProblemDetailOperationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProblemDetailOperationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProblemDetailOperationsResponse response) {
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
        public Builder body(ListProblemDetailOperationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProblemDetailOperationsResponse build() {
            return new ListProblemDetailOperationsResponse(this);
        } 

    } 

}
