// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJournalProofResponse} extends {@link TeaModel}
 *
 * <p>GetJournalProofResponse</p>
 */
public class GetJournalProofResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJournalProofResponseBody body;

    private GetJournalProofResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJournalProofResponse create() {
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
    public GetJournalProofResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJournalProofResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJournalProofResponseBody body);

        @Override
        GetJournalProofResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJournalProofResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJournalProofResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJournalProofResponse response) {
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
        public Builder body(GetJournalProofResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJournalProofResponse build() {
            return new GetJournalProofResponse(this);
        } 

    } 

}
