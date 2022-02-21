// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJournalsResponse} extends {@link TeaModel}
 *
 * <p>ListJournalsResponse</p>
 */
public class ListJournalsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListJournalsResponseBody body;

    private ListJournalsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListJournalsResponse create() {
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
    public ListJournalsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListJournalsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListJournalsResponseBody body);

        @Override
        ListJournalsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListJournalsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListJournalsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListJournalsResponse response) {
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
        public Builder body(ListJournalsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListJournalsResponse build() {
            return new ListJournalsResponse(this);
        } 

    } 

}
