// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FilterUsersResponse} extends {@link TeaModel}
 *
 * <p>FilterUsersResponse</p>
 */
public class FilterUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FilterUsersResponseBody body;

    private FilterUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FilterUsersResponse create() {
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
    public FilterUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FilterUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FilterUsersResponseBody body);

        @Override
        FilterUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FilterUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FilterUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FilterUsersResponse response) {
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
        public Builder body(FilterUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FilterUsersResponse build() {
            return new FilterUsersResponse(this);
        } 

    } 

}
