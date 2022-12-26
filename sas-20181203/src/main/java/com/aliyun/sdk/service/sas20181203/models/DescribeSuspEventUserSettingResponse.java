// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventUserSettingResponse} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventUserSettingResponse</p>
 */
public class DescribeSuspEventUserSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSuspEventUserSettingResponseBody body;

    private DescribeSuspEventUserSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSuspEventUserSettingResponse create() {
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
    public DescribeSuspEventUserSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSuspEventUserSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSuspEventUserSettingResponseBody body);

        @Override
        DescribeSuspEventUserSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSuspEventUserSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSuspEventUserSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSuspEventUserSettingResponse response) {
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
        public Builder body(DescribeSuspEventUserSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSuspEventUserSettingResponse build() {
            return new DescribeSuspEventUserSettingResponse(this);
        } 

    } 

}
