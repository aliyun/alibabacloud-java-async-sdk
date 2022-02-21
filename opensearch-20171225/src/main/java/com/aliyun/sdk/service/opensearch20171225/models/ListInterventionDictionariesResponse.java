// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionariesResponse} extends {@link TeaModel}
 *
 * <p>ListInterventionDictionariesResponse</p>
 */
public class ListInterventionDictionariesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInterventionDictionariesResponseBody body;

    private ListInterventionDictionariesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInterventionDictionariesResponse create() {
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
    public ListInterventionDictionariesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInterventionDictionariesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInterventionDictionariesResponseBody body);

        @Override
        ListInterventionDictionariesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInterventionDictionariesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInterventionDictionariesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInterventionDictionariesResponse response) {
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
        public Builder body(ListInterventionDictionariesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInterventionDictionariesResponse build() {
            return new ListInterventionDictionariesResponse(this);
        } 

    } 

}
