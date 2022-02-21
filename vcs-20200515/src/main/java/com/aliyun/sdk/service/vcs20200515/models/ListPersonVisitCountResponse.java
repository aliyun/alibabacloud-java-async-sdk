// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonVisitCountResponse} extends {@link TeaModel}
 *
 * <p>ListPersonVisitCountResponse</p>
 */
public class ListPersonVisitCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPersonVisitCountResponseBody body;

    private ListPersonVisitCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPersonVisitCountResponse create() {
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
    public ListPersonVisitCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPersonVisitCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPersonVisitCountResponseBody body);

        @Override
        ListPersonVisitCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPersonVisitCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPersonVisitCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPersonVisitCountResponse response) {
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
        public Builder body(ListPersonVisitCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPersonVisitCountResponse build() {
            return new ListPersonVisitCountResponse(this);
        } 

    } 

}
