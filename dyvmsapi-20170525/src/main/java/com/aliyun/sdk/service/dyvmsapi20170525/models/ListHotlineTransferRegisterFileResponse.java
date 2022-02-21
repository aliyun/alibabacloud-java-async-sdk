// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotlineTransferRegisterFileResponse} extends {@link TeaModel}
 *
 * <p>ListHotlineTransferRegisterFileResponse</p>
 */
public class ListHotlineTransferRegisterFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotlineTransferRegisterFileResponseBody body;

    private ListHotlineTransferRegisterFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotlineTransferRegisterFileResponse create() {
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
    public ListHotlineTransferRegisterFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotlineTransferRegisterFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotlineTransferRegisterFileResponseBody body);

        @Override
        ListHotlineTransferRegisterFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotlineTransferRegisterFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotlineTransferRegisterFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotlineTransferRegisterFileResponse response) {
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
        public Builder body(ListHotlineTransferRegisterFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotlineTransferRegisterFileResponse build() {
            return new ListHotlineTransferRegisterFileResponse(this);
        } 

    } 

}
