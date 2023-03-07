// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMultiAccountTagKeysResponse} extends {@link TeaModel}
 *
 * <p>ListMultiAccountTagKeysResponse</p>
 */
public class ListMultiAccountTagKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMultiAccountTagKeysResponseBody body;

    private ListMultiAccountTagKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMultiAccountTagKeysResponse create() {
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
    public ListMultiAccountTagKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMultiAccountTagKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMultiAccountTagKeysResponseBody body);

        @Override
        ListMultiAccountTagKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMultiAccountTagKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMultiAccountTagKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMultiAccountTagKeysResponse response) {
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
        public Builder body(ListMultiAccountTagKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMultiAccountTagKeysResponse build() {
            return new ListMultiAccountTagKeysResponse(this);
        } 

    } 

}
