// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEcoRelationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEcoRelationResponseBody</p>
 */
public class QueryEcoRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ContextMap")
    private java.util.Map < String, ? > contextMap;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryEcoRelationResponseBody(Builder builder) {
        this.code = builder.code;
        this.contextMap = builder.contextMap;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEcoRelationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contextMap
     */
    public java.util.Map < String, ? > getContextMap() {
        return this.contextMap;
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
        private java.util.Map < String, ? > contextMap; 
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
         * ContextMap.
         */
        public Builder contextMap(java.util.Map < String, ? > contextMap) {
            this.contextMap = contextMap;
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

        public QueryEcoRelationResponseBody build() {
            return new QueryEcoRelationResponseBody(this);
        } 

    } 

    public static class ResellerProductModeDO extends TeaModel {
        @NameInMap("IsService")
        private Integer isService;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductName")
        private String productName;

        private ResellerProductModeDO(Builder builder) {
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
         * @return isService
         */
        public Integer getIsService() {
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
            private Integer isService; 
            private String productCode; 
            private String productName; 

            /**
             * IsService.
             */
            public Builder isService(Integer isService) {
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
        @NameInMap("CommodityRoute")
        private Boolean commodityRoute;

        @NameInMap("MultiOrder")
        private Boolean multiOrder;

        @NameInMap("PayMode")
        private String payMode;

        private ResellerProductRuleDO(Builder builder) {
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
            private Boolean commodityRoute; 
            private Boolean multiOrder; 
            private String payMode; 

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

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("IsTopReseller")
        private Boolean isTopReseller;

        @NameInMap("ResellerProductModeDO")
        private ResellerProductModeDO resellerProductModeDO;

        @NameInMap("ResellerProductRuleDO")
        private ResellerProductRuleDO resellerProductRuleDO;

        @NameInMap("ResellerUid")
        private Long resellerUid;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Uid")
        private Long uid;

        @NameInMap("UserType")
        private String userType;

        private Data(Builder builder) {
            this.canLoginOfficial = builder.canLoginOfficial;
            this.endTime = builder.endTime;
            this.isTopReseller = builder.isTopReseller;
            this.resellerProductModeDO = builder.resellerProductModeDO;
            this.resellerProductRuleDO = builder.resellerProductRuleDO;
            this.resellerUid = builder.resellerUid;
            this.startTime = builder.startTime;
            this.status = builder.status;
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
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isTopReseller
         */
        public Boolean getIsTopReseller() {
            return this.isTopReseller;
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
            private String endTime; 
            private Boolean isTopReseller; 
            private ResellerProductModeDO resellerProductModeDO; 
            private ResellerProductRuleDO resellerProductRuleDO; 
            private Long resellerUid; 
            private String startTime; 
            private String status; 
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
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IsTopReseller.
             */
            public Builder isTopReseller(Boolean isTopReseller) {
                this.isTopReseller = isTopReseller;
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
            public Builder startTime(String startTime) {
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
