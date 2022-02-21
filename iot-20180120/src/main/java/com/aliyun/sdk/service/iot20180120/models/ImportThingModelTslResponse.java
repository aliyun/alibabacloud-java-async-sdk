// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportThingModelTslResponse} extends {@link TeaModel}
 *
 * <p>ImportThingModelTslResponse</p>
 */
public class ImportThingModelTslResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportThingModelTslResponseBody body;

    private ImportThingModelTslResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportThingModelTslResponse create() {
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
    public ImportThingModelTslResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportThingModelTslResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportThingModelTslResponseBody body);

        @Override
        ImportThingModelTslResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportThingModelTslResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportThingModelTslResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportThingModelTslResponse response) {
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
        public Builder body(ImportThingModelTslResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportThingModelTslResponse build() {
            return new ImportThingModelTslResponse(this);
        } 

    } 

}
