// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddHotspotFileResponse} extends {@link TeaModel}
 *
 * <p>AddHotspotFileResponse</p>
 */
public class AddHotspotFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddHotspotFileResponseBody body;

    private AddHotspotFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddHotspotFileResponse create() {
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
    public AddHotspotFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddHotspotFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddHotspotFileResponseBody body);

        @Override
        AddHotspotFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddHotspotFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddHotspotFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddHotspotFileResponse response) {
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
        public Builder body(AddHotspotFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddHotspotFileResponse build() {
            return new AddHotspotFileResponse(this);
        } 

    } 

}
