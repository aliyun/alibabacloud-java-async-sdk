// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLineageResponse} extends {@link TeaModel}
 *
 * <p>ListLineageResponse</p>
 */
public class ListLineageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLineageResponseBody body;

    private ListLineageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLineageResponse create() {
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
    public ListLineageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLineageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLineageResponseBody body);

        @Override
        ListLineageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLineageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLineageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLineageResponse response) {
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
        public Builder body(ListLineageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLineageResponse build() {
            return new ListLineageResponse(this);
        } 

    } 

}
