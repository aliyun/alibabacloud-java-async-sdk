// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddInstanceMembersResponse} extends {@link TeaModel}
 *
 * <p>AddInstanceMembersResponse</p>
 */
public class AddInstanceMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddInstanceMembersResponseBody body;

    private AddInstanceMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddInstanceMembersResponse create() {
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
    public AddInstanceMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddInstanceMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddInstanceMembersResponseBody body);

        @Override
        AddInstanceMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddInstanceMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddInstanceMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddInstanceMembersResponse response) {
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
        public Builder body(AddInstanceMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddInstanceMembersResponse build() {
            return new AddInstanceMembersResponse(this);
        } 

    } 

}
