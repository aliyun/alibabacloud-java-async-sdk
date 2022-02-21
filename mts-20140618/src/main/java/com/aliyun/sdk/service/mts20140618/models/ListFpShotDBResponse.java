// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFpShotDBResponse} extends {@link TeaModel}
 *
 * <p>ListFpShotDBResponse</p>
 */
public class ListFpShotDBResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFpShotDBResponseBody body;

    private ListFpShotDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFpShotDBResponse create() {
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
    public ListFpShotDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFpShotDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFpShotDBResponseBody body);

        @Override
        ListFpShotDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFpShotDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFpShotDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFpShotDBResponse response) {
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
        public Builder body(ListFpShotDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFpShotDBResponse build() {
            return new ListFpShotDBResponse(this);
        } 

    } 

}
