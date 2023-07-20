// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceContainersResponse} extends {@link TeaModel}
 *
 * <p>ListServiceContainersResponse</p>
 */
public class ListServiceContainersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceContainersResponseBody body;

    private ListServiceContainersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceContainersResponse create() {
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
    public ListServiceContainersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceContainersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceContainersResponseBody body);

        @Override
        ListServiceContainersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceContainersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceContainersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceContainersResponse response) {
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
        public Builder body(ListServiceContainersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceContainersResponse build() {
            return new ListServiceContainersResponse(this);
        } 

    } 

}
