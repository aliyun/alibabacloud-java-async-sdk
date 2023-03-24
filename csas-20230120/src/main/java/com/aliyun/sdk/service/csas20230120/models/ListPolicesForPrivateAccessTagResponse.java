// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicesForPrivateAccessTagResponse} extends {@link TeaModel}
 *
 * <p>ListPolicesForPrivateAccessTagResponse</p>
 */
public class ListPolicesForPrivateAccessTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPolicesForPrivateAccessTagResponseBody body;

    private ListPolicesForPrivateAccessTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPolicesForPrivateAccessTagResponse create() {
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
    public ListPolicesForPrivateAccessTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPolicesForPrivateAccessTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPolicesForPrivateAccessTagResponseBody body);

        @Override
        ListPolicesForPrivateAccessTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPolicesForPrivateAccessTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPolicesForPrivateAccessTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPolicesForPrivateAccessTagResponse response) {
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
        public Builder body(ListPolicesForPrivateAccessTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPolicesForPrivateAccessTagResponse build() {
            return new ListPolicesForPrivateAccessTagResponse(this);
        } 

    } 

}
