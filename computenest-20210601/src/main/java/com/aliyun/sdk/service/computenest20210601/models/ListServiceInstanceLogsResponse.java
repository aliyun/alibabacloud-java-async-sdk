// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceInstanceLogsResponse} extends {@link TeaModel}
 *
 * <p>ListServiceInstanceLogsResponse</p>
 */
public class ListServiceInstanceLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceInstanceLogsResponseBody body;

    private ListServiceInstanceLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceInstanceLogsResponse create() {
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
    public ListServiceInstanceLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceInstanceLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceInstanceLogsResponseBody body);

        @Override
        ListServiceInstanceLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceInstanceLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceInstanceLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceInstanceLogsResponse response) {
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
        public Builder body(ListServiceInstanceLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceInstanceLogsResponse build() {
            return new ListServiceInstanceLogsResponse(this);
        } 

    } 

}
