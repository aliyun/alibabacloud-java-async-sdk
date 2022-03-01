// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerStatisticsResponse} extends {@link TeaModel}
 *
 * <p>DescribeContainerStatisticsResponse</p>
 */
public class DescribeContainerStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeContainerStatisticsResponseBody body;

    private DescribeContainerStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeContainerStatisticsResponse create() {
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
    public DescribeContainerStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeContainerStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeContainerStatisticsResponseBody body);

        @Override
        DescribeContainerStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeContainerStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeContainerStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeContainerStatisticsResponse response) {
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
        public Builder body(DescribeContainerStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeContainerStatisticsResponse build() {
            return new DescribeContainerStatisticsResponse(this);
        } 

    } 

}
