// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterProgramResponse} extends {@link TeaModel}
 *
 * <p>AddCasterProgramResponse</p>
 */
public class AddCasterProgramResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCasterProgramResponseBody body;

    private AddCasterProgramResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCasterProgramResponse create() {
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
    public AddCasterProgramResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCasterProgramResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCasterProgramResponseBody body);

        @Override
        AddCasterProgramResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCasterProgramResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCasterProgramResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCasterProgramResponse response) {
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
        public Builder body(AddCasterProgramResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCasterProgramResponse build() {
            return new AddCasterProgramResponse(this);
        } 

    } 

}
