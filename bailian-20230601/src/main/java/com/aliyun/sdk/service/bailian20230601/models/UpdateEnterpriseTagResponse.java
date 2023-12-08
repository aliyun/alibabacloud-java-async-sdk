// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnterpriseTagResponse} extends {@link TeaModel}
 *
 * <p>UpdateEnterpriseTagResponse</p>
 */
public class UpdateEnterpriseTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEnterpriseTagResponseBody body;

    private UpdateEnterpriseTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEnterpriseTagResponse create() {
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
    public UpdateEnterpriseTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEnterpriseTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEnterpriseTagResponseBody body);

        @Override
        UpdateEnterpriseTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEnterpriseTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEnterpriseTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEnterpriseTagResponse response) {
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
        public Builder body(UpdateEnterpriseTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEnterpriseTagResponse build() {
            return new UpdateEnterpriseTagResponse(this);
        } 

    } 

}
