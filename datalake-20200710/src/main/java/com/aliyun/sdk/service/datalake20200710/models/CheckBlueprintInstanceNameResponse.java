// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckBlueprintInstanceNameResponse} extends {@link TeaModel}
 *
 * <p>CheckBlueprintInstanceNameResponse</p>
 */
public class CheckBlueprintInstanceNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckBlueprintInstanceNameResponseBody body;

    private CheckBlueprintInstanceNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckBlueprintInstanceNameResponse create() {
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
    public CheckBlueprintInstanceNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckBlueprintInstanceNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckBlueprintInstanceNameResponseBody body);

        @Override
        CheckBlueprintInstanceNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckBlueprintInstanceNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckBlueprintInstanceNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckBlueprintInstanceNameResponse response) {
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
        public Builder body(CheckBlueprintInstanceNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckBlueprintInstanceNameResponse build() {
            return new CheckBlueprintInstanceNameResponse(this);
        } 

    } 

}
