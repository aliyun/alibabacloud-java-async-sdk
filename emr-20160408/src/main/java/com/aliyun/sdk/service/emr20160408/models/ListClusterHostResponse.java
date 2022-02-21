// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterHostResponse} extends {@link TeaModel}
 *
 * <p>ListClusterHostResponse</p>
 */
public class ListClusterHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterHostResponseBody body;

    private ListClusterHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterHostResponse create() {
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
    public ListClusterHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterHostResponseBody body);

        @Override
        ListClusterHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterHostResponse response) {
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
        public Builder body(ListClusterHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterHostResponse build() {
            return new ListClusterHostResponse(this);
        } 

    } 

}
