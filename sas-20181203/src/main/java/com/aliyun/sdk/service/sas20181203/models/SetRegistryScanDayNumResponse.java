// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRegistryScanDayNumResponse} extends {@link TeaModel}
 *
 * <p>SetRegistryScanDayNumResponse</p>
 */
public class SetRegistryScanDayNumResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetRegistryScanDayNumResponseBody body;

    private SetRegistryScanDayNumResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetRegistryScanDayNumResponse create() {
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
    public SetRegistryScanDayNumResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetRegistryScanDayNumResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetRegistryScanDayNumResponseBody body);

        @Override
        SetRegistryScanDayNumResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetRegistryScanDayNumResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetRegistryScanDayNumResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetRegistryScanDayNumResponse response) {
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
        public Builder body(SetRegistryScanDayNumResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetRegistryScanDayNumResponse build() {
            return new SetRegistryScanDayNumResponse(this);
        } 

    } 

}
