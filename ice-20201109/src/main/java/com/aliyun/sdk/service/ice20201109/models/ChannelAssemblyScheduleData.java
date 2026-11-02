// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ChannelAssemblyScheduleData} extends {@link TeaModel}
 *
 * <p>ChannelAssemblyScheduleData</p>
 */
public class ChannelAssemblyScheduleData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdBreaks")
    private java.util.List<AdBreaks> adBreaks;

    @com.aliyun.core.annotation.NameInMap("ApproximateDurationSeconds")
    private Long approximateDurationSeconds;

    @com.aliyun.core.annotation.NameInMap("ApproximateStartTime")
    private String approximateStartTime;

    @com.aliyun.core.annotation.NameInMap("EntryType")
    private String entryType;

    @com.aliyun.core.annotation.NameInMap("ProgramName")
    private String programName;

    @com.aliyun.core.annotation.NameInMap("SourceLocationName")
    private String sourceLocationName;

    @com.aliyun.core.annotation.NameInMap("SourceName")
    private String sourceName;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private ChannelAssemblyScheduleData(Builder builder) {
        this.adBreaks = builder.adBreaks;
        this.approximateDurationSeconds = builder.approximateDurationSeconds;
        this.approximateStartTime = builder.approximateStartTime;
        this.entryType = builder.entryType;
        this.programName = builder.programName;
        this.sourceLocationName = builder.sourceLocationName;
        this.sourceName = builder.sourceName;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChannelAssemblyScheduleData create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adBreaks
     */
    public java.util.List<AdBreaks> getAdBreaks() {
        return this.adBreaks;
    }

    /**
     * @return approximateDurationSeconds
     */
    public Long getApproximateDurationSeconds() {
        return this.approximateDurationSeconds;
    }

    /**
     * @return approximateStartTime
     */
    public String getApproximateStartTime() {
        return this.approximateStartTime;
    }

    /**
     * @return entryType
     */
    public String getEntryType() {
        return this.entryType;
    }

    /**
     * @return programName
     */
    public String getProgramName() {
        return this.programName;
    }

    /**
     * @return sourceLocationName
     */
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * @return sourceName
     */
    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder {
        private java.util.List<AdBreaks> adBreaks; 
        private Long approximateDurationSeconds; 
        private String approximateStartTime; 
        private String entryType; 
        private String programName; 
        private String sourceLocationName; 
        private String sourceName; 
        private String sourceType; 

        private Builder() {
        } 

        private Builder(ChannelAssemblyScheduleData model) {
            this.adBreaks = model.adBreaks;
            this.approximateDurationSeconds = model.approximateDurationSeconds;
            this.approximateStartTime = model.approximateStartTime;
            this.entryType = model.entryType;
            this.programName = model.programName;
            this.sourceLocationName = model.sourceLocationName;
            this.sourceName = model.sourceName;
            this.sourceType = model.sourceType;
        } 

        /**
         * <p>The information about ad breaks.</p>
         */
        public Builder adBreaks(java.util.List<AdBreaks> adBreaks) {
            this.adBreaks = adBreaks;
            return this;
        }

        /**
         * <p>The scheduled playback duration.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder approximateDurationSeconds(Long approximateDurationSeconds) {
            this.approximateDurationSeconds = approximateDurationSeconds;
            return this;
        }

        /**
         * <p>The scheduled start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1989128002313</p>
         */
        public Builder approximateStartTime(String approximateStartTime) {
            this.approximateStartTime = approximateStartTime;
            return this;
        }

        /**
         * <p>The entry type.</p>
         * 
         * <strong>example:</strong>
         * <p>program</p>
         */
        public Builder entryType(String entryType) {
            this.entryType = entryType;
            return this;
        }

        /**
         * <p>The name of the program.</p>
         * 
         * <strong>example:</strong>
         * <p>program1</p>
         */
        public Builder programName(String programName) {
            this.programName = programName;
            return this;
        }

        /**
         * <p>The name of the source location.</p>
         * 
         * <strong>example:</strong>
         * <p>MySourceLocation</p>
         */
        public Builder sourceLocationName(String sourceLocationName) {
            this.sourceLocationName = sourceLocationName;
            return this;
        }

        /**
         * <p>The name of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>MySource</p>
         */
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }

        /**
         * <p>The source type. Valid values: vodSource and liveSource.</p>
         * 
         * <strong>example:</strong>
         * <p>vodSource</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public ChannelAssemblyScheduleData build() {
            return new ChannelAssemblyScheduleData(this);
        } 

    } 

    /**
     * 
     * {@link ChannelAssemblyScheduleData} extends {@link TeaModel}
     *
     * <p>ChannelAssemblyScheduleData</p>
     */
    public static class AdBreaks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MessageType")
        private String messageType;

        @com.aliyun.core.annotation.NameInMap("OffsetMillis")
        private String offsetMillis;

        @com.aliyun.core.annotation.NameInMap("SourceLocationName")
        private String sourceLocationName;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("SpliceInsertSettings")
        private String spliceInsertSettings;

        @com.aliyun.core.annotation.NameInMap("TimeSignalSettings")
        private String timeSignalSettings;

        private AdBreaks(Builder builder) {
            this.messageType = builder.messageType;
            this.offsetMillis = builder.offsetMillis;
            this.sourceLocationName = builder.sourceLocationName;
            this.sourceName = builder.sourceName;
            this.spliceInsertSettings = builder.spliceInsertSettings;
            this.timeSignalSettings = builder.timeSignalSettings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdBreaks create() {
            return builder().build();
        }

        /**
         * @return messageType
         */
        public String getMessageType() {
            return this.messageType;
        }

        /**
         * @return offsetMillis
         */
        public String getOffsetMillis() {
            return this.offsetMillis;
        }

        /**
         * @return sourceLocationName
         */
        public String getSourceLocationName() {
            return this.sourceLocationName;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return spliceInsertSettings
         */
        public String getSpliceInsertSettings() {
            return this.spliceInsertSettings;
        }

        /**
         * @return timeSignalSettings
         */
        public String getTimeSignalSettings() {
            return this.timeSignalSettings;
        }

        public static final class Builder {
            private String messageType; 
            private String offsetMillis; 
            private String sourceLocationName; 
            private String sourceName; 
            private String spliceInsertSettings; 
            private String timeSignalSettings; 

            private Builder() {
            } 

            private Builder(AdBreaks model) {
                this.messageType = model.messageType;
                this.offsetMillis = model.offsetMillis;
                this.sourceLocationName = model.sourceLocationName;
                this.sourceName = model.sourceName;
                this.spliceInsertSettings = model.spliceInsertSettings;
                this.timeSignalSettings = model.timeSignalSettings;
            } 

            /**
             * <p>The SCTE-35 message type.</p>
             * 
             * <strong>example:</strong>
             * <p>SPLICE_INSERT</p>
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * <p>The position to insert the ad marker, as an offset relative to the beginning of the program. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder offsetMillis(String offsetMillis) {
                this.offsetMillis = offsetMillis;
                return this;
            }

            /**
             * <p>The name of the source location.</p>
             * 
             * <strong>example:</strong>
             * <p>MySourceLocation</p>
             */
            public Builder sourceLocationName(String sourceLocationName) {
                this.sourceLocationName = sourceLocationName;
                return this;
            }

            /**
             * <p>The name of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>MySource</p>
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * <p>The SpliceInsert configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AvailNumber&quot;:0,&quot;AvailExpected&quot;:0,&quot;SpliceEventID&quot;:1,&quot;UniqueProgramID&quot;:0}</p>
             */
            public Builder spliceInsertSettings(String spliceInsertSettings) {
                this.spliceInsertSettings = spliceInsertSettings;
                return this;
            }

            /**
             * <p>The TimeSignal configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;segmentationEventID&quot;:0,&quot;segmentationUPIDType&quot;:14,&quot;segmentationUPID&quot;:&quot;upid&quot;,&quot;segmentationTypeID&quot;:48,&quot;segmentNumber&quot;:0,&quot;segmentsExpected&quot;:0,&quot;subSegmentNumber&quot;:1,&quot;subSegmentsExpected&quot;:0}</p>
             */
            public Builder timeSignalSettings(String timeSignalSettings) {
                this.timeSignalSettings = timeSignalSettings;
                return this;
            }

            public AdBreaks build() {
                return new AdBreaks(this);
            } 

        } 

    }
}
