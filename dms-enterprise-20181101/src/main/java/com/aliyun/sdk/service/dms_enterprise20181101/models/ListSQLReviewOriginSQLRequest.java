// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSQLReviewOriginSQLRequest} extends {@link RequestModel}
 *
 * <p>ListSQLReviewOriginSQLRequest</p>
 */
public class ListSQLReviewOriginSQLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderActionDetail")
    private OrderActionDetail orderActionDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
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
         * <p>The parameters that are used to filter SQL statements involved in the ticket.</p>
         */
        public Builder orderActionDetail(OrderActionDetail orderActionDetail) {
            String orderActionDetailShrink = shrink(orderActionDetail, "OrderActionDetail", "json");
            this.putQueryParameter("OrderActionDetail", orderActionDetailShrink);
            this.orderActionDetail = orderActionDetail;
            return this;
        }

        /**
         * <p>The ID of the SQL review ticket. You can call the <a href="https://help.aliyun.com/document_detail/257777.html">CreateSQLReviewOrder</a> operation to query the ticket ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123321</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The tenant ID. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

    /**
     * 
     * {@link ListSQLReviewOriginSQLRequest} extends {@link TeaModel}
     *
     * <p>ListSQLReviewOriginSQLRequest</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(maximum = 500)
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
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSQLReviewOriginSQLRequest} extends {@link TeaModel}
     *
     * <p>ListSQLReviewOriginSQLRequest</p>
     */
    public static class OrderActionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckStatusResult")
        private String checkStatusResult;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Page page;

        @com.aliyun.core.annotation.NameInMap("SQLReviewResult")
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
             * <p>The review status of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>new</strong>: The SQL statement was waiting to be reviewed.</li>
             * <li><strong>unknown</strong>: The SQL statement cannot be parsed.</li>
             * <li><strong>check_not_pass</strong>: The SQL statement failed to pass the review.</li>
             * <li><strong>check_pass</strong>: The SQL statement passed the review.</li>
             * <li><strong>force_pass</strong>: The SQL statement passed the manual review.</li>
             * <li><strong>force_not_pass</strong>: The SQL statement failed to pass the manual review.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>check_not_pass</p>
             */
            public Builder checkStatusResult(String checkStatusResult) {
                this.checkStatusResult = checkStatusResult;
                return this;
            }

            /**
             * <p>The ID of the file that contains the SQL statements to be reviewed.</p>
             * 
             * <strong>example:</strong>
             * <p>123345</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The pagination information.</p>
             */
            public Builder page(Page page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The optimization suggestion for the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>MUST_IMPROVE</strong>: The SQL statement must be optimized.</li>
             * <li><strong>POTENTIAL_ISSUE</strong>: The SQL statement contains potential issues.</li>
             * <li><strong>SUGGEST_IMPROVE</strong>: We recommend that you optimize the SQL statement.</li>
             * <li><strong>USE_DMS_TOOLKIT</strong>: We recommend that you change schemas without locking tables.</li>
             * <li><strong>USE_DMS_DML_UNLOCK</strong>: We recommend that you change data without locking tables.</li>
             * <li><strong>TABLE_INDEX_SUGGEST</strong>: We recommend that you optimize indexes for the SQL statement.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MUST_IMPROVE</p>
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
