// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSQLReviewOriginSQLRequest} extends {@link RequestModel}
 *
 * <p>ListSQLReviewOriginSQLRequest</p>
 */
public class ListSQLReviewOriginSQLRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("OrderActionDetail")
    private OrderActionDetail orderActionDetail;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true, minimum = 1)
    private Long orderId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private ListSQLReviewOriginSQLRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.orderActionDetail = builder.orderActionDetail;
        this.orderId = builder.orderId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSQLReviewOriginSQLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return orderActionDetail
     */
    public OrderActionDetail getOrderActionDetail() {
        return this.orderActionDetail;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListSQLReviewOriginSQLRequest, Builder> {
        private String regionId; 
        private OrderActionDetail orderActionDetail; 
        private Long orderId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListSQLReviewOriginSQLRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.orderActionDetail = request.orderActionDetail;
            this.orderId = request.orderId;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The parameters that are used to filter SQL statements involved in the ticket.
         */
        public Builder orderActionDetail(OrderActionDetail orderActionDetail) {
            String orderActionDetailShrink = shrink(orderActionDetail, "OrderActionDetail", "json");
            this.putQueryParameter("OrderActionDetail", orderActionDetailShrink);
            this.orderActionDetail = orderActionDetail;
            return this;
        }

        /**
         * The ID of the ticket for the SQL review. You can call the [CreateSQLReviewOrder](~~257777~~) operation to query the ID of the ticket.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant) or [ListUserTenants](https://www.alibabacloud.com/help/en/data-management-service/latest/listusertenants) operation to query the ID of the tenant.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListSQLReviewOriginSQLRequest build() {
            return new ListSQLReviewOriginSQLRequest(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(maximum = 500)
        private Integer pageSize;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
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

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 

            /**
             * The number of the page to return.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries to return on each page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    public static class OrderActionDetail extends TeaModel {
        @NameInMap("CheckStatusResult")
        private String checkStatusResult;

        @NameInMap("FileId")
        private Long fileId;

        @NameInMap("Page")
        private Page page;

        @NameInMap("SQLReviewResult")
        private String SQLReviewResult;

        private OrderActionDetail(Builder builder) {
            this.checkStatusResult = builder.checkStatusResult;
            this.fileId = builder.fileId;
            this.page = builder.page;
            this.SQLReviewResult = builder.SQLReviewResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderActionDetail create() {
            return builder().build();
        }

        /**
         * @return checkStatusResult
         */
        public String getCheckStatusResult() {
            return this.checkStatusResult;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return page
         */
        public Page getPage() {
            return this.page;
        }

        /**
         * @return SQLReviewResult
         */
        public String getSQLReviewResult() {
            return this.SQLReviewResult;
        }

        public static final class Builder {
            private String checkStatusResult; 
            private Long fileId; 
            private Page page; 
            private String SQLReviewResult; 

            /**
             * The review status of the SQL statement. Valid values:
             * <p>
             * 
             * *   **new**: The SQL statement is pending for analysis.
             * *   **unknown**: The SQL statement failed to be parsed.
             * *   **check_not_pass**: The SQL statement failed the review.
             * *   **check_pass**: The SQL statement passed the review.
             * *   **force_pass**: The SQL statement passed the review by manual effort.
             * *   **force_not_pass**: The SQL statement failed the review by manual effort.
             */
            public Builder checkStatusResult(String checkStatusResult) {
                this.checkStatusResult = checkStatusResult;
                return this;
            }

            /**
             * The ID of the file.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * The paging settings.
             */
            public Builder page(Page page) {
                this.page = page;
                return this;
            }

            /**
             * The optimization suggestion for the SQL statement. Valid values:
             * <p>
             * 
             * *   **MUST_IMPROVE**: The SQL statement must be improved.
             * *   **POTENTIAL_ISSUE**: The SQL statement contains potential issues.
             * *   **SUGGEST_IMPROVE**: We recommend that you improve the SQL statement.
             * *   **USE_DMS_TOOLKIT**: We recommend that you change schemas without locking tables.
             * *   **USE_DMS_DML_UNLOCK**: We recommend that you change data without locking tables.
             * *   **TABLE_INDEX_SUGGEST**: We recommend that you use SQL statements that use indexes.
             */
            public Builder SQLReviewResult(String SQLReviewResult) {
                this.SQLReviewResult = SQLReviewResult;
                return this;
            }

            public OrderActionDetail build() {
                return new OrderActionDetail(this);
            } 

        } 

    }
}
