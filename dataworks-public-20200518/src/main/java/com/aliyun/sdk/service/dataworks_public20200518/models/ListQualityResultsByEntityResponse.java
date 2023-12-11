// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQualityResultsByEntityResponse} extends {@link TeaModel}
 *
 * <p>ListQualityResultsByEntityResponse</p>
 */
public class ListQualityResultsByEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQualityResultsByEntityResponseBody body;

    private ListQualityResultsByEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQualityResultsByEntityResponse create() {
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
    public ListQualityResultsByEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQualityResultsByEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQualityResultsByEntityResponseBody body);

        @Override
        ListQualityResultsByEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQualityResultsByEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQualityResultsByEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQualityResultsByEntityResponse response) {
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
        public Builder body(ListQualityResultsByEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQualityResultsByEntityResponse build() {
            return new ListQualityResultsByEntityResponse(this);
        } 

    } 

}
