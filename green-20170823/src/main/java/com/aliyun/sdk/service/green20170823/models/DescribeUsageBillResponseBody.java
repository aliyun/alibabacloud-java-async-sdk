// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsageBillResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsageBillResponseBody</p>
 */
public class DescribeUsageBillResponseBody extends TeaModel {
    @NameInMap("BillList")
    private java.util.List < BillList> billList;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeUsageBillResponseBody(Builder builder) {
        this.billList = builder.billList;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsageBillResponseBody create() {
        return builder().build();
    }

    /**
     * @return billList
     */
    public java.util.List < BillList> getBillList() {
        return this.billList;
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
        private java.util.List < BillList> billList; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * BillList.
         */
        public Builder billList(java.util.List < BillList> billList) {
            this.billList = billList;
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
         * RequestId.
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

        public DescribeUsageBillResponseBody build() {
            return new DescribeUsageBillResponseBody(this);
        } 

    } 

    public static class BillList extends TeaModel {
        @NameInMap("BizType")
        private String bizType;

        @NameInMap("ConfirmCount")
        private Long confirmCount;

        @NameInMap("Day")
        private String day;

        @NameInMap("FreeCount")
        private Long freeCount;

        @NameInMap("Region")
        private String region;

        @NameInMap("ReviewCount")
        private Long reviewCount;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("SubUid")
        private String subUid;

        @NameInMap("TotalCount")
        private Long totalCount;

        private BillList(Builder builder) {
            this.bizType = builder.bizType;
            this.confirmCount = builder.confirmCount;
            this.day = builder.day;
            this.freeCount = builder.freeCount;
            this.region = builder.region;
            this.reviewCount = builder.reviewCount;
            this.scene = builder.scene;
            this.subUid = builder.subUid;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillList create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return confirmCount
         */
        public Long getConfirmCount() {
            return this.confirmCount;
        }

        /**
         * @return day
         */
        public String getDay() {
            return this.day;
        }

        /**
         * @return freeCount
         */
        public Long getFreeCount() {
            return this.freeCount;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return reviewCount
         */
        public Long getReviewCount() {
            return this.reviewCount;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return subUid
         */
        public String getSubUid() {
            return this.subUid;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String bizType; 
            private Long confirmCount; 
            private String day; 
            private Long freeCount; 
            private String region; 
            private Long reviewCount; 
            private String scene; 
            private String subUid; 
            private Long totalCount; 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * ConfirmCount.
             */
            public Builder confirmCount(Long confirmCount) {
                this.confirmCount = confirmCount;
                return this;
            }

            /**
             * Day.
             */
            public Builder day(String day) {
                this.day = day;
                return this;
            }

            /**
             * FreeCount.
             */
            public Builder freeCount(Long freeCount) {
                this.freeCount = freeCount;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ReviewCount.
             */
            public Builder reviewCount(Long reviewCount) {
                this.reviewCount = reviewCount;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * SubUid.
             */
            public Builder subUid(String subUid) {
                this.subUid = subUid;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public BillList build() {
                return new BillList(this);
            } 

        } 

    }
}
