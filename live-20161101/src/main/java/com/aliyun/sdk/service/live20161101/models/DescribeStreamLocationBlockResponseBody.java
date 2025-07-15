// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeStreamLocationBlockResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStreamLocationBlockResponseBody</p>
 */
public class DescribeStreamLocationBlockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamBlockList")
    private StreamBlockList streamBlockList;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeStreamLocationBlockResponseBody(Builder builder) {
        this.count = builder.count;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.streamBlockList = builder.streamBlockList;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStreamLocationBlockResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamBlockList
     */
    public StreamBlockList getStreamBlockList() {
        return this.streamBlockList;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Integer count; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private StreamBlockList streamBlockList; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeStreamLocationBlockResponseBody model) {
            this.count = model.count;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.streamBlockList = model.streamBlockList;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The total number of entries that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7C69682-7F88-40DD-A198-10D0309E439B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations.</p>
         */
        public Builder streamBlockList(StreamBlockList streamBlockList) {
            this.streamBlockList = streamBlockList;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeStreamLocationBlockResponseBody build() {
            return new DescribeStreamLocationBlockResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStreamLocationBlockResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStreamLocationBlockResponseBody</p>
     */
    public static class StreamBlock extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BlockType")
        private String blockType;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("LocationList")
        private String locationList;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private StreamBlock(Builder builder) {
            this.appName = builder.appName;
            this.blockType = builder.blockType;
            this.domainName = builder.domainName;
            this.locationList = builder.locationList;
            this.releaseTime = builder.releaseTime;
            this.status = builder.status;
            this.streamName = builder.streamName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamBlock create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return blockType
         */
        public String getBlockType() {
            return this.blockType;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return locationList
         */
        public String getLocationList() {
            return this.locationList;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String appName; 
            private String blockType; 
            private String domainName; 
            private String locationList; 
            private String releaseTime; 
            private Integer status; 
            private String streamName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(StreamBlock model) {
                this.appName = model.appName;
                this.blockType = model.blockType;
                this.domainName = model.domainName;
                this.locationList = model.locationList;
                this.releaseTime = model.releaseTime;
                this.status = model.status;
                this.streamName = model.streamName;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The name of the application in which the blocking applies.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The blocking type. Valid values:</p>
             * <ul>
             * <li>blacklist</li>
             * <li>whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>blacklist</p>
             */
            public Builder blockType(String blockType) {
                this.blockType = blockType;
                return this;
            }

            /**
             * <p>The accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The blocked region. If multiple regions are specified, such as CN and AS, they are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder locationList(String locationList) {
                this.locationList = locationList;
                return this;
            }

            /**
             * <p>The time when the blocking ends. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-13T09:27Z</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The blocking status. Valid values: 0 (not started), 1 (blocking), 2 (successful), 3 (failed), 4 (expired), and 5 (deleting).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>stream</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The time when the configuration was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-14T09:27Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public StreamBlock build() {
                return new StreamBlock(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeStreamLocationBlockResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStreamLocationBlockResponseBody</p>
     */
    public static class StreamBlockList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StreamBlock")
        private java.util.List<StreamBlock> streamBlock;

        private StreamBlockList(Builder builder) {
            this.streamBlock = builder.streamBlock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamBlockList create() {
            return builder().build();
        }

        /**
         * @return streamBlock
         */
        public java.util.List<StreamBlock> getStreamBlock() {
            return this.streamBlock;
        }

        public static final class Builder {
            private java.util.List<StreamBlock> streamBlock; 

            private Builder() {
            } 

            private Builder(StreamBlockList model) {
                this.streamBlock = model.streamBlock;
            } 

            /**
             * StreamBlock.
             */
            public Builder streamBlock(java.util.List<StreamBlock> streamBlock) {
                this.streamBlock = streamBlock;
                return this;
            }

            public StreamBlockList build() {
                return new StreamBlockList(this);
            } 

        } 

    }
}
