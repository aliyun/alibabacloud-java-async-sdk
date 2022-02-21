// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCategoryNameResponse} extends {@link TeaModel}
 *
 * <p>UpdateCategoryNameResponse</p>
 */
public class UpdateCategoryNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCategoryNameResponseBody body;

    private UpdateCategoryNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCategoryNameResponse create() {
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
    public UpdateCategoryNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCategoryNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCategoryNameResponseBody body);

        @Override
        UpdateCategoryNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCategoryNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCategoryNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCategoryNameResponse response) {
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
        public Builder body(UpdateCategoryNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCategoryNameResponse build() {
            return new UpdateCategoryNameResponse(this);
        } 

    } 

}
