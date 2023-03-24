// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsForPrivateAccessTagResponse} extends {@link TeaModel}
 *
 * <p>ListApplicationsForPrivateAccessTagResponse</p>
 */
public class ListApplicationsForPrivateAccessTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApplicationsForPrivateAccessTagResponseBody body;

    private ListApplicationsForPrivateAccessTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApplicationsForPrivateAccessTagResponse create() {
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
    public ListApplicationsForPrivateAccessTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApplicationsForPrivateAccessTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApplicationsForPrivateAccessTagResponseBody body);

        @Override
        ListApplicationsForPrivateAccessTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApplicationsForPrivateAccessTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApplicationsForPrivateAccessTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApplicationsForPrivateAccessTagResponse response) {
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
        public Builder body(ListApplicationsForPrivateAccessTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApplicationsForPrivateAccessTagResponse build() {
            return new ListApplicationsForPrivateAccessTagResponse(this);
        } 

    } 

}
