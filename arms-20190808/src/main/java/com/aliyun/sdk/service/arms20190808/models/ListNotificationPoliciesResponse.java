// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNotificationPoliciesResponse} extends {@link TeaModel}
 *
 * <p>ListNotificationPoliciesResponse</p>
 */
public class ListNotificationPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNotificationPoliciesResponseBody body;

    private ListNotificationPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNotificationPoliciesResponse create() {
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
    public ListNotificationPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNotificationPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNotificationPoliciesResponseBody body);

        @Override
        ListNotificationPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNotificationPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNotificationPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNotificationPoliciesResponse response) {
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
        public Builder body(ListNotificationPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNotificationPoliciesResponse build() {
            return new ListNotificationPoliciesResponse(this);
        } 

    } 

}
