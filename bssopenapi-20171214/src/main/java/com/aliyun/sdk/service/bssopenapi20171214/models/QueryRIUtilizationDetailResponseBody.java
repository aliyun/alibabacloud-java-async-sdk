// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRIUtilizationDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRIUtilizationDetailResponseBody</p>
 */
public class QueryRIUtilizationDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryRIUtilizationDetailResponseBody build() {
            return new QueryRIUtilizationDetailResponseBody(this);
        } 

    } 

    public static class DetailList extends TeaModel {
        @NameInMap("DeductDate")
        private String deductDate;

        @NameInMap("DeductFactorTotal")
        private Float deductFactorTotal;

        @NameInMap("DeductHours")
        private String deductHours;

        @NameInMap("DeductQuantity")
        private Float deductQuantity;

        @NameInMap("DeductedCommodityCode")
        private String deductedCommodityCode;

        @NameInMap("DeductedInstanceId")
        private String deductedInstanceId;

        @NameInMap("DeductedProductDetail")
        private String deductedProductDetail;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("RIInstanceId")
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
             * DeductDate.
             */
            public Builder deductDate(String deductDate) {
                this.deductDate = deductDate;
                return this;
            }

            /**
             * DeductFactorTotal.
             */
            public Builder deductFactorTotal(Float deductFactorTotal) {
                this.deductFactorTotal = deductFactorTotal;
                return this;
            }

            /**
             * DeductHours.
             */
            public Builder deductHours(String deductHours) {
                this.deductHours = deductHours;
                return this;
            }

            /**
             * DeductQuantity.
             */
            public Builder deductQuantity(Float deductQuantity) {
                this.deductQuantity = deductQuantity;
                return this;
            }

            /**
             * DeductedCommodityCode.
             */
            public Builder deductedCommodityCode(String deductedCommodityCode) {
                this.deductedCommodityCode = deductedCommodityCode;
                return this;
            }

            /**
             * DeductedInstanceId.
             */
            public Builder deductedInstanceId(String deductedInstanceId) {
                this.deductedInstanceId = deductedInstanceId;
                return this;
            }

            /**
             * DeductedProductDetail.
             */
            public Builder deductedProductDetail(String deductedProductDetail) {
                this.deductedProductDetail = deductedProductDetail;
                return this;
            }

            /**
             * InstanceSpec.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * RIInstanceId.
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
    public static class DataDetailList extends TeaModel {
        @NameInMap("DetailList")
        private java.util.List < DetailList> detailList;

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
        public java.util.List < DetailList> getDetailList() {
            return this.detailList;
        }

        public static final class Builder {
            private java.util.List < DetailList> detailList; 

            /**
             * DetailList.
             */
            public Builder detailList(java.util.List < DetailList> detailList) {
                this.detailList = detailList;
                return this;
            }

            public DataDetailList build() {
                return new DataDetailList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DetailList")
        private DataDetailList detailList;

        @NameInMap("PageNum")
        private Long pageNum;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalCount")
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
             * DetailList.
             */
            public Builder detailList(DataDetailList detailList) {
                this.detailList = detailList;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
