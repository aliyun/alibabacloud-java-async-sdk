// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeDailyAsyncJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDailyAsyncJobResponseBody</p>
 */
public class DescribeDailyAsyncJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DailyJobList")
    private java.util.List<DailyJobList> dailyJobList;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDailyAsyncJobResponseBody(Builder builder) {
        this.dailyJobList = builder.dailyJobList;
        this.jobType = builder.jobType;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDailyAsyncJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dailyJobList
     */
    public java.util.List<DailyJobList> getDailyJobList() {
        return this.dailyJobList;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DailyJobList> dailyJobList; 
        private String jobType; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDailyAsyncJobResponseBody model) {
            this.dailyJobList = model.dailyJobList;
            this.jobType = model.jobType;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DailyJobList.
         */
        public Builder dailyJobList(java.util.List<DailyJobList> dailyJobList) {
            this.dailyJobList = dailyJobList;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDailyAsyncJobResponseBody build() {
            return new DescribeDailyAsyncJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDailyAsyncJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDailyAsyncJobResponseBody</p>
     */
    public static class DailyJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("JobCount")
        private Integer jobCount;

        private DailyJobList(Builder builder) {
            this.date = builder.date;
            this.jobCount = builder.jobCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyJobList create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return jobCount
         */
        public Integer getJobCount() {
            return this.jobCount;
        }

        public static final class Builder {
            private String date; 
            private Integer jobCount; 

            private Builder() {
            } 

            private Builder(DailyJobList model) {
                this.date = model.date;
                this.jobCount = model.jobCount;
            } 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * JobCount.
             */
            public Builder jobCount(Integer jobCount) {
                this.jobCount = jobCount;
                return this;
            }

            public DailyJobList build() {
                return new DailyJobList(this);
            } 

        } 

    }
}
