// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetDataBatchIngestionResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataBatchIngestionResponseBody</p>
 */
public class GetDataBatchIngestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataBatchIngestion")
    private DataBatchIngestion dataBatchIngestion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataBatchIngestionResponseBody(Builder builder) {
        this.dataBatchIngestion = builder.dataBatchIngestion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataBatchIngestionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataBatchIngestion
     */
    public DataBatchIngestion getDataBatchIngestion() {
        return this.dataBatchIngestion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataBatchIngestion dataBatchIngestion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataBatchIngestionResponseBody model) {
            this.dataBatchIngestion = model.dataBatchIngestion;
            this.requestId = model.requestId;
        } 

        /**
         * DataBatchIngestion.
         */
        public Builder dataBatchIngestion(DataBatchIngestion dataBatchIngestion) {
            this.dataBatchIngestion = dataBatchIngestion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataBatchIngestionResponseBody build() {
            return new GetDataBatchIngestionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataBatchIngestionResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataBatchIngestionResponseBody</p>
     */
    public static class DataIngestions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataIngestionId")
        private String dataIngestionId;

        @com.aliyun.core.annotation.NameInMap("DataIngestionStatus")
        private String dataIngestionStatus;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("VendorId")
        private String vendorId;

        private DataIngestions(Builder builder) {
            this.dataIngestionId = builder.dataIngestionId;
            this.dataIngestionStatus = builder.dataIngestionStatus;
            this.dataSourceId = builder.dataSourceId;
            this.productId = builder.productId;
            this.vendorId = builder.vendorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataIngestions create() {
            return builder().build();
        }

        /**
         * @return dataIngestionId
         */
        public String getDataIngestionId() {
            return this.dataIngestionId;
        }

        /**
         * @return dataIngestionStatus
         */
        public String getDataIngestionStatus() {
            return this.dataIngestionStatus;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return vendorId
         */
        public String getVendorId() {
            return this.vendorId;
        }

        public static final class Builder {
            private String dataIngestionId; 
            private String dataIngestionStatus; 
            private String dataSourceId; 
            private String productId; 
            private String vendorId; 

            private Builder() {
            } 

            private Builder(DataIngestions model) {
                this.dataIngestionId = model.dataIngestionId;
                this.dataIngestionStatus = model.dataIngestionStatus;
                this.dataSourceId = model.dataSourceId;
                this.productId = model.productId;
                this.vendorId = model.vendorId;
            } 

            /**
             * DataIngestionId.
             */
            public Builder dataIngestionId(String dataIngestionId) {
                this.dataIngestionId = dataIngestionId;
                return this;
            }

            /**
             * DataIngestionStatus.
             */
            public Builder dataIngestionStatus(String dataIngestionStatus) {
                this.dataIngestionStatus = dataIngestionStatus;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * VendorId.
             */
            public Builder vendorId(String vendorId) {
                this.vendorId = vendorId;
                return this;
            }

            public DataIngestions build() {
                return new DataIngestions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataBatchIngestionResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataBatchIngestionResponseBody</p>
     */
    public static class DataBatchIngestion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApsaraDataIngestionIds")
        private java.util.List<String> apsaraDataIngestionIds;

        @com.aliyun.core.annotation.NameInMap("AutoScanNew")
        private String autoScanNew;

        @com.aliyun.core.annotation.NameInMap("DataBatchIngestionEffectTime")
        private String dataBatchIngestionEffectTime;

        @com.aliyun.core.annotation.NameInMap("DataBatchIngestionMode")
        private String dataBatchIngestionMode;

        @com.aliyun.core.annotation.NameInMap("DataBatchIngestionSetTime")
        private String dataBatchIngestionSetTime;

        @com.aliyun.core.annotation.NameInMap("DataBatchIngestionStatus")
        private String dataBatchIngestionStatus;

        @com.aliyun.core.annotation.NameInMap("DataIngestions")
        private java.util.List<DataIngestions> dataIngestions;

        @com.aliyun.core.annotation.NameInMap("DataSourceRecognizeEnabled")
        private Boolean dataSourceRecognizeEnabled;

        @com.aliyun.core.annotation.NameInMap("LogUserIds")
        private java.util.List<String> logUserIds;

        @com.aliyun.core.annotation.NameInMap("RecommendDataIngestionIds")
        private java.util.List<String> recommendDataIngestionIds;

        private DataBatchIngestion(Builder builder) {
            this.apsaraDataIngestionIds = builder.apsaraDataIngestionIds;
            this.autoScanNew = builder.autoScanNew;
            this.dataBatchIngestionEffectTime = builder.dataBatchIngestionEffectTime;
            this.dataBatchIngestionMode = builder.dataBatchIngestionMode;
            this.dataBatchIngestionSetTime = builder.dataBatchIngestionSetTime;
            this.dataBatchIngestionStatus = builder.dataBatchIngestionStatus;
            this.dataIngestions = builder.dataIngestions;
            this.dataSourceRecognizeEnabled = builder.dataSourceRecognizeEnabled;
            this.logUserIds = builder.logUserIds;
            this.recommendDataIngestionIds = builder.recommendDataIngestionIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataBatchIngestion create() {
            return builder().build();
        }

        /**
         * @return apsaraDataIngestionIds
         */
        public java.util.List<String> getApsaraDataIngestionIds() {
            return this.apsaraDataIngestionIds;
        }

        /**
         * @return autoScanNew
         */
        public String getAutoScanNew() {
            return this.autoScanNew;
        }

        /**
         * @return dataBatchIngestionEffectTime
         */
        public String getDataBatchIngestionEffectTime() {
            return this.dataBatchIngestionEffectTime;
        }

        /**
         * @return dataBatchIngestionMode
         */
        public String getDataBatchIngestionMode() {
            return this.dataBatchIngestionMode;
        }

        /**
         * @return dataBatchIngestionSetTime
         */
        public String getDataBatchIngestionSetTime() {
            return this.dataBatchIngestionSetTime;
        }

        /**
         * @return dataBatchIngestionStatus
         */
        public String getDataBatchIngestionStatus() {
            return this.dataBatchIngestionStatus;
        }

        /**
         * @return dataIngestions
         */
        public java.util.List<DataIngestions> getDataIngestions() {
            return this.dataIngestions;
        }

        /**
         * @return dataSourceRecognizeEnabled
         */
        public Boolean getDataSourceRecognizeEnabled() {
            return this.dataSourceRecognizeEnabled;
        }

        /**
         * @return logUserIds
         */
        public java.util.List<String> getLogUserIds() {
            return this.logUserIds;
        }

        /**
         * @return recommendDataIngestionIds
         */
        public java.util.List<String> getRecommendDataIngestionIds() {
            return this.recommendDataIngestionIds;
        }

        public static final class Builder {
            private java.util.List<String> apsaraDataIngestionIds; 
            private String autoScanNew; 
            private String dataBatchIngestionEffectTime; 
            private String dataBatchIngestionMode; 
            private String dataBatchIngestionSetTime; 
            private String dataBatchIngestionStatus; 
            private java.util.List<DataIngestions> dataIngestions; 
            private Boolean dataSourceRecognizeEnabled; 
            private java.util.List<String> logUserIds; 
            private java.util.List<String> recommendDataIngestionIds; 

            private Builder() {
            } 

            private Builder(DataBatchIngestion model) {
                this.apsaraDataIngestionIds = model.apsaraDataIngestionIds;
                this.autoScanNew = model.autoScanNew;
                this.dataBatchIngestionEffectTime = model.dataBatchIngestionEffectTime;
                this.dataBatchIngestionMode = model.dataBatchIngestionMode;
                this.dataBatchIngestionSetTime = model.dataBatchIngestionSetTime;
                this.dataBatchIngestionStatus = model.dataBatchIngestionStatus;
                this.dataIngestions = model.dataIngestions;
                this.dataSourceRecognizeEnabled = model.dataSourceRecognizeEnabled;
                this.logUserIds = model.logUserIds;
                this.recommendDataIngestionIds = model.recommendDataIngestionIds;
            } 

            /**
             * ApsaraDataIngestionIds.
             */
            public Builder apsaraDataIngestionIds(java.util.List<String> apsaraDataIngestionIds) {
                this.apsaraDataIngestionIds = apsaraDataIngestionIds;
                return this;
            }

            /**
             * AutoScanNew.
             */
            public Builder autoScanNew(String autoScanNew) {
                this.autoScanNew = autoScanNew;
                return this;
            }

            /**
             * DataBatchIngestionEffectTime.
             */
            public Builder dataBatchIngestionEffectTime(String dataBatchIngestionEffectTime) {
                this.dataBatchIngestionEffectTime = dataBatchIngestionEffectTime;
                return this;
            }

            /**
             * DataBatchIngestionMode.
             */
            public Builder dataBatchIngestionMode(String dataBatchIngestionMode) {
                this.dataBatchIngestionMode = dataBatchIngestionMode;
                return this;
            }

            /**
             * DataBatchIngestionSetTime.
             */
            public Builder dataBatchIngestionSetTime(String dataBatchIngestionSetTime) {
                this.dataBatchIngestionSetTime = dataBatchIngestionSetTime;
                return this;
            }

            /**
             * DataBatchIngestionStatus.
             */
            public Builder dataBatchIngestionStatus(String dataBatchIngestionStatus) {
                this.dataBatchIngestionStatus = dataBatchIngestionStatus;
                return this;
            }

            /**
             * DataIngestions.
             */
            public Builder dataIngestions(java.util.List<DataIngestions> dataIngestions) {
                this.dataIngestions = dataIngestions;
                return this;
            }

            /**
             * DataSourceRecognizeEnabled.
             */
            public Builder dataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
                this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
                return this;
            }

            /**
             * LogUserIds.
             */
            public Builder logUserIds(java.util.List<String> logUserIds) {
                this.logUserIds = logUserIds;
                return this;
            }

            /**
             * RecommendDataIngestionIds.
             */
            public Builder recommendDataIngestionIds(java.util.List<String> recommendDataIngestionIds) {
                this.recommendDataIngestionIds = recommendDataIngestionIds;
                return this;
            }

            public DataBatchIngestion build() {
                return new DataBatchIngestion(this);
            } 

        } 

    }
}
