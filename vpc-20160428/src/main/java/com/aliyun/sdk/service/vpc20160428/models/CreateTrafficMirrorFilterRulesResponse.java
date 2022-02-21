// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrafficMirrorFilterRulesResponse} extends {@link TeaModel}
 *
 * <p>CreateTrafficMirrorFilterRulesResponse</p>
 */
public class CreateTrafficMirrorFilterRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTrafficMirrorFilterRulesResponseBody body;

    private CreateTrafficMirrorFilterRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTrafficMirrorFilterRulesResponse create() {
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
    public CreateTrafficMirrorFilterRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTrafficMirrorFilterRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTrafficMirrorFilterRulesResponseBody body);

        @Override
        CreateTrafficMirrorFilterRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTrafficMirrorFilterRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTrafficMirrorFilterRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTrafficMirrorFilterRulesResponse response) {
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
        public Builder body(CreateTrafficMirrorFilterRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTrafficMirrorFilterRulesResponse build() {
            return new CreateTrafficMirrorFilterRulesResponse(this);
        } 

    } 

}
