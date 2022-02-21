// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamRecordIndexFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamRecordIndexFilesResponseBody</p>
 */
public class DescribeLiveStreamRecordIndexFilesResponseBody extends TeaModel {
    @NameInMap("Order")
    private String order;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RecordIndexInfoList")
    private RecordIndexInfoList recordIndexInfoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalNum")
    private Integer totalNum;

    @NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeLiveStreamRecordIndexFilesResponseBody(Builder builder) {
        this.order = builder.order;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.recordIndexInfoList = builder.recordIndexInfoList;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamRecordIndexFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return recordIndexInfoList
     */
    public RecordIndexInfoList getRecordIndexInfoList() {
        return this.recordIndexInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String order; 
        private Integer pageNum; 
        private Integer pageSize; 
        private RecordIndexInfoList recordIndexInfoList; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

        /**
         * Order.
         */
        public Builder order(String order) {
            this.order = order;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
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
         * RecordIndexInfoList.
         */
        public Builder recordIndexInfoList(RecordIndexInfoList recordIndexInfoList) {
            this.recordIndexInfoList = recordIndexInfoList;
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
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveStreamRecordIndexFilesResponseBody build() {
            return new DescribeLiveStreamRecordIndexFilesResponseBody(this);
        } 

    } 

    public static class RecordIndexInfo extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("OssBucket")
        private String ossBucket;

        @NameInMap("OssEndpoint")
        private String ossEndpoint;

        @NameInMap("OssObject")
        private String ossObject;

        @NameInMap("RecordId")
        private String recordId;

        @NameInMap("RecordUrl")
        private String recordUrl;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("Width")
        private Integer width;

        private RecordIndexInfo(Builder builder) {
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.height = builder.height;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.ossObject = builder.ossObject;
            this.recordId = builder.recordId;
            this.recordUrl = builder.recordUrl;
            this.startTime = builder.startTime;
            this.streamName = builder.streamName;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordIndexInfo create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossEndpoint
         */
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        /**
         * @return ossObject
         */
        public String getOssObject() {
            return this.ossObject;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return recordUrl
         */
        public String getRecordUrl() {
            return this.recordUrl;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String appName; 
            private String createTime; 
            private String domainName; 
            private Float duration; 
            private String endTime; 
            private Integer height; 
            private String ossBucket; 
            private String ossEndpoint; 
            private String ossObject; 
            private String recordId; 
            private String recordUrl; 
            private String startTime; 
            private String streamName; 
            private Integer width; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * OssBucket.
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * OssEndpoint.
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * OssObject.
             */
            public Builder ossObject(String ossObject) {
                this.ossObject = ossObject;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * RecordUrl.
             */
            public Builder recordUrl(String recordUrl) {
                this.recordUrl = recordUrl;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public RecordIndexInfo build() {
                return new RecordIndexInfo(this);
            } 

        } 

    }
    public static class RecordIndexInfoList extends TeaModel {
        @NameInMap("RecordIndexInfo")
        private java.util.List < RecordIndexInfo> recordIndexInfo;

        private RecordIndexInfoList(Builder builder) {
            this.recordIndexInfo = builder.recordIndexInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordIndexInfoList create() {
            return builder().build();
        }

        /**
         * @return recordIndexInfo
         */
        public java.util.List < RecordIndexInfo> getRecordIndexInfo() {
            return this.recordIndexInfo;
        }

        public static final class Builder {
            private java.util.List < RecordIndexInfo> recordIndexInfo; 

            /**
             * RecordIndexInfo.
             */
            public Builder recordIndexInfo(java.util.List < RecordIndexInfo> recordIndexInfo) {
                this.recordIndexInfo = recordIndexInfo;
                return this;
            }

            public RecordIndexInfoList build() {
                return new RecordIndexInfoList(this);
            } 

        } 

    }
}
