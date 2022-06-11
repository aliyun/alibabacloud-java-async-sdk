// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDynamicSettingsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDynamicSettingsResponse</p>
 */
public class DescribeDynamicSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDynamicSettingsResponseBody body;

    private DescribeDynamicSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDynamicSettingsResponse create() {
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
    public DescribeDynamicSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDynamicSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDynamicSettingsResponseBody body);

        @Override
        DescribeDynamicSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDynamicSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDynamicSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDynamicSettingsResponse response) {
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
        public Builder body(DescribeDynamicSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDynamicSettingsResponse build() {
            return new DescribeDynamicSettingsResponse(this);
        } 

    } 

}
