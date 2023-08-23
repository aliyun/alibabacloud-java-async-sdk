// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInfraredDeviceBrandsResponse} extends {@link TeaModel}
 *
 * <p>ListInfraredDeviceBrandsResponse</p>
 */
public class ListInfraredDeviceBrandsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInfraredDeviceBrandsResponseBody body;

    private ListInfraredDeviceBrandsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInfraredDeviceBrandsResponse create() {
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
    public ListInfraredDeviceBrandsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInfraredDeviceBrandsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInfraredDeviceBrandsResponseBody body);

        @Override
        ListInfraredDeviceBrandsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInfraredDeviceBrandsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInfraredDeviceBrandsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInfraredDeviceBrandsResponse response) {
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
        public Builder body(ListInfraredDeviceBrandsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInfraredDeviceBrandsResponse build() {
            return new ListInfraredDeviceBrandsResponse(this);
        } 

    } 

}
