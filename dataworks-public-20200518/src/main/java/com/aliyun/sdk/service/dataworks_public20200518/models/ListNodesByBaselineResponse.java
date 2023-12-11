// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesByBaselineResponse} extends {@link TeaModel}
 *
 * <p>ListNodesByBaselineResponse</p>
 */
public class ListNodesByBaselineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNodesByBaselineResponseBody body;

    private ListNodesByBaselineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNodesByBaselineResponse create() {
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
    public ListNodesByBaselineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNodesByBaselineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNodesByBaselineResponseBody body);

        @Override
        ListNodesByBaselineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNodesByBaselineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNodesByBaselineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNodesByBaselineResponse response) {
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
        public Builder body(ListNodesByBaselineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNodesByBaselineResponse build() {
            return new ListNodesByBaselineResponse(this);
        } 

    } 

}
