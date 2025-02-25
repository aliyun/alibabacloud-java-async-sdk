// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link QueryShopIndexResponseBody} extends {@link TeaModel}
 *
 * <p>QueryShopIndexResponseBody</p>
 */
public class QueryShopIndexResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryShopIndexResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryShopIndexResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public QueryShopIndexResponseBody build() {
            return new QueryShopIndexResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryShopIndexResponseBody} extends {@link TeaModel}
     *
     * <p>QueryShopIndexResponseBody</p>
     */
    public static class ShopIndex extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaultShopNum")
        private Integer faultShopNum;

        @com.aliyun.core.annotation.NameInMap("HighFreqFaultShopNum")
        private Integer highFreqFaultShopNum;

        @com.aliyun.core.annotation.NameInMap("InstalledShopNum")
        private Integer installedShopNum;

        @com.aliyun.core.annotation.NameInMap("NetWorkShopNum")
        private Integer netWorkShopNum;

        @com.aliyun.core.annotation.NameInMap("NormalShopNum")
        private Integer normalShopNum;

        @com.aliyun.core.annotation.NameInMap("NotWorkShopNum")
        private Integer notWorkShopNum;

        @com.aliyun.core.annotation.NameInMap("ShopTotal")
        private Integer shopTotal;

        @com.aliyun.core.annotation.NameInMap("UpholdShopNum")
        private Integer upholdShopNum;

        private ShopIndex(Builder builder) {
            this.faultShopNum = builder.faultShopNum;
            this.highFreqFaultShopNum = builder.highFreqFaultShopNum;
            this.installedShopNum = builder.installedShopNum;
            this.netWorkShopNum = builder.netWorkShopNum;
            this.normalShopNum = builder.normalShopNum;
            this.notWorkShopNum = builder.notWorkShopNum;
            this.shopTotal = builder.shopTotal;
            this.upholdShopNum = builder.upholdShopNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShopIndex create() {
            return builder().build();
        }

        /**
         * @return faultShopNum
         */
        public Integer getFaultShopNum() {
            return this.faultShopNum;
        }

        /**
         * @return highFreqFaultShopNum
         */
        public Integer getHighFreqFaultShopNum() {
            return this.highFreqFaultShopNum;
        }

        /**
         * @return installedShopNum
         */
        public Integer getInstalledShopNum() {
            return this.installedShopNum;
        }

        /**
         * @return netWorkShopNum
         */
        public Integer getNetWorkShopNum() {
            return this.netWorkShopNum;
        }

        /**
         * @return normalShopNum
         */
        public Integer getNormalShopNum() {
            return this.normalShopNum;
        }

        /**
         * @return notWorkShopNum
         */
        public Integer getNotWorkShopNum() {
            return this.notWorkShopNum;
        }

        /**
         * @return shopTotal
         */
        public Integer getShopTotal() {
            return this.shopTotal;
        }

        /**
         * @return upholdShopNum
         */
        public Integer getUpholdShopNum() {
            return this.upholdShopNum;
        }

        public static final class Builder {
            private Integer faultShopNum; 
            private Integer highFreqFaultShopNum; 
            private Integer installedShopNum; 
            private Integer netWorkShopNum; 
            private Integer normalShopNum; 
            private Integer notWorkShopNum; 
            private Integer shopTotal; 
            private Integer upholdShopNum; 

            /**
             * FaultShopNum.
             */
            public Builder faultShopNum(Integer faultShopNum) {
                this.faultShopNum = faultShopNum;
                return this;
            }

            /**
             * HighFreqFaultShopNum.
             */
            public Builder highFreqFaultShopNum(Integer highFreqFaultShopNum) {
                this.highFreqFaultShopNum = highFreqFaultShopNum;
                return this;
            }

            /**
             * InstalledShopNum.
             */
            public Builder installedShopNum(Integer installedShopNum) {
                this.installedShopNum = installedShopNum;
                return this;
            }

            /**
             * NetWorkShopNum.
             */
            public Builder netWorkShopNum(Integer netWorkShopNum) {
                this.netWorkShopNum = netWorkShopNum;
                return this;
            }

            /**
             * NormalShopNum.
             */
            public Builder normalShopNum(Integer normalShopNum) {
                this.normalShopNum = normalShopNum;
                return this;
            }

            /**
             * NotWorkShopNum.
             */
            public Builder notWorkShopNum(Integer notWorkShopNum) {
                this.notWorkShopNum = notWorkShopNum;
                return this;
            }

            /**
             * ShopTotal.
             */
            public Builder shopTotal(Integer shopTotal) {
                this.shopTotal = shopTotal;
                return this;
            }

            /**
             * UpholdShopNum.
             */
            public Builder upholdShopNum(Integer upholdShopNum) {
                this.upholdShopNum = upholdShopNum;
                return this;
            }

            public ShopIndex build() {
                return new ShopIndex(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryShopIndexResponseBody} extends {@link TeaModel}
     *
     * <p>QueryShopIndexResponseBody</p>
     */
    public static class FailShops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShopId")
        private String shopId;

        @com.aliyun.core.annotation.NameInMap("ShopName")
        private String shopName;

        private FailShops(Builder builder) {
            this.shopId = builder.shopId;
            this.shopName = builder.shopName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailShops create() {
            return builder().build();
        }

        /**
         * @return shopId
         */
        public String getShopId() {
            return this.shopId;
        }

        /**
         * @return shopName
         */
        public String getShopName() {
            return this.shopName;
        }

        public static final class Builder {
            private String shopId; 
            private String shopName; 

            /**
             * ShopId.
             */
            public Builder shopId(String shopId) {
                this.shopId = shopId;
                return this;
            }

            /**
             * ShopName.
             */
            public Builder shopName(String shopName) {
                this.shopName = shopName;
                return this;
            }

            public FailShops build() {
                return new FailShops(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryShopIndexResponseBody} extends {@link TeaModel}
     *
     * <p>QueryShopIndexResponseBody</p>
     */
    public static class ShopScheduleIndex extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostTime")
        private Double costTime;

        @com.aliyun.core.annotation.NameInMap("FailShopNum")
        private Integer failShopNum;

        @com.aliyun.core.annotation.NameInMap("FailShops")
        private java.util.List<FailShops> failShops;

        @com.aliyun.core.annotation.NameInMap("ScheduleNum")
        private Integer scheduleNum;

        @com.aliyun.core.annotation.NameInMap("ScheduleShopNum")
        private Integer scheduleShopNum;

        @com.aliyun.core.annotation.NameInMap("SuccessRate")
        private Float successRate;

        private ShopScheduleIndex(Builder builder) {
            this.costTime = builder.costTime;
            this.failShopNum = builder.failShopNum;
            this.failShops = builder.failShops;
            this.scheduleNum = builder.scheduleNum;
            this.scheduleShopNum = builder.scheduleShopNum;
            this.successRate = builder.successRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShopScheduleIndex create() {
            return builder().build();
        }

        /**
         * @return costTime
         */
        public Double getCostTime() {
            return this.costTime;
        }

        /**
         * @return failShopNum
         */
        public Integer getFailShopNum() {
            return this.failShopNum;
        }

        /**
         * @return failShops
         */
        public java.util.List<FailShops> getFailShops() {
            return this.failShops;
        }

        /**
         * @return scheduleNum
         */
        public Integer getScheduleNum() {
            return this.scheduleNum;
        }

        /**
         * @return scheduleShopNum
         */
        public Integer getScheduleShopNum() {
            return this.scheduleShopNum;
        }

        /**
         * @return successRate
         */
        public Float getSuccessRate() {
            return this.successRate;
        }

        public static final class Builder {
            private Double costTime; 
            private Integer failShopNum; 
            private java.util.List<FailShops> failShops; 
            private Integer scheduleNum; 
            private Integer scheduleShopNum; 
            private Float successRate; 

            /**
             * CostTime.
             */
            public Builder costTime(Double costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * FailShopNum.
             */
            public Builder failShopNum(Integer failShopNum) {
                this.failShopNum = failShopNum;
                return this;
            }

            /**
             * FailShops.
             */
            public Builder failShops(java.util.List<FailShops> failShops) {
                this.failShops = failShops;
                return this;
            }

            /**
             * ScheduleNum.
             */
            public Builder scheduleNum(Integer scheduleNum) {
                this.scheduleNum = scheduleNum;
                return this;
            }

            /**
             * ScheduleShopNum.
             */
            public Builder scheduleShopNum(Integer scheduleShopNum) {
                this.scheduleShopNum = scheduleShopNum;
                return this;
            }

            /**
             * SuccessRate.
             */
            public Builder successRate(Float successRate) {
                this.successRate = successRate;
                return this;
            }

            public ShopScheduleIndex build() {
                return new ShopScheduleIndex(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryShopIndexResponseBody} extends {@link TeaModel}
     *
     * <p>QueryShopIndexResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShopIndex")
        private ShopIndex shopIndex;

        @com.aliyun.core.annotation.NameInMap("ShopScheduleIndex")
        private ShopScheduleIndex shopScheduleIndex;

        private Data(Builder builder) {
            this.shopIndex = builder.shopIndex;
            this.shopScheduleIndex = builder.shopScheduleIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return shopIndex
         */
        public ShopIndex getShopIndex() {
            return this.shopIndex;
        }

        /**
         * @return shopScheduleIndex
         */
        public ShopScheduleIndex getShopScheduleIndex() {
            return this.shopScheduleIndex;
        }

        public static final class Builder {
            private ShopIndex shopIndex; 
            private ShopScheduleIndex shopScheduleIndex; 

            /**
             * ShopIndex.
             */
            public Builder shopIndex(ShopIndex shopIndex) {
                this.shopIndex = shopIndex;
                return this;
            }

            /**
             * ShopScheduleIndex.
             */
            public Builder shopScheduleIndex(ShopScheduleIndex shopScheduleIndex) {
                this.shopScheduleIndex = shopScheduleIndex;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
