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

        /**
         * AdBreaks.
         */
        public Builder adBreaks(java.util.List<AdBreaks> adBreaks) {
            this.adBreaks = adBreaks;
            return this;
        }

        /**
         * ApproximateDurationSeconds.
         */
        public Builder approximateDurationSeconds(Long approximateDurationSeconds) {
            this.approximateDurationSeconds = approximateDurationSeconds;
            return this;
        }

        /**
         * ApproximateStartTime.
         */
        public Builder approximateStartTime(String approximateStartTime) {
            this.approximateStartTime = approximateStartTime;
            return this;
        }

        /**
         * EntryType.
         */
        public Builder entryType(String entryType) {
            this.entryType = entryType;
            return this;
        }

        /**
         * ProgramName.
         */
        public Builder programName(String programName) {
            this.programName = programName;
            return this;
        }

        /**
         * SourceLocationName.
         */
        public Builder sourceLocationName(String sourceLocationName) {
            this.sourceLocationName = sourceLocationName;
            return this;
        }

        /**
         * SourceName.
         */
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }

        /**
         * SourceType.
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

            /**
             * MessageType.
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * OffsetMillis.
             */
            public Builder offsetMillis(String offsetMillis) {
                this.offsetMillis = offsetMillis;
                return this;
            }

            /**
             * SourceLocationName.
             */
            public Builder sourceLocationName(String sourceLocationName) {
                this.sourceLocationName = sourceLocationName;
                return this;
            }

            /**
             * SourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * SpliceInsertSettings.
             */
            public Builder spliceInsertSettings(String spliceInsertSettings) {
                this.spliceInsertSettings = spliceInsertSettings;
                return this;
            }

            /**
             * TimeSignalSettings.
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
