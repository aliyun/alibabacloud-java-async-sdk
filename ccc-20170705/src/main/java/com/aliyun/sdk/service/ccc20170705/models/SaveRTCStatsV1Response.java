// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveRTCStatsV1Response} extends {@link TeaModel}
 *
 * <p>SaveRTCStatsV1Response</p>
 */
public class SaveRTCStatsV1Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveRTCStatsV1ResponseBody body;

    private SaveRTCStatsV1Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveRTCStatsV1Response create() {
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
    public SaveRTCStatsV1ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveRTCStatsV1Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveRTCStatsV1ResponseBody body);

        @Override
        SaveRTCStatsV1Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveRTCStatsV1Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveRTCStatsV1ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveRTCStatsV1Response response) {
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
        public Builder body(SaveRTCStatsV1ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveRTCStatsV1Response build() {
            return new SaveRTCStatsV1Response(this);
        } 

    } 

}
