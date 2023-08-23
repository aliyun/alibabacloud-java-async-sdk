// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllProvincesResponse} extends {@link TeaModel}
 *
 * <p>ListAllProvincesResponse</p>
 */
public class ListAllProvincesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAllProvincesResponseBody body;

    private ListAllProvincesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAllProvincesResponse create() {
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
    public ListAllProvincesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAllProvincesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAllProvincesResponseBody body);

        @Override
        ListAllProvincesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAllProvincesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAllProvincesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAllProvincesResponse response) {
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
        public Builder body(ListAllProvincesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAllProvincesResponse build() {
            return new ListAllProvincesResponse(this);
        } 

    } 

}
