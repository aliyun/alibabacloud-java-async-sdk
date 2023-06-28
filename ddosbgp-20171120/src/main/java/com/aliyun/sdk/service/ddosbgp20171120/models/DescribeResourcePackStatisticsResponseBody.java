// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcePackStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourcePackStatisticsResponseBody</p>
 */
public class DescribeResourcePackStatisticsResponseBody extends TeaModel {
    @NameInMap("AvailablePackNum")
    private Integer availablePackNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCurrCapacity")
    private Long totalCurrCapacity;

    @NameInMap("TotalInitCapacity")
    private Long totalInitCapacity;

    @NameInMap("TotalUsedCapacity")
    private Long totalUsedCapacity;

    private DescribeResourcePackStatisticsResponseBody(Builder builder) {
        this.availablePackNum = builder.availablePackNum;
        this.requestId = builder.requestId;
        this.totalCurrCapacity = builder.totalCurrCapacity;
        this.totalInitCapacity = builder.totalInitCapacity;
        this.totalUsedCapacity = builder.totalUsedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcePackStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return availablePackNum
     */
    public Integer getAvailablePackNum() {
        return this.availablePackNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCurrCapacity
     */
    public Long getTotalCurrCapacity() {
        return this.totalCurrCapacity;
    }

    /**
     * @return totalInitCapacity
     */
    public Long getTotalInitCapacity() {
        return this.totalInitCapacity;
    }

    /**
     * @return totalUsedCapacity
     */
    public Long getTotalUsedCapacity() {
        return this.totalUsedCapacity;
    }

    public static final class Builder {
        private Integer availablePackNum; 
        private String requestId; 
        private Long totalCurrCapacity; 
        private Long totalInitCapacity; 
        private Long totalUsedCapacity; 

        /**
         * AvailablePackNum.
         */
        public Builder availablePackNum(Integer availablePackNum) {
            this.availablePackNum = availablePackNum;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCurrCapacity.
         */
        public Builder totalCurrCapacity(Long totalCurrCapacity) {
            this.totalCurrCapacity = totalCurrCapacity;
            return this;
        }

        /**
         * TotalInitCapacity.
         */
        public Builder totalInitCapacity(Long totalInitCapacity) {
            this.totalInitCapacity = totalInitCapacity;
            return this;
        }

        /**
         * TotalUsedCapacity.
         */
        public Builder totalUsedCapacity(Long totalUsedCapacity) {
            this.totalUsedCapacity = totalUsedCapacity;
            return this;
        }

        public DescribeResourcePackStatisticsResponseBody build() {
            return new DescribeResourcePackStatisticsResponseBody(this);
        } 

    } 

}
