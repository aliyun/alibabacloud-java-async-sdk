// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDIJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetDIJobResponseBody</p>
 */
public class GetDIJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDIJobResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDIJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDIJobResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C99E2BE6-9DEA-5C2E-8F51-1DDCFEADE490</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDIJobResponseBody build() {
            return new GetDIJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class DestinationDataSourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        private DestinationDataSourceSettings(Builder builder) {
            this.dataSourceName = builder.dataSourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationDataSourceSettings create() {
            return builder().build();
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public static final class Builder {
            private String dataSourceName; 

            private Builder() {
            } 

            private Builder(DestinationDataSourceSettings model) {
                this.dataSourceName = model.dataSourceName;
            } 

            /**
             * <p>The name of the destination data source.</p>
             * 
             * <strong>example:</strong>
             * <p>dw_mysql</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            public DestinationDataSourceSettings build() {
                return new DestinationDataSourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class ColumnDataTypeSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationDataType")
        private String destinationDataType;

        @com.aliyun.core.annotation.NameInMap("SourceDataType")
        private String sourceDataType;

        private ColumnDataTypeSettings(Builder builder) {
            this.destinationDataType = builder.destinationDataType;
            this.sourceDataType = builder.sourceDataType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnDataTypeSettings create() {
            return builder().build();
        }

        /**
         * @return destinationDataType
         */
        public String getDestinationDataType() {
            return this.destinationDataType;
        }

        /**
         * @return sourceDataType
         */
        public String getSourceDataType() {
            return this.sourceDataType;
        }

        public static final class Builder {
            private String destinationDataType; 
            private String sourceDataType; 

            private Builder() {
            } 

            private Builder(ColumnDataTypeSettings model) {
                this.destinationDataType = model.destinationDataType;
                this.sourceDataType = model.sourceDataType;
            } 

            /**
             * <p>The destination data type, such as bigint, boolean, string, text, datetime, timestamp, decimal, and binary. Data types vary based on the data source type.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder destinationDataType(String destinationDataType) {
                this.destinationDataType = destinationDataType;
                return this;
            }

            /**
             * <p>The source data type, such as bigint, boolean, string, text, datetime, timestamp, decimal, and binary. Data types vary based on the data source type.</p>
             * 
             * <strong>example:</strong>
             * <p>bigint</p>
             */
            public Builder sourceDataType(String sourceDataType) {
                this.sourceDataType = sourceDataType;
                return this;
            }

            public ColumnDataTypeSettings build() {
                return new ColumnDataTypeSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class CycleScheduleSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleMigrationType")
        private String cycleMigrationType;

        @com.aliyun.core.annotation.NameInMap("ScheduleParameters")
        private String scheduleParameters;

        private CycleScheduleSettings(Builder builder) {
            this.cycleMigrationType = builder.cycleMigrationType;
            this.scheduleParameters = builder.scheduleParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CycleScheduleSettings create() {
            return builder().build();
        }

        /**
         * @return cycleMigrationType
         */
        public String getCycleMigrationType() {
            return this.cycleMigrationType;
        }

        /**
         * @return scheduleParameters
         */
        public String getScheduleParameters() {
            return this.scheduleParameters;
        }

        public static final class Builder {
            private String cycleMigrationType; 
            private String scheduleParameters; 

            private Builder() {
            } 

            private Builder(CycleScheduleSettings model) {
                this.cycleMigrationType = model.cycleMigrationType;
                this.scheduleParameters = model.scheduleParameters;
            } 

            /**
             * <p>The synchronization type that requires periodic scheduling. Valid values:</p>
             * <ul>
             * <li>Full: full data synchronization.</li>
             * <li>OfflineIncremental: batch incremental synchronization.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Full</p>
             */
            public Builder cycleMigrationType(String cycleMigrationType) {
                this.cycleMigrationType = cycleMigrationType;
                return this;
            }

            /**
             * <p>The scheduling parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>bizdate=$bizdate</p>
             */
            public Builder scheduleParameters(String scheduleParameters) {
                this.scheduleParameters = scheduleParameters;
                return this;
            }

            public CycleScheduleSettings build() {
                return new CycleScheduleSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class DdlHandlingSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DdlHandlingSettings(Builder builder) {
            this.action = builder.action;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DdlHandlingSettings create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String action; 
            private String type; 

            private Builder() {
            } 

            private Builder(DdlHandlingSettings model) {
                this.action = model.action;
                this.type = model.type;
            } 

            /**
             * <p>The handling action. Valid values:</p>
             * <ul>
             * <li>Ignore: ignores the DDL statement.</li>
             * <li>Critical: reports an error.</li>
             * <li>Normal: processes the DDL statement normally.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ignore</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The DDL type. Valid values:</p>
             * <ul>
             * <li>RenameColumn: renames a column.</li>
             * <li>ModifyColumn: modifies a column.</li>
             * <li>CreateTable: creates a table.</li>
             * <li>TruncateTable: truncates a table.</li>
             * <li>DropTable: drops a table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CreateTable</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DdlHandlingSettings build() {
                return new DdlHandlingSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class RuntimeSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RuntimeSettings(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeSettings create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(RuntimeSettings model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The setting name. Valid values:</p>
             * <ul>
             * <li>src.offline.datasource.max.connection: the maximum number of connections to the source for batch tasks.</li>
             * <li>dst.offline.truncate: specifies whether to truncate the destination table.</li>
             * <li>runtime.offline.speed.limit.enable: specifies whether to enable throttling for batch tasks.</li>
             * <li>runtime.offline.concurrent: the concurrency of batch synchronization tasks.</li>
             * <li>runtime.enable.auto.create.schema: specifies whether to automatically create a schema at the destination.</li>
             * <li>runtime.realtime.concurrent: the concurrency of real-time tasks.</li>
             * <li>runtime.realtime.failover.minute.dataxcdc: the wait time in minutes before restarting after a failover failure.</li>
             * <li>runtime.realtime.failover.times.dataxcdc: the number of restart attempts after a failover failure.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>runtime.offline.concurrent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The setting value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RuntimeSettings build() {
                return new RuntimeSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class JobSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelSettings")
        private String channelSettings;

        @com.aliyun.core.annotation.NameInMap("ColumnDataTypeSettings")
        private java.util.List<ColumnDataTypeSettings> columnDataTypeSettings;

        @com.aliyun.core.annotation.NameInMap("CycleScheduleSettings")
        private CycleScheduleSettings cycleScheduleSettings;

        @com.aliyun.core.annotation.NameInMap("DdlHandlingSettings")
        private java.util.List<DdlHandlingSettings> ddlHandlingSettings;

        @com.aliyun.core.annotation.NameInMap("RuntimeSettings")
        private java.util.List<RuntimeSettings> runtimeSettings;

        private JobSettings(Builder builder) {
            this.channelSettings = builder.channelSettings;
            this.columnDataTypeSettings = builder.columnDataTypeSettings;
            this.cycleScheduleSettings = builder.cycleScheduleSettings;
            this.ddlHandlingSettings = builder.ddlHandlingSettings;
            this.runtimeSettings = builder.runtimeSettings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobSettings create() {
            return builder().build();
        }

        /**
         * @return channelSettings
         */
        public String getChannelSettings() {
            return this.channelSettings;
        }

        /**
         * @return columnDataTypeSettings
         */
        public java.util.List<ColumnDataTypeSettings> getColumnDataTypeSettings() {
            return this.columnDataTypeSettings;
        }

        /**
         * @return cycleScheduleSettings
         */
        public CycleScheduleSettings getCycleScheduleSettings() {
            return this.cycleScheduleSettings;
        }

        /**
         * @return ddlHandlingSettings
         */
        public java.util.List<DdlHandlingSettings> getDdlHandlingSettings() {
            return this.ddlHandlingSettings;
        }

        /**
         * @return runtimeSettings
         */
        public java.util.List<RuntimeSettings> getRuntimeSettings() {
            return this.runtimeSettings;
        }

        public static final class Builder {
            private String channelSettings; 
            private java.util.List<ColumnDataTypeSettings> columnDataTypeSettings; 
            private CycleScheduleSettings cycleScheduleSettings; 
            private java.util.List<DdlHandlingSettings> ddlHandlingSettings; 
            private java.util.List<RuntimeSettings> runtimeSettings; 

            private Builder() {
            } 

            private Builder(JobSettings model) {
                this.channelSettings = model.channelSettings;
                this.columnDataTypeSettings = model.columnDataTypeSettings;
                this.cycleScheduleSettings = model.cycleScheduleSettings;
                this.ddlHandlingSettings = model.ddlHandlingSettings;
                this.runtimeSettings = model.runtimeSettings;
            } 

            /**
             * <p>The channel-related task settings. You can configure specific channels. Currently, Holo2Holo (synchronization from Hologres to Hologres) and Holo2Kafka (synchronization from Hologres to Kafka) are supported.</p>
             * <ol>
             * <li>Holo2Kafka</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}}</li>
             * <li>kafkaClientProperties: the Kafka producer parameters used when writing data to Kafka.</li>
             * <li>keyColumns: the Kafka columns to which data is written.</li>
             * <li>writeMode: the format in which data is written to Kafka. Valid values: json and canal.</li>
             * </ul>
             * <ol start="2">
             * <li>Holo2Holo</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</li>
             * <li>conflictMode: the conflict handling policy when writing data to Hologres. Valid values: replace (overwrite) and ignore (ignore).</li>
             * <li>writeMode: the method used to write data to Hologres. Valid values: replay and insert.</li>
             * <li>dynamicColumnAction: the method used to write dynamic columns to Hologres. Valid values: replay, insert, and ignore.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;structInfo&quot;:&quot;MANAGED&quot;,&quot;storageType&quot;:&quot;TEXTFILE&quot;,&quot;writeMode&quot;:&quot;APPEND&quot;,&quot;partitionColumns&quot;:[{&quot;columnName&quot;:&quot;pt&quot;,&quot;columnType&quot;:&quot;STRING&quot;,&quot;comment&quot;:&quot;&quot;}],&quot;fieldDelimiter&quot;:&quot;&quot;}</p>
             */
            public Builder channelSettings(String channelSettings) {
                this.channelSettings = channelSettings;
                return this;
            }

            /**
             * <p>The column type mappings.</p>
             */
            public Builder columnDataTypeSettings(java.util.List<ColumnDataTypeSettings> columnDataTypeSettings) {
                this.columnDataTypeSettings = columnDataTypeSettings;
                return this;
            }

            /**
             * <p>The periodic scheduling settings.</p>
             */
            public Builder cycleScheduleSettings(CycleScheduleSettings cycleScheduleSettings) {
                this.cycleScheduleSettings = cycleScheduleSettings;
                return this;
            }

            /**
             * <p>The array of DDL handling settings, which includes a list of DDL types to be handled and their corresponding rules.</p>
             */
            public Builder ddlHandlingSettings(java.util.List<DdlHandlingSettings> ddlHandlingSettings) {
                this.ddlHandlingSettings = ddlHandlingSettings;
                return this;
            }

            /**
             * <p>The runtime settings.</p>
             */
            public Builder runtimeSettings(java.util.List<RuntimeSettings> runtimeSettings) {
                this.runtimeSettings = runtimeSettings;
                return this;
            }

            public JobSettings build() {
                return new JobSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class OfflineResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestedCu")
        private Double requestedCu;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupIdentifier")
        private String resourceGroupIdentifier;

        private OfflineResourceSettings(Builder builder) {
            this.requestedCu = builder.requestedCu;
            this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfflineResourceSettings create() {
            return builder().build();
        }

        /**
         * @return requestedCu
         */
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        /**
         * @return resourceGroupIdentifier
         */
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

        public static final class Builder {
            private Double requestedCu; 
            private String resourceGroupIdentifier; 

            private Builder() {
            } 

            private Builder(OfflineResourceSettings model) {
                this.requestedCu = model.requestedCu;
                this.resourceGroupIdentifier = model.resourceGroupIdentifier;
            } 

            /**
             * <p>The number of compute units (CUs) of the scheduling resource group used by the batch synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the data integration resource group used for batch synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>di_resourcegroup_v1</p>
             */
            public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
                this.resourceGroupIdentifier = resourceGroupIdentifier;
                return this;
            }

            public OfflineResourceSettings build() {
                return new OfflineResourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class RealtimeResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestedCu")
        private Double requestedCu;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupIdentifier")
        private String resourceGroupIdentifier;

        private RealtimeResourceSettings(Builder builder) {
            this.requestedCu = builder.requestedCu;
            this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealtimeResourceSettings create() {
            return builder().build();
        }

        /**
         * @return requestedCu
         */
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        /**
         * @return resourceGroupIdentifier
         */
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

        public static final class Builder {
            private Double requestedCu; 
            private String resourceGroupIdentifier; 

            private Builder() {
            } 

            private Builder(RealtimeResourceSettings model) {
                this.requestedCu = model.requestedCu;
                this.resourceGroupIdentifier = model.resourceGroupIdentifier;
            } 

            /**
             * <p>The number of CUs of the data integration resource group used for real-time synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the data integration resource group used for real-time tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>di_resourcegroup_v1</p>
             */
            public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
                this.resourceGroupIdentifier = resourceGroupIdentifier;
                return this;
            }

            public RealtimeResourceSettings build() {
                return new RealtimeResourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class ScheduleResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestedCu")
        private Double requestedCu;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupIdentifier")
        private String resourceGroupIdentifier;

        private ScheduleResourceSettings(Builder builder) {
            this.requestedCu = builder.requestedCu;
            this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleResourceSettings create() {
            return builder().build();
        }

        /**
         * @return requestedCu
         */
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        /**
         * @return resourceGroupIdentifier
         */
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

        public static final class Builder {
            private Double requestedCu; 
            private String resourceGroupIdentifier; 

            private Builder() {
            } 

            private Builder(ScheduleResourceSettings model) {
                this.requestedCu = model.requestedCu;
                this.resourceGroupIdentifier = model.resourceGroupIdentifier;
            } 

            /**
             * <p>The number of CUs of the data integration resource group used by the batch scheduling task.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the scheduling resource group used by the batch scheduling task.</p>
             * 
             * <strong>example:</strong>
             * <p>schedual_resourcegroup_v1</p>
             */
            public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
                this.resourceGroupIdentifier = resourceGroupIdentifier;
                return this;
            }

            public ScheduleResourceSettings build() {
                return new ScheduleResourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class ResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OfflineResourceSettings")
        private OfflineResourceSettings offlineResourceSettings;

        @com.aliyun.core.annotation.NameInMap("RealtimeResourceSettings")
        private RealtimeResourceSettings realtimeResourceSettings;

        @com.aliyun.core.annotation.NameInMap("ScheduleResourceSettings")
        private ScheduleResourceSettings scheduleResourceSettings;

        private ResourceSettings(Builder builder) {
            this.offlineResourceSettings = builder.offlineResourceSettings;
            this.realtimeResourceSettings = builder.realtimeResourceSettings;
            this.scheduleResourceSettings = builder.scheduleResourceSettings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSettings create() {
            return builder().build();
        }

        /**
         * @return offlineResourceSettings
         */
        public OfflineResourceSettings getOfflineResourceSettings() {
            return this.offlineResourceSettings;
        }

        /**
         * @return realtimeResourceSettings
         */
        public RealtimeResourceSettings getRealtimeResourceSettings() {
            return this.realtimeResourceSettings;
        }

        /**
         * @return scheduleResourceSettings
         */
        public ScheduleResourceSettings getScheduleResourceSettings() {
            return this.scheduleResourceSettings;
        }

        public static final class Builder {
            private OfflineResourceSettings offlineResourceSettings; 
            private RealtimeResourceSettings realtimeResourceSettings; 
            private ScheduleResourceSettings scheduleResourceSettings; 

            private Builder() {
            } 

            private Builder(ResourceSettings model) {
                this.offlineResourceSettings = model.offlineResourceSettings;
                this.realtimeResourceSettings = model.realtimeResourceSettings;
                this.scheduleResourceSettings = model.scheduleResourceSettings;
            } 

            /**
             * <p>The batch synchronization resources.</p>
             */
            public Builder offlineResourceSettings(OfflineResourceSettings offlineResourceSettings) {
                this.offlineResourceSettings = offlineResourceSettings;
                return this;
            }

            /**
             * <p>The real-time synchronization resources.</p>
             */
            public Builder realtimeResourceSettings(RealtimeResourceSettings realtimeResourceSettings) {
                this.realtimeResourceSettings = realtimeResourceSettings;
                return this;
            }

            /**
             * <p>The scheduling resource.</p>
             */
            public Builder scheduleResourceSettings(ScheduleResourceSettings scheduleResourceSettings) {
                this.scheduleResourceSettings = scheduleResourceSettings;
                return this;
            }

            public ResourceSettings build() {
                return new ResourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class DataSourceProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        private DataSourceProperties(Builder builder) {
            this.encoding = builder.encoding;
            this.timezone = builder.timezone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceProperties create() {
            return builder().build();
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        public static final class Builder {
            private String encoding; 
            private String timezone; 

            private Builder() {
            } 

            private Builder(DataSourceProperties model) {
                this.encoding = model.encoding;
                this.timezone = model.timezone;
            } 

            /**
             * <p>The database encoding.</p>
             * 
             * <strong>example:</strong>
             * <p>UTF-8</p>
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>GMT+8</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public DataSourceProperties build() {
                return new DataSourceProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class SourceDataSourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DataSourceProperties")
        private DataSourceProperties dataSourceProperties;

        private SourceDataSourceSettings(Builder builder) {
            this.dataSourceName = builder.dataSourceName;
            this.dataSourceProperties = builder.dataSourceProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceDataSourceSettings create() {
            return builder().build();
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return dataSourceProperties
         */
        public DataSourceProperties getDataSourceProperties() {
            return this.dataSourceProperties;
        }

        public static final class Builder {
            private String dataSourceName; 
            private DataSourceProperties dataSourceProperties; 

            private Builder() {
            } 

            private Builder(SourceDataSourceSettings model) {
                this.dataSourceName = model.dataSourceName;
                this.dataSourceProperties = model.dataSourceProperties;
            } 

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>dw_mysql</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The properties of the data source.</p>
             */
            public Builder dataSourceProperties(DataSourceProperties dataSourceProperties) {
                this.dataSourceProperties = dataSourceProperties;
                return this;
            }

            public SourceDataSourceSettings build() {
                return new SourceDataSourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class SourceObjectSelectionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("ExpressionType")
        private String expressionType;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        private SourceObjectSelectionRules(Builder builder) {
            this.action = builder.action;
            this.expression = builder.expression;
            this.expressionType = builder.expressionType;
            this.objectType = builder.objectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceObjectSelectionRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return expressionType
         */
        public String getExpressionType() {
            return this.expressionType;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        public static final class Builder {
            private String action; 
            private String expression; 
            private String expressionType; 
            private String objectType; 

            private Builder() {
            } 

            private Builder(SourceObjectSelectionRules model) {
                this.action = model.action;
                this.expression = model.expression;
                this.expressionType = model.expressionType;
                this.objectType = model.objectType;
            } 

            /**
             * <p>The selection action. Valid values: Include and Exclude.</p>
             * 
             * <strong>example:</strong>
             * <p>Include</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The expression.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_table_1</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The expression type. Valid values: Exact and Regex.</p>
             * 
             * <strong>example:</strong>
             * <p>Exact</p>
             */
            public Builder expressionType(String expressionType) {
                this.expressionType = expressionType;
                return this;
            }

            /**
             * <p>The object type. Valid values:</p>
             * <ul>
             * <li>Table: table.</li>
             * <li>Schema: schema.</li>
             * <li>Database: database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            public SourceObjectSelectionRules build() {
                return new SourceObjectSelectionRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class TransformationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleActionType")
        private String ruleActionType;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleTargetType")
        private String ruleTargetType;

        private TransformationRules(Builder builder) {
            this.ruleActionType = builder.ruleActionType;
            this.ruleName = builder.ruleName;
            this.ruleTargetType = builder.ruleTargetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransformationRules create() {
            return builder().build();
        }

        /**
         * @return ruleActionType
         */
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleTargetType
         */
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

        public static final class Builder {
            private String ruleActionType; 
            private String ruleName; 
            private String ruleTargetType; 

            private Builder() {
            } 

            private Builder(TransformationRules model) {
                this.ruleActionType = model.ruleActionType;
                this.ruleName = model.ruleName;
                this.ruleTargetType = model.ruleTargetType;
            } 

            /**
             * <p>The action type. Valid values:</p>
             * <ul>
             * <li>DefinePrimaryKey: defines the primary key.</li>
             * <li>Rename: renames the object.</li>
             * <li>AddColumn: adds a column.</li>
             * <li>HandleDml: handles DML operations.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AddColumn</p>
             */
            public Builder ruleActionType(String ruleActionType) {
                this.ruleActionType = ruleActionType;
                return this;
            }

            /**
             * <p>The rule name. The rule name must be unique when the action type and the target type of the action are the same.</p>
             * 
             * <strong>example:</strong>
             * <p>rename_rule_1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The target type of the action. Valid values:</p>
             * <ul>
             * <li>Table: table.</li>
             * <li>Schema: schema.</li>
             * <li>Database: database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder ruleTargetType(String ruleTargetType) {
                this.ruleTargetType = ruleTargetType;
                return this;
            }

            public TransformationRules build() {
                return new TransformationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class TableMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceObjectSelectionRules")
        private java.util.List<SourceObjectSelectionRules> sourceObjectSelectionRules;

        @com.aliyun.core.annotation.NameInMap("TransformationRules")
        private java.util.List<TransformationRules> transformationRules;

        private TableMappings(Builder builder) {
            this.sourceObjectSelectionRules = builder.sourceObjectSelectionRules;
            this.transformationRules = builder.transformationRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableMappings create() {
            return builder().build();
        }

        /**
         * @return sourceObjectSelectionRules
         */
        public java.util.List<SourceObjectSelectionRules> getSourceObjectSelectionRules() {
            return this.sourceObjectSelectionRules;
        }

        /**
         * @return transformationRules
         */
        public java.util.List<TransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

        public static final class Builder {
            private java.util.List<SourceObjectSelectionRules> sourceObjectSelectionRules; 
            private java.util.List<TransformationRules> transformationRules; 

            private Builder() {
            } 

            private Builder(TableMappings model) {
                this.sourceObjectSelectionRules = model.sourceObjectSelectionRules;
                this.transformationRules = model.transformationRules;
            } 

            /**
             * <p>Each rule selects a set of source objects to be synchronized. Multiple rules combine to select a single table.</p>
             */
            public Builder sourceObjectSelectionRules(java.util.List<SourceObjectSelectionRules> sourceObjectSelectionRules) {
                this.sourceObjectSelectionRules = sourceObjectSelectionRules;
                return this;
            }

            /**
             * <p>The list of transformation rule definitions for synchronization objects. Each element in the list is a transformation rule definition.</p>
             */
            public Builder transformationRules(java.util.List<TransformationRules> transformationRules) {
                this.transformationRules = transformationRules;
                return this;
            }

            public TableMappings build() {
                return new TableMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class PagingInfoTransformationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleActionType")
        private String ruleActionType;

        @com.aliyun.core.annotation.NameInMap("RuleExpression")
        private String ruleExpression;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleTargetType")
        private String ruleTargetType;

        private PagingInfoTransformationRules(Builder builder) {
            this.ruleActionType = builder.ruleActionType;
            this.ruleExpression = builder.ruleExpression;
            this.ruleName = builder.ruleName;
            this.ruleTargetType = builder.ruleTargetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfoTransformationRules create() {
            return builder().build();
        }

        /**
         * @return ruleActionType
         */
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        /**
         * @return ruleExpression
         */
        public String getRuleExpression() {
            return this.ruleExpression;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleTargetType
         */
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

        public static final class Builder {
            private String ruleActionType; 
            private String ruleExpression; 
            private String ruleName; 
            private String ruleTargetType; 

            private Builder() {
            } 

            private Builder(PagingInfoTransformationRules model) {
                this.ruleActionType = model.ruleActionType;
                this.ruleExpression = model.ruleExpression;
                this.ruleName = model.ruleName;
                this.ruleTargetType = model.ruleTargetType;
            } 

            /**
             * <p>The action type. Valid values:</p>
             * <ul>
             * <li>DefinePrimaryKey: defines the primary key.</li>
             * <li>Rename: renames the object.</li>
             * <li>AddColumn: adds a column.</li>
             * <li>HandleDml: handles DML operations.</li>
             * <li>DefineIncrementalCondition: defines the incremental condition.</li>
             * <li>DefineCycleScheduleSettings: defines the periodic scheduling settings.</li>
             * <li>DefinePartitionKey: defines the partition key.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Rename</p>
             */
            public Builder ruleActionType(String ruleActionType) {
                this.ruleActionType = ruleActionType;
                return this;
            }

            /**
             * <p>The rule expression in JSON string format.</p>
             * <ol>
             * <li>Rename rule (Rename)</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot;}</li>
             * <li>expression: the expression for the rename transformation rule. Supported variables in the expression include: ${srcDatasourceName} (source data source name), ${srcDatabaseName} (source database name), and ${srcTableName} (source table name).</li>
             * </ul>
             * <ol start="2">
             * <li>Add column rule (AddColumn)</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</li>
             * <li>If not specified, the default rule is to add no columns and perform no replication.</li>
             * <li>columnName: the name of the appended column.</li>
             * <li>columnValueType: the value type of the appended column. Valid values: Constant and Variable.</li>
             * <li>columnValue: the value of the appended column. When columnValueType is Constant, the value is a custom constant of the String type. When columnValueType is Variable, the value is a built-in variable. Valid built-in variables include: EXECUTE_TIME (execution time, Long type), DB_NAME_SRC (source database name, String type), DATASOURCE_NAME_SRC (source data source name, String type), TABLE_NAME_SRC (source table name, String type), DB_NAME_DEST (destination database name, String type), DATASOURCE_NAME_DEST (destination data source name, String type), TABLE_NAME_DEST (destination table name, String type), and DB_NAME_SRC_TRANSED (transformed database name, String type).</li>
             * </ul>
             * <ol start="3">
             * <li>Specify the primary key column names for the destination table (DefinePrimaryKey)</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</li>
             * <li>If not specified, the source primary key columns are used by default.</li>
             * <li>When the destination is an existing table: the data integration system does not modify the destination table schema. If the specified primary key columns are not in the destination column set, an error is reported when the task starts.</li>
             * <li>When the destination is a table to be created automatically: the data integration system automatically creates the destination table schema, which includes the defined primary key columns. If the specified primary key columns are not in the destination column set, an error is reported when the task starts.</li>
             * </ul>
             * <ol start="4">
             * <li>DML handling rule (HandleDml)</li>
             * </ol>
             * <ul>
             * <li>Example:
             * {&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</li>
             * <li>If not specified, the default rule is Normal for Insert, Update, and Delete.</li>
             * <li>dmlType: the DML operations type. Valid values: Insert, Update, and Delete.</li>
             * <li>dmlAction: the DML handling policy. Valid values: Normal (normal processing), Ignore (ignore), Filter (conditional normal processing, used when dmlType is Update or Delete), and LogicalDelete (logical deletion).</li>
             * <li>filterCondition: the DML filter condition, used when dmlAction is Filter.</li>
             * </ul>
             * <ol start="5">
             * <li>Incremental condition (DefineIncrementalCondition)</li>
             * </ol>
             * <ul>
             * <li>Example:
             * {&quot;where&quot;:&quot;id &gt; 0&quot;}</li>
             * <li>Specifies the incremental filter condition.</li>
             * </ul>
             * <ol start="6">
             * <li>Periodic scheduling parameters (DefineCycleScheduleSettings)</li>
             * </ol>
             * <ul>
             * <li>Example:
             * {&quot;cronExpress&quot;:&quot; * * * * * *&quot;, &quot;cycleType&quot;:&quot;1&quot;}</li>
             * <li>Specifies the scheduling parameters for the scheduled task.</li>
             * </ul>
             * <ol start="7">
             * <li>Specify the partition key (DefinePartitionKey)</li>
             * </ol>
             * <ul>
             * <li>Example:
             * {&quot;columns&quot;:[&quot;id&quot;]}</li>
             * <li>Specifies the partition key.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}</p>
             */
            public Builder ruleExpression(String ruleExpression) {
                this.ruleExpression = ruleExpression;
                return this;
            }

            /**
             * <p>The rule name. The rule name must be unique under a specific combination of action type and target type.</p>
             * 
             * <strong>example:</strong>
             * <p>rename_rule_1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The target type of the action. Valid values:</p>
             * <ul>
             * <li>Table: table.</li>
             * <li>Schema: schema.</li>
             * <li>Database: database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder ruleTargetType(String ruleTargetType) {
                this.ruleTargetType = ruleTargetType;
                return this;
            }

            public PagingInfoTransformationRules build() {
                return new PagingInfoTransformationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DIJobId")
        @Deprecated
        private String DIJobId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationDataSourceSettings")
        private java.util.List<DestinationDataSourceSettings> destinationDataSourceSettings;

        @com.aliyun.core.annotation.NameInMap("DestinationDataSourceType")
        private String destinationDataSourceType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobSettings")
        private JobSettings jobSettings;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("MigrationType")
        private String migrationType;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ResourceSettings")
        private ResourceSettings resourceSettings;

        @com.aliyun.core.annotation.NameInMap("SourceDataSourceSettings")
        private java.util.List<SourceDataSourceSettings> sourceDataSourceSettings;

        @com.aliyun.core.annotation.NameInMap("SourceDataSourceType")
        private String sourceDataSourceType;

        @com.aliyun.core.annotation.NameInMap("TableMappings")
        private java.util.List<TableMappings> tableMappings;

        @com.aliyun.core.annotation.NameInMap("TransformationRules")
        private java.util.List<PagingInfoTransformationRules> transformationRules;

        private PagingInfo(Builder builder) {
            this.DIJobId = builder.DIJobId;
            this.description = builder.description;
            this.destinationDataSourceSettings = builder.destinationDataSourceSettings;
            this.destinationDataSourceType = builder.destinationDataSourceType;
            this.id = builder.id;
            this.jobName = builder.jobName;
            this.jobSettings = builder.jobSettings;
            this.jobStatus = builder.jobStatus;
            this.jobType = builder.jobType;
            this.migrationType = builder.migrationType;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.resourceSettings = builder.resourceSettings;
            this.sourceDataSourceSettings = builder.sourceDataSourceSettings;
            this.sourceDataSourceType = builder.sourceDataSourceType;
            this.tableMappings = builder.tableMappings;
            this.transformationRules = builder.transformationRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return DIJobId
         */
        public String getDIJobId() {
            return this.DIJobId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationDataSourceSettings
         */
        public java.util.List<DestinationDataSourceSettings> getDestinationDataSourceSettings() {
            return this.destinationDataSourceSettings;
        }

        /**
         * @return destinationDataSourceType
         */
        public String getDestinationDataSourceType() {
            return this.destinationDataSourceType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobSettings
         */
        public JobSettings getJobSettings() {
            return this.jobSettings;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return migrationType
         */
        public String getMigrationType() {
            return this.migrationType;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return resourceSettings
         */
        public ResourceSettings getResourceSettings() {
            return this.resourceSettings;
        }

        /**
         * @return sourceDataSourceSettings
         */
        public java.util.List<SourceDataSourceSettings> getSourceDataSourceSettings() {
            return this.sourceDataSourceSettings;
        }

        /**
         * @return sourceDataSourceType
         */
        public String getSourceDataSourceType() {
            return this.sourceDataSourceType;
        }

        /**
         * @return tableMappings
         */
        public java.util.List<TableMappings> getTableMappings() {
            return this.tableMappings;
        }

        /**
         * @return transformationRules
         */
        public java.util.List<PagingInfoTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

        public static final class Builder {
            private String DIJobId; 
            private String description; 
            private java.util.List<DestinationDataSourceSettings> destinationDataSourceSettings; 
            private String destinationDataSourceType; 
            private Long id; 
            private String jobName; 
            private JobSettings jobSettings; 
            private String jobStatus; 
            private String jobType; 
            private String migrationType; 
            private String owner; 
            private Long projectId; 
            private ResourceSettings resourceSettings; 
            private java.util.List<SourceDataSourceSettings> sourceDataSourceSettings; 
            private String sourceDataSourceType; 
            private java.util.List<TableMappings> tableMappings; 
            private java.util.List<PagingInfoTransformationRules> transformationRules; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.DIJobId = model.DIJobId;
                this.description = model.description;
                this.destinationDataSourceSettings = model.destinationDataSourceSettings;
                this.destinationDataSourceType = model.destinationDataSourceType;
                this.id = model.id;
                this.jobName = model.jobName;
                this.jobSettings = model.jobSettings;
                this.jobStatus = model.jobStatus;
                this.jobType = model.jobType;
                this.migrationType = model.migrationType;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.resourceSettings = model.resourceSettings;
                this.sourceDataSourceSettings = model.sourceDataSourceSettings;
                this.sourceDataSourceType = model.sourceDataSourceType;
                this.tableMappings = model.tableMappings;
                this.transformationRules = model.transformationRules;
            } 

            /**
             * <p><strong>[Deprecated]</strong> This field is deprecated. Use the Id field instead.</p>
             * 
             * <strong>example:</strong>
             * <p>32601</p>
             */
            public Builder DIJobId(String DIJobId) {
                this.DIJobId = DIJobId;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of destination data source properties.</p>
             */
            public Builder destinationDataSourceSettings(java.util.List<DestinationDataSourceSettings> destinationDataSourceSettings) {
                this.destinationDataSourceSettings = destinationDataSourceSettings;
                return this;
            }

            /**
             * <p>The type of the destination data source. Valid values: Hologres, OSS-HDFS, OSS, MaxCompute, LogHub, StarRocks, DataHub, AnalyticDB_For_MySQL, Kafka, and Hive.</p>
             * 
             * <strong>example:</strong>
             * <p>Hologres</p>
             */
            public Builder destinationDataSourceType(String destinationDataSourceType) {
                this.destinationDataSourceType = destinationDataSourceType;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>32601</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>imp_ods_dms_det_dealer_info_df</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The runtime settings.</p>
             */
            public Builder jobSettings(JobSettings jobSettings) {
                this.jobSettings = jobSettings;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Finished: the task ran successfully and has finished.</li>
             * <li>Failed: the task failed to run.</li>
             * <li>Running: the task is running.</li>
             * <li>Initialized: the task is initialized but not started.</li>
             * <li>Stopping: the task is being stopped.</li>
             * <li>Stop: the task is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li>DatabaseRealtimeMigration: performs stream synchronization for multiple tables across multiple source databases. Supports full data only, incremental data only, or both full and incremental data.</li>
             * <li>DatabaseOfflineMigration: performs batch synchronization for multiple tables across multiple source databases. Supports full data only, incremental data only, or both full and incremental data.</li>
             * <li>SingleTableRealtimeMigration: performs stream synchronization for a single source table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DatabaseRealtimeMigration</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The synchronization type. Valid values:</p>
             * <ul>
             * <li>FullAndRealtimeIncremental: full and real-time incremental synchronization (real-time synchronization for the entire database).</li>
             * <li>RealtimeIncremental: real-time incremental synchronization (real-time synchronization for a single table).</li>
             * <li>Full: full data synchronization (batch synchronization for the entire database).</li>
             * <li>OfflineIncremental: batch incremental synchronization (batch synchronization for the entire database).</li>
             * <li>FullAndOfflineIncremental: full and batch incremental synchronization (batch synchronization for the entire database).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FullAndRealtimeIncremental</p>
             */
            public Builder migrationType(String migrationType) {
                this.migrationType = migrationType;
                return this;
            }

            /**
             * <p>The task owner.</p>
             * 
             * <strong>example:</strong>
             * <p>3726346</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
             * <p>This parameter specifies the DataWorks workspace used for this API call.</p>
             * 
             * <strong>example:</strong>
             * <p>98330</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The resource settings.</p>
             */
            public Builder resourceSettings(ResourceSettings resourceSettings) {
                this.resourceSettings = resourceSettings;
                return this;
            }

            /**
             * <p>The array of source data source settings.</p>
             */
            public Builder sourceDataSourceSettings(java.util.List<SourceDataSourceSettings> sourceDataSourceSettings) {
                this.sourceDataSourceSettings = sourceDataSourceSettings;
                return this;
            }

            /**
             * <p>The type of the source data source. Valid values: PolarDB, MySQL, Kafka, LogHub, Hologres, Oracle, OceanBase, MongoDB, RedShift, Hive, SQLServer, Doris, and ClickHouse.</p>
             * 
             * <strong>example:</strong>
             * <p>Mysql</p>
             */
            public Builder sourceDataSourceType(String sourceDataSourceType) {
                this.sourceDataSourceType = sourceDataSourceType;
                return this;
            }

            /**
             * <p>The list of synchronization object transformation mappings. Each element in the list describes a set of source object selection rules and a list of transformation rules applied to the selected synchronization objects.</p>
             * <blockquote>
             * <p>[
             *   {
             *     &quot;SourceObjectSelectionRules&quot;:[
             *       {
             *         &quot;ObjectType&quot;:&quot;Database&quot;,
             *         &quot;Action&quot;:&quot;Include&quot;,
             *         &quot;ExpressionType&quot;:&quot;Exact&quot;,
             *         &quot;Expression&quot;:&quot;biz_db&quot;
             *       },
             *     {
             *         &quot;ObjectType&quot;:&quot;Schema&quot;,
             *         &quot;Action&quot;:&quot;Include&quot;,
             *         &quot;ExpressionType&quot;:&quot;Exact&quot;,
             *         &quot;Expression&quot;:&quot;s1&quot;
             *       }, 
             *     {
             *         &quot;ObjectType&quot;:&quot;Table&quot;,
             *         &quot;Action&quot;:&quot;Include&quot;,
             *         &quot;ExpressionType&quot;:&quot;Exact&quot;,
             *         &quot;Expression&quot;:&quot;table1&quot;
             *       }
             *     ],
             *     &quot;TransformationRuleNames&quot;:[
             *       {
             *         &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;,
             *         &quot;RuleActionType&quot;:&quot;Rename&quot;,
             *         &quot;RuleTargetType&quot;:&quot;Schema&quot;
             *           }
             *     ]
             *   }
             * ]</p>
             * </blockquote>
             */
            public Builder tableMappings(java.util.List<TableMappings> tableMappings) {
                this.tableMappings = tableMappings;
                return this;
            }

            /**
             * <p>The list of transformation rule definitions for synchronization objects.</p>
             * <blockquote>
             * <p>[
             *   {
             *     &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;,
             *     &quot;RuleActionType&quot;:&quot;Rename&quot;,
             *     &quot;RuleTargetType&quot;:&quot;Schema&quot;,
             *     &quot;RuleExpression&quot;:&quot;{\&quot;expression\&quot;:\&quot;${srcDatasoureName}_${srcDatabaseName}\&quot;}&quot;
             *   }
             * ]</p>
             * </blockquote>
             */
            public Builder transformationRules(java.util.List<PagingInfoTransformationRules> transformationRules) {
                this.transformationRules = transformationRules;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
