// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQosUsageStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetQosUsageStatisticResponseBody</p>
 */
public class GetQosUsageStatisticResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rt")
    private Long rt;

    @NameInMap("Success")
    private Boolean success;

    private GetQosUsageStatisticResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.rt = builder.rt;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQosUsageStatisticResponseBody create() {
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
     * @return rt
     */
    public Long getRt() {
        return this.rt;
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
        private Long rt; 
        private Boolean success; 

        /**
         * 结果码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 结果
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 结果描述
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求链路ID，如POP请求进来的requestId，返回时原样返回
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 服务端处理耗时，ms
         */
        public Builder rt(Long rt) {
            this.rt = rt;
            return this;
        }

        /**
         * 是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQosUsageStatisticResponseBody build() {
            return new GetQosUsageStatisticResponseBody(this);
        } 

    } 

    public static class GetQosUsageStatisticResList extends TeaModel {
        @NameInMap("BillCount")
        private Long billCount;

        @NameInMap("DsDay")
        private Long dsDay;

        @NameInMap("FailCount")
        private Long failCount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Month")
        private Long month;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("Provice")
        private String provice;

        @NameInMap("SpecType")
        private String specType;

        @NameInMap("SucessCount")
        private Long sucessCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("YunOutProduct")
        private String yunOutProduct;

        private GetQosUsageStatisticResList(Builder builder) {
            this.billCount = builder.billCount;
            this.dsDay = builder.dsDay;
            this.failCount = builder.failCount;
            this.instanceId = builder.instanceId;
            this.month = builder.month;
            this.operator = builder.operator;
            this.productName = builder.productName;
            this.provice = builder.provice;
            this.specType = builder.specType;
            this.sucessCount = builder.sucessCount;
            this.totalCount = builder.totalCount;
            this.yunOutProduct = builder.yunOutProduct;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetQosUsageStatisticResList create() {
            return builder().build();
        }

        /**
         * @return billCount
         */
        public Long getBillCount() {
            return this.billCount;
        }

        /**
         * @return dsDay
         */
        public Long getDsDay() {
            return this.dsDay;
        }

        /**
         * @return failCount
         */
        public Long getFailCount() {
            return this.failCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return month
         */
        public Long getMonth() {
            return this.month;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return provice
         */
        public String getProvice() {
            return this.provice;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return sucessCount
         */
        public Long getSucessCount() {
            return this.sucessCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return yunOutProduct
         */
        public String getYunOutProduct() {
            return this.yunOutProduct;
        }

        public static final class Builder {
            private Long billCount; 
            private Long dsDay; 
            private Long failCount; 
            private String instanceId; 
            private Long month; 
            private String operator; 
            private String productName; 
            private String provice; 
            private String specType; 
            private Long sucessCount; 
            private Long totalCount; 
            private String yunOutProduct; 

            /**
             * 计费总量
             */
            public Builder billCount(Long billCount) {
                this.billCount = billCount;
                return this;
            }

            /**
             * DsDay.
             */
            public Builder dsDay(Long dsDay) {
                this.dsDay = dsDay;
                return this;
            }

            /**
             * 订购失败总量
             */
            public Builder failCount(Long failCount) {
                this.failCount = failCount;
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
             * Month.
             */
            public Builder month(Long month) {
                this.month = month;
                return this;
            }

            /**
             * 运营商编号
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * 省份
             */
            public Builder provice(String provice) {
                this.provice = provice;
                return this;
            }

            /**
             * 该实例对应的包类型
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * 订购成功总量
             */
            public Builder sucessCount(Long sucessCount) {
                this.sucessCount = sucessCount;
                return this;
            }

            /**
             * 订购总量
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * 产品规格
             */
            public Builder yunOutProduct(String yunOutProduct) {
                this.yunOutProduct = yunOutProduct;
                return this;
            }

            public GetQosUsageStatisticResList build() {
                return new GetQosUsageStatisticResList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CurPageNum")
        private Integer curPageNum;

        @NameInMap("GetQosUsageStatisticResList")
        private java.util.List < GetQosUsageStatisticResList> getQosUsageStatisticResList;

        @NameInMap("NumPerPage")
        private Integer numPerPage;

        @NameInMap("TotalNum")
        private Integer totalNum;

        private Data(Builder builder) {
            this.curPageNum = builder.curPageNum;
            this.getQosUsageStatisticResList = builder.getQosUsageStatisticResList;
            this.numPerPage = builder.numPerPage;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return curPageNum
         */
        public Integer getCurPageNum() {
            return this.curPageNum;
        }

        /**
         * @return getQosUsageStatisticResList
         */
        public java.util.List < GetQosUsageStatisticResList> getGetQosUsageStatisticResList() {
            return this.getQosUsageStatisticResList;
        }

        /**
         * @return numPerPage
         */
        public Integer getNumPerPage() {
            return this.numPerPage;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private Integer curPageNum; 
            private java.util.List < GetQosUsageStatisticResList> getQosUsageStatisticResList; 
            private Integer numPerPage; 
            private Integer totalNum; 

            /**
             * 当前页数
             */
            public Builder curPageNum(Integer curPageNum) {
                this.curPageNum = curPageNum;
                return this;
            }

            /**
             * GetQosUsageStatisticResList.
             */
            public Builder getQosUsageStatisticResList(java.util.List < GetQosUsageStatisticResList> getQosUsageStatisticResList) {
                this.getQosUsageStatisticResList = getQosUsageStatisticResList;
                return this;
            }

            /**
             * 每页的记录条数
             */
            public Builder numPerPage(Integer numPerPage) {
                this.numPerPage = numPerPage;
                return this;
            }

            /**
             * 总记录条数
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
