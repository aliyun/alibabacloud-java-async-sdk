// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetSuspiciousStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSuspiciousStatisticsResponseBody</p>
 */
public class GetSuspiciousStatisticsResponseBody extends TeaModel {
    @NameInMap("RemindCount")
    private Integer remindCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SeriousCount")
    private Integer seriousCount;

    @NameInMap("SuspiciousCount")
    private Integer suspiciousCount;

    @NameInMap("TotalCount")
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
         * <p>RemindCount.</p>
         */
        public Builder remindCount(Integer remindCount) {
            this.remindCount = remindCount;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SeriousCount.</p>
         */
        public Builder seriousCount(Integer seriousCount) {
            this.seriousCount = seriousCount;
            return this;
        }

        /**
         * <p>SuspiciousCount.</p>
         */
        public Builder suspiciousCount(Integer suspiciousCount) {
            this.suspiciousCount = suspiciousCount;
            return this;
        }

        /**
         * <p>TotalCount.</p>
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
