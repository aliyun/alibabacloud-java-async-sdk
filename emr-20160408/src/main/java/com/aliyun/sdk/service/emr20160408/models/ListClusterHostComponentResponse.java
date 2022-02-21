// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterHostComponentResponse} extends {@link TeaModel}
 *
 * <p>ListClusterHostComponentResponse</p>
 */
public class ListClusterHostComponentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterHostComponentResponseBody body;

    private ListClusterHostComponentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterHostComponentResponse create() {
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
    public ListClusterHostComponentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterHostComponentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterHostComponentResponseBody body);

        @Override
        ListClusterHostComponentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterHostComponentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterHostComponentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterHostComponentResponse response) {
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
        public Builder body(ListClusterHostComponentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterHostComponentResponse build() {
            return new ListClusterHostComponentResponse(this);
        } 

    } 

}
