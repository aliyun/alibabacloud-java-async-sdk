// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomBlockRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomBlockRecordsResponseBody</p>
 */
public class DescribeCustomBlockRecordsResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RecordList")
    private java.util.List < RecordList> recordList;

    @NameInMap("RequestId")
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

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return recordList
     */
    public java.util.List < RecordList> getRecordList() {
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
        private java.util.List < RecordList> recordList; 
        private String requestId; 

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RecordList.
         */
        public Builder recordList(java.util.List < RecordList> recordList) {
            this.recordList = recordList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomBlockRecordsResponseBody build() {
            return new DescribeCustomBlockRecordsResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * TotalCount.
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
    public static class TargetList extends TeaModel {
        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
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

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * TargetType.
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
    public static class RecordList extends TeaModel {
        @NameInMap("BlockExpireDate")
        private Long blockExpireDate;

        @NameInMap("BlockIp")
        private String blockIp;

        @NameInMap("Bound")
        private String bound;

        @NameInMap("EnableCount")
        private Integer enableCount;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ServerCount")
        private Integer serverCount;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TargetList")
        private java.util.List < TargetList> targetList;

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
        public java.util.List < TargetList> getTargetList() {
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
            private java.util.List < TargetList> targetList; 

            /**
             * BlockExpireDate.
             */
            public Builder blockExpireDate(Long blockExpireDate) {
                this.blockExpireDate = blockExpireDate;
                return this;
            }

            /**
             * BlockIp.
             */
            public Builder blockIp(String blockIp) {
                this.blockIp = blockIp;
                return this;
            }

            /**
             * Bound.
             */
            public Builder bound(String bound) {
                this.bound = bound;
                return this;
            }

            /**
             * EnableCount.
             */
            public Builder enableCount(Integer enableCount) {
                this.enableCount = enableCount;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ServerCount.
             */
            public Builder serverCount(Integer serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TargetList.
             */
            public Builder targetList(java.util.List < TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            public RecordList build() {
                return new RecordList(this);
            } 

        } 

    }
}
