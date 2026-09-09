// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link QueryCostCenterResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCostCenterResponseBody</p>
 */
public class QueryCostCenterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CostCenterDtoList")
    private java.util.List<CostCenterDtoList> costCenterDtoList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private QueryCostCenterResponseBody(Builder builder) {
        this.costCenterDtoList = builder.costCenterDtoList;
        this.currentPage = builder.currentPage;
        this.metadata = builder.metadata;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostCenterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costCenterDtoList
     */
    public java.util.List<CostCenterDtoList> getCostCenterDtoList() {
        return this.costCenterDtoList;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CostCenterDtoList> costCenterDtoList; 
        private Integer currentPage; 
        private Object metadata; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(QueryCostCenterResponseBody model) {
            this.costCenterDtoList = model.costCenterDtoList;
            this.currentPage = model.currentPage;
            this.metadata = model.metadata;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of financial unit data.</p>
         */
        public Builder costCenterDtoList(java.util.List<CostCenterDtoList> costCenterDtoList) {
            this.costCenterDtoList = costCenterDtoList;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The metadata of the response struct.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryCostCenterResponseBody build() {
            return new QueryCostCenterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCostCenterResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostCenterResponseBody</p>
     */
    public static class CostCenterDtoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostCenterCode")
        private String costCenterCode;

        @com.aliyun.core.annotation.NameInMap("CostCenterId")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("CostCenterName")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
        private Long ownerAccountId;

        @com.aliyun.core.annotation.NameInMap("ParentCostCenterId")
        private Long parentCostCenterId;

        @com.aliyun.core.annotation.NameInMap("PrevCostCenterId")
        private Long prevCostCenterId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private CostCenterDtoList(Builder builder) {
            this.costCenterCode = builder.costCenterCode;
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.level = builder.level;
            this.ownerAccountId = builder.ownerAccountId;
            this.parentCostCenterId = builder.parentCostCenterId;
            this.prevCostCenterId = builder.prevCostCenterId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostCenterDtoList create() {
            return builder().build();
        }

        /**
         * @return costCenterCode
         */
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return ownerAccountId
         */
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        /**
         * @return parentCostCenterId
         */
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        /**
         * @return prevCostCenterId
         */
        public Long getPrevCostCenterId() {
            return this.prevCostCenterId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String costCenterCode; 
            private Long costCenterId; 
            private String costCenterName; 
            private Integer level; 
            private Long ownerAccountId; 
            private Long parentCostCenterId; 
            private Long prevCostCenterId; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(CostCenterDtoList model) {
                this.costCenterCode = model.costCenterCode;
                this.costCenterId = model.costCenterId;
                this.costCenterName = model.costCenterName;
                this.level = model.level;
                this.ownerAccountId = model.ownerAccountId;
                this.parentCostCenterId = model.parentCostCenterId;
                this.prevCostCenterId = model.prevCostCenterId;
                this.priority = model.priority;
            } 

            /**
             * <p>The code of the financial unit.</p>
             * 
             * <strong>example:</strong>
             * <p>15945703968#</p>
             */
            public Builder costCenterCode(String costCenterCode) {
                this.costCenterCode = costCenterCode;
                return this;
            }

            /**
             * <p>The ID of the financial unit.</p>
             * 
             * <strong>example:</strong>
             * <p>485938</p>
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * <p>The name of the financial unit. The name must be unique within the same account.</p>
             * 
             * <strong>example:</strong>
             * <p>资源组</p>
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * <p>The level of the financial unit node.</p>
             * 
             * <strong>example:</strong>
             * <p>loose</p>
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The ID of the user who owns the financial unit.</p>
             * 
             * <strong>example:</strong>
             * <p>1314839403940987</p>
             */
            public Builder ownerAccountId(Long ownerAccountId) {
                this.ownerAccountId = ownerAccountId;
                return this;
            }

            /**
             * <p>The ID of the parent financial unit.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder parentCostCenterId(Long parentCostCenterId) {
                this.parentCostCenterId = parentCostCenterId;
                return this;
            }

            /**
             * <p>The ID of the previous financial unit.</p>
             * 
             * <strong>example:</strong>
             * <p>485996</p>
             */
            public Builder prevCostCenterId(Long prevCostCenterId) {
                this.prevCostCenterId = prevCostCenterId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public CostCenterDtoList build() {
                return new CostCenterDtoList(this);
            } 

        } 

    }
}
