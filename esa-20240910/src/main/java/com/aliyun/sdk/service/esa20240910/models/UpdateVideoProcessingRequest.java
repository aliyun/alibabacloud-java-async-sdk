// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateVideoProcessingRequest} extends {@link RequestModel}
 *
 * <p>UpdateVideoProcessingRequest</p>
 */
public class UpdateVideoProcessingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlvSeekEnd")
    private String flvSeekEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlvSeekStart")
    private String flvSeekStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlvVideoSeekMode")
    private String flvVideoSeekMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mp4SeekEnd")
    private String mp4SeekEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mp4SeekStart")
    private String mp4SeekStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleEnable")
    private String ruleEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sequence")
    private Integer sequence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoSeekEnable")
    private String videoSeekEnable;

    private UpdateVideoProcessingRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.flvSeekEnd = builder.flvSeekEnd;
        this.flvSeekStart = builder.flvSeekStart;
        this.flvVideoSeekMode = builder.flvVideoSeekMode;
        this.mp4SeekEnd = builder.mp4SeekEnd;
        this.mp4SeekStart = builder.mp4SeekStart;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteId = builder.siteId;
        this.videoSeekEnable = builder.videoSeekEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVideoProcessingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return flvSeekEnd
     */
    public String getFlvSeekEnd() {
        return this.flvSeekEnd;
    }

    /**
     * @return flvSeekStart
     */
    public String getFlvSeekStart() {
        return this.flvSeekStart;
    }

    /**
     * @return flvVideoSeekMode
     */
    public String getFlvVideoSeekMode() {
        return this.flvVideoSeekMode;
    }

    /**
     * @return mp4SeekEnd
     */
    public String getMp4SeekEnd() {
        return this.mp4SeekEnd;
    }

    /**
     * @return mp4SeekStart
     */
    public String getMp4SeekStart() {
        return this.mp4SeekStart;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return ruleEnable
     */
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return sequence
     */
    public Integer getSequence() {
        return this.sequence;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return videoSeekEnable
     */
    public String getVideoSeekEnable() {
        return this.videoSeekEnable;
    }

    public static final class Builder extends Request.Builder<UpdateVideoProcessingRequest, Builder> {
        private Long configId; 
        private String flvSeekEnd; 
        private String flvSeekStart; 
        private String flvVideoSeekMode; 
        private String mp4SeekEnd; 
        private String mp4SeekStart; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Long siteId; 
        private String videoSeekEnable; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVideoProcessingRequest request) {
            super(request);
            this.configId = request.configId;
            this.flvSeekEnd = request.flvSeekEnd;
            this.flvSeekStart = request.flvSeekStart;
            this.flvVideoSeekMode = request.flvVideoSeekMode;
            this.mp4SeekEnd = request.mp4SeekEnd;
            this.mp4SeekStart = request.mp4SeekStart;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.sequence = request.sequence;
            this.siteId = request.siteId;
            this.videoSeekEnable = request.videoSeekEnable;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * FlvSeekEnd.
         */
        public Builder flvSeekEnd(String flvSeekEnd) {
            this.putQueryParameter("FlvSeekEnd", flvSeekEnd);
            this.flvSeekEnd = flvSeekEnd;
            return this;
        }

        /**
         * FlvSeekStart.
         */
        public Builder flvSeekStart(String flvSeekStart) {
            this.putQueryParameter("FlvSeekStart", flvSeekStart);
            this.flvSeekStart = flvSeekStart;
            return this;
        }

        /**
         * FlvVideoSeekMode.
         */
        public Builder flvVideoSeekMode(String flvVideoSeekMode) {
            this.putQueryParameter("FlvVideoSeekMode", flvVideoSeekMode);
            this.flvVideoSeekMode = flvVideoSeekMode;
            return this;
        }

        /**
         * Mp4SeekEnd.
         */
        public Builder mp4SeekEnd(String mp4SeekEnd) {
            this.putQueryParameter("Mp4SeekEnd", mp4SeekEnd);
            this.mp4SeekEnd = mp4SeekEnd;
            return this;
        }

        /**
         * Mp4SeekStart.
         */
        public Builder mp4SeekStart(String mp4SeekStart) {
            this.putQueryParameter("Mp4SeekStart", mp4SeekStart);
            this.mp4SeekStart = mp4SeekStart;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * RuleEnable.
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * Sequence.
         */
        public Builder sequence(Integer sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * VideoSeekEnable.
         */
        public Builder videoSeekEnable(String videoSeekEnable) {
            this.putQueryParameter("VideoSeekEnable", videoSeekEnable);
            this.videoSeekEnable = videoSeekEnable;
            return this;
        }

        @Override
        public UpdateVideoProcessingRequest build() {
            return new UpdateVideoProcessingRequest(this);
        } 

    } 

}
