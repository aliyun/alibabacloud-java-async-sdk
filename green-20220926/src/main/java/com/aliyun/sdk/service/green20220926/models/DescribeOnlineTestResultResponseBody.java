// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link DescribeOnlineTestResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOnlineTestResultResponseBody</p>
 */
public class DescribeOnlineTestResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AudioData")
    private AudioData audioData;

    @com.aliyun.core.annotation.NameInMap("FrameData")
    private FrameData frameData;

    @com.aliyun.core.annotation.NameInMap("ModerationTime")
    private String moderationTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.NameInMap("SummaryList")
    private java.util.List<SummaryList> summaryList;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private DescribeOnlineTestResultResponseBody(Builder builder) {
        this.audioData = builder.audioData;
        this.frameData = builder.frameData;
        this.moderationTime = builder.moderationTime;
        this.requestId = builder.requestId;
        this.riskLevel = builder.riskLevel;
        this.serviceCode = builder.serviceCode;
        this.summaryList = builder.summaryList;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnlineTestResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioData
     */
    public AudioData getAudioData() {
        return this.audioData;
    }

    /**
     * @return frameData
     */
    public FrameData getFrameData() {
        return this.frameData;
    }

    /**
     * @return moderationTime
     */
    public String getModerationTime() {
        return this.moderationTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return summaryList
     */
    public java.util.List<SummaryList> getSummaryList() {
        return this.summaryList;
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

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private AudioData audioData; 
        private FrameData frameData; 
        private String moderationTime; 
        private String requestId; 
        private String riskLevel; 
        private String serviceCode; 
        private java.util.List<SummaryList> summaryList; 
        private String taskId; 
        private String taskStatus; 
        private String url; 

        private Builder() {
        } 

        private Builder(DescribeOnlineTestResultResponseBody model) {
            this.audioData = model.audioData;
            this.frameData = model.frameData;
            this.moderationTime = model.moderationTime;
            this.requestId = model.requestId;
            this.riskLevel = model.riskLevel;
            this.serviceCode = model.serviceCode;
            this.summaryList = model.summaryList;
            this.taskId = model.taskId;
            this.taskStatus = model.taskStatus;
            this.url = model.url;
        } 

        /**
         * AudioData.
         */
        public Builder audioData(AudioData audioData) {
            this.audioData = audioData;
            return this;
        }

        /**
         * FrameData.
         */
        public Builder frameData(FrameData frameData) {
            this.frameData = frameData;
            return this;
        }

        /**
         * ModerationTime.
         */
        public Builder moderationTime(String moderationTime) {
            this.moderationTime = moderationTime;
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
         * RiskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * SummaryList.
         */
        public Builder summaryList(java.util.List<SummaryList> summaryList) {
            this.summaryList = summaryList;
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

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public DescribeOnlineTestResultResponseBody build() {
            return new DescribeOnlineTestResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOnlineTestResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOnlineTestResultResponseBody</p>
     */
    public static class AudioData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private AudioData(Builder builder) {
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioData create() {
            return builder().build();
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(AudioData model) {
                this.timeStamp = model.timeStamp;
            } 

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public AudioData build() {
                return new AudioData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOnlineTestResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOnlineTestResultResponseBody</p>
     */
    public static class FrameData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private FrameData(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameData create() {
            return builder().build();
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String timeStamp; 
            private String url; 

            private Builder() {
            } 

            private Builder(FrameData model) {
                this.timeStamp = model.timeStamp;
                this.url = model.url;
            } 

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public FrameData build() {
                return new FrameData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOnlineTestResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOnlineTestResultResponseBody</p>
     */
    public static class SummaryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskLevelSummary")
        private java.util.Map<String, Long> riskLevelSummary;

        @com.aliyun.core.annotation.NameInMap("SliceCount")
        private Integer sliceCount;

        private SummaryList(Builder builder) {
            this.resourceType = builder.resourceType;
            this.riskLevel = builder.riskLevel;
            this.riskLevelSummary = builder.riskLevelSummary;
            this.sliceCount = builder.sliceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryList create() {
            return builder().build();
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskLevelSummary
         */
        public java.util.Map<String, Long> getRiskLevelSummary() {
            return this.riskLevelSummary;
        }

        /**
         * @return sliceCount
         */
        public Integer getSliceCount() {
            return this.sliceCount;
        }

        public static final class Builder {
            private String resourceType; 
            private String riskLevel; 
            private java.util.Map<String, Long> riskLevelSummary; 
            private Integer sliceCount; 

            private Builder() {
            } 

            private Builder(SummaryList model) {
                this.resourceType = model.resourceType;
                this.riskLevel = model.riskLevel;
                this.riskLevelSummary = model.riskLevelSummary;
                this.sliceCount = model.sliceCount;
            } 

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * RiskLevelSummary.
             */
            public Builder riskLevelSummary(java.util.Map<String, Long> riskLevelSummary) {
                this.riskLevelSummary = riskLevelSummary;
                return this;
            }

            /**
             * SliceCount.
             */
            public Builder sliceCount(Integer sliceCount) {
                this.sliceCount = sliceCount;
                return this;
            }

            public SummaryList build() {
                return new SummaryList(this);
            } 

        } 

    }
}
