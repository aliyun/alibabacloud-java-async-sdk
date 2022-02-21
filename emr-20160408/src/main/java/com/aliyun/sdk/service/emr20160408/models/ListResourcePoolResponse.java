// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcePoolResponse} extends {@link TeaModel}
 *
 * <p>ListResourcePoolResponse</p>
 */
public class ListResourcePoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourcePoolResponseBody body;

    private ListResourcePoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourcePoolResponse create() {
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
    public ListResourcePoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourcePoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourcePoolResponseBody body);

        @Override
        ListResourcePoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourcePoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourcePoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourcePoolResponse response) {
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
        public Builder body(ListResourcePoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourcePoolResponse build() {
            return new ListResourcePoolResponse(this);
        } 

    } 

}
