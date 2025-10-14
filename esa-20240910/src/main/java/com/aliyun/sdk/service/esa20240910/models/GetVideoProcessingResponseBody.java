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
 * {@link GetVideoProcessingResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoProcessingResponseBody</p>
 */
public class GetVideoProcessingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("FlvSeekEnd")
    private String flvSeekEnd;

    @com.aliyun.core.annotation.NameInMap("FlvSeekStart")
    private String flvSeekStart;

    @com.aliyun.core.annotation.NameInMap("FlvVideoSeekMode")
    private String flvVideoSeekMode;

    @com.aliyun.core.annotation.NameInMap("Mp4SeekEnd")
    private String mp4SeekEnd;

    @com.aliyun.core.annotation.NameInMap("Mp4SeekStart")
    private String mp4SeekStart;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.NameInMap("RuleEnable")
    private String ruleEnable;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.NameInMap("Sequence")
    private Integer sequence;

    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    @com.aliyun.core.annotation.NameInMap("VideoSeekEnable")
    private String videoSeekEnable;

    private GetVideoProcessingResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.configType = builder.configType;
        this.flvSeekEnd = builder.flvSeekEnd;
        this.flvSeekStart = builder.flvSeekStart;
        this.flvVideoSeekMode = builder.flvVideoSeekMode;
        this.mp4SeekEnd = builder.mp4SeekEnd;
        this.mp4SeekStart = builder.mp4SeekStart;
        this.requestId = builder.requestId;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteVersion = builder.siteVersion;
        this.videoSeekEnable = builder.videoSeekEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoProcessingResponseBody create() {
        return builder().build();
    }

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
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private Long configId; 
        private String configType; 
        private String flvSeekEnd; 
        private String flvSeekStart; 
        private String flvVideoSeekMode; 
        private String mp4SeekEnd; 
        private String mp4SeekStart; 
        private String requestId; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Integer siteVersion; 
        private String videoSeekEnable; 

        private Builder() {
        } 

        private Builder(GetVideoProcessingResponseBody model) {
            this.configId = model.configId;
            this.configType = model.configType;
            this.flvSeekEnd = model.flvSeekEnd;
            this.flvSeekStart = model.flvSeekStart;
            this.flvVideoSeekMode = model.flvVideoSeekMode;
            this.mp4SeekEnd = model.mp4SeekEnd;
            this.mp4SeekStart = model.mp4SeekStart;
            this.requestId = model.requestId;
            this.rule = model.rule;
            this.ruleEnable = model.ruleEnable;
            this.ruleName = model.ruleName;
            this.sequence = model.sequence;
            this.siteVersion = model.siteVersion;
            this.videoSeekEnable = model.videoSeekEnable;
        } 

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>The type of the configuration. Valid values:</p>
         * <ul>
         * <li>global: global configuration.</li>
         * <li>rule: rule configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * <p>The custom end parameter for FLV files.</p>
         * 
         * <strong>example:</strong>
         * <p>end</p>
         */
        public Builder flvSeekEnd(String flvSeekEnd) {
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
            this.flvSeekStart = flvSeekStart;
            return this;
        }

        /**
         * <p>FLV Seeking Valid values:</p>
         * <ul>
         * <li>by_byte: Seek by byte.</li>
         * <li>by_time: Seek by time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>by_byte</p>
         */
        public Builder flvVideoSeekMode(String flvVideoSeekMode) {
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
            this.mp4SeekStart = mp4SeekStart;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * <p>Indicates whether the rule is enabled. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * <p>The name of the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        public Builder ruleName(String ruleName) {
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
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>The version number of the website configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteVersion(Integer siteVersion) {
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
            this.videoSeekEnable = videoSeekEnable;
            return this;
        }

        public GetVideoProcessingResponseBody build() {
            return new GetVideoProcessingResponseBody(this);
        } 

    } 

}
