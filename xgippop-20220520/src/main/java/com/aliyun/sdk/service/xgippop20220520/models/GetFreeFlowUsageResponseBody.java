// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFreeFlowUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetFreeFlowUsageResponseBody</p>
 */
public class GetFreeFlowUsageResponseBody extends TeaModel {
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

    private GetFreeFlowUsageResponseBody(Builder builder) {
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

    public static GetFreeFlowUsageResponseBody create() {
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

        public GetFreeFlowUsageResponseBody build() {
            return new GetFreeFlowUsageResponseBody(this);
        } 

    } 

    public static class CustomerList extends TeaModel {
        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("CustomerEndTime")
        private String customerEndTime;

        @NameInMap("CustomerFlowOrderId")
        private String customerFlowOrderId;

        @NameInMap("CustomerFlowStatus")
        private String customerFlowStatus;

        @NameInMap("CustomerOpenTime")
        private String customerOpenTime;

        @NameInMap("CustomerStartTime")
        private String customerStartTime;

        @NameInMap("FlowProductId")
        private String flowProductId;

        @NameInMap("FlowProductName")
        private String flowProductName;

        @NameInMap("IsLasting")
        private Boolean isLasting;

        @NameInMap("MobileNumber")
        private String mobileNumber;

        @NameInMap("UnitNum")
        private Integer unitNum;

        @NameInMap("UnitPrice")
        private Integer unitPrice;

        private CustomerList(Builder builder) {
            this.channelId = builder.channelId;
            this.customerEndTime = builder.customerEndTime;
            this.customerFlowOrderId = builder.customerFlowOrderId;
            this.customerFlowStatus = builder.customerFlowStatus;
            this.customerOpenTime = builder.customerOpenTime;
            this.customerStartTime = builder.customerStartTime;
            this.flowProductId = builder.flowProductId;
            this.flowProductName = builder.flowProductName;
            this.isLasting = builder.isLasting;
            this.mobileNumber = builder.mobileNumber;
            this.unitNum = builder.unitNum;
            this.unitPrice = builder.unitPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerList create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return customerEndTime
         */
        public String getCustomerEndTime() {
            return this.customerEndTime;
        }

        /**
         * @return customerFlowOrderId
         */
        public String getCustomerFlowOrderId() {
            return this.customerFlowOrderId;
        }

        /**
         * @return customerFlowStatus
         */
        public String getCustomerFlowStatus() {
            return this.customerFlowStatus;
        }

        /**
         * @return customerOpenTime
         */
        public String getCustomerOpenTime() {
            return this.customerOpenTime;
        }

        /**
         * @return customerStartTime
         */
        public String getCustomerStartTime() {
            return this.customerStartTime;
        }

        /**
         * @return flowProductId
         */
        public String getFlowProductId() {
            return this.flowProductId;
        }

        /**
         * @return flowProductName
         */
        public String getFlowProductName() {
            return this.flowProductName;
        }

        /**
         * @return isLasting
         */
        public Boolean getIsLasting() {
            return this.isLasting;
        }

        /**
         * @return mobileNumber
         */
        public String getMobileNumber() {
            return this.mobileNumber;
        }

        /**
         * @return unitNum
         */
        public Integer getUnitNum() {
            return this.unitNum;
        }

        /**
         * @return unitPrice
         */
        public Integer getUnitPrice() {
            return this.unitPrice;
        }

        public static final class Builder {
            private String channelId; 
            private String customerEndTime; 
            private String customerFlowOrderId; 
            private String customerFlowStatus; 
            private String customerOpenTime; 
            private String customerStartTime; 
            private String flowProductId; 
            private String flowProductName; 
            private Boolean isLasting; 
            private String mobileNumber; 
            private Integer unitNum; 
            private Integer unitPrice; 

            /**
             * 购买渠道
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * C端产品失效时间
             */
            public Builder customerEndTime(String customerEndTime) {
                this.customerEndTime = customerEndTime;
                return this;
            }

            /**
             * CustomerFlowOrderId.
             */
            public Builder customerFlowOrderId(String customerFlowOrderId) {
                this.customerFlowOrderId = customerFlowOrderId;
                return this;
            }

            /**
             * C端免流状态，取值包括create/working/expiration
             */
            public Builder customerFlowStatus(String customerFlowStatus) {
                this.customerFlowStatus = customerFlowStatus;
                return this;
            }

            /**
             * C端产品开通时间
             */
            public Builder customerOpenTime(String customerOpenTime) {
                this.customerOpenTime = customerOpenTime;
                return this;
            }

            /**
             * C端产品生效时间
             */
            public Builder customerStartTime(String customerStartTime) {
                this.customerStartTime = customerStartTime;
                return this;
            }

            /**
             * 免流产品ID
             */
            public Builder flowProductId(String flowProductId) {
                this.flowProductId = flowProductId;
                return this;
            }

            /**
             * 免流产品名
             */
            public Builder flowProductName(String flowProductName) {
                this.flowProductName = flowProductName;
                return this;
            }

            /**
             * 是否包月，true或false
             */
            public Builder isLasting(Boolean isLasting) {
                this.isLasting = isLasting;
                return this;
            }

            /**
             * C端手机号
             */
            public Builder mobileNumber(String mobileNumber) {
                this.mobileNumber = mobileNumber;
                return this;
            }

            /**
             * 该流量包的计量单元数
             */
            public Builder unitNum(Integer unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            /**
             * 流量包价格
             */
            public Builder unitPrice(Integer unitPrice) {
                this.unitPrice = unitPrice;
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
