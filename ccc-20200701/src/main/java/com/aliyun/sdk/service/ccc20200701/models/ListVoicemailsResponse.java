// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVoicemailsResponse} extends {@link TeaModel}
 *
 * <p>ListVoicemailsResponse</p>
 */
public class ListVoicemailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVoicemailsResponseBody body;

    private ListVoicemailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVoicemailsResponse create() {
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
    public ListVoicemailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVoicemailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVoicemailsResponseBody body);

        @Override
        ListVoicemailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVoicemailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVoicemailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVoicemailsResponse response) {
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
        public Builder body(ListVoicemailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVoicemailsResponse build() {
            return new ListVoicemailsResponse(this);
        } 

    } 

}
