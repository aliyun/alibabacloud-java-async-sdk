// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotProbeResponse} extends {@link TeaModel}
 *
 * <p>ListHoneypotProbeResponse</p>
 */
public class ListHoneypotProbeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHoneypotProbeResponseBody body;

    private ListHoneypotProbeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHoneypotProbeResponse create() {
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
    public ListHoneypotProbeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHoneypotProbeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHoneypotProbeResponseBody body);

        @Override
        ListHoneypotProbeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHoneypotProbeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHoneypotProbeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHoneypotProbeResponse response) {
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
        public Builder body(ListHoneypotProbeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHoneypotProbeResponse build() {
            return new ListHoneypotProbeResponse(this);
        } 

    } 

}
