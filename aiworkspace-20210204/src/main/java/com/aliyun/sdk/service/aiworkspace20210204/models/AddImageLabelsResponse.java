// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddImageLabelsResponse} extends {@link TeaModel}
 *
 * <p>AddImageLabelsResponse</p>
 */
public class AddImageLabelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddImageLabelsResponseBody body;

    private AddImageLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddImageLabelsResponse create() {
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
    public AddImageLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddImageLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddImageLabelsResponseBody body);

        @Override
        AddImageLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddImageLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddImageLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddImageLabelsResponse response) {
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
        public Builder body(AddImageLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddImageLabelsResponse build() {
            return new AddImageLabelsResponse(this);
        } 

    } 

}
