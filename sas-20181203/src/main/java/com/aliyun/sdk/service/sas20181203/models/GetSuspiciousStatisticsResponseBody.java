// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSuspiciousStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSuspiciousStatisticsResponseBody</p>
 */
public class GetSuspiciousStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemindCount")
    private Integer remindCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SeriousCount")
    private Integer seriousCount;

    @com.aliyun.core.annotation.NameInMap("SuspiciousCount")
    private Integer suspiciousCount;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetSuspiciousStatisticsResponseBody(Builder builder) {
        this.remindCount = builder.remindCount;
        this.requestId = builder.requestId;
        this.seriousCount = builder.seriousCount;
        this.suspiciousCount = builder.suspiciousCount;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSuspiciousStatisticsResponseBody create() {
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer remindCount; 
        private String requestId; 
        private Integer seriousCount; 
        private Integer suspiciousCount; 
        private Integer totalCount; 

        /**
         * <p>The number of alerts whose Emergency level is Reminder.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder remindCount(Integer remindCount) {
            this.remindCount = remindCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>84092B42-1A59-4F34-8DF8-1D93520990A5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of alerts whose Emergency level is Urgent.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder seriousCount(Integer seriousCount) {
            this.seriousCount = seriousCount;
            return this;
        }

        /**
         * <p>The number of alerts whose Emergency level is Suspicious.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder suspiciousCount(Integer suspiciousCount) {
            this.suspiciousCount = suspiciousCount;
            return this;
        }

        /**
         * <p>The total number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetSuspiciousStatisticsResponseBody build() {
            return new GetSuspiciousStatisticsResponseBody(this);
        } 

    } 

}
