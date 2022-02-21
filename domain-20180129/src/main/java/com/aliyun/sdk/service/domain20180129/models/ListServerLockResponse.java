// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerLockResponse} extends {@link TeaModel}
 *
 * <p>ListServerLockResponse</p>
 */
public class ListServerLockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServerLockResponseBody body;

    private ListServerLockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServerLockResponse create() {
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
    public ListServerLockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServerLockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServerLockResponseBody body);

        @Override
        ListServerLockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServerLockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServerLockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServerLockResponse response) {
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
        public Builder body(ListServerLockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServerLockResponse build() {
            return new ListServerLockResponse(this);
        } 

    } 

}
