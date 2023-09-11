// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationAccessPointsResponse} extends {@link TeaModel}
 *
 * <p>ListApplicationAccessPointsResponse</p>
 */
public class ListApplicationAccessPointsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApplicationAccessPointsResponseBody body;

    private ListApplicationAccessPointsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApplicationAccessPointsResponse create() {
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
    public ListApplicationAccessPointsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApplicationAccessPointsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApplicationAccessPointsResponseBody body);

        @Override
        ListApplicationAccessPointsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApplicationAccessPointsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApplicationAccessPointsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApplicationAccessPointsResponse response) {
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
        public Builder body(ListApplicationAccessPointsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApplicationAccessPointsResponse build() {
            return new ListApplicationAccessPointsResponse(this);
        } 

    } 

}
