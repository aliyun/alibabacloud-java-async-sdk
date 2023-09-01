// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListServiceTemplatesResponse</p>
 */
public class ListServiceTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceTemplatesResponseBody body;

    private ListServiceTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceTemplatesResponse create() {
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
    public ListServiceTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceTemplatesResponseBody body);

        @Override
        ListServiceTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceTemplatesResponse response) {
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
        public Builder body(ListServiceTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceTemplatesResponse build() {
            return new ListServiceTemplatesResponse(this);
        } 

    } 

}
