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
 * {@link CreateVideoProcessingRequest} extends {@link RequestModel}
 *
 * <p>CreateVideoProcessingRequest</p>
 */
public class CreateVideoProcessingRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoSeekEnable")
    private String videoSeekEnable;

    private CreateVideoProcessingRequest(Builder builder) {
        super(builder);
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
        this.siteVersion = builder.siteVersion;
        this.videoSeekEnable = builder.videoSeekEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoProcessingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    /**
     * @return videoSeekEnable
     */
    public String getVideoSeekEnable() {
        return this.videoSeekEnable;
    }

    public static final class Builder extends Request.Builder<CreateVideoProcessingRequest, Builder> {
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
        private Integer siteVersion; 
        private String videoSeekEnable; 

        private Builder() {
            super();
        } 

        private Builder(CreateVideoProcessingRequest request) {
            super(request);
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
            this.siteVersion = request.siteVersion;
            this.videoSeekEnable = request.videoSeekEnable;
        } 

        /**
         * <p>Set custom end parameters for FLV files.</p>
         * 
         * <strong>example:</strong>
         * <p>end</p>
         */
        public Builder flvSeekEnd(String flvSeekEnd) {
            this.putQueryParameter("FlvSeekEnd", flvSeekEnd);
            this.flvSeekEnd = flvSeekEnd;
            return this;
        }

        /**
         * <p>The custom start parameter for FLV files.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        public Builder flvSeekStart(String flvSeekStart) {
            this.putQueryParameter("FlvSeekStart", flvSeekStart);
            this.flvSeekStart = flvSeekStart;
            return this;
        }

        /**
         * <p>FLV seeking. Valid values:</p>
         * <ul>
         * <li>by_byte: seek by byte</li>
         * <li>by_time: seek by time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>by_byte</p>
         */
        public Builder flvVideoSeekMode(String flvVideoSeekMode) {
            this.putQueryParameter("FlvVideoSeekMode", flvVideoSeekMode);
            this.flvVideoSeekMode = flvVideoSeekMode;
            return this;
        }

        /**
         * <p>Customize the mp4 end parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>end</p>
         */
        public Builder mp4SeekEnd(String mp4SeekEnd) {
            this.putQueryParameter("Mp4SeekEnd", mp4SeekEnd);
            this.mp4SeekEnd = mp4SeekEnd;
            return this;
        }

        /**
         * <p>Customize the mp4 start parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        public Builder mp4SeekStart(String mp4SeekStart) {
            this.putQueryParameter("Mp4SeekStart", mp4SeekStart);
            this.mp4SeekStart = mp4SeekStart;
            return this;
        }

        /**
         * <p>The content of the rule. A conditional expression is used to match a user request. You do not need to set this parameter when you add global configuration. Use cases:</p>
         * <ul>
         * <li>true: Match all incoming requests.</li>
         * <li>Set the value to a custom expression, for example:(http.host eq &quot;video.example.com&quot;): Match the specified request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>Specifies whether to enable the rule. Valid values: You do not need to set this parameter when you add global configuration. Specifies whether to check the image used by the instance supports hot migration. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * <p>The name of the scheduling rule. You do not need to set this parameter when you add global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The order in which the rule is executed. A smaller value gives priority to the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sequence(Integer sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
         * <p>The version number of the website configurations. You can use this parameter to specify a version of your website to apply the feature settings. By default, version 0 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * <p>Video seeking. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder videoSeekEnable(String videoSeekEnable) {
            this.putQueryParameter("VideoSeekEnable", videoSeekEnable);
            this.videoSeekEnable = videoSeekEnable;
            return this;
        }

        @Override
        public CreateVideoProcessingRequest build() {
            return new CreateVideoProcessingRequest(this);
        } 

    } 

}
