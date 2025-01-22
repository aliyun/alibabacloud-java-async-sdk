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
 * {@link UpdateProgramRequest} extends {@link RequestModel}
 *
 * <p>UpdateProgramRequest</p>
 */
public class UpdateProgramRequest extends Request {
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
    private String sourceLocationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceName")
    private String sourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Transition")
    private String transition;

    private UpdateProgramRequest(Builder builder) {
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

    public static UpdateProgramRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateProgramRequest, Builder> {
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

        private Builder(UpdateProgramRequest request) {
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
         * AdBreaks.
         */
        public Builder adBreaks(String adBreaks) {
            this.putQueryParameter("AdBreaks", adBreaks);
            this.adBreaks = adBreaks;
            return this;
        }

        /**
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
         * ClipRange.
         */
        public Builder clipRange(String clipRange) {
            this.putQueryParameter("ClipRange", clipRange);
            this.clipRange = clipRange;
            return this;
        }

        /**
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
         * SourceLocationName.
         */
        public Builder sourceLocationName(String sourceLocationName) {
            this.putQueryParameter("SourceLocationName", sourceLocationName);
            this.sourceLocationName = sourceLocationName;
            return this;
        }

        /**
         * SourceName.
         */
        public Builder sourceName(String sourceName) {
            this.putQueryParameter("SourceName", sourceName);
            this.sourceName = sourceName;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Transition.
         */
        public Builder transition(String transition) {
            this.putQueryParameter("Transition", transition);
            this.transition = transition;
            return this;
        }

        @Override
        public UpdateProgramRequest build() {
            return new UpdateProgramRequest(this);
        } 

    } 

}
