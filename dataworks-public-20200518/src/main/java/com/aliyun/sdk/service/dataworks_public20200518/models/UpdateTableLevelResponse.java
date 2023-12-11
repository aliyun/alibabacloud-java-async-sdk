// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableLevelResponse} extends {@link TeaModel}
 *
 * <p>UpdateTableLevelResponse</p>
 */
public class UpdateTableLevelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTableLevelResponseBody body;

    private UpdateTableLevelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTableLevelResponse create() {
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
    public UpdateTableLevelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTableLevelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTableLevelResponseBody body);

        @Override
        UpdateTableLevelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTableLevelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTableLevelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTableLevelResponse response) {
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
        public Builder body(UpdateTableLevelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTableLevelResponse build() {
            return new UpdateTableLevelResponse(this);
        } 

    } 

}
