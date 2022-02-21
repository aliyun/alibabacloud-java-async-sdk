// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditThesaurusForApiResponse} extends {@link TeaModel}
 *
 * <p>EditThesaurusForApiResponse</p>
 */
public class EditThesaurusForApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditThesaurusForApiResponseBody body;

    private EditThesaurusForApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditThesaurusForApiResponse create() {
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
    public EditThesaurusForApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditThesaurusForApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditThesaurusForApiResponseBody body);

        @Override
        EditThesaurusForApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditThesaurusForApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditThesaurusForApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditThesaurusForApiResponse response) {
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
        public Builder body(EditThesaurusForApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditThesaurusForApiResponse build() {
            return new EditThesaurusForApiResponse(this);
        } 

    } 

}
