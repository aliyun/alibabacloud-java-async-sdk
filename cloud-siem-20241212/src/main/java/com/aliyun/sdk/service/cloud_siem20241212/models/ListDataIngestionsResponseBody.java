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
 * {@link ListDataIngestionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataIngestionsResponseBody</p>
 */
public class ListDataIngestionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataIngestions")
    private java.util.List<DataIngestions> dataIngestions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataIngestionsResponseBody(Builder builder) {
        this.dataIngestions = builder.dataIngestions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataIngestionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataIngestions
     */
    public java.util.List<DataIngestions> getDataIngestions() {
        return this.dataIngestions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataIngestions> dataIngestions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataIngestionsResponseBody model) {
            this.dataIngestions = model.dataIngestions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of data ingestions.</p>
         */
        public Builder dataIngestions(java.util.List<DataIngestions> dataIngestions) {
            this.dataIngestions = dataIngestions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataIngestionsResponseBody build() {
            return new ListDataIngestionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataIngestionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataIngestionsResponseBody</p>
     */
    public static class DataIngestions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveTime")
        private Long activeTime;

        @com.aliyun.core.annotation.NameInMap("CapacityCount")
        private Integer capacityCount;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataIngestionId")
        private String dataIngestionId;

        @com.aliyun.core.annotation.NameInMap("DataIngestionMode")
        private String dataIngestionMode;

        @com.aliyun.core.annotation.NameInMap("DataIngestionModeEditable")
        private Boolean dataIngestionModeEditable;

        @com.aliyun.core.annotation.NameInMap("DataIngestionState")
        private String dataIngestionState;

        @com.aliyun.core.annotation.NameInMap("DataIngestionStateCode")
        private String dataIngestionStateCode;

        @com.aliyun.core.annotation.NameInMap("DataIngestionStatus")
        private String dataIngestionStatus;

        @com.aliyun.core.annotation.NameInMap("DataIngestionTemplateId")
        private String dataIngestionTemplateId;

        @com.aliyun.core.annotation.NameInMap("DataIngestionType")
        private String dataIngestionType;

        @com.aliyun.core.annotation.NameInMap("DataSourceEditable")
        private Boolean dataSourceEditable;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleEditable")
        private Boolean normalizationRuleEditable;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
        private String normalizationRuleId;

        @com.aliyun.core.annotation.NameInMap("RealtimeDataSourceId")
        private String realtimeDataSourceId;

        @com.aliyun.core.annotation.NameInMap("ScanDataSourceId")
        private String scanDataSourceId;

        @com.aliyun.core.annotation.NameInMap("StreamJobId")
        private String streamJobId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private DataIngestions(Builder builder) {
            this.activeTime = builder.activeTime;
            this.capacityCount = builder.capacityCount;
            this.createTime = builder.createTime;
            this.dataIngestionId = builder.dataIngestionId;
            this.dataIngestionMode = builder.dataIngestionMode;
            this.dataIngestionModeEditable = builder.dataIngestionModeEditable;
            this.dataIngestionState = builder.dataIngestionState;
            this.dataIngestionStateCode = builder.dataIngestionStateCode;
            this.dataIngestionStatus = builder.dataIngestionStatus;
            this.dataIngestionTemplateId = builder.dataIngestionTemplateId;
            this.dataIngestionType = builder.dataIngestionType;
            this.dataSourceEditable = builder.dataSourceEditable;
            this.dataSourceId = builder.dataSourceId;
            this.normalizationRuleEditable = builder.normalizationRuleEditable;
            this.normalizationRuleId = builder.normalizationRuleId;
            this.realtimeDataSourceId = builder.realtimeDataSourceId;
            this.scanDataSourceId = builder.scanDataSourceId;
            this.streamJobId = builder.streamJobId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataIngestions create() {
            return builder().build();
        }

        /**
         * @return activeTime
         */
        public Long getActiveTime() {
            return this.activeTime;
        }

        /**
         * @return capacityCount
         */
        public Integer getCapacityCount() {
            return this.capacityCount;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataIngestionId
         */
        public String getDataIngestionId() {
            return this.dataIngestionId;
        }

        /**
         * @return dataIngestionMode
         */
        public String getDataIngestionMode() {
            return this.dataIngestionMode;
        }

        /**
         * @return dataIngestionModeEditable
         */
        public Boolean getDataIngestionModeEditable() {
            return this.dataIngestionModeEditable;
        }

        /**
         * @return dataIngestionState
         */
        public String getDataIngestionState() {
            return this.dataIngestionState;
        }

        /**
         * @return dataIngestionStateCode
         */
        public String getDataIngestionStateCode() {
            return this.dataIngestionStateCode;
        }

        /**
         * @return dataIngestionStatus
         */
        public String getDataIngestionStatus() {
            return this.dataIngestionStatus;
        }

        /**
         * @return dataIngestionTemplateId
         */
        public String getDataIngestionTemplateId() {
            return this.dataIngestionTemplateId;
        }

        /**
         * @return dataIngestionType
         */
        public String getDataIngestionType() {
            return this.dataIngestionType;
        }

        /**
         * @return dataSourceEditable
         */
        public Boolean getDataSourceEditable() {
            return this.dataSourceEditable;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return normalizationRuleEditable
         */
        public Boolean getNormalizationRuleEditable() {
            return this.normalizationRuleEditable;
        }

        /**
         * @return normalizationRuleId
         */
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        /**
         * @return realtimeDataSourceId
         */
        public String getRealtimeDataSourceId() {
            return this.realtimeDataSourceId;
        }

        /**
         * @return scanDataSourceId
         */
        public String getScanDataSourceId() {
            return this.scanDataSourceId;
        }

        /**
         * @return streamJobId
         */
        public String getStreamJobId() {
            return this.streamJobId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long activeTime; 
            private Integer capacityCount; 
            private Long createTime; 
            private String dataIngestionId; 
            private String dataIngestionMode; 
            private Boolean dataIngestionModeEditable; 
            private String dataIngestionState; 
            private String dataIngestionStateCode; 
            private String dataIngestionStatus; 
            private String dataIngestionTemplateId; 
            private String dataIngestionType; 
            private Boolean dataSourceEditable; 
            private String dataSourceId; 
            private Boolean normalizationRuleEditable; 
            private String normalizationRuleId; 
            private String realtimeDataSourceId; 
            private String scanDataSourceId; 
            private String streamJobId; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(DataIngestions model) {
                this.activeTime = model.activeTime;
                this.capacityCount = model.capacityCount;
                this.createTime = model.createTime;
                this.dataIngestionId = model.dataIngestionId;
                this.dataIngestionMode = model.dataIngestionMode;
                this.dataIngestionModeEditable = model.dataIngestionModeEditable;
                this.dataIngestionState = model.dataIngestionState;
                this.dataIngestionStateCode = model.dataIngestionStateCode;
                this.dataIngestionStatus = model.dataIngestionStatus;
                this.dataIngestionTemplateId = model.dataIngestionTemplateId;
                this.dataIngestionType = model.dataIngestionType;
                this.dataSourceEditable = model.dataSourceEditable;
                this.dataSourceId = model.dataSourceId;
                this.normalizationRuleEditable = model.normalizationRuleEditable;
                this.normalizationRuleId = model.normalizationRuleId;
                this.realtimeDataSourceId = model.realtimeDataSourceId;
                this.scanDataSourceId = model.scanDataSourceId;
                this.streamJobId = model.streamJobId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The activation time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder activeTime(Long activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * <p>The number of associated security capabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder capacityCount(Integer capacityCount) {
                this.capacityCount = capacityCount;
                return this;
            }

            /**
             * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The data ingestion ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_sas_netstat_ingestion_173326*******</p>
             */
            public Builder dataIngestionId(String dataIngestionId) {
                this.dataIngestionId = dataIngestionId;
                return this;
            }

            /**
             * <p>The data ingestion mode. Valid values:</p>
             * <ul>
             * <li>realtime</li>
             * <li>scan</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>realtime</p>
             */
            public Builder dataIngestionMode(String dataIngestionMode) {
                this.dataIngestionMode = dataIngestionMode;
                return this;
            }

            /**
             * <p>Indicates whether the data ingestion mode is editable.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataIngestionModeEditable(Boolean dataIngestionModeEditable) {
                this.dataIngestionModeEditable = dataIngestionModeEditable;
                return this;
            }

            /**
             * <p>The data ingestion state. Valid values:</p>
             * <ul>
             * <li>ingested</li>
             * <li>uningested</li>
             * <li>abnormal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ingested</p>
             */
            public Builder dataIngestionState(String dataIngestionState) {
                this.dataIngestionState = dataIngestionState;
                return this;
            }

            /**
             * <p>The error code for the data ingestion exception state.</p>
             * 
             * <strong>example:</strong>
             * <p>UserUnauthorized</p>
             */
            public Builder dataIngestionStateCode(String dataIngestionStateCode) {
                this.dataIngestionStateCode = dataIngestionStateCode;
                return this;
            }

            /**
             * <p>The accessed state of data ingestion. Valid values:</p>
             * <ul>
             * <li>enabled: Enabled.</li>
             * <li>disabled: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder dataIngestionStatus(String dataIngestionStatus) {
                this.dataIngestionStatus = dataIngestionStatus;
                return this;
            }

            /**
             * <p>The data ingestion template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud_sas_netstat_ingestion</p>
             */
            public Builder dataIngestionTemplateId(String dataIngestionTemplateId) {
                this.dataIngestionTemplateId = dataIngestionTemplateId;
                return this;
            }

            /**
             * <p>The data ingestion type. Valid values:</p>
             * <ul>
             * <li>preset</li>
             * <li>custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder dataIngestionType(String dataIngestionType) {
                this.dataIngestionType = dataIngestionType;
                return this;
            }

            /**
             * <p>Indicates whether the data source is editable.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataSourceEditable(Boolean dataSourceEditable) {
                this.dataSourceEditable = dataSourceEditable;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-scpfegri73oyoknbc90c</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>Indicates whether the normalization rule is editable.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder normalizationRuleEditable(Boolean normalizationRuleEditable) {
                this.normalizationRuleEditable = normalizationRuleEditable;
                return this;
            }

            /**
             * <p>The normalization rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>nr-0aywiqdtaqdvwac7xkbjsf3a</p>
             */
            public Builder normalizationRuleId(String normalizationRuleId) {
                this.normalizationRuleId = normalizationRuleId;
                return this;
            }

            /**
             * <p>The data source ID in real-time mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-scpfegri73oyoknbc90c</p>
             */
            public Builder realtimeDataSourceId(String realtimeDataSourceId) {
                this.realtimeDataSourceId = realtimeDataSourceId;
                return this;
            }

            /**
             * <p>The data source ID in scan mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-scpfegri73oyoknbc90c</p>
             */
            public Builder scanDataSourceId(String scanDataSourceId) {
                this.scanDataSourceId = scanDataSourceId;
                return this;
            }

            /**
             * <p>The stream job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>73a78aa245e3b1299d6ceed093de7bd8</p>
             */
            public Builder streamJobId(String streamJobId) {
                this.streamJobId = streamJobId;
                return this;
            }

            /**
             * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataIngestions build() {
                return new DataIngestions(this);
            } 

        } 

    }
}
