// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUpgradeRecordResponse} extends {@link TeaModel}
 *
 * <p>GenerateUpgradeRecordResponse</p>
 */
public class GenerateUpgradeRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateUpgradeRecordResponseBody body;

    private GenerateUpgradeRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateUpgradeRecordResponse create() {
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
    public GenerateUpgradeRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateUpgradeRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateUpgradeRecordResponseBody body);

        @Override
        GenerateUpgradeRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateUpgradeRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateUpgradeRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateUpgradeRecordResponse response) {
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
        public Builder body(GenerateUpgradeRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateUpgradeRecordResponse build() {
            return new GenerateUpgradeRecordResponse(this);
        } 

    } 

}
