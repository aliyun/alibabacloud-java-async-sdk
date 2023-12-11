// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDISyncTaskConfigForUpdatingResponse} extends {@link TeaModel}
 *
 * <p>GenerateDISyncTaskConfigForUpdatingResponse</p>
 */
public class GenerateDISyncTaskConfigForUpdatingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateDISyncTaskConfigForUpdatingResponseBody body;

    private GenerateDISyncTaskConfigForUpdatingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateDISyncTaskConfigForUpdatingResponse create() {
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
    public GenerateDISyncTaskConfigForUpdatingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateDISyncTaskConfigForUpdatingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateDISyncTaskConfigForUpdatingResponseBody body);

        @Override
        GenerateDISyncTaskConfigForUpdatingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateDISyncTaskConfigForUpdatingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateDISyncTaskConfigForUpdatingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateDISyncTaskConfigForUpdatingResponse response) {
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
        public Builder body(GenerateDISyncTaskConfigForUpdatingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateDISyncTaskConfigForUpdatingResponse build() {
            return new GenerateDISyncTaskConfigForUpdatingResponse(this);
        } 

    } 

}
