// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiagnosisItemsResponse} extends {@link TeaModel}
 *
 * <p>ListDiagnosisItemsResponse</p>
 */
public class ListDiagnosisItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDiagnosisItemsResponseBody body;

    private ListDiagnosisItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDiagnosisItemsResponse create() {
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
    public ListDiagnosisItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDiagnosisItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDiagnosisItemsResponseBody body);

        @Override
        ListDiagnosisItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDiagnosisItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDiagnosisItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDiagnosisItemsResponse response) {
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
        public Builder body(ListDiagnosisItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDiagnosisItemsResponse build() {
            return new ListDiagnosisItemsResponse(this);
        } 

    } 

}
