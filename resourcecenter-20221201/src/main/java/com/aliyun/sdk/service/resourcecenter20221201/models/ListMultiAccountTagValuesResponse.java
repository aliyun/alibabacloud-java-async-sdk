// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMultiAccountTagValuesResponse} extends {@link TeaModel}
 *
 * <p>ListMultiAccountTagValuesResponse</p>
 */
public class ListMultiAccountTagValuesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMultiAccountTagValuesResponseBody body;

    private ListMultiAccountTagValuesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMultiAccountTagValuesResponse create() {
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
    public ListMultiAccountTagValuesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMultiAccountTagValuesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMultiAccountTagValuesResponseBody body);

        @Override
        ListMultiAccountTagValuesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMultiAccountTagValuesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMultiAccountTagValuesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMultiAccountTagValuesResponse response) {
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
        public Builder body(ListMultiAccountTagValuesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMultiAccountTagValuesResponse build() {
            return new ListMultiAccountTagValuesResponse(this);
        } 

    } 

}
