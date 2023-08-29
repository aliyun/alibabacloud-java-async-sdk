// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserSecDropRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserSecDropRequest</p>
 */
public class DescribeDcdnUserSecDropRequest extends Request {
    @Query
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Query
    @NameInMap("Metric")
    @Validation(required = true)
    private String metric;

    @Query
    @NameInMap("SecFunc")
    @Validation(required = true)
    private String secFunc;

    private DescribeDcdnUserSecDropRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.metric = builder.metric;
        this.secFunc = builder.secFunc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserSecDropRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return secFunc
     */
    public String getSecFunc() {
        return this.secFunc;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnUserSecDropRequest, Builder> {
        private String data; 
        private String metric; 
        private String secFunc; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnUserSecDropRequest request) {
            super(request);
            this.data = request.data;
            this.metric = request.metric;
            this.secFunc = request.secFunc;
        } 

        /**
         * The date or month that you want to query.
         * <p>
         * 
         * *   If data is collected every day, set Data in the format of yyyymmdd, such as 20201203.
         * *   If data is collected every month, set Data in the format of yyyymm, such as 202012.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The time interval at which data is collected.
         * <p>
         * 
         * *   If data is collected every day, the number of blocked packets on the specified day is calculated.
         * *   If data is collected every month, the number of blocked packets in the specified month is calculated.
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * The security feature. Valid values:
         * <p>
         * 
         * *   waf: WAF
         * *   tmd: rate limiting
         * *   robot: bot traffic recognition
         * *   l4\_dm_drop: domain name blocking at Layer 4
         */
        public Builder secFunc(String secFunc) {
            this.putQueryParameter("SecFunc", secFunc);
            this.secFunc = secFunc;
            return this;
        }

        @Override
        public DescribeDcdnUserSecDropRequest build() {
            return new DescribeDcdnUserSecDropRequest(this);
        } 

    } 

}
