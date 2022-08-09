// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardFlowInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardFlowInfoResponseBody</p>
 */
public class GetCardFlowInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("LocalizedMessage")
    private String localizedMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetCardFlowInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.localizedMessage = builder.localizedMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardFlowInfoResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return localizedMessage
     */
    public String getLocalizedMessage() {
        return this.localizedMessage;
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
        private String errorMessage; 
        private String localizedMessage; 
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * LocalizedMessage.
         */
        public Builder localizedMessage(String localizedMessage) {
            this.localizedMessage = localizedMessage;
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

        public GetCardFlowInfoResponseBody build() {
            return new GetCardFlowInfoResponseBody(this);
        } 

    } 

    public static class ListDayFlow extends TeaModel {
        @NameInMap("Day")
        private String day;

        @NameInMap("Flow")
        private String flow;

        private ListDayFlow(Builder builder) {
            this.day = builder.day;
            this.flow = builder.flow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListDayFlow create() {
            return builder().build();
        }

        /**
         * @return day
         */
        public String getDay() {
            return this.day;
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        public static final class Builder {
            private String day; 
            private String flow; 

            /**
             * Day.
             */
            public Builder day(String day) {
                this.day = day;
                return this;
            }

            /**
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            public ListDayFlow build() {
                return new ListDayFlow(this);
            } 

        } 

    }
    public static class ListCardMonthFlow extends TeaModel {
        @NameInMap("FlowCount")
        private String flowCount;

        @NameInMap("ListDayFlow")
        private java.util.List < ListDayFlow> listDayFlow;

        @NameInMap("Month")
        private String month;

        private ListCardMonthFlow(Builder builder) {
            this.flowCount = builder.flowCount;
            this.listDayFlow = builder.listDayFlow;
            this.month = builder.month;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListCardMonthFlow create() {
            return builder().build();
        }

        /**
         * @return flowCount
         */
        public String getFlowCount() {
            return this.flowCount;
        }

        /**
         * @return listDayFlow
         */
        public java.util.List < ListDayFlow> getListDayFlow() {
            return this.listDayFlow;
        }

        /**
         * @return month
         */
        public String getMonth() {
            return this.month;
        }

        public static final class Builder {
            private String flowCount; 
            private java.util.List < ListDayFlow> listDayFlow; 
            private String month; 

            /**
             * FlowCount.
             */
            public Builder flowCount(String flowCount) {
                this.flowCount = flowCount;
                return this;
            }

            /**
             * ListDayFlow.
             */
            public Builder listDayFlow(java.util.List < ListDayFlow> listDayFlow) {
                this.listDayFlow = listDayFlow;
                return this;
            }

            /**
             * Month.
             */
            public Builder month(String month) {
                this.month = month;
                return this;
            }

            public ListCardMonthFlow build() {
                return new ListCardMonthFlow(this);
            } 

        } 

    }
    public static class ListPackageDTO extends TeaModel {
        @NameInMap("EffectiveTime")
        private String effectiveTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("PackageName")
        private String packageName;

        @NameInMap("Remark")
        private String remark;

        private ListPackageDTO(Builder builder) {
            this.effectiveTime = builder.effectiveTime;
            this.expireTime = builder.expireTime;
            this.packageName = builder.packageName;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListPackageDTO create() {
            return builder().build();
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String effectiveTime; 
            private String expireTime; 
            private String packageName; 
            private String remark; 

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * PackageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public ListPackageDTO build() {
                return new ListPackageDTO(this);
            } 

        } 

    }
    public static class ListVendorDetail extends TeaModel {
        @NameInMap("NetWorkDelay")
        private String netWorkDelay;

        @NameInMap("Ratio")
        private String ratio;

        @NameInMap("SignalStrength")
        private String signalStrength;

        @NameInMap("UsedFlow")
        private String usedFlow;

        @NameInMap("Vendor")
        private String vendor;

        private ListVendorDetail(Builder builder) {
            this.netWorkDelay = builder.netWorkDelay;
            this.ratio = builder.ratio;
            this.signalStrength = builder.signalStrength;
            this.usedFlow = builder.usedFlow;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListVendorDetail create() {
            return builder().build();
        }

        /**
         * @return netWorkDelay
         */
        public String getNetWorkDelay() {
            return this.netWorkDelay;
        }

        /**
         * @return ratio
         */
        public String getRatio() {
            return this.ratio;
        }

        /**
         * @return signalStrength
         */
        public String getSignalStrength() {
            return this.signalStrength;
        }

        /**
         * @return usedFlow
         */
        public String getUsedFlow() {
            return this.usedFlow;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String netWorkDelay; 
            private String ratio; 
            private String signalStrength; 
            private String usedFlow; 
            private String vendor; 

            /**
             * NetWorkDelay.
             */
            public Builder netWorkDelay(String netWorkDelay) {
                this.netWorkDelay = netWorkDelay;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(String ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * SignalStrength.
             */
            public Builder signalStrength(String signalStrength) {
                this.signalStrength = signalStrength;
                return this;
            }

            /**
             * UsedFlow.
             */
            public Builder usedFlow(String usedFlow) {
                this.usedFlow = usedFlow;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public ListVendorDetail build() {
                return new ListVendorDetail(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ListCardMonthFlow")
        private java.util.List < ListCardMonthFlow> listCardMonthFlow;

        @NameInMap("ListPackageDTO")
        private java.util.List < ListPackageDTO> listPackageDTO;

        @NameInMap("ListVendorDetail")
        private java.util.List < ListVendorDetail> listVendorDetail;

        private Data(Builder builder) {
            this.listCardMonthFlow = builder.listCardMonthFlow;
            this.listPackageDTO = builder.listPackageDTO;
            this.listVendorDetail = builder.listVendorDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return listCardMonthFlow
         */
        public java.util.List < ListCardMonthFlow> getListCardMonthFlow() {
            return this.listCardMonthFlow;
        }

        /**
         * @return listPackageDTO
         */
        public java.util.List < ListPackageDTO> getListPackageDTO() {
            return this.listPackageDTO;
        }

        /**
         * @return listVendorDetail
         */
        public java.util.List < ListVendorDetail> getListVendorDetail() {
            return this.listVendorDetail;
        }

        public static final class Builder {
            private java.util.List < ListCardMonthFlow> listCardMonthFlow; 
            private java.util.List < ListPackageDTO> listPackageDTO; 
            private java.util.List < ListVendorDetail> listVendorDetail; 

            /**
             * ListCardMonthFlow.
             */
            public Builder listCardMonthFlow(java.util.List < ListCardMonthFlow> listCardMonthFlow) {
                this.listCardMonthFlow = listCardMonthFlow;
                return this;
            }

            /**
             * ListPackageDTO.
             */
            public Builder listPackageDTO(java.util.List < ListPackageDTO> listPackageDTO) {
                this.listPackageDTO = listPackageDTO;
                return this;
            }

            /**
             * ListVendorDetail.
             */
            public Builder listVendorDetail(java.util.List < ListVendorDetail> listVendorDetail) {
                this.listVendorDetail = listVendorDetail;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
