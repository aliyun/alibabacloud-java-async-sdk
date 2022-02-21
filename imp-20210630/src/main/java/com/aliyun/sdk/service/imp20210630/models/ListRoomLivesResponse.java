// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoomLivesResponse} extends {@link TeaModel}
 *
 * <p>ListRoomLivesResponse</p>
 */
public class ListRoomLivesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRoomLivesResponseBody body;

    private ListRoomLivesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRoomLivesResponse create() {
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
    public ListRoomLivesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRoomLivesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRoomLivesResponseBody body);

        @Override
        ListRoomLivesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRoomLivesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRoomLivesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRoomLivesResponse response) {
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
        public Builder body(ListRoomLivesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRoomLivesResponse build() {
            return new ListRoomLivesResponse(this);
        } 

    } 

}
