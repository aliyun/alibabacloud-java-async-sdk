// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetReserveTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetReserveTaskDetailResponseBody</p>
 */
public class GetReserveTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.NameInMap("CurrCompletedSessionCapacity")
    private Integer currCompletedSessionCapacity;

    @com.aliyun.core.annotation.NameInMap("DistrictId")
    private String districtId;

    @com.aliyun.core.annotation.NameInMap("ExpectResourceReadyTime")
    private String expectResourceReadyTime;

    @com.aliyun.core.annotation.NameInMap("ExpectSessionCapacity")
    private Integer expectSessionCapacity;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResBatchList")
    private java.util.List < ResBatchList> resBatchList;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    private GetReserveTaskDetailResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.currCompletedSessionCapacity = builder.currCompletedSessionCapacity;
        this.districtId = builder.districtId;
        this.expectResourceReadyTime = builder.expectResourceReadyTime;
        this.expectSessionCapacity = builder.expectSessionCapacity;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.resBatchList = builder.resBatchList;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReserveTaskDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return currCompletedSessionCapacity
     */
    public Integer getCurrCompletedSessionCapacity() {
        return this.currCompletedSessionCapacity;
    }

    /**
     * @return districtId
     */
    public String getDistrictId() {
        return this.districtId;
    }

    /**
     * @return expectResourceReadyTime
     */
    public String getExpectResourceReadyTime() {
        return this.expectResourceReadyTime;
    }

    /**
     * @return expectSessionCapacity
     */
    public Integer getExpectSessionCapacity() {
        return this.expectSessionCapacity;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resBatchList
     */
    public java.util.List < ResBatchList> getResBatchList() {
        return this.resBatchList;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder {
        private String appId; 
        private String appVersion; 
        private Integer currCompletedSessionCapacity; 
        private String districtId; 
        private String expectResourceReadyTime; 
        private Integer expectSessionCapacity; 
        private String projectId; 
        private String requestId; 
        private java.util.List < ResBatchList> resBatchList; 
        private String taskId; 
        private String taskStatus; 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        /**
         * CurrCompletedSessionCapacity.
         */
        public Builder currCompletedSessionCapacity(Integer currCompletedSessionCapacity) {
            this.currCompletedSessionCapacity = currCompletedSessionCapacity;
            return this;
        }

        /**
         * DistrictId.
         */
        public Builder districtId(String districtId) {
            this.districtId = districtId;
            return this;
        }

        /**
         * ExpectResourceReadyTime.
         */
        public Builder expectResourceReadyTime(String expectResourceReadyTime) {
            this.expectResourceReadyTime = expectResourceReadyTime;
            return this;
        }

        /**
         * ExpectSessionCapacity.
         */
        public Builder expectSessionCapacity(Integer expectSessionCapacity) {
            this.expectSessionCapacity = expectSessionCapacity;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
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
         * ResBatchList.
         */
        public Builder resBatchList(java.util.List < ResBatchList> resBatchList) {
            this.resBatchList = resBatchList;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public GetReserveTaskDetailResponseBody build() {
            return new GetReserveTaskDetailResponseBody(this);
        } 

    } 

    public static class ResBatchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResBatchId")
        private String resBatchId;

        @com.aliyun.core.annotation.NameInMap("ResBatchTagName")
        private String resBatchTagName;

        private ResBatchList(Builder builder) {
            this.resBatchId = builder.resBatchId;
            this.resBatchTagName = builder.resBatchTagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResBatchList create() {
            return builder().build();
        }

        /**
         * @return resBatchId
         */
        public String getResBatchId() {
            return this.resBatchId;
        }

        /**
         * @return resBatchTagName
         */
        public String getResBatchTagName() {
            return this.resBatchTagName;
        }

        public static final class Builder {
            private String resBatchId; 
            private String resBatchTagName; 

            /**
             * ResBatchId.
             */
            public Builder resBatchId(String resBatchId) {
                this.resBatchId = resBatchId;
                return this;
            }

            /**
             * ResBatchTagName.
             */
            public Builder resBatchTagName(String resBatchTagName) {
                this.resBatchTagName = resBatchTagName;
                return this;
            }

            public ResBatchList build() {
                return new ResBatchList(this);
            } 

        } 

    }
}
