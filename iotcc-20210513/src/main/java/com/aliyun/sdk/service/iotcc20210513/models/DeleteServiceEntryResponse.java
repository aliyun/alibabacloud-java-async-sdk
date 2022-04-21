// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceEntryResponse} extends {@link TeaModel}
 *
 * <p>DeleteServiceEntryResponse</p>
 */
public class DeleteServiceEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteServiceEntryResponseBody body;

    private DeleteServiceEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteServiceEntryResponse create() {
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
    public DeleteServiceEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServiceEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteServiceEntryResponseBody body);

        @Override
        DeleteServiceEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServiceEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteServiceEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServiceEntryResponse response) {
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
        public Builder body(DeleteServiceEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServiceEntryResponse build() {
            return new DeleteServiceEntryResponse(this);
        } 

    } 

}
