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
 * {@link Program} extends {@link TeaModel}
 *
 * <p>Program</p>
 */
public class Program extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdBreaks")
    private java.util.List<AdBreaks> adBreaks;

    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("ChannelName")
    private String channelName;

    @com.aliyun.core.annotation.NameInMap("ClipRange")
    private String clipRange;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("ProgramName")
    private String programName;

    @com.aliyun.core.annotation.NameInMap("SourceLocationName")
    private String sourceLocationName;

    @com.aliyun.core.annotation.NameInMap("SourceName")
    private String sourceName;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("Transition")
    private String transition;

    private Program(Builder builder) {
        this.adBreaks = builder.adBreaks;
        this.arn = builder.arn;
        this.channelName = builder.channelName;
        this.clipRange = builder.clipRange;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.programName = builder.programName;
        this.sourceLocationName = builder.sourceLocationName;
        this.sourceName = builder.sourceName;
        this.sourceType = builder.sourceType;
        this.transition = builder.transition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Program create() {
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
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return clipRange
     */
    public String getClipRange() {
        return this.clipRange;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
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

    /**
     * @return transition
     */
    public String getTransition() {
        return this.transition;
    }

    public static final class Builder {
        private java.util.List<AdBreaks> adBreaks; 
        private String arn; 
        private String channelName; 
        private String clipRange; 
        private String gmtCreate; 
        private String gmtModified; 
        private String programName; 
        private String sourceLocationName; 
        private String sourceName; 
        private String sourceType; 
        private String transition; 

        private Builder() {
        } 

        private Builder(Program model) {
            this.adBreaks = model.adBreaks;
            this.arn = model.arn;
            this.channelName = model.channelName;
            this.clipRange = model.clipRange;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.programName = model.programName;
            this.sourceLocationName = model.sourceLocationName;
            this.sourceName = model.sourceName;
            this.sourceType = model.sourceType;
            this.transition = model.transition;
        } 

        /**
         * <p>The ad breaks.</p>
         */
        public Builder adBreaks(java.util.List<AdBreaks> adBreaks) {
            this.adBreaks = adBreaks;
            return this;
        }

        /**
         * <p>The ARN of the program.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ims:mediaweaver:<regionId>:<userId>:program/myChannel/MyProgram</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>The name of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        public Builder channelName(String channelName) {
            this.channelName = channelName;
            return this;
        }

        /**
         * <p>The information about the clip.</p>
         * 
         * <strong>example:</strong>
         * <p>{StartOffsetMillis: 213123, EndOffsetMillis: 213134}</p>
         */
        public Builder clipRange(String clipRange) {
            this.clipRange = clipRange;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-02T00:58:19Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-02T00:58:19Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
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
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>vodSource</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The program transition method.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;: &quot;RELATIVE&quot;, &quot;RelativePosition&quot;: &quot;AFTER_PROGRAM&quot;, &quot;RelativeProgram&quot;: &quot;program2&quot;}</p>
         */
        public Builder transition(String transition) {
            this.transition = transition;
            return this;
        }

        public Program build() {
            return new Program(this);
        } 

    } 

    /**
     * 
     * {@link Program} extends {@link TeaModel}
     *
     * <p>Program</p>
     */
    public static class AdBreaks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("MessageType")
        private String messageType;

        @com.aliyun.core.annotation.NameInMap("OffsetMillis")
        private Long offsetMillis;

        @com.aliyun.core.annotation.NameInMap("ProgramName")
        private String programName;

        @com.aliyun.core.annotation.NameInMap("SourceLocationName")
        private String sourceLocationName;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("SpliceInsertSettings")
        private String spliceInsertSettings;

        @com.aliyun.core.annotation.NameInMap("TimeSignalSettings")
        private String timeSignalSettings;

        private AdBreaks(Builder builder) {
            this.channelName = builder.channelName;
            this.messageType = builder.messageType;
            this.offsetMillis = builder.offsetMillis;
            this.programName = builder.programName;
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
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
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
        public Long getOffsetMillis() {
            return this.offsetMillis;
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
            private String channelName; 
            private String messageType; 
            private Long offsetMillis; 
            private String programName; 
            private String sourceLocationName; 
            private String sourceName; 
            private String spliceInsertSettings; 
            private String timeSignalSettings; 

            private Builder() {
            } 

            private Builder(AdBreaks model) {
                this.channelName = model.channelName;
                this.messageType = model.messageType;
                this.offsetMillis = model.offsetMillis;
                this.programName = model.programName;
                this.sourceLocationName = model.sourceLocationName;
                this.sourceName = model.sourceName;
                this.spliceInsertSettings = model.spliceInsertSettings;
                this.timeSignalSettings = model.timeSignalSettings;
            } 

            /**
             * <p>The name of the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>MyChannel</p>
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * <p>MessageType</p>
             * 
             * <strong>example:</strong>
             * <p>SPLICE_INSERT</p>
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * <p>The offset.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder offsetMillis(Long offsetMillis) {
                this.offsetMillis = offsetMillis;
                return this;
            }

            /**
             * <p>The name of the program.</p>
             * 
             * <strong>example:</strong>
             * <p>program_name</p>
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
             * <p>MyAdSource</p>
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
