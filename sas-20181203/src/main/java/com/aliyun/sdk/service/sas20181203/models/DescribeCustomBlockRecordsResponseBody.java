// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCustomBlockRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomBlockRecordsResponseBody</p>
 */
public class DescribeCustomBlockRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RecordList")
    private java.util.List<RecordList> recordList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCustomBlockRecordsResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.recordList = builder.recordList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomBlockRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return recordList
     */
    public java.util.List<RecordList> getRecordList() {
        return this.recordList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List<RecordList> recordList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCustomBlockRecordsResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.recordList = model.recordList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>An array that consists of the defense rules.</p>
         */
        public Builder recordList(java.util.List<RecordList> recordList) {
            this.recordList = recordList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>028CF634-5268-5660-9575-48C9ED6B7T8Y</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomBlockRecordsResponseBody build() {
            return new DescribeCustomBlockRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomBlockRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomBlockRecordsResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>708</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomBlockRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomBlockRecordsResponseBody</p>
     */
    public static class TargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private TargetList(Builder builder) {
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetList create() {
            return builder().build();
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String target; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(TargetList model) {
                this.target = model.target;
                this.targetType = model.targetType;
            } 

            /**
             * <p>The ID of the destination asset.</p>
             * 
             * <strong>example:</strong>
             * <p>032b618f-b220-4a0d-bd37-fbdc6*******</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The type of the query. Valid values:</p>
             * <ul>
             * <li>Set the value to <strong>uuid</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>uuid</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public TargetList build() {
                return new TargetList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomBlockRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomBlockRecordsResponseBody</p>
     */
    public static class RecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockExpireDate")
        private Long blockExpireDate;

        @com.aliyun.core.annotation.NameInMap("BlockIp")
        private String blockIp;

        @com.aliyun.core.annotation.NameInMap("Bound")
        private String bound;

        @com.aliyun.core.annotation.NameInMap("EnableCount")
        private Integer enableCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ServerCount")
        private Integer serverCount;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TargetList")
        private java.util.List<TargetList> targetList;

        private RecordList(Builder builder) {
            this.blockExpireDate = builder.blockExpireDate;
            this.blockIp = builder.blockIp;
            this.bound = builder.bound;
            this.enableCount = builder.enableCount;
            this.id = builder.id;
            this.serverCount = builder.serverCount;
            this.source = builder.source;
            this.status = builder.status;
            this.targetList = builder.targetList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordList create() {
            return builder().build();
        }

        /**
         * @return blockExpireDate
         */
        public Long getBlockExpireDate() {
            return this.blockExpireDate;
        }

        /**
         * @return blockIp
         */
        public String getBlockIp() {
            return this.blockIp;
        }

        /**
         * @return bound
         */
        public String getBound() {
            return this.bound;
        }

        /**
         * @return enableCount
         */
        public Integer getEnableCount() {
            return this.enableCount;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return serverCount
         */
        public Integer getServerCount() {
            return this.serverCount;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return targetList
         */
        public java.util.List<TargetList> getTargetList() {
            return this.targetList;
        }

        public static final class Builder {
            private Long blockExpireDate; 
            private String blockIp; 
            private String bound; 
            private Integer enableCount; 
            private Long id; 
            private Integer serverCount; 
            private String source; 
            private Integer status; 
            private java.util.List<TargetList> targetList; 

            private Builder() {
            } 

            private Builder(RecordList model) {
                this.blockExpireDate = model.blockExpireDate;
                this.blockIp = model.blockIp;
                this.bound = model.bound;
                this.enableCount = model.enableCount;
                this.id = model.id;
                this.serverCount = model.serverCount;
                this.source = model.source;
                this.status = model.status;
                this.targetList = model.targetList;
            } 

            /**
             * <p>The timestamp generated when the block action on the IP address becomes invalid.</p>
             * 
             * <strong>example:</strong>
             * <p>1671506882063</p>
             */
            public Builder blockExpireDate(Long blockExpireDate) {
                this.blockExpireDate = blockExpireDate;
                return this;
            }

            /**
             * <p>The blocked IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>45.227.XX.XX</p>
             */
            public Builder blockIp(String blockIp) {
                this.blockIp = blockIp;
                return this;
            }

            /**
             * <p>The direction of the traffic that is sent by the blocked IP address. Valid values:</p>
             * <ul>
             * <li><strong>in</strong></li>
             * <li><strong>out</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>in</p>
             */
            public Builder bound(String bound) {
                this.bound = bound;
                return this;
            }

            /**
             * <p>The number of servers for which the defense rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder enableCount(Integer enableCount) {
                this.enableCount = enableCount;
                return this;
            }

            /**
             * <p>The record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>353376</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The total number of servers on which the IP address is blocked.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder serverCount(Integer serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * <p>The source of the defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>UserRule</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status of the defense rule against brute-force attacks. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: invalid.</li>
             * <li><strong>1</strong>: enabled.</li>
             * <li><strong>2</strong>: failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The servers for which the defense rule is enabled.</p>
             */
            public Builder targetList(java.util.List<TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            public RecordList build() {
                return new RecordList(this);
            } 

        } 

    }
}
