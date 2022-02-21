// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionaryEntriesResponse} extends {@link TeaModel}
 *
 * <p>ListInterventionDictionaryEntriesResponse</p>
 */
public class ListInterventionDictionaryEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInterventionDictionaryEntriesResponseBody body;

    private ListInterventionDictionaryEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInterventionDictionaryEntriesResponse create() {
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
    public ListInterventionDictionaryEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInterventionDictionaryEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInterventionDictionaryEntriesResponseBody body);

        @Override
        ListInterventionDictionaryEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInterventionDictionaryEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInterventionDictionaryEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInterventionDictionaryEntriesResponse response) {
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
        public Builder body(ListInterventionDictionaryEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInterventionDictionaryEntriesResponse build() {
            return new ListInterventionDictionaryEntriesResponse(this);
        } 

    } 

}
