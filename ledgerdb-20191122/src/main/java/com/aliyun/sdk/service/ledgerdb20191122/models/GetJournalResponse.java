// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJournalResponse} extends {@link TeaModel}
 *
 * <p>GetJournalResponse</p>
 */
public class GetJournalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJournalResponseBody body;

    private GetJournalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJournalResponse create() {
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
    public GetJournalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJournalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJournalResponseBody body);

        @Override
        GetJournalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJournalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJournalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJournalResponse response) {
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
        public Builder body(GetJournalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJournalResponse build() {
            return new GetJournalResponse(this);
        } 

    } 

}
