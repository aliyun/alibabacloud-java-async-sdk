// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBandwidthackagesResponse} extends {@link TeaModel}
 *
 * <p>ListBandwidthackagesResponse</p>
 */
public class ListBandwidthackagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBandwidthackagesResponseBody body;

    private ListBandwidthackagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBandwidthackagesResponse create() {
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
    public ListBandwidthackagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBandwidthackagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBandwidthackagesResponseBody body);

        @Override
        ListBandwidthackagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBandwidthackagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBandwidthackagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBandwidthackagesResponse response) {
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
        public Builder body(ListBandwidthackagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBandwidthackagesResponse build() {
            return new ListBandwidthackagesResponse(this);
        } 

    } 

}
