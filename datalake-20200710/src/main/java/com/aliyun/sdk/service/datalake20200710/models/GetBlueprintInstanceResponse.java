// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBlueprintInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetBlueprintInstanceResponse</p>
 */
public class GetBlueprintInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBlueprintInstanceResponseBody body;

    private GetBlueprintInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBlueprintInstanceResponse create() {
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
    public GetBlueprintInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBlueprintInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBlueprintInstanceResponseBody body);

        @Override
        GetBlueprintInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBlueprintInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBlueprintInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBlueprintInstanceResponse response) {
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
        public Builder body(GetBlueprintInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBlueprintInstanceResponse build() {
            return new GetBlueprintInstanceResponse(this);
        } 

    } 

}
