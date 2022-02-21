// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCallV2Response} extends {@link TeaModel}
 *
 * <p>StartCallV2Response</p>
 */
public class StartCallV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartCallV2ResponseBody body;

    private StartCallV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartCallV2Response create() {
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
    public StartCallV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartCallV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartCallV2ResponseBody body);

        @Override
        StartCallV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartCallV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartCallV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartCallV2Response response) {
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
        public Builder body(StartCallV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartCallV2Response build() {
            return new StartCallV2Response(this);
        } 

    } 

}
