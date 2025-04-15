// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeCloudNotesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudNotesResponseBody</p>
 */
public class DescribeCloudNotesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCnt")
    private Integer totalCnt;

    private DescribeCloudNotesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCnt = builder.totalCnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudNotesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCnt
     */
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCnt; 

        private Builder() {
        } 

        private Builder(DescribeCloudNotesResponseBody model) {
            this.items = model.items;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCnt = model.totalCnt;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>154EF5DE-3D08-1F2C-A482-281F78D74B7C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCnt.
         */
        public Builder totalCnt(Integer totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }

        public DescribeCloudNotesResponseBody build() {
            return new DescribeCloudNotesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudNotesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudNotesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoChaptersFilePath")
        private String autoChaptersFilePath;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("CustomPromptFilePath")
        private String customPromptFilePath;

        @com.aliyun.core.annotation.NameInMap("MeetingAssistanceFilePath")
        private String meetingAssistanceFilePath;

        @com.aliyun.core.annotation.NameInMap("Region")
        private Integer region;

        @com.aliyun.core.annotation.NameInMap("ServiceInspectionFilePath")
        private String serviceInspectionFilePath;

        @com.aliyun.core.annotation.NameInMap("StartTs")
        private Long startTs;

        @com.aliyun.core.annotation.NameInMap("SummarizationFilePath")
        private String summarizationFilePath;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TextPolishFilePath")
        private String textPolishFilePath;

        @com.aliyun.core.annotation.NameInMap("TranscriptionFilePath")
        private String transcriptionFilePath;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private Items(Builder builder) {
            this.autoChaptersFilePath = builder.autoChaptersFilePath;
            this.bucket = builder.bucket;
            this.channelId = builder.channelId;
            this.customPromptFilePath = builder.customPromptFilePath;
            this.meetingAssistanceFilePath = builder.meetingAssistanceFilePath;
            this.region = builder.region;
            this.serviceInspectionFilePath = builder.serviceInspectionFilePath;
            this.startTs = builder.startTs;
            this.summarizationFilePath = builder.summarizationFilePath;
            this.taskId = builder.taskId;
            this.textPolishFilePath = builder.textPolishFilePath;
            this.transcriptionFilePath = builder.transcriptionFilePath;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return autoChaptersFilePath
         */
        public String getAutoChaptersFilePath() {
            return this.autoChaptersFilePath;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return customPromptFilePath
         */
        public String getCustomPromptFilePath() {
            return this.customPromptFilePath;
        }

        /**
         * @return meetingAssistanceFilePath
         */
        public String getMeetingAssistanceFilePath() {
            return this.meetingAssistanceFilePath;
        }

        /**
         * @return region
         */
        public Integer getRegion() {
            return this.region;
        }

        /**
         * @return serviceInspectionFilePath
         */
        public String getServiceInspectionFilePath() {
            return this.serviceInspectionFilePath;
        }

        /**
         * @return startTs
         */
        public Long getStartTs() {
            return this.startTs;
        }

        /**
         * @return summarizationFilePath
         */
        public String getSummarizationFilePath() {
            return this.summarizationFilePath;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return textPolishFilePath
         */
        public String getTextPolishFilePath() {
            return this.textPolishFilePath;
        }

        /**
         * @return transcriptionFilePath
         */
        public String getTranscriptionFilePath() {
            return this.transcriptionFilePath;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String autoChaptersFilePath; 
            private String bucket; 
            private String channelId; 
            private String customPromptFilePath; 
            private String meetingAssistanceFilePath; 
            private Integer region; 
            private String serviceInspectionFilePath; 
            private Long startTs; 
            private String summarizationFilePath; 
            private String taskId; 
            private String textPolishFilePath; 
            private String transcriptionFilePath; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.autoChaptersFilePath = model.autoChaptersFilePath;
                this.bucket = model.bucket;
                this.channelId = model.channelId;
                this.customPromptFilePath = model.customPromptFilePath;
                this.meetingAssistanceFilePath = model.meetingAssistanceFilePath;
                this.region = model.region;
                this.serviceInspectionFilePath = model.serviceInspectionFilePath;
                this.startTs = model.startTs;
                this.summarizationFilePath = model.summarizationFilePath;
                this.taskId = model.taskId;
                this.textPolishFilePath = model.textPolishFilePath;
                this.transcriptionFilePath = model.transcriptionFilePath;
                this.vendor = model.vendor;
            } 

            /**
             * AutoChaptersFilePath.
             */
            public Builder autoChaptersFilePath(String autoChaptersFilePath) {
                this.autoChaptersFilePath = autoChaptersFilePath;
                return this;
            }

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * CustomPromptFilePath.
             */
            public Builder customPromptFilePath(String customPromptFilePath) {
                this.customPromptFilePath = customPromptFilePath;
                return this;
            }

            /**
             * MeetingAssistanceFilePath.
             */
            public Builder meetingAssistanceFilePath(String meetingAssistanceFilePath) {
                this.meetingAssistanceFilePath = meetingAssistanceFilePath;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(Integer region) {
                this.region = region;
                return this;
            }

            /**
             * ServiceInspectionFilePath.
             */
            public Builder serviceInspectionFilePath(String serviceInspectionFilePath) {
                this.serviceInspectionFilePath = serviceInspectionFilePath;
                return this;
            }

            /**
             * StartTs.
             */
            public Builder startTs(Long startTs) {
                this.startTs = startTs;
                return this;
            }

            /**
             * SummarizationFilePath.
             */
            public Builder summarizationFilePath(String summarizationFilePath) {
                this.summarizationFilePath = summarizationFilePath;
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
             * TextPolishFilePath.
             */
            public Builder textPolishFilePath(String textPolishFilePath) {
                this.textPolishFilePath = textPolishFilePath;
                return this;
            }

            /**
             * TranscriptionFilePath.
             */
            public Builder transcriptionFilePath(String transcriptionFilePath) {
                this.transcriptionFilePath = transcriptionFilePath;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
