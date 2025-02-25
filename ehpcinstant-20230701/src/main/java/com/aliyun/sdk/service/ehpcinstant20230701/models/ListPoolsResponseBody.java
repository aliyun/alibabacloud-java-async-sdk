// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link ListPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPoolsResponseBody</p>
 */
public class ListPoolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PoolList")
    private java.util.List<PoolList> poolList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListPoolsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.poolList = builder.poolList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoolsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return poolList
     */
    public java.util.List<PoolList> getPoolList() {
        return this.poolList;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<PoolList> poolList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * PoolList.
         */
        public Builder poolList(java.util.List<PoolList> poolList) {
            this.poolList = poolList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPoolsResponseBody build() {
            return new ListPoolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPoolsResponseBody</p>
     */
    public static class PoolList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("MaxExectorNum")
        private Integer maxExectorNum;

        @com.aliyun.core.annotation.NameInMap("PoolName")
        private String poolName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PoolList(Builder builder) {
            this.isDefault = builder.isDefault;
            this.maxExectorNum = builder.maxExectorNum;
            this.poolName = builder.poolName;
            this.priority = builder.priority;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PoolList create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return maxExectorNum
         */
        public Integer getMaxExectorNum() {
            return this.maxExectorNum;
        }

        /**
         * @return poolName
         */
        public String getPoolName() {
            return this.poolName;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean isDefault; 
            private Integer maxExectorNum; 
            private String poolName; 
            private Integer priority; 
            private String status; 

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * MaxExectorNum.
             */
            public Builder maxExectorNum(Integer maxExectorNum) {
                this.maxExectorNum = maxExectorNum;
                return this;
            }

            /**
             * PoolName.
             */
            public Builder poolName(String poolName) {
                this.poolName = poolName;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PoolList build() {
                return new PoolList(this);
            } 

        } 

    }
}
