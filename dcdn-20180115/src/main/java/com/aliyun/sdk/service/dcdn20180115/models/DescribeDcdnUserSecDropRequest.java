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
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecFunc")
    @Validation(required = true)
    private String secFunc;

    private DescribeDcdnUserSecDropRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.metric = builder.metric;
        this.ownerId = builder.ownerId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
        private Long ownerId; 
        private String secFunc; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnUserSecDropRequest response) {
            super(response);
            this.data = response.data;
            this.metric = response.metric;
            this.ownerId = response.ownerId;
            this.secFunc = response.secFunc;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * Metric.
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SecFunc.
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
