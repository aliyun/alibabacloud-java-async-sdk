// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPhoneTagsResponse} extends {@link TeaModel}
 *
 * <p>AddPhoneTagsResponse</p>
 */
public class AddPhoneTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddPhoneTagsResponseBody body;

    private AddPhoneTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddPhoneTagsResponse create() {
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
    public AddPhoneTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddPhoneTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddPhoneTagsResponseBody body);

        @Override
        AddPhoneTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddPhoneTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddPhoneTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddPhoneTagsResponse response) {
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
        public Builder body(AddPhoneTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddPhoneTagsResponse build() {
            return new AddPhoneTagsResponse(this);
        } 

    } 

}
