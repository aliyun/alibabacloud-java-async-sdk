// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTriggerHookResponse} extends {@link TeaModel}
 *
 * <p>GetTriggerHookResponse</p>
 */
public class GetTriggerHookResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private GetTriggerHookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static GetTriggerHookResponse create() {
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

    public interface Builder extends Response.Builder<GetTriggerHookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        GetTriggerHookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTriggerHookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTriggerHookResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public GetTriggerHookResponse build() {
            return new GetTriggerHookResponse(this);
        } 

    } 

}
