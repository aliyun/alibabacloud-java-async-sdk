// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRemediationTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListRemediationTemplatesResponse</p>
 */
public class ListRemediationTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRemediationTemplatesResponseBody body;

    private ListRemediationTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRemediationTemplatesResponse create() {
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
    public ListRemediationTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRemediationTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRemediationTemplatesResponseBody body);

        @Override
        ListRemediationTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRemediationTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRemediationTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRemediationTemplatesResponse response) {
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
        public Builder body(ListRemediationTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRemediationTemplatesResponse build() {
            return new ListRemediationTemplatesResponse(this);
        } 

    } 

}
