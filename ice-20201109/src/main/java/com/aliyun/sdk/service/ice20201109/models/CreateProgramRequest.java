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
 * {@link CreateProgramRequest} extends {@link RequestModel}
 *
 * <p>CreateProgramRequest</p>
 */
public class CreateProgramRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdBreaks")
    private String adBreaks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClipRange")
    private String clipRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String programName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLocationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLocationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Transition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transition;

    private CreateProgramRequest(Builder builder) {
        super(builder);
        this.adBreaks = builder.adBreaks;
        this.channelName = builder.channelName;
        this.clipRange = builder.clipRange;
        this.programName = builder.programName;
        this.sourceLocationName = builder.sourceLocationName;
        this.sourceName = builder.sourceName;
        this.sourceType = builder.sourceType;
        this.transition = builder.transition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProgramRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adBreaks
     */
    public String getAdBreaks() {
        return this.adBreaks;
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

    public static final class Builder extends Request.Builder<CreateProgramRequest, Builder> {
        private String adBreaks; 
        private String channelName; 
        private String clipRange; 
        private String programName; 
        private String sourceLocationName; 
        private String sourceName; 
        private String sourceType; 
        private String transition; 

        private Builder() {
            super();
        } 

        private Builder(CreateProgramRequest request) {
            super(request);
            this.adBreaks = request.adBreaks;
            this.channelName = request.channelName;
            this.clipRange = request.clipRange;
            this.programName = request.programName;
            this.sourceLocationName = request.sourceLocationName;
            this.sourceName = request.sourceName;
            this.sourceType = request.sourceType;
            this.transition = request.transition;
        } 

        /**
         * <p>The information about ad breaks.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MessageType&quot;:&quot;SPLICE_INSERT&quot;,&quot;OffsetMillis&quot;:1000,&quot;SourceLocationName&quot;:&quot;MySourceLocation&quot;,&quot;SourceName&quot;:&quot;MyAdSource&quot;,&quot;SpliceInsertSettings&quot;:{&quot;AvailNumber&quot;:0,&quot;AvailExpected&quot;:0,&quot;SpliceEventID&quot;:1,&quot;UniqueProgramID&quot;:0}}]</p>
         */
        public Builder adBreaks(String adBreaks) {
            this.putQueryParameter("AdBreaks", adBreaks);
            this.adBreaks = adBreaks;
            return this;
        }

        /**
         * <p>The name of the channel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        public Builder channelName(String channelName) {
            this.putQueryParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * <p>Extracts a clip from the source.</p>
         * 
         * <strong>example:</strong>
         * <p>{StartOffsetMillis: 213123, EndOffsetMillis: 213134}</p>
         */
        public Builder clipRange(String clipRange) {
            this.putQueryParameter("ClipRange", clipRange);
            this.clipRange = clipRange;
            return this;
        }

        /**
         * <p>The name of the program.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>program1</p>
         */
        public Builder programName(String programName) {
            this.putQueryParameter("ProgramName", programName);
            this.programName = programName;
            return this;
        }

        /**
         * <p>The source location.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySourceLcation</p>
         */
        public Builder sourceLocationName(String sourceLocationName) {
            this.putQueryParameter("SourceLocationName", sourceLocationName);
            this.sourceLocationName = sourceLocationName;
            return this;
        }

        /**
         * <p>The name of the source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySource</p>
         */
        public Builder sourceName(String sourceName) {
            this.putQueryParameter("SourceName", sourceName);
            this.sourceName = sourceName;
            return this;
        }

        /**
         * <p>The source type of the program.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vodSource</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The program transition method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;: &quot;RELATIVE&quot;, &quot;RelativePosition&quot;: &quot;AFTER_PROGRAM&quot;, &quot;RelativeProgram&quot;: &quot;program2&quot;}</p>
         */
        public Builder transition(String transition) {
            this.putQueryParameter("Transition", transition);
            this.transition = transition;
            return this;
        }

        @Override
        public CreateProgramRequest build() {
            return new CreateProgramRequest(this);
        } 

    } 

}
