// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListThingTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListThingTemplatesResponse</p>
 */
public class ListThingTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListThingTemplatesResponseBody body;

    private ListThingTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListThingTemplatesResponse create() {
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
    public ListThingTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListThingTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListThingTemplatesResponseBody body);

        @Override
        ListThingTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListThingTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListThingTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListThingTemplatesResponse response) {
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
        public Builder body(ListThingTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListThingTemplatesResponse build() {
            return new ListThingTemplatesResponse(this);
        } 

    } 

}
