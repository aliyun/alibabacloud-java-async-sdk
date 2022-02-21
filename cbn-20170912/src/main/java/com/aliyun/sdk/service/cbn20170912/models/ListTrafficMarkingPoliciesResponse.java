// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrafficMarkingPoliciesResponse} extends {@link TeaModel}
 *
 * <p>ListTrafficMarkingPoliciesResponse</p>
 */
public class ListTrafficMarkingPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTrafficMarkingPoliciesResponseBody body;

    private ListTrafficMarkingPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTrafficMarkingPoliciesResponse create() {
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
    public ListTrafficMarkingPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTrafficMarkingPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTrafficMarkingPoliciesResponseBody body);

        @Override
        ListTrafficMarkingPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTrafficMarkingPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTrafficMarkingPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTrafficMarkingPoliciesResponse response) {
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
        public Builder body(ListTrafficMarkingPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTrafficMarkingPoliciesResponse build() {
            return new ListTrafficMarkingPoliciesResponse(this);
        } 

    } 

}
