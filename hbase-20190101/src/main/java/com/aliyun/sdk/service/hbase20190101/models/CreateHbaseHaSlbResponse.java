// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHbaseHaSlbResponse} extends {@link TeaModel}
 *
 * <p>CreateHbaseHaSlbResponse</p>
 */
public class CreateHbaseHaSlbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHbaseHaSlbResponseBody body;

    private CreateHbaseHaSlbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHbaseHaSlbResponse create() {
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
    public CreateHbaseHaSlbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHbaseHaSlbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHbaseHaSlbResponseBody body);

        @Override
        CreateHbaseHaSlbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHbaseHaSlbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHbaseHaSlbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHbaseHaSlbResponse response) {
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
        public Builder body(CreateHbaseHaSlbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHbaseHaSlbResponse build() {
            return new CreateHbaseHaSlbResponse(this);
        } 

    } 

}
