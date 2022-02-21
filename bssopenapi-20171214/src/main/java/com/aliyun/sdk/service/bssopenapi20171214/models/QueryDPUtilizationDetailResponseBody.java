// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDPUtilizationDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDPUtilizationDetailResponseBody</p>
 */
public class QueryDPUtilizationDetailResponseBody extends TeaModel {
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

    private QueryDPUtilizationDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDPUtilizationDetailResponseBody create() {
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

        public QueryDPUtilizationDetailResponseBody build() {
            return new QueryDPUtilizationDetailResponseBody(this);
        } 

    } 

    public static class DetailList extends TeaModel {
        @NameInMap("DeductDate")
        private String deductDate;

        @NameInMap("DeductFactorTotal")
        private Float deductFactorTotal;

        @NameInMap("DeductHours")
        private Float deductHours;

        @NameInMap("DeductMeasure")
        private Float deductMeasure;

        @NameInMap("DeductQuantity")
        private Float deductQuantity;

        @NameInMap("DeductedCommodityCode")
        private String deductedCommodityCode;

        @NameInMap("DeductedInstanceId")
        private String deductedInstanceId;

        @NameInMap("DeductedProductDetail")
        private String deductedProductDetail;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("Region")
        private String region;

        @NameInMap("ResCode")
        private String resCode;

        @NameInMap("ShareUid")
        private Long shareUid;

        @NameInMap("Uid")
        private Long uid;

        private DetailList(Builder builder) {
            this.deductDate = builder.deductDate;
            this.deductFactorTotal = builder.deductFactorTotal;
            this.deductHours = builder.deductHours;
            this.deductMeasure = builder.deductMeasure;
            this.deductQuantity = builder.deductQuantity;
            this.deductedCommodityCode = builder.deductedCommodityCode;
            this.deductedInstanceId = builder.deductedInstanceId;
            this.deductedProductDetail = builder.deductedProductDetail;
            this.instanceId = builder.instanceId;
            this.instanceSpec = builder.instanceSpec;
            this.region = builder.region;
            this.resCode = builder.resCode;
            this.shareUid = builder.shareUid;
            this.uid = builder.uid;
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
        public Float getDeductHours() {
            return this.deductHours;
        }

        /**
         * @return deductMeasure
         */
        public Float getDeductMeasure() {
            return this.deductMeasure;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resCode
         */
        public String getResCode() {
            return this.resCode;
        }

        /**
         * @return shareUid
         */
        public Long getShareUid() {
            return this.shareUid;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String deductDate; 
            private Float deductFactorTotal; 
            private Float deductHours; 
            private Float deductMeasure; 
            private Float deductQuantity; 
            private String deductedCommodityCode; 
            private String deductedInstanceId; 
            private String deductedProductDetail; 
            private String instanceId; 
            private String instanceSpec; 
            private String region; 
            private String resCode; 
            private Long shareUid; 
            private Long uid; 

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
            public Builder deductHours(Float deductHours) {
                this.deductHours = deductHours;
                return this;
            }

            /**
             * DeductMeasure.
             */
            public Builder deductMeasure(Float deductMeasure) {
                this.deductMeasure = deductMeasure;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResCode.
             */
            public Builder resCode(String resCode) {
                this.resCode = resCode;
                return this;
            }

            /**
             * ShareUid.
             */
            public Builder shareUid(Long shareUid) {
                this.shareUid = shareUid;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
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

        @NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.detailList = builder.detailList;
            this.nextToken = builder.nextToken;
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
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private DataDetailList detailList; 
            private String nextToken; 

            /**
             * DetailList.
             */
            public Builder detailList(DataDetailList detailList) {
                this.detailList = detailList;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
