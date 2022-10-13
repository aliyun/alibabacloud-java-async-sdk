// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatasetItemResponse} extends {@link TeaModel}
 *
 * <p>ModifyDatasetItemResponse</p>
 */
public class ModifyDatasetItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDatasetItemResponseBody body;

    private ModifyDatasetItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDatasetItemResponse create() {
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
    public ModifyDatasetItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDatasetItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDatasetItemResponseBody body);

        @Override
        ModifyDatasetItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDatasetItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDatasetItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDatasetItemResponse response) {
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
        public Builder body(ModifyDatasetItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDatasetItemResponse build() {
            return new ModifyDatasetItemResponse(this);
        } 

    } 

}
