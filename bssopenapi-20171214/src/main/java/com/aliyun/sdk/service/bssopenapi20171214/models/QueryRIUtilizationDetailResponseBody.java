// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryRIUtilizationDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRIUtilizationDetailResponseBody</p>
 */
public class QueryRIUtilizationDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryRIUtilizationDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRIUtilizationDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful！</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DF58589C-A06C-4224-8615-7797E6474FA3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryRIUtilizationDetailResponseBody build() {
            return new QueryRIUtilizationDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRIUtilizationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRIUtilizationDetailResponseBody</p>
     */
    public static class DetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeductDate")
        private String deductDate;

        @com.aliyun.core.annotation.NameInMap("DeductFactorTotal")
        private Float deductFactorTotal;

        @com.aliyun.core.annotation.NameInMap("DeductHours")
        private String deductHours;

        @com.aliyun.core.annotation.NameInMap("DeductQuantity")
        private Float deductQuantity;

        @com.aliyun.core.annotation.NameInMap("DeductedCommodityCode")
        private String deductedCommodityCode;

        @com.aliyun.core.annotation.NameInMap("DeductedInstanceId")
        private String deductedInstanceId;

        @com.aliyun.core.annotation.NameInMap("DeductedProductDetail")
        private String deductedProductDetail;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("RIInstanceId")
        private String RIInstanceId;

        private DetailList(Builder builder) {
            this.deductDate = builder.deductDate;
            this.deductFactorTotal = builder.deductFactorTotal;
            this.deductHours = builder.deductHours;
            this.deductQuantity = builder.deductQuantity;
            this.deductedCommodityCode = builder.deductedCommodityCode;
            this.deductedInstanceId = builder.deductedInstanceId;
            this.deductedProductDetail = builder.deductedProductDetail;
            this.instanceSpec = builder.instanceSpec;
            this.RIInstanceId = builder.RIInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailList create() {
            return builder().build();
        }

        /**
         * @return deductDate
         */
        public String getDeductDate() {
            return this.deductDate;
        }

        /**
         * @return deductFactorTotal
         */
        public Float getDeductFactorTotal() {
            return this.deductFactorTotal;
        }

        /**
         * @return deductHours
         */
        public String getDeductHours() {
            return this.deductHours;
        }

        /**
         * @return deductQuantity
         */
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        /**
         * @return deductedCommodityCode
         */
        public String getDeductedCommodityCode() {
            return this.deductedCommodityCode;
        }

        /**
         * @return deductedInstanceId
         */
        public String getDeductedInstanceId() {
            return this.deductedInstanceId;
        }

        /**
         * @return deductedProductDetail
         */
        public String getDeductedProductDetail() {
            return this.deductedProductDetail;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return RIInstanceId
         */
        public String getRIInstanceId() {
            return this.RIInstanceId;
        }

        public static final class Builder {
            private String deductDate; 
            private Float deductFactorTotal; 
            private String deductHours; 
            private Float deductQuantity; 
            private String deductedCommodityCode; 
            private String deductedInstanceId; 
            private String deductedProductDetail; 
            private String instanceSpec; 
            private String RIInstanceId; 

            /**
             * <p>The time when the fees are deducted by using the RI.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-23 12:00:00</p>
             */
            public Builder deductDate(String deductDate) {
                this.deductDate = deductDate;
                return this;
            }

            /**
             * <p>The total amount of computing power of the RI or capacity of SCU in the time period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deductFactorTotal(Float deductFactorTotal) {
                this.deductFactorTotal = deductFactorTotal;
                return this;
            }

            /**
             * <p>The deduct factor. This parameter is returned only if the RICommodityCode parameter is set to ecsRi.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder deductHours(String deductHours) {
                this.deductHours = deductHours;
                return this;
            }

            /**
             * <p>The computing power or capacity of the pay-as-you-go instance whose fees are deducted by using the RI.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deductQuantity(Float deductQuantity) {
                this.deductQuantity = deductQuantity;
                return this;
            }

            /**
             * <p>The code of the service whose fees are deducted by using the RI.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder deductedCommodityCode(String deductedCommodityCode) {
                this.deductedCommodityCode = deductedCommodityCode;
                return this;
            }

            /**
             * <p>The ID of the instance whose fees are deducted by using the RI.</p>
             * 
             * <strong>example:</strong>
             * <p>safdffghfgh</p>
             */
            public Builder deductedInstanceId(String deductedInstanceId) {
                this.deductedInstanceId = deductedInstanceId;
                return this;
            }

            /**
             * <p>The name of the service whose fees are deducted by using the RI.</p>
             * 
             * <strong>example:</strong>
             * <p>ApsaraDB RDS</p>
             */
            public Builder deductedProductDetail(String deductedProductDetail) {
                this.deductedProductDetail = deductedProductDetail;
                return this;
            }

            /**
             * <p>The instance type of the instance whose fees are deducted by using the RI.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mysql.s3.large</p>
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * <p>The ID of the RI.</p>
             * 
             * <strong>example:</strong>
             * <p>324253645</p>
             */
            public Builder RIInstanceId(String RIInstanceId) {
                this.RIInstanceId = RIInstanceId;
                return this;
            }

            public DetailList build() {
                return new DetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRIUtilizationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRIUtilizationDetailResponseBody</p>
     */
    public static class DataDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailList")
        private java.util.List<DetailList> detailList;

        private DataDetailList(Builder builder) {
            this.detailList = builder.detailList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDetailList create() {
            return builder().build();
        }

        /**
         * @return detailList
         */
        public java.util.List<DetailList> getDetailList() {
            return this.detailList;
        }

        public static final class Builder {
            private java.util.List<DetailList> detailList; 

            /**
             * DetailList.
             */
            public Builder detailList(java.util.List<DetailList> detailList) {
                this.detailList = detailList;
                return this;
            }

            public DataDetailList build() {
                return new DataDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRIUtilizationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRIUtilizationDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailList")
        private DataDetailList detailList;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Long pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.detailList = builder.detailList;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detailList
         */
        public DataDetailList getDetailList() {
            return this.detailList;
        }

        /**
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private DataDetailList detailList; 
            private Long pageNum; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * <p>The usage details of the RI.</p>
             */
            public Builder detailList(DataDetailList detailList) {
                this.detailList = detailList;
                return this;
            }

            /**
             * <p>The number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
