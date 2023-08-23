// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveRTCStatsV2Response} extends {@link TeaModel}
 *
 * <p>SaveRTCStatsV2Response</p>
 */
public class SaveRTCStatsV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveRTCStatsV2ResponseBody body;

    private SaveRTCStatsV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveRTCStatsV2Response create() {
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
    public SaveRTCStatsV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveRTCStatsV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveRTCStatsV2ResponseBody body);

        @Override
        SaveRTCStatsV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveRTCStatsV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveRTCStatsV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveRTCStatsV2Response response) {
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
        public Builder body(SaveRTCStatsV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveRTCStatsV2Response build() {
            return new SaveRTCStatsV2Response(this);
        } 

    } 

}
