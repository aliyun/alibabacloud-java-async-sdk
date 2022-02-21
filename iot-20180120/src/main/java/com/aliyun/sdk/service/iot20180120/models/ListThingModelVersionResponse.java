// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListThingModelVersionResponse} extends {@link TeaModel}
 *
 * <p>ListThingModelVersionResponse</p>
 */
public class ListThingModelVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListThingModelVersionResponseBody body;

    private ListThingModelVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListThingModelVersionResponse create() {
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
    public ListThingModelVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListThingModelVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListThingModelVersionResponseBody body);

        @Override
        ListThingModelVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListThingModelVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListThingModelVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListThingModelVersionResponse response) {
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
        public Builder body(ListThingModelVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListThingModelVersionResponse build() {
            return new ListThingModelVersionResponse(this);
        } 

    } 

}
