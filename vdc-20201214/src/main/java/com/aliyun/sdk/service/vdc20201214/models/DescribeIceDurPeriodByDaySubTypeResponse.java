// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIceDurPeriodByDaySubTypeResponse} extends {@link TeaModel}
 *
 * <p>DescribeIceDurPeriodByDaySubTypeResponse</p>
 */
public class DescribeIceDurPeriodByDaySubTypeResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeIceDurPeriodByDaySubTypeResponseBody body;

    private DescribeIceDurPeriodByDaySubTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeIceDurPeriodByDaySubTypeResponse create() {
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
    public DescribeIceDurPeriodByDaySubTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIceDurPeriodByDaySubTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeIceDurPeriodByDaySubTypeResponseBody body);

        @Override
        DescribeIceDurPeriodByDaySubTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIceDurPeriodByDaySubTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeIceDurPeriodByDaySubTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIceDurPeriodByDaySubTypeResponse response) {
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
        public Builder body(DescribeIceDurPeriodByDaySubTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIceDurPeriodByDaySubTypeResponse build() {
            return new DescribeIceDurPeriodByDaySubTypeResponse(this);
        } 

    } 

}
