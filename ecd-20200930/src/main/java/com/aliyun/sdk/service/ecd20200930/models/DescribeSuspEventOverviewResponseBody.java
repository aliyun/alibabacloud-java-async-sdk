// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventOverviewResponseBody</p>
 */
public class DescribeSuspEventOverviewResponseBody extends TeaModel {
    @NameInMap("RemindCount")
    private Integer remindCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SeriousCount")
    private Integer seriousCount;

    @NameInMap("SuspiciousCount")
    private Integer suspiciousCount;

    private DescribeSuspEventOverviewResponseBody(Builder builder) {
        this.remindCount = builder.remindCount;
        this.requestId = builder.requestId;
        this.seriousCount = builder.seriousCount;
        this.suspiciousCount = builder.suspiciousCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventOverviewResponseBody create() {
        return builder().build();
    }

    /**
     * @return remindCount
     */
    public Integer getRemindCount() {
        return this.remindCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return seriousCount
     */
    public Integer getSeriousCount() {
        return this.seriousCount;
    }

    /**
     * @return suspiciousCount
     */
    public Integer getSuspiciousCount() {
        return this.suspiciousCount;
    }

    public static final class Builder {
        private Integer remindCount; 
        private String requestId; 
        private Integer seriousCount; 
        private Integer suspiciousCount; 

        /**
         * RemindCount.
         */
        public Builder remindCount(Integer remindCount) {
            this.remindCount = remindCount;
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
         * SeriousCount.
         */
        public Builder seriousCount(Integer seriousCount) {
            this.seriousCount = seriousCount;
            return this;
        }

        /**
         * DescribeSuspEventOverview
         */
        public Builder suspiciousCount(Integer suspiciousCount) {
            this.suspiciousCount = suspiciousCount;
            return this;
        }

        public DescribeSuspEventOverviewResponseBody build() {
            return new DescribeSuspEventOverviewResponseBody(this);
        } 

    } 

}
