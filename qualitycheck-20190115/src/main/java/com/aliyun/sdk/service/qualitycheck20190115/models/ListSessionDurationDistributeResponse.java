// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSessionDurationDistributeResponse} extends {@link TeaModel}
 *
 * <p>ListSessionDurationDistributeResponse</p>
 */
public class ListSessionDurationDistributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSessionDurationDistributeResponseBody body;

    private ListSessionDurationDistributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSessionDurationDistributeResponse create() {
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
    public ListSessionDurationDistributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSessionDurationDistributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSessionDurationDistributeResponseBody body);

        @Override
        ListSessionDurationDistributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSessionDurationDistributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSessionDurationDistributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSessionDurationDistributeResponse response) {
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
        public Builder body(ListSessionDurationDistributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSessionDurationDistributeResponse build() {
            return new ListSessionDurationDistributeResponse(this);
        } 

    } 

}
