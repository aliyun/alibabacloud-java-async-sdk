// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigSchedruleOnDemandResponse} extends {@link TeaModel}
 *
 * <p>ConfigSchedruleOnDemandResponse</p>
 */
public class ConfigSchedruleOnDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigSchedruleOnDemandResponseBody body;

    private ConfigSchedruleOnDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigSchedruleOnDemandResponse create() {
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
    public ConfigSchedruleOnDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigSchedruleOnDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigSchedruleOnDemandResponseBody body);

        @Override
        ConfigSchedruleOnDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigSchedruleOnDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigSchedruleOnDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigSchedruleOnDemandResponse response) {
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
        public Builder body(ConfigSchedruleOnDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigSchedruleOnDemandResponse build() {
            return new ConfigSchedruleOnDemandResponse(this);
        } 

    } 

}
