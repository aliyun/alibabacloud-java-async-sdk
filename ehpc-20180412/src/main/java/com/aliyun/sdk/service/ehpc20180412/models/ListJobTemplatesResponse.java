// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListJobTemplatesResponse</p>
 */
public class ListJobTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListJobTemplatesResponseBody body;

    private ListJobTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListJobTemplatesResponse create() {
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
    public ListJobTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListJobTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListJobTemplatesResponseBody body);

        @Override
        ListJobTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListJobTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListJobTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListJobTemplatesResponse response) {
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
        public Builder body(ListJobTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListJobTemplatesResponse build() {
            return new ListJobTemplatesResponse(this);
        } 

    } 

}
