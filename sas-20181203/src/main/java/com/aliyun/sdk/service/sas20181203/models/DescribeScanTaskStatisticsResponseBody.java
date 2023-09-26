// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScanTaskStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScanTaskStatisticsResponseBody</p>
 */
public class DescribeScanTaskStatisticsResponseBody extends TeaModel {
    @NameInMap("DealedRiskNum")
    private Integer dealedRiskNum;

    @NameInMap("PersonalTaskNum")
    private Long personalTaskNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalTaskNum")
    private Long totalTaskNum;

    @NameInMap("UserNum")
    private Long userNum;

    private DescribeScanTaskStatisticsResponseBody(Builder builder) {
        this.dealedRiskNum = builder.dealedRiskNum;
        this.personalTaskNum = builder.personalTaskNum;
        this.requestId = builder.requestId;
        this.totalTaskNum = builder.totalTaskNum;
        this.userNum = builder.userNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScanTaskStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dealedRiskNum
     */
    public Integer getDealedRiskNum() {
        return this.dealedRiskNum;
    }

    /**
     * @return personalTaskNum
     */
    public Long getPersonalTaskNum() {
        return this.personalTaskNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalTaskNum
     */
    public Long getTotalTaskNum() {
        return this.totalTaskNum;
    }

    /**
     * @return userNum
     */
    public Long getUserNum() {
        return this.userNum;
    }

    public static final class Builder {
        private Integer dealedRiskNum; 
        private Long personalTaskNum; 
        private String requestId; 
        private Long totalTaskNum; 
        private Long userNum; 

        /**
         * The number of risks that are handled for the user.
         */
        public Builder dealedRiskNum(Integer dealedRiskNum) {
            this.dealedRiskNum = dealedRiskNum;
            return this;
        }

        /**
         * The total number of tasks that are created for the user.
         */
        public Builder personalTaskNum(Long personalTaskNum) {
            this.personalTaskNum = personalTaskNum;
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
         * The total number of virus detection tasks.
         */
        public Builder totalTaskNum(Long totalTaskNum) {
            this.totalTaskNum = totalTaskNum;
            return this;
        }

        /**
         * The number of risks that are detected for the user.
         */
        public Builder userNum(Long userNum) {
            this.userNum = userNum;
            return this;
        }

        public DescribeScanTaskStatisticsResponseBody build() {
            return new DescribeScanTaskStatisticsResponseBody(this);
        } 

    } 

}
