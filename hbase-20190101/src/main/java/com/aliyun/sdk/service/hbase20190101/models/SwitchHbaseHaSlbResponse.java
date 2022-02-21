// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchHbaseHaSlbResponse} extends {@link TeaModel}
 *
 * <p>SwitchHbaseHaSlbResponse</p>
 */
public class SwitchHbaseHaSlbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchHbaseHaSlbResponseBody body;

    private SwitchHbaseHaSlbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchHbaseHaSlbResponse create() {
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
    public SwitchHbaseHaSlbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchHbaseHaSlbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchHbaseHaSlbResponseBody body);

        @Override
        SwitchHbaseHaSlbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchHbaseHaSlbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchHbaseHaSlbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchHbaseHaSlbResponse response) {
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
        public Builder body(SwitchHbaseHaSlbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchHbaseHaSlbResponse build() {
            return new SwitchHbaseHaSlbResponse(this);
        } 

    } 

}
