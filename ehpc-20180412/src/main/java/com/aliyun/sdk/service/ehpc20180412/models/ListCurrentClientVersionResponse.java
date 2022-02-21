// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCurrentClientVersionResponse} extends {@link TeaModel}
 *
 * <p>ListCurrentClientVersionResponse</p>
 */
public class ListCurrentClientVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCurrentClientVersionResponseBody body;

    private ListCurrentClientVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCurrentClientVersionResponse create() {
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
    public ListCurrentClientVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCurrentClientVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCurrentClientVersionResponseBody body);

        @Override
        ListCurrentClientVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCurrentClientVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCurrentClientVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCurrentClientVersionResponse response) {
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
        public Builder body(ListCurrentClientVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCurrentClientVersionResponse build() {
            return new ListCurrentClientVersionResponse(this);
        } 

    } 

}
