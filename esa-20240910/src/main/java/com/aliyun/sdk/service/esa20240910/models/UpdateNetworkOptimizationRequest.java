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
 * {@link UpdateNetworkOptimizationRequest} extends {@link RequestModel}
 *
 * <p>UpdateNetworkOptimizationRequest</p>
 */
public class UpdateNetworkOptimizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Grpc")
    private String grpc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Http2Origin")
    private String http2Origin;

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
    @com.aliyun.core.annotation.NameInMap("SmartRouting")
    private String smartRouting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadMaxFilesize")
    private String uploadMaxFilesize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Websocket")
    private String websocket;

    private UpdateNetworkOptimizationRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.grpc = builder.grpc;
        this.http2Origin = builder.http2Origin;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteId = builder.siteId;
        this.smartRouting = builder.smartRouting;
        this.uploadMaxFilesize = builder.uploadMaxFilesize;
        this.websocket = builder.websocket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNetworkOptimizationRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateNetworkOptimizationRequest, Builder> {
        private Long configId; 
        private String grpc; 
        private String http2Origin; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Long siteId; 
        private String smartRouting; 
        private String uploadMaxFilesize; 
        private String websocket; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNetworkOptimizationRequest request) {
            super(request);
            this.configId = request.configId;
            this.grpc = request.grpc;
            this.http2Origin = request.http2Origin;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.sequence = request.sequence;
            this.siteId = request.siteId;
            this.smartRouting = request.smartRouting;
            this.uploadMaxFilesize = request.uploadMaxFilesize;
            this.websocket = request.websocket;
        } 

        /**
         * <p>The configuration ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>Controls whether gRPC is enabled. This feature is disabled by default. Valid values:</p>
         * <ul>
         * <li><p>on: gRPC is enabled.</p>
         * </li>
         * <li><p>off: gRPC is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder grpc(String grpc) {
            this.putQueryParameter("Grpc", grpc);
            this.grpc = grpc;
            return this;
        }

        /**
         * <p>Controls whether HTTP/2 to origin is enabled. This feature is disabled by default. Valid values:</p>
         * <ul>
         * <li><p>on: HTTP/2 to origin is enabled.</p>
         * </li>
         * <li><p>off: HTTP/2 to origin is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder http2Origin(String http2Origin) {
            this.putQueryParameter("Http2Origin", http2Origin);
            this.http2Origin = http2Origin;
            return this;
        }

        /**
         * <p>The conditional expression used to match requests. This parameter is optional for global configurations.</p>
         * <ul>
         * <li><p>To match all incoming requests, set the value to true.</p>
         * </li>
         * <li><p>To match specific requests, set the value to a custom expression, for example, (http.host eq &quot;video.example.com&quot;).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>Controls whether the rule is enabled. This parameter is optional for global configurations. Valid values:</p>
         * <ul>
         * <li><p>on: The rule is enabled.</p>
         * </li>
         * <li><p>off: The rule is disabled.</p>
         * </li>
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
         * <p>The rule name. This parameter is optional for global configurations.</p>
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
         * <p>The rule execution order. Smaller values have higher priority.</p>
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
         * <p>The site ID. Call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain this ID.</p>
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
         * <p>Controls whether smart routing is enabled. This feature is disabled by default. Valid values:</p>
         * <ul>
         * <li><p>on: Smart routing is enabled.</p>
         * </li>
         * <li><p>off: Smart routing is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder smartRouting(String smartRouting) {
            this.putQueryParameter("SmartRouting", smartRouting);
            this.smartRouting = smartRouting;
            return this;
        }

        /**
         * <p>The maximum upload file size, in MB. The value must be an integer from 100 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder uploadMaxFilesize(String uploadMaxFilesize) {
            this.putQueryParameter("UploadMaxFilesize", uploadMaxFilesize);
            this.uploadMaxFilesize = uploadMaxFilesize;
            return this;
        }

        /**
         * <p>Controls whether WebSocket is enabled. This feature is enabled by default. Valid values:</p>
         * <ul>
         * <li><p>on: WebSocket is enabled.</p>
         * </li>
         * <li><p>off: WebSocket is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder websocket(String websocket) {
            this.putQueryParameter("Websocket", websocket);
            this.websocket = websocket;
            return this;
        }

        @Override
        public UpdateNetworkOptimizationRequest build() {
            return new UpdateNetworkOptimizationRequest(this);
        } 

    } 

}
