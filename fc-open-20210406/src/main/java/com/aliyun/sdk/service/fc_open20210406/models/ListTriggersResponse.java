// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTriggersResponse} extends {@link TeaModel}
 *
 * <p>ListTriggersResponse</p>
 */
public class ListTriggersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTriggersResponseBody body;

    private ListTriggersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTriggersResponse create() {
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
    public ListTriggersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTriggersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTriggersResponseBody body);

        @Override
        ListTriggersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTriggersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTriggersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTriggersResponse response) {
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
        public Builder body(ListTriggersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTriggersResponse build() {
            return new ListTriggersResponse(this);
        } 

    } 

}
