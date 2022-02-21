// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesOfUserResponse} extends {@link TeaModel}
 *
 * <p>ListInstancesOfUserResponse</p>
 */
public class ListInstancesOfUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstancesOfUserResponseBody body;

    private ListInstancesOfUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstancesOfUserResponse create() {
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
    public ListInstancesOfUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstancesOfUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstancesOfUserResponseBody body);

        @Override
        ListInstancesOfUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstancesOfUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstancesOfUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstancesOfUserResponse response) {
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
        public Builder body(ListInstancesOfUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstancesOfUserResponse build() {
            return new ListInstancesOfUserResponse(this);
        } 

    } 

}
