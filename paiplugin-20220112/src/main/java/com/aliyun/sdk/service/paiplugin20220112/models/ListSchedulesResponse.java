// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSchedulesResponse} extends {@link TeaModel}
 *
 * <p>ListSchedulesResponse</p>
 */
public class ListSchedulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSchedulesResponseBody body;

    private ListSchedulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSchedulesResponse create() {
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
    public ListSchedulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSchedulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSchedulesResponseBody body);

        @Override
        ListSchedulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSchedulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSchedulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSchedulesResponse response) {
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
        public Builder body(ListSchedulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSchedulesResponse build() {
            return new ListSchedulesResponse(this);
        } 

    } 

}
