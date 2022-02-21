// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionaryRelatedEntitiesResponse} extends {@link TeaModel}
 *
 * <p>ListInterventionDictionaryRelatedEntitiesResponse</p>
 */
public class ListInterventionDictionaryRelatedEntitiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInterventionDictionaryRelatedEntitiesResponseBody body;

    private ListInterventionDictionaryRelatedEntitiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInterventionDictionaryRelatedEntitiesResponse create() {
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
    public ListInterventionDictionaryRelatedEntitiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInterventionDictionaryRelatedEntitiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInterventionDictionaryRelatedEntitiesResponseBody body);

        @Override
        ListInterventionDictionaryRelatedEntitiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInterventionDictionaryRelatedEntitiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInterventionDictionaryRelatedEntitiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInterventionDictionaryRelatedEntitiesResponse response) {
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
        public Builder body(ListInterventionDictionaryRelatedEntitiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInterventionDictionaryRelatedEntitiesResponse build() {
            return new ListInterventionDictionaryRelatedEntitiesResponse(this);
        } 

    } 

}
