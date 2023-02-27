// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonalNumbersOfUserResponse} extends {@link TeaModel}
 *
 * <p>ListPersonalNumbersOfUserResponse</p>
 */
public class ListPersonalNumbersOfUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPersonalNumbersOfUserResponseBody body;

    private ListPersonalNumbersOfUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPersonalNumbersOfUserResponse create() {
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
    public ListPersonalNumbersOfUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPersonalNumbersOfUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPersonalNumbersOfUserResponseBody body);

        @Override
        ListPersonalNumbersOfUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPersonalNumbersOfUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPersonalNumbersOfUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPersonalNumbersOfUserResponse response) {
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
        public Builder body(ListPersonalNumbersOfUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPersonalNumbersOfUserResponse build() {
            return new ListPersonalNumbersOfUserResponse(this);
        } 

    } 

}
