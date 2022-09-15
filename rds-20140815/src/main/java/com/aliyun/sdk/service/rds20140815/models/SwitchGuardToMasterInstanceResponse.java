// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchGuardToMasterInstanceResponse} extends {@link TeaModel}
 *
 * <p>SwitchGuardToMasterInstanceResponse</p>
 */
public class SwitchGuardToMasterInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchGuardToMasterInstanceResponseBody body;

    private SwitchGuardToMasterInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchGuardToMasterInstanceResponse create() {
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
    public SwitchGuardToMasterInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchGuardToMasterInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchGuardToMasterInstanceResponseBody body);

        @Override
        SwitchGuardToMasterInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchGuardToMasterInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchGuardToMasterInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchGuardToMasterInstanceResponse response) {
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
        public Builder body(SwitchGuardToMasterInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchGuardToMasterInstanceResponse build() {
            return new SwitchGuardToMasterInstanceResponse(this);
        } 

    } 

}
