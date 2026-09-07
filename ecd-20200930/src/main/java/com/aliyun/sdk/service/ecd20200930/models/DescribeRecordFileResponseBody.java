// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeRecordFileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordFileResponseBody</p>
 */
public class DescribeRecordFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordFiles")
    private java.util.List<RecordFiles> recordFiles;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRecordFileResponseBody(Builder builder) {
        this.recordFiles = builder.recordFiles;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordFiles
     */
    public java.util.List<RecordFiles> getRecordFiles() {
        return this.recordFiles;
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
        private java.util.List<RecordFiles> recordFiles; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRecordFileResponseBody model) {
            this.recordFiles = model.recordFiles;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of the recording files.</p>
         */
        public Builder recordFiles(java.util.List<RecordFiles> recordFiles) {
            this.recordFiles = recordFiles;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>05C2791F-41A7-5E7C-B5E4-1401FD0E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRecordFileResponseBody build() {
            return new DescribeRecordFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecordFileResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordFileResponseBody</p>
     */
    public static class EventDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Integer eventTime;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        private EventDetails(Builder builder) {
            this.eventName = builder.eventName;
            this.eventTime = builder.eventTime;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventDetails create() {
            return builder().build();
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventTime
         */
        public Integer getEventTime() {
            return this.eventTime;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private String eventName; 
            private Integer eventTime; 
            private String eventType; 

            private Builder() {
            } 

            private Builder(EventDetails model) {
                this.eventName = model.eventName;
                this.eventTime = model.eventTime;
                this.eventType = model.eventType;
            } 

            /**
             * <p>The event details.</p>
             * 
             * <strong>example:</strong>
             * <p>{\n\t\&quot;messageInfo\&quot; : \&quot;mouse_move\&quot;,\n\t\&quot;messageType\&quot; : \&quot;UserInput\&quot;\n}\n&quot;</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The time when the event occurred. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder eventTime(Integer eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>UserInput</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            public EventDetails build() {
                return new EventDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecordFileResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordFileResponseBody</p>
     */
    public static class RecordFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EventDetails")
        private java.util.List<EventDetails> eventDetails;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("RecordEndTime")
        private String recordEndTime;

        @com.aliyun.core.annotation.NameInMap("RecordExpire")
        private Long recordExpire;

        @com.aliyun.core.annotation.NameInMap("RecordStartTime")
        private String recordStartTime;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private Integer recordType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private RecordFiles(Builder builder) {
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.endUserId = builder.endUserId;
            this.eventDetails = builder.eventDetails;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.policyId = builder.policyId;
            this.recordEndTime = builder.recordEndTime;
            this.recordExpire = builder.recordExpire;
            this.recordStartTime = builder.recordStartTime;
            this.recordType = builder.recordType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFiles create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return eventDetails
         */
        public java.util.List<EventDetails> getEventDetails() {
            return this.eventDetails;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return recordEndTime
         */
        public String getRecordEndTime() {
            return this.recordEndTime;
        }

        /**
         * @return recordExpire
         */
        public Long getRecordExpire() {
            return this.recordExpire;
        }

        /**
         * @return recordStartTime
         */
        public String getRecordStartTime() {
            return this.recordStartTime;
        }

        /**
         * @return recordType
         */
        public Integer getRecordType() {
            return this.recordType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String desktopId; 
            private String desktopName; 
            private String endUserId; 
            private java.util.List<EventDetails> eventDetails; 
            private String fileName; 
            private Long fileSize; 
            private String policyId; 
            private String recordEndTime; 
            private Long recordExpire; 
            private String recordStartTime; 
            private Integer recordType; 
            private String regionId; 
            private String resourceGroupId; 
            private String resourceGroupName; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(RecordFiles model) {
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.endUserId = model.endUserId;
                this.eventDetails = model.eventDetails;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.policyId = model.policyId;
                this.recordEndTime = model.recordEndTime;
                this.recordExpire = model.recordExpire;
                this.recordStartTime = model.recordStartTime;
                this.recordType = model.recordType;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
                this.status = model.status;
            } 

            /**
             * <p>The Cloud Desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-7yulhw1g1attet7d2</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The name of the Cloud Desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>fvt-ecd</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The name of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The event details.</p>
             */
            public Builder eventDetails(java.util.List<EventDetails> eventDetails) {
                this.eventDetails = eventDetails;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>Task3</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The size of the file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>139</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The ID of the control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-**</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The time when the recording ended. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-18T06:02:25Z</p>
             */
            public Builder recordEndTime(String recordEndTime) {
                this.recordEndTime = recordEndTime;
                return this;
            }

            /**
             * <p>The expiration time of the screen recording file.</p>
             * 
             * <strong>example:</strong>
             * <p>1774656000000</p>
             */
            public Builder recordExpire(Long recordExpire) {
                this.recordExpire = recordExpire;
                return this;
            }

            /**
             * <p>The time when the recording started. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-18T06:02:25Z</p>
             */
            public Builder recordStartTime(String recordStartTime) {
                this.recordStartTime = recordStartTime;
                return this;
            }

            /**
             * <p>The type of the screen recording file. Valid values:</p>
             * <ul>
             * <li>alltime: full-time recording.</li>
             * <li>period: interval recording.</li>
             * <li>event: event-based recording.</li>
             * <li>session: session recording.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder recordType(Integer recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * <p>The region where the recorded Cloud Desktop is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-f3s3dgt8dtb0vlqc8</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>resource</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The status of the screen recording file. Valid values:</p>
             * <ul>
             * <li>0: uploaded.</li>
             * <li>1: uploading.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public RecordFiles build() {
                return new RecordFiles(this);
            } 

        } 

    }
}
