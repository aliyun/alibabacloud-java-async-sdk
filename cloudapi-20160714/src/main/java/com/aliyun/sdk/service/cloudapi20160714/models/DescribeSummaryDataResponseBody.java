// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSummaryDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSummaryDataResponseBody</p>
 */
public class DescribeSummaryDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExpireInstanceNum")
    private Integer expireInstanceNum;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageApiNum")
    private Integer usageApiNum;

    @com.aliyun.core.annotation.NameInMap("UsageGroupNum")
    private Integer usageGroupNum;

    @com.aliyun.core.annotation.NameInMap("UsageInstanceNum")
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
         * <p>The number of subscription dedicated instances that expire in 14 days or less.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder expireInstanceNum(Integer expireInstanceNum) {
            this.expireInstanceNum = expireInstanceNum;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder usageApiNum(Integer usageApiNum) {
            this.usageApiNum = usageApiNum;
            return this;
        }

        /**
         * <p>The number of API groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usageGroupNum(Integer usageGroupNum) {
            this.usageGroupNum = usageGroupNum;
            return this;
        }

        /**
         * <p>The number of running dedicated instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
