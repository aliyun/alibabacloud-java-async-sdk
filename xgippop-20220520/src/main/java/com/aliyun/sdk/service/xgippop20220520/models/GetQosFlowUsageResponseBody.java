// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQosFlowUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetQosFlowUsageResponseBody</p>
 */
public class GetQosFlowUsageResponseBody extends TeaModel {
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

    private GetQosFlowUsageResponseBody(Builder builder) {
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

    public static GetQosFlowUsageResponseBody create() {
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

        public GetQosFlowUsageResponseBody build() {
            return new GetQosFlowUsageResponseBody(this);
        } 

    } 

    public static class CustomerList extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("DsDay")
        private Long dsDay;

        @NameInMap("DsMonth")
        private Long dsMonth;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ItemCode")
        private String itemCode;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("OrderNum")
        private Integer orderNum;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("Provice")
        private String provice;

        @NameInMap("QosRequestId")
        private String qosRequestId;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("SpecType")
        private String specType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalPrice")
        private Integer totalPrice;

        @NameInMap("TotolTime")
        private Long totolTime;

        private CustomerList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.appId = builder.appId;
            this.dsDay = builder.dsDay;
            this.dsMonth = builder.dsMonth;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.itemCode = builder.itemCode;
            this.message = builder.message;
            this.name = builder.name;
            this.operator = builder.operator;
            this.orderNum = builder.orderNum;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.provice = builder.provice;
            this.qosRequestId = builder.qosRequestId;
            this.remark = builder.remark;
            this.specType = builder.specType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalPrice = builder.totalPrice;
            this.totolTime = builder.totolTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return dsDay
         */
        public Long getDsDay() {
            return this.dsDay;
        }

        /**
         * @return dsMonth
         */
        public Long getDsMonth() {
            return this.dsMonth;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return itemCode
         */
        public String getItemCode() {
            return this.itemCode;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return orderNum
         */
        public Integer getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
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
         * @return qosRequestId
         */
        public String getQosRequestId() {
            return this.qosRequestId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalPrice
         */
        public Integer getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return totolTime
         */
        public Long getTotolTime() {
            return this.totolTime;
        }

        public static final class Builder {
            private Long aliUid; 
            private String appId; 
            private Long dsDay; 
            private Long dsMonth; 
            private String endTime; 
            private String instanceId; 
            private String itemCode; 
            private String message; 
            private String name; 
            private String operator; 
            private Integer orderNum; 
            private String productId; 
            private String productName; 
            private String provice; 
            private String qosRequestId; 
            private String remark; 
            private String specType; 
            private String startTime; 
            private String status; 
            private Integer totalPrice; 
            private Long totolTime; 

            /**
             * 用户编号
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * app编号
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * 受理日期
             */
            public Builder dsDay(Long dsDay) {
                this.dsDay = dsDay;
                return this;
            }

            /**
             * 受理月份
             */
            public Builder dsMonth(Long dsMonth) {
                this.dsMonth = dsMonth;
                return this;
            }

            /**
             * 结束时间
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 实例
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 商品code
             */
            public Builder itemCode(String itemCode) {
                this.itemCode = itemCode;
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
             * 内部商品名称
             */
            public Builder name(String name) {
                this.name = name;
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
             * 订购总数量
             */
            public Builder orderNum(Integer orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * 运营商商品编号
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * 运营商商品名称
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
             * 请求实例
             */
            public Builder qosRequestId(String qosRequestId) {
                this.qosRequestId = qosRequestId;
                return this;
            }

            /**
             * 备注
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * 商品规格
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * success/fail/stop
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 订购总金额
             */
            public Builder totalPrice(Integer totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * 加速总时间
             */
            public Builder totolTime(Long totolTime) {
                this.totolTime = totolTime;
                return this;
            }

            public CustomerList build() {
                return new CustomerList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CurPageNum")
        private Integer curPageNum;

        @NameInMap("CustomerList")
        private java.util.List < CustomerList> customerList;

        @NameInMap("HasNext")
        private Boolean hasNext;

        @NameInMap("HasPrev")
        private Boolean hasPrev;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NumPerPage")
        private Integer numPerPage;

        @NameInMap("TotalNum")
        private Integer totalNum;

        @NameInMap("TotalPageNum")
        private Integer totalPageNum;

        private Data(Builder builder) {
            this.curPageNum = builder.curPageNum;
            this.customerList = builder.customerList;
            this.hasNext = builder.hasNext;
            this.hasPrev = builder.hasPrev;
            this.instanceId = builder.instanceId;
            this.numPerPage = builder.numPerPage;
            this.totalNum = builder.totalNum;
            this.totalPageNum = builder.totalPageNum;
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
         * @return customerList
         */
        public java.util.List < CustomerList> getCustomerList() {
            return this.customerList;
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
        }

        /**
         * @return hasPrev
         */
        public Boolean getHasPrev() {
            return this.hasPrev;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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

        /**
         * @return totalPageNum
         */
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

        public static final class Builder {
            private Integer curPageNum; 
            private java.util.List < CustomerList> customerList; 
            private Boolean hasNext; 
            private Boolean hasPrev; 
            private String instanceId; 
            private Integer numPerPage; 
            private Integer totalNum; 
            private Integer totalPageNum; 

            /**
             * 当前页数
             */
            public Builder curPageNum(Integer curPageNum) {
                this.curPageNum = curPageNum;
                return this;
            }

            /**
             * C端用户列表
             */
            public Builder customerList(java.util.List < CustomerList> customerList) {
                this.customerList = customerList;
                return this;
            }

            /**
             * 是否有下一页
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * 是否有上一页
             */
            public Builder hasPrev(Boolean hasPrev) {
                this.hasPrev = hasPrev;
                return this;
            }

            /**
             * 实例ID
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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

            /**
             * 总页数
             */
            public Builder totalPageNum(Integer totalPageNum) {
                this.totalPageNum = totalPageNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
