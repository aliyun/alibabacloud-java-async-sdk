// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUsersResponse} extends {@link TeaModel}
 *
 * <p>AddUsersResponse</p>
 */
public class AddUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUsersResponseBody body;

    private AddUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUsersResponse create() {
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
    public AddUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUsersResponseBody body);

        @Override
        AddUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUsersResponse response) {
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
        public Builder body(AddUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUsersResponse build() {
            return new AddUsersResponse(this);
        } 

    } 

}
