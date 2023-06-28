// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOnDemaondDefenseStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyOnDemaondDefenseStatusResponse</p>
 */
public class ModifyOnDemaondDefenseStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyOnDemaondDefenseStatusResponseBody body;

    private ModifyOnDemaondDefenseStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyOnDemaondDefenseStatusResponse create() {
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
    public ModifyOnDemaondDefenseStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyOnDemaondDefenseStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyOnDemaondDefenseStatusResponseBody body);

        @Override
        ModifyOnDemaondDefenseStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyOnDemaondDefenseStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyOnDemaondDefenseStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyOnDemaondDefenseStatusResponse response) {
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
        public Builder body(ModifyOnDemaondDefenseStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyOnDemaondDefenseStatusResponse build() {
            return new ModifyOnDemaondDefenseStatusResponse(this);
        } 

    } 

}
