// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSLARulesResponse} extends {@link TeaModel}
 *
 * <p>UpdateSLARulesResponse</p>
 */
public class UpdateSLARulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSLARulesResponseBody body;

    private UpdateSLARulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSLARulesResponse create() {
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
    public UpdateSLARulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSLARulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSLARulesResponseBody body);

        @Override
        UpdateSLARulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSLARulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSLARulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSLARulesResponse response) {
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
        public Builder body(UpdateSLARulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSLARulesResponse build() {
            return new UpdateSLARulesResponse(this);
        } 

    } 

}
