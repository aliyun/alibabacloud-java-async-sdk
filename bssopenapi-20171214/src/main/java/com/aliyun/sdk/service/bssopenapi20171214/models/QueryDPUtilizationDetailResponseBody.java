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
 * {@link QueryDPUtilizationDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDPUtilizationDetailResponseBody</p>
 */
public class QueryDPUtilizationDetailResponseBody extends TeaModel {
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
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
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
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDPUtilizationDetailResponseBody build() {
            return new QueryDPUtilizationDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDPUtilizationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDPUtilizationDetailResponseBody</p>
     */
    public static class DetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeductDate")
        private String deductDate;

        @com.aliyun.core.annotation.NameInMap("DeductFactorTotal")
        private Float deductFactorTotal;

        @com.aliyun.core.annotation.NameInMap("DeductHours")
        private Float deductHours;

        @com.aliyun.core.annotation.NameInMap("DeductMeasure")
        private Float deductMeasure;

        @com.aliyun.core.annotation.NameInMap("DeductQuantity")
        private Float deductQuantity;

        @com.aliyun.core.annotation.NameInMap("DeductedCommodityCode")
        private String deductedCommodityCode;

        @com.aliyun.core.annotation.NameInMap("DeductedInstanceId")
        private String deductedInstanceId;

        @com.aliyun.core.annotation.NameInMap("DeductedProductDetail")
        private String deductedProductDetail;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResCode")
        private String resCode;

        @com.aliyun.core.annotation.NameInMap("ShareUid")
        private Long shareUid;

        @com.aliyun.core.annotation.NameInMap("Uid")
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
             * <p>The deduction date.</p>
             * 
             * <strong>example:</strong>
             * <p>2019/5/23 12:00</p>
             */
            public Builder deductDate(String deductDate) {
                this.deductDate = deductDate;
                return this;
            }

            /**
             * <p>The total computing capacity or storage capacity of the RI or SCU during the deduction.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deductFactorTotal(Float deductFactorTotal) {
                this.deductFactorTotal = deductFactorTotal;
                return this;
            }

            /**
             * <p>The deduct factor. This parameter is returned only if the CommodityCode parameter is set to ecsRi.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder deductHours(Float deductHours) {
                this.deductHours = deductHours;
                return this;
            }

            /**
             * <p>The original measured amount.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deductMeasure(Float deductMeasure) {
                this.deductMeasure = deductMeasure;
                return this;
            }

            /**
             * <p>The computing capacity or storage capacity that is deducted in a pay-as-you-go instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deductQuantity(Float deductQuantity) {
                this.deductQuantity = deductQuantity;
                return this;
            }

            /**
             * <p>The code of the deducted service.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder deductedCommodityCode(String deductedCommodityCode) {
                this.deductedCommodityCode = deductedCommodityCode;
                return this;
            }

            /**
             * <p>The ID of the deducted instance.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-123123</p>
             */
            public Builder deductedInstanceId(String deductedInstanceId) {
                this.deductedInstanceId = deductedInstanceId;
                return this;
            }

            /**
             * <p>The name of the deducted service.</p>
             * 
             * <strong>example:</strong>
             * <p>ApsaraDB RDS</p>
             */
            public Builder deductedProductDetail(String deductedProductDetail) {
                this.deductedProductDetail = deductedProductDetail;
                return this;
            }

            /**
             * <p>The ID of the RI.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-123123</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance type of the deducted instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mysql.s3.large</p>
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * <p>The region in which the instance resides. This parameter can be left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>PutRequest</p>
             */
            public Builder resCode(String resCode) {
                this.resCode = resCode;
                return this;
            }

            /**
             * <p>The UID of the deducted instance.</p>
             * <ul>
             * <li>If the deduction is shared, the value of this parameter indicates the UID of the deducted instance.</li>
             * <li>If the deduction is not shared, the value of this parameter is the same as that of the uid parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1111111111</p>
             */
            public Builder shareUid(Long shareUid) {
                this.shareUid = shareUid;
                return this;
            }

            /**
             * <p>The UID of the deducted instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1111111111</p>
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
    /**
     * 
     * {@link QueryDPUtilizationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDPUtilizationDetailResponseBody</p>
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
     * {@link QueryDPUtilizationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDPUtilizationDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailList")
        private DataDetailList detailList;

        @com.aliyun.core.annotation.NameInMap("NextToken")
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
             * <p>The detailed resource plan usage.</p>
             */
            public Builder detailList(DataDetailList detailList) {
                this.detailList = detailList;
                return this;
            }

            /**
             * <p>The token that is used to retrieve the next page of results. You can set the LastToken parameter to this value in the next request. If null is returned, all results are queried.</p>
             * 
             * <strong>example:</strong>
             * <p>CAESF***zNTAw</p>
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
