// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultRegistrantProfileResponse} extends {@link TeaModel}
 *
 * <p>SetDefaultRegistrantProfileResponse</p>
 */
public class SetDefaultRegistrantProfileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDefaultRegistrantProfileResponseBody body;

    private SetDefaultRegistrantProfileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDefaultRegistrantProfileResponse create() {
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
    public SetDefaultRegistrantProfileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDefaultRegistrantProfileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDefaultRegistrantProfileResponseBody body);

        @Override
        SetDefaultRegistrantProfileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDefaultRegistrantProfileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDefaultRegistrantProfileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDefaultRegistrantProfileResponse response) {
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
        public Builder body(SetDefaultRegistrantProfileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDefaultRegistrantProfileResponse build() {
            return new SetDefaultRegistrantProfileResponse(this);
        } 

    } 

}
