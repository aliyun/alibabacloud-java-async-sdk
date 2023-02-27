// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPersonalNumbersToUserResponse} extends {@link TeaModel}
 *
 * <p>AddPersonalNumbersToUserResponse</p>
 */
public class AddPersonalNumbersToUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddPersonalNumbersToUserResponseBody body;

    private AddPersonalNumbersToUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddPersonalNumbersToUserResponse create() {
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
    public AddPersonalNumbersToUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddPersonalNumbersToUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddPersonalNumbersToUserResponseBody body);

        @Override
        AddPersonalNumbersToUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddPersonalNumbersToUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddPersonalNumbersToUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddPersonalNumbersToUserResponse response) {
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
        public Builder body(AddPersonalNumbersToUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddPersonalNumbersToUserResponse build() {
            return new AddPersonalNumbersToUserResponse(this);
        } 

    } 

}
