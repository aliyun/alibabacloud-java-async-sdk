// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemSubtotalsResponse} extends {@link TeaModel}
 *
 * <p>ListProblemSubtotalsResponse</p>
 */
public class ListProblemSubtotalsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProblemSubtotalsResponseBody body;

    private ListProblemSubtotalsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProblemSubtotalsResponse create() {
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
    public ListProblemSubtotalsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProblemSubtotalsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProblemSubtotalsResponseBody body);

        @Override
        ListProblemSubtotalsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProblemSubtotalsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProblemSubtotalsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProblemSubtotalsResponse response) {
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
        public Builder body(ListProblemSubtotalsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProblemSubtotalsResponse build() {
            return new ListProblemSubtotalsResponse(this);
        } 

    } 

}
