// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentlessRelateMaliciousResponse} extends {@link TeaModel}
 *
 * <p>ListAgentlessRelateMaliciousResponse</p>
 */
public class ListAgentlessRelateMaliciousResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAgentlessRelateMaliciousResponseBody body;

    private ListAgentlessRelateMaliciousResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAgentlessRelateMaliciousResponse create() {
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
    public ListAgentlessRelateMaliciousResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAgentlessRelateMaliciousResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAgentlessRelateMaliciousResponseBody body);

        @Override
        ListAgentlessRelateMaliciousResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAgentlessRelateMaliciousResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAgentlessRelateMaliciousResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAgentlessRelateMaliciousResponse response) {
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
        public Builder body(ListAgentlessRelateMaliciousResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAgentlessRelateMaliciousResponse build() {
            return new ListAgentlessRelateMaliciousResponse(this);
        } 

    } 

}
