// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQualityCheckSchemeResponse} extends {@link TeaModel}
 *
 * <p>ListQualityCheckSchemeResponse</p>
 */
public class ListQualityCheckSchemeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQualityCheckSchemeResponseBody body;

    private ListQualityCheckSchemeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQualityCheckSchemeResponse create() {
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
    public ListQualityCheckSchemeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQualityCheckSchemeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQualityCheckSchemeResponseBody body);

        @Override
        ListQualityCheckSchemeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQualityCheckSchemeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQualityCheckSchemeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQualityCheckSchemeResponse response) {
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
        public Builder body(ListQualityCheckSchemeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQualityCheckSchemeResponse build() {
            return new ListQualityCheckSchemeResponse(this);
        } 

    } 

}
