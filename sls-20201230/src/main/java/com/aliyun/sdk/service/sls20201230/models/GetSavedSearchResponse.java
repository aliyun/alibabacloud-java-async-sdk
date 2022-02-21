// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetSavedSearchResponse} extends {@link TeaModel}
 *
 * <p>GetSavedSearchResponse</p>
 */
public class GetSavedSearchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SavedSearch body;

    private GetSavedSearchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSavedSearchResponse create() {
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
    public SavedSearch getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSavedSearchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SavedSearch body);

        @Override
        GetSavedSearchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSavedSearchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SavedSearch body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSavedSearchResponse response) {
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
        public Builder body(SavedSearch body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSavedSearchResponse build() {
            return new GetSavedSearchResponse(this);
        } 

    } 

}
