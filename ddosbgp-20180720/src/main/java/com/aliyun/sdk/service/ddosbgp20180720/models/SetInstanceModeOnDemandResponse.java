// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstanceModeOnDemandResponse} extends {@link TeaModel}
 *
 * <p>SetInstanceModeOnDemandResponse</p>
 */
public class SetInstanceModeOnDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetInstanceModeOnDemandResponseBody body;

    private SetInstanceModeOnDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetInstanceModeOnDemandResponse create() {
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
    public SetInstanceModeOnDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetInstanceModeOnDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetInstanceModeOnDemandResponseBody body);

        @Override
        SetInstanceModeOnDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetInstanceModeOnDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetInstanceModeOnDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetInstanceModeOnDemandResponse response) {
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
        public Builder body(SetInstanceModeOnDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetInstanceModeOnDemandResponse build() {
            return new SetInstanceModeOnDemandResponse(this);
        } 

    } 

}
