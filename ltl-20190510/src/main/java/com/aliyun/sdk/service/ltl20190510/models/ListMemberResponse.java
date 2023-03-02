// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMemberResponse} extends {@link TeaModel}
 *
 * <p>ListMemberResponse</p>
 */
public class ListMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMemberResponseBody body;

    private ListMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMemberResponse create() {
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
    public ListMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMemberResponseBody body);

        @Override
        ListMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMemberResponse response) {
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
        public Builder body(ListMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMemberResponse build() {
            return new ListMemberResponse(this);
        } 

    } 

}
