// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LabelBuildResponse} extends {@link TeaModel}
 *
 * <p>LabelBuildResponse</p>
 */
public class LabelBuildResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LabelBuildResponseBody body;

    private LabelBuildResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LabelBuildResponse create() {
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
    public LabelBuildResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LabelBuildResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LabelBuildResponseBody body);

        @Override
        LabelBuildResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LabelBuildResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LabelBuildResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LabelBuildResponse response) {
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
        public Builder body(LabelBuildResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LabelBuildResponse build() {
            return new LabelBuildResponse(this);
        } 

    } 

}
