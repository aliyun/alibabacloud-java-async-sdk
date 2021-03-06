// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeColumnSecLevelResponse} extends {@link TeaModel}
 *
 * <p>ChangeColumnSecLevelResponse</p>
 */
public class ChangeColumnSecLevelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeColumnSecLevelResponseBody body;

    private ChangeColumnSecLevelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeColumnSecLevelResponse create() {
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
    public ChangeColumnSecLevelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeColumnSecLevelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeColumnSecLevelResponseBody body);

        @Override
        ChangeColumnSecLevelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeColumnSecLevelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeColumnSecLevelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeColumnSecLevelResponse response) {
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
        public Builder body(ChangeColumnSecLevelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeColumnSecLevelResponse build() {
            return new ChangeColumnSecLevelResponse(this);
        } 

    } 

}
