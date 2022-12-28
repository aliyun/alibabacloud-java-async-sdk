// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPodRiskResponse} extends {@link TeaModel}
 *
 * <p>ListPodRiskResponse</p>
 */
public class ListPodRiskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPodRiskResponseBody body;

    private ListPodRiskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPodRiskResponse create() {
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
    public ListPodRiskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPodRiskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPodRiskResponseBody body);

        @Override
        ListPodRiskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPodRiskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPodRiskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPodRiskResponse response) {
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
        public Builder body(ListPodRiskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPodRiskResponse build() {
            return new ListPodRiskResponse(this);
        } 

    } 

}
