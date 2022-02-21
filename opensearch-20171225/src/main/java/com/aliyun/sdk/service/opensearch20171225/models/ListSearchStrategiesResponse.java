// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSearchStrategiesResponse} extends {@link TeaModel}
 *
 * <p>ListSearchStrategiesResponse</p>
 */
public class ListSearchStrategiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSearchStrategiesResponseBody body;

    private ListSearchStrategiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSearchStrategiesResponse create() {
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
    public ListSearchStrategiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSearchStrategiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSearchStrategiesResponseBody body);

        @Override
        ListSearchStrategiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSearchStrategiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSearchStrategiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSearchStrategiesResponse response) {
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
        public Builder body(ListSearchStrategiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSearchStrategiesResponse build() {
            return new ListSearchStrategiesResponse(this);
        } 

    } 

}
