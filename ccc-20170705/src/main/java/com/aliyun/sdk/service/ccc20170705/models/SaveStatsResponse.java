// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveStatsResponse} extends {@link TeaModel}
 *
 * <p>SaveStatsResponse</p>
 */
public class SaveStatsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveStatsResponseBody body;

    private SaveStatsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveStatsResponse create() {
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
    public SaveStatsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveStatsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveStatsResponseBody body);

        @Override
        SaveStatsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveStatsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveStatsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveStatsResponse response) {
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
        public Builder body(SaveStatsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveStatsResponse build() {
            return new SaveStatsResponse(this);
        } 

    } 

}
