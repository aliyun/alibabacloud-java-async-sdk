// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnConfigOfVersionResponse} extends {@link TeaModel}
 *
 * <p>SetDcdnConfigOfVersionResponse</p>
 */
public class SetDcdnConfigOfVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDcdnConfigOfVersionResponseBody body;

    private SetDcdnConfigOfVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDcdnConfigOfVersionResponse create() {
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
    public SetDcdnConfigOfVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDcdnConfigOfVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDcdnConfigOfVersionResponseBody body);

        @Override
        SetDcdnConfigOfVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDcdnConfigOfVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDcdnConfigOfVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDcdnConfigOfVersionResponse response) {
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
        public Builder body(SetDcdnConfigOfVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDcdnConfigOfVersionResponse build() {
            return new SetDcdnConfigOfVersionResponse(this);
        } 

    } 

}
