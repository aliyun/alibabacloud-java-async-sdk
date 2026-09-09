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

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SumStorageMetricsByDateResponseBody(Builder builder) {
        this.data = builder.data;
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
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SumStorageMetricsByDateResponseBody model) {
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li><p>1xx: Informational. The request is received and the process is continuing.</p>
         * </li>
         * <li><p>2xx: Success. The request is successfully received, understood, and accepted.</p>
         * </li>
         * <li><p>3xx: Redirection. Further action needs to be taken to complete the request.</p>
         * </li>
         * <li><p>4xx: Client Error. The request contains bad syntax or cannot be fulfilled.</p>
         * </li>
         * <li><p>5xx: Server Error. The server fails to fulfill an apparently valid request.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0abb781a17411408145995819e0dae</p>
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
             * <p>If the type is PROJECT, this parameter indicates the project name. If the type is STORAGE_TYPE, this parameter indicates the storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>prj</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The percentage of the storage usage.</p>
             * 
             * <strong>example:</strong>
             * <p>91.22</p>
             */
            public Builder percentage(Double percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The storage usage.</p>
             * 
             * <strong>example:</strong>
             * <p>300.560392</p>
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
             * <p>The date of the statistics. The format is yyyyMMdd.</p>
             * 
             * <strong>example:</strong>
             * <p>20250719</p>
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * <p>The list of storage usage of a specified type.</p>
             */
            public Builder itemStorageMetrics(java.util.List<ItemStorageMetrics> itemStorageMetrics) {
                this.itemStorageMetrics = itemStorageMetrics;
                return this;
            }

            /**
             * <p>The storage type. Valid values:</p>
             * <ul>
             * <li><p>Storage: Standard.</p>
             * </li>
             * <li><p>LowFreqStorage: Infrequent Access (IA).</p>
             * </li>
             * <li><p>ColdStorage: Archive.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Storage</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The unit of the total storage.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The total storage.</p>
             * 
             * <strong>example:</strong>
             * <p>329.503338</p>
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
