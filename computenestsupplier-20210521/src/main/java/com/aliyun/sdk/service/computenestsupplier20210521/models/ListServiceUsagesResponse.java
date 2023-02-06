// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceUsagesResponse} extends {@link TeaModel}
 *
 * <p>ListServiceUsagesResponse</p>
 */
public class ListServiceUsagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceUsagesResponseBody body;

    private ListServiceUsagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceUsagesResponse create() {
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
    public ListServiceUsagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceUsagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceUsagesResponseBody body);

        @Override
        ListServiceUsagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceUsagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceUsagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceUsagesResponse response) {
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
        public Builder body(ListServiceUsagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceUsagesResponse build() {
            return new ListServiceUsagesResponse(this);
        } 

    } 

}
