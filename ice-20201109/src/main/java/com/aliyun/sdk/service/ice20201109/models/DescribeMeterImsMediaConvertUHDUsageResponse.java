// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterImsMediaConvertUHDUsageResponse} extends {@link TeaModel}
 *
 * <p>DescribeMeterImsMediaConvertUHDUsageResponse</p>
 */
public class DescribeMeterImsMediaConvertUHDUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMeterImsMediaConvertUHDUsageResponseBody body;

    private DescribeMeterImsMediaConvertUHDUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeMeterImsMediaConvertUHDUsageResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribeMeterImsMediaConvertUHDUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMeterImsMediaConvertUHDUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeMeterImsMediaConvertUHDUsageResponseBody body);

        @Override
        DescribeMeterImsMediaConvertUHDUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMeterImsMediaConvertUHDUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeMeterImsMediaConvertUHDUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMeterImsMediaConvertUHDUsageResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeMeterImsMediaConvertUHDUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMeterImsMediaConvertUHDUsageResponse build() {
            return new DescribeMeterImsMediaConvertUHDUsageResponse(this);
        } 

    } 

}
