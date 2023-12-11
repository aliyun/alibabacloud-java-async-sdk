// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDISyncTaskConfigForCreatingResponse} extends {@link TeaModel}
 *
 * <p>GenerateDISyncTaskConfigForCreatingResponse</p>
 */
public class GenerateDISyncTaskConfigForCreatingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateDISyncTaskConfigForCreatingResponseBody body;

    private GenerateDISyncTaskConfigForCreatingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateDISyncTaskConfigForCreatingResponse create() {
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
    public GenerateDISyncTaskConfigForCreatingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateDISyncTaskConfigForCreatingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateDISyncTaskConfigForCreatingResponseBody body);

        @Override
        GenerateDISyncTaskConfigForCreatingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateDISyncTaskConfigForCreatingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateDISyncTaskConfigForCreatingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateDISyncTaskConfigForCreatingResponse response) {
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
        public Builder body(GenerateDISyncTaskConfigForCreatingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateDISyncTaskConfigForCreatingResponse build() {
            return new GenerateDISyncTaskConfigForCreatingResponse(this);
        } 

    } 

}
