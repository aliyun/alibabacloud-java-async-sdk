// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVideoAudiosResponse} extends {@link TeaModel}
 *
 * <p>ListVideoAudiosResponse</p>
 */
public class ListVideoAudiosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVideoAudiosResponseBody body;

    private ListVideoAudiosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVideoAudiosResponse create() {
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
    public ListVideoAudiosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVideoAudiosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVideoAudiosResponseBody body);

        @Override
        ListVideoAudiosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVideoAudiosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVideoAudiosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVideoAudiosResponse response) {
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
        public Builder body(ListVideoAudiosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVideoAudiosResponse build() {
            return new ListVideoAudiosResponse(this);
        } 

    } 

}
