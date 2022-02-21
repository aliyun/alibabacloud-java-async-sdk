// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMetastoreCrawlerResponse} extends {@link TeaModel}
 *
 * <p>ModifyMetastoreCrawlerResponse</p>
 */
public class ModifyMetastoreCrawlerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMetastoreCrawlerResponseBody body;

    private ModifyMetastoreCrawlerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMetastoreCrawlerResponse create() {
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
    public ModifyMetastoreCrawlerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMetastoreCrawlerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMetastoreCrawlerResponseBody body);

        @Override
        ModifyMetastoreCrawlerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMetastoreCrawlerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMetastoreCrawlerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMetastoreCrawlerResponse response) {
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
        public Builder body(ModifyMetastoreCrawlerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMetastoreCrawlerResponse build() {
            return new ModifyMetastoreCrawlerResponse(this);
        } 

    } 

}
