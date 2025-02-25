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
 * {@link ListJobInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobInfoResponseBody</p>
 */
public class ListJobInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobInfoList")
    private java.util.List<JobInfoList> jobInfoList;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListJobInfoResponseBody(Builder builder) {
        this.jobInfoList = builder.jobInfoList;
        this.jobType = builder.jobType;
        this.mediaId = builder.mediaId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobInfoList
     */
    public java.util.List<JobInfoList> getJobInfoList() {
        return this.jobInfoList;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<JobInfoList> jobInfoList; 
        private String jobType; 
        private String mediaId; 
        private String requestId; 

        /**
         * JobInfoList.
         */
        public Builder jobInfoList(java.util.List<JobInfoList> jobInfoList) {
            this.jobInfoList = jobInfoList;
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
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListJobInfoResponseBody build() {
            return new ListJobInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobInfoResponseBody</p>
     */
    public static class JobInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private JobInfoList(Builder builder) {
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.jobId = builder.jobId;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfoList create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String completeTime; 
            private String createTime; 
            private String jobId; 
            private String status; 
            private Long userId; 

            /**
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public JobInfoList build() {
                return new JobInfoList(this);
            } 

        } 

    }
}
