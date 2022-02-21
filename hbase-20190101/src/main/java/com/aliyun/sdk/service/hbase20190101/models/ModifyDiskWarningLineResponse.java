// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskWarningLineResponse} extends {@link TeaModel}
 *
 * <p>ModifyDiskWarningLineResponse</p>
 */
public class ModifyDiskWarningLineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDiskWarningLineResponseBody body;

    private ModifyDiskWarningLineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDiskWarningLineResponse create() {
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
    public ModifyDiskWarningLineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDiskWarningLineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDiskWarningLineResponseBody body);

        @Override
        ModifyDiskWarningLineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDiskWarningLineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDiskWarningLineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDiskWarningLineResponse response) {
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
        public Builder body(ModifyDiskWarningLineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDiskWarningLineResponse build() {
            return new ModifyDiskWarningLineResponse(this);
        } 

    } 

}
