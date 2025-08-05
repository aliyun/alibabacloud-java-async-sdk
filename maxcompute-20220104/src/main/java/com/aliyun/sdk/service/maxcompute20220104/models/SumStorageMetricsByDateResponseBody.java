// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link SumStorageMetricsByDateResponseBody} extends {@link TeaModel}
 *
 * <p>SumStorageMetricsByDateResponseBody</p>
 */
public class SumStorageMetricsByDateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SumStorageMetricsByDateResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SumStorageMetricsByDateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SumStorageMetricsByDateResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SumStorageMetricsByDateResponseBody build() {
            return new SumStorageMetricsByDateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SumStorageMetricsByDateResponseBody} extends {@link TeaModel}
     *
     * <p>SumStorageMetricsByDateResponseBody</p>
     */
    public static class ItemStorageMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("itemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("percentage")
        private Double percentage;

        @com.aliyun.core.annotation.NameInMap("usage")
        private String usage;

        private ItemStorageMetrics(Builder builder) {
            this.itemName = builder.itemName;
            this.percentage = builder.percentage;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemStorageMetrics create() {
            return builder().build();
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return percentage
         */
        public Double getPercentage() {
            return this.percentage;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String itemName; 
            private Double percentage; 
            private String usage; 

            private Builder() {
            } 

            private Builder(ItemStorageMetrics model) {
                this.itemName = model.itemName;
                this.percentage = model.percentage;
                this.usage = model.usage;
            } 

            /**
             * itemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * percentage.
             */
            public Builder percentage(Double percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public ItemStorageMetrics build() {
                return new ItemStorageMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link SumStorageMetricsByDateResponseBody} extends {@link TeaModel}
     *
     * <p>SumStorageMetricsByDateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("itemStorageMetrics")
        private java.util.List<ItemStorageMetrics> itemStorageMetrics;

        @com.aliyun.core.annotation.NameInMap("storageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("usage")
        private String usage;

        private Data(Builder builder) {
            this.dateTime = builder.dateTime;
            this.itemStorageMetrics = builder.itemStorageMetrics;
            this.storageType = builder.storageType;
            this.unit = builder.unit;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        /**
         * @return itemStorageMetrics
         */
        public java.util.List<ItemStorageMetrics> getItemStorageMetrics() {
            return this.itemStorageMetrics;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String dateTime; 
            private java.util.List<ItemStorageMetrics> itemStorageMetrics; 
            private String storageType; 
            private String unit; 
            private String usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dateTime = model.dateTime;
                this.itemStorageMetrics = model.itemStorageMetrics;
                this.storageType = model.storageType;
                this.unit = model.unit;
                this.usage = model.usage;
            } 

            /**
             * dateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * itemStorageMetrics.
             */
            public Builder itemStorageMetrics(java.util.List<ItemStorageMetrics> itemStorageMetrics) {
                this.itemStorageMetrics = itemStorageMetrics;
                return this;
            }

            /**
             * storageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
