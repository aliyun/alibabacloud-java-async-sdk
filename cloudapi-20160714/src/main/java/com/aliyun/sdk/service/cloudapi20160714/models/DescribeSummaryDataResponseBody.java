// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSummaryDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSummaryDataResponseBody</p>
 */
public class DescribeSummaryDataResponseBody extends TeaModel {
    @NameInMap("ExpireInstanceNum")
    private Integer expireInstanceNum;

    @NameInMap("Region")
    private String region;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UsageApiNum")
    private Integer usageApiNum;

    @NameInMap("UsageGroupNum")
    private Integer usageGroupNum;

    @NameInMap("UsageInstanceNum")
    private Integer usageInstanceNum;

    private DescribeSummaryDataResponseBody(Builder builder) {
        this.expireInstanceNum = builder.expireInstanceNum;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.usageApiNum = builder.usageApiNum;
        this.usageGroupNum = builder.usageGroupNum;
        this.usageInstanceNum = builder.usageInstanceNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSummaryDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return expireInstanceNum
     */
    public Integer getExpireInstanceNum() {
        return this.expireInstanceNum;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usageApiNum
     */
    public Integer getUsageApiNum() {
        return this.usageApiNum;
    }

    /**
     * @return usageGroupNum
     */
    public Integer getUsageGroupNum() {
        return this.usageGroupNum;
    }

    /**
     * @return usageInstanceNum
     */
    public Integer getUsageInstanceNum() {
        return this.usageInstanceNum;
    }

    public static final class Builder {
        private Integer expireInstanceNum; 
        private String region; 
        private String requestId; 
        private Integer usageApiNum; 
        private Integer usageGroupNum; 
        private Integer usageInstanceNum; 

        /**
         * The number of subscription dedicated instances that expire in 14 days or less.
         */
        public Builder expireInstanceNum(Integer expireInstanceNum) {
            this.expireInstanceNum = expireInstanceNum;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of APIs.
         */
        public Builder usageApiNum(Integer usageApiNum) {
            this.usageApiNum = usageApiNum;
            return this;
        }

        /**
         * The number of API groups.
         */
        public Builder usageGroupNum(Integer usageGroupNum) {
            this.usageGroupNum = usageGroupNum;
            return this;
        }

        /**
         * The number of running dedicated instances.
         */
        public Builder usageInstanceNum(Integer usageInstanceNum) {
            this.usageInstanceNum = usageInstanceNum;
            return this;
        }

        public DescribeSummaryDataResponseBody build() {
            return new DescribeSummaryDataResponseBody(this);
        } 

    } 

}
