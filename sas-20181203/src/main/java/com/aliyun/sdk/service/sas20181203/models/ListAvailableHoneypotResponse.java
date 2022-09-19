// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableHoneypotResponse} extends {@link TeaModel}
 *
 * <p>ListAvailableHoneypotResponse</p>
 */
public class ListAvailableHoneypotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAvailableHoneypotResponseBody body;

    private ListAvailableHoneypotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAvailableHoneypotResponse create() {
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
    public ListAvailableHoneypotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAvailableHoneypotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAvailableHoneypotResponseBody body);

        @Override
        ListAvailableHoneypotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAvailableHoneypotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAvailableHoneypotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAvailableHoneypotResponse response) {
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
        public Builder body(ListAvailableHoneypotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAvailableHoneypotResponse build() {
            return new ListAvailableHoneypotResponse(this);
        } 

    } 

}
