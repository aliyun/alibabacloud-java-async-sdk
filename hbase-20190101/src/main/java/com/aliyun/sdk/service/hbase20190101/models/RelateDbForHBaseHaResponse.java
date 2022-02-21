// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RelateDbForHBaseHaResponse} extends {@link TeaModel}
 *
 * <p>RelateDbForHBaseHaResponse</p>
 */
public class RelateDbForHBaseHaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RelateDbForHBaseHaResponseBody body;

    private RelateDbForHBaseHaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RelateDbForHBaseHaResponse create() {
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
    public RelateDbForHBaseHaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RelateDbForHBaseHaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RelateDbForHBaseHaResponseBody body);

        @Override
        RelateDbForHBaseHaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RelateDbForHBaseHaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RelateDbForHBaseHaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RelateDbForHBaseHaResponse response) {
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
        public Builder body(RelateDbForHBaseHaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RelateDbForHBaseHaResponse build() {
            return new RelateDbForHBaseHaResponse(this);
        } 

    } 

}
