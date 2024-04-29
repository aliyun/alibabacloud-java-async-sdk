// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopOversoldGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopOversoldGroupResponseBody</p>
 */
public class DescribeDesktopOversoldGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDesktopOversoldGroupResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopOversoldGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < Data> data; 
        private String nextToken; 
        private String requestId; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDesktopOversoldGroupResponseBody build() {
            return new DescribeDesktopOversoldGroupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrenceCount")
        private Integer concurrenceCount;

        @com.aliyun.core.annotation.NameInMap("CurConcurrenceCount")
        private Integer curConcurrenceCount;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesktopType")
        private String desktopType;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("IdleDisconnectDuration")
        private String idleDisconnectDuration;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("KeepDuration")
        private String keepDuration;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OversoldGroupId")
        private String oversoldGroupId;

        @com.aliyun.core.annotation.NameInMap("OversoldUserCount")
        private Integer oversoldUserCount;

        @com.aliyun.core.annotation.NameInMap("OversoldWarn")
        private Integer oversoldWarn;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("SaleStatus")
        private String saleStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StopDuration")
        private Long stopDuration;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        private Data(Builder builder) {
            this.concurrenceCount = builder.concurrenceCount;
            this.curConcurrenceCount = builder.curConcurrenceCount;
            this.dataDiskSize = builder.dataDiskSize;
            this.description = builder.description;
            this.desktopType = builder.desktopType;
            this.directoryId = builder.directoryId;
            this.expireTime = builder.expireTime;
            this.idleDisconnectDuration = builder.idleDisconnectDuration;
            this.imageId = builder.imageId;
            this.keepDuration = builder.keepDuration;
            this.name = builder.name;
            this.oversoldGroupId = builder.oversoldGroupId;
            this.oversoldUserCount = builder.oversoldUserCount;
            this.oversoldWarn = builder.oversoldWarn;
            this.policyGroupId = builder.policyGroupId;
            this.saleStatus = builder.saleStatus;
            this.status = builder.status;
            this.stopDuration = builder.stopDuration;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return concurrenceCount
         */
        public Integer getConcurrenceCount() {
            return this.concurrenceCount;
        }

        /**
         * @return curConcurrenceCount
         */
        public Integer getCurConcurrenceCount() {
            return this.curConcurrenceCount;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return desktopType
         */
        public String getDesktopType() {
            return this.desktopType;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return idleDisconnectDuration
         */
        public String getIdleDisconnectDuration() {
            return this.idleDisconnectDuration;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return keepDuration
         */
        public String getKeepDuration() {
            return this.keepDuration;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return oversoldGroupId
         */
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

        /**
         * @return oversoldUserCount
         */
        public Integer getOversoldUserCount() {
            return this.oversoldUserCount;
        }

        /**
         * @return oversoldWarn
         */
        public Integer getOversoldWarn() {
            return this.oversoldWarn;
        }

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        /**
         * @return saleStatus
         */
        public String getSaleStatus() {
            return this.saleStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stopDuration
         */
        public Long getStopDuration() {
            return this.stopDuration;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private Integer concurrenceCount; 
            private Integer curConcurrenceCount; 
            private Integer dataDiskSize; 
            private String description; 
            private String desktopType; 
            private String directoryId; 
            private String expireTime; 
            private String idleDisconnectDuration; 
            private String imageId; 
            private String keepDuration; 
            private String name; 
            private String oversoldGroupId; 
            private Integer oversoldUserCount; 
            private Integer oversoldWarn; 
            private String policyGroupId; 
            private String saleStatus; 
            private String status; 
            private Long stopDuration; 
            private Integer systemDiskSize; 

            /**
             * ConcurrenceCount.
             */
            public Builder concurrenceCount(Integer concurrenceCount) {
                this.concurrenceCount = concurrenceCount;
                return this;
            }

            /**
             * CurConcurrenceCount.
             */
            public Builder curConcurrenceCount(Integer curConcurrenceCount) {
                this.curConcurrenceCount = curConcurrenceCount;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DesktopType.
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * IdleDisconnectDuration.
             */
            public Builder idleDisconnectDuration(String idleDisconnectDuration) {
                this.idleDisconnectDuration = idleDisconnectDuration;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * KeepDuration.
             */
            public Builder keepDuration(String keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OversoldGroupId.
             */
            public Builder oversoldGroupId(String oversoldGroupId) {
                this.oversoldGroupId = oversoldGroupId;
                return this;
            }

            /**
             * OversoldUserCount.
             */
            public Builder oversoldUserCount(Integer oversoldUserCount) {
                this.oversoldUserCount = oversoldUserCount;
                return this;
            }

            /**
             * OversoldWarn.
             */
            public Builder oversoldWarn(Integer oversoldWarn) {
                this.oversoldWarn = oversoldWarn;
                return this;
            }

            /**
             * PolicyGroupId.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * SaleStatus.
             */
            public Builder saleStatus(String saleStatus) {
                this.saleStatus = saleStatus;
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
             * StopDuration.
             */
            public Builder stopDuration(Long stopDuration) {
                this.stopDuration = stopDuration;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
