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
 * {@link GetNetworkOptimizationResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkOptimizationResponseBody</p>
 */
public class GetNetworkOptimizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("Grpc")
    private String grpc;

    @com.aliyun.core.annotation.NameInMap("Http2Origin")
    private String http2Origin;

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

    @com.aliyun.core.annotation.NameInMap("SmartRouting")
    private String smartRouting;

    @com.aliyun.core.annotation.NameInMap("UploadMaxFilesize")
    private String uploadMaxFilesize;

    @com.aliyun.core.annotation.NameInMap("Websocket")
    private String websocket;

    private GetNetworkOptimizationResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.configType = builder.configType;
        this.grpc = builder.grpc;
        this.http2Origin = builder.http2Origin;
        this.requestId = builder.requestId;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteVersion = builder.siteVersion;
        this.smartRouting = builder.smartRouting;
        this.uploadMaxFilesize = builder.uploadMaxFilesize;
        this.websocket = builder.websocket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkOptimizationResponseBody create() {
        return builder().build();
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
     * @return grpc
     */
    public String getGrpc() {
        return this.grpc;
    }

    /**
     * @return http2Origin
     */
    public String getHttp2Origin() {
        return this.http2Origin;
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
     * @return smartRouting
     */
    public String getSmartRouting() {
        return this.smartRouting;
    }

    /**
     * @return uploadMaxFilesize
     */
    public String getUploadMaxFilesize() {
        return this.uploadMaxFilesize;
    }

    /**
     * @return websocket
     */
    public String getWebsocket() {
        return this.websocket;
    }

    public static final class Builder {
        private Long configId; 
        private String configType; 
        private String grpc; 
        private String http2Origin; 
        private String requestId; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Integer siteVersion; 
        private String smartRouting; 
        private String uploadMaxFilesize; 
        private String websocket; 

        /**
         * <p>Configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>Configuration type, which can be used to query global or rule configurations. Value range:</p>
         * <ul>
         * <li>global: Query global configuration.</li>
         * <li>rule: Query rule configuration.</li>
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
         * <p>Whether to enable GRPC, default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enabled</li>
         * <li>off: Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder grpc(String grpc) {
            this.grpc = grpc;
            return this;
        }

        /**
         * <p>Whether to enable HTTP2 origin, default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enabled</li>
         * <li>off: Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder http2Origin(String http2Origin) {
            this.http2Origin = http2Origin;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * <p>Rule switch. Values:</p>
         * <ul>
         * <li>on: Enabled</li>
         * <li>off: Disabled</li>
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
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Rule execution sequence.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>Site version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * <p>Whether to enable smart routing service, default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enabled</li>
         * <li>off: Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder smartRouting(String smartRouting) {
            this.smartRouting = smartRouting;
            return this;
        }

        /**
         * <p>Maximum upload file size, in MB, value range: 100～500.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder uploadMaxFilesize(String uploadMaxFilesize) {
            this.uploadMaxFilesize = uploadMaxFilesize;
            return this;
        }

        /**
         * <p>Whether to enable Websocket, default is enabled. Value range:</p>
         * <ul>
         * <li>on: Enabled</li>
         * <li>off: Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder websocket(String websocket) {
            this.websocket = websocket;
            return this;
        }

        public GetNetworkOptimizationResponseBody build() {
            return new GetNetworkOptimizationResponseBody(this);
        } 

    } 

}
