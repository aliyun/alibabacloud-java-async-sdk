// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarFsQuotaListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarFsQuotaListResponseBody</p>
 */
public class DescribePolarFsQuotaListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.NameInMap("QuotaItems")
    private java.util.List<QuotaItems> quotaItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribePolarFsQuotaListResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.quotaItems = builder.quotaItems;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarFsQuotaListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return quotaItems
     */
    public java.util.List<QuotaItems> getQuotaItems() {
        return this.quotaItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String pageNumber; 
        private String pageRecordCount; 
        private String pageSize; 
        private String polarFsInstanceId; 
        private java.util.List<QuotaItems> quotaItems; 
        private String requestId; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribePolarFsQuotaListResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.polarFsInstanceId = model.polarFsInstanceId;
            this.quotaItems = model.quotaItems;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The PolarFs instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-test****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>The directory quotas.</p>
         */
        public Builder quotaItems(java.util.List<QuotaItems> quotaItems) {
            this.quotaItems = quotaItems;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribePolarFsQuotaListResponseBody build() {
            return new DescribePolarFsQuotaListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarFsQuotaListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsQuotaListResponseBody</p>
     */
    public static class QuotaItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("Inodes")
        private Long inodes;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Long usedCapacity;

        @com.aliyun.core.annotation.NameInMap("UsedInodes")
        private Long usedInodes;

        private QuotaItems(Builder builder) {
            this.capacity = builder.capacity;
            this.inodes = builder.inodes;
            this.path = builder.path;
            this.usedCapacity = builder.usedCapacity;
            this.usedInodes = builder.usedInodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaItems create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return inodes
         */
        public Long getInodes() {
            return this.inodes;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return usedCapacity
         */
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        /**
         * @return usedInodes
         */
        public Long getUsedInodes() {
            return this.usedInodes;
        }

        public static final class Builder {
            private Long capacity; 
            private Long inodes; 
            private String path; 
            private Long usedCapacity; 
            private Long usedInodes; 

            private Builder() {
            } 

            private Builder(QuotaItems model) {
                this.capacity = model.capacity;
                this.inodes = model.inodes;
                this.path = model.path;
                this.usedCapacity = model.usedCapacity;
                this.usedInodes = model.usedInodes;
            } 

            /**
             * <p>The capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>1073741824</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>Inodes</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder inodes(Long inodes) {
                this.inodes = inodes;
                return this;
            }

            /**
             * <p>The directory path.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The used capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>104857600</p>
             */
            public Builder usedCapacity(Long usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            /**
             * <p>The number of used inodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usedInodes(Long usedInodes) {
                this.usedInodes = usedInodes;
                return this;
            }

            public QuotaItems build() {
                return new QuotaItems(this);
            } 

        } 

    }
}
