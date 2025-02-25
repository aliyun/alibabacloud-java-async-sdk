// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnUserSecDropRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserSecDropRequest</p>
 */
public class DescribeDcdnUserSecDropRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecFunc")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The date or month that you want to query.</p>
         * <ul>
         * <li>If data is collected every day, set Data in the format of yyyymmdd, such as 20201203.</li>
         * <li>If data is collected every month, set Data in the format of yyyymm, such as 202012.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20201203</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The time interval at which data is collected.</p>
         * <ul>
         * <li>If data is collected every day, the number of blocked packets on the specified day is calculated.</li>
         * <li>If data is collected every month, the number of blocked packets in the specified month is calculated.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1day</p>
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The security feature. Valid values:</p>
         * <ul>
         * <li>waf: WAF</li>
         * <li>tmd: rate limiting</li>
         * <li>robot: bot traffic recognition</li>
         * <li>l4_dm_drop: domain name blocking at Layer 4</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf</p>
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
