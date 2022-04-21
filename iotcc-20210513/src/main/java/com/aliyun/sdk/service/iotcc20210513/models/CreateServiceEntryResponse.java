// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceEntryResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceEntryResponse</p>
 */
public class CreateServiceEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceEntryResponseBody body;

    private CreateServiceEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceEntryResponse create() {
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
    public CreateServiceEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceEntryResponseBody body);

        @Override
        CreateServiceEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceEntryResponse response) {
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
        public Builder body(CreateServiceEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceEntryResponse build() {
            return new CreateServiceEntryResponse(this);
        } 

    } 

}
