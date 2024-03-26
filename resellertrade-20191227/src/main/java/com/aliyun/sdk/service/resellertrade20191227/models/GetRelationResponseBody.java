// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRelationResponseBody} extends {@link TeaModel}
 *
 * <p>GetRelationResponseBody</p>
 */
public class GetRelationResponseBody extends TeaModel {
    @NameInMap("Class")
    private String _class;

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

    private GetRelationResponseBody(Builder builder) {
        this._class = builder._class;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRelationResponseBody create() {
        return builder().build();
    }

    /**
     * @return _class
     */
    public String get_class() {
        return this._class;
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
        private String _class; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Class.
         */
        public Builder _class(String _class) {
            this._class = _class;
            return this;
        }

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

        public GetRelationResponseBody build() {
            return new GetRelationResponseBody(this);
        } 

    } 

    public static class ResellerProductModeDO extends TeaModel {
        @NameInMap("Class")
        private String _class;

        @NameInMap("IsService")
        private Long isService;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductName")
        private String productName;

        private ResellerProductModeDO(Builder builder) {
            this._class = builder._class;
            this.isService = builder.isService;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResellerProductModeDO create() {
            return builder().build();
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return isService
         */
        public Long getIsService() {
            return this.isService;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private String _class; 
            private Long isService; 
            private String productCode; 
            private String productName; 

            /**
             * Class.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * IsService.
             */
            public Builder isService(Long isService) {
                this.isService = isService;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public ResellerProductModeDO build() {
                return new ResellerProductModeDO(this);
            } 

        } 

    }
    public static class ResellerProductRuleDO extends TeaModel {
        @NameInMap("Class")
        private String _class;

        @NameInMap("CommodityRoute")
        private Boolean commodityRoute;

        @NameInMap("MultiOrder")
        private Boolean multiOrder;

        @NameInMap("PayMode")
        private String payMode;

        private ResellerProductRuleDO(Builder builder) {
            this._class = builder._class;
            this.commodityRoute = builder.commodityRoute;
            this.multiOrder = builder.multiOrder;
            this.payMode = builder.payMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResellerProductRuleDO create() {
            return builder().build();
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return commodityRoute
         */
        public Boolean getCommodityRoute() {
            return this.commodityRoute;
        }

        /**
         * @return multiOrder
         */
        public Boolean getMultiOrder() {
            return this.multiOrder;
        }

        /**
         * @return payMode
         */
        public String getPayMode() {
            return this.payMode;
        }

        public static final class Builder {
            private String _class; 
            private Boolean commodityRoute; 
            private Boolean multiOrder; 
            private String payMode; 

            /**
             * Class.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * CommodityRoute.
             */
            public Builder commodityRoute(Boolean commodityRoute) {
                this.commodityRoute = commodityRoute;
                return this;
            }

            /**
             * MultiOrder.
             */
            public Builder multiOrder(Boolean multiOrder) {
                this.multiOrder = multiOrder;
                return this;
            }

            /**
             * PayMode.
             */
            public Builder payMode(String payMode) {
                this.payMode = payMode;
                return this;
            }

            public ResellerProductRuleDO build() {
                return new ResellerProductRuleDO(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CanLoginOfficial")
        private Boolean canLoginOfficial;

        @NameInMap("Class")
        private String _class;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ResellerProductModeDO")
        private ResellerProductModeDO resellerProductModeDO;

        @NameInMap("ResellerProductRuleDO")
        private ResellerProductRuleDO resellerProductRuleDO;

        @NameInMap("ResellerUid")
        private Long resellerUid;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TopReseller")
        private Boolean topReseller;

        @NameInMap("Uid")
        private Long uid;

        @NameInMap("UserType")
        private String userType;

        private Data(Builder builder) {
            this.canLoginOfficial = builder.canLoginOfficial;
            this._class = builder._class;
            this.endTime = builder.endTime;
            this.resellerProductModeDO = builder.resellerProductModeDO;
            this.resellerProductRuleDO = builder.resellerProductRuleDO;
            this.resellerUid = builder.resellerUid;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.topReseller = builder.topReseller;
            this.uid = builder.uid;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canLoginOfficial
         */
        public Boolean getCanLoginOfficial() {
            return this.canLoginOfficial;
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return resellerProductModeDO
         */
        public ResellerProductModeDO getResellerProductModeDO() {
            return this.resellerProductModeDO;
        }

        /**
         * @return resellerProductRuleDO
         */
        public ResellerProductRuleDO getResellerProductRuleDO() {
            return this.resellerProductRuleDO;
        }

        /**
         * @return resellerUid
         */
        public Long getResellerUid() {
            return this.resellerUid;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return topReseller
         */
        public Boolean getTopReseller() {
            return this.topReseller;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private Boolean canLoginOfficial; 
            private String _class; 
            private Long endTime; 
            private ResellerProductModeDO resellerProductModeDO; 
            private ResellerProductRuleDO resellerProductRuleDO; 
            private Long resellerUid; 
            private Long startTime; 
            private String status; 
            private Boolean topReseller; 
            private Long uid; 
            private String userType; 

            /**
             * CanLoginOfficial.
             */
            public Builder canLoginOfficial(Boolean canLoginOfficial) {
                this.canLoginOfficial = canLoginOfficial;
                return this;
            }

            /**
             * Class.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ResellerProductModeDO.
             */
            public Builder resellerProductModeDO(ResellerProductModeDO resellerProductModeDO) {
                this.resellerProductModeDO = resellerProductModeDO;
                return this;
            }

            /**
             * ResellerProductRuleDO.
             */
            public Builder resellerProductRuleDO(ResellerProductRuleDO resellerProductRuleDO) {
                this.resellerProductRuleDO = resellerProductRuleDO;
                return this;
            }

            /**
             * ResellerUid.
             */
            public Builder resellerUid(Long resellerUid) {
                this.resellerUid = resellerUid;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TopReseller.
             */
            public Builder topReseller(Boolean topReseller) {
                this.topReseller = topReseller;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
