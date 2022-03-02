// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link CreateSelectObjectMetaResponse} extends {@link TeaModel}
 *
 * <p>CreateSelectObjectMetaResponse</p>
 */
public class CreateSelectObjectMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SelectMetaStatus body;

    private CreateSelectObjectMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSelectObjectMetaResponse create() {
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
    public SelectMetaStatus getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSelectObjectMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SelectMetaStatus body);

        @Override
        CreateSelectObjectMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSelectObjectMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SelectMetaStatus body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSelectObjectMetaResponse response) {
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
        public Builder body(SelectMetaStatus body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSelectObjectMetaResponse build() {
            return new CreateSelectObjectMetaResponse(this);
        } 

    } 

}
