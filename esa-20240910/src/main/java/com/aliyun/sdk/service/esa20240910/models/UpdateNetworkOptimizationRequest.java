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
         * <p>Configuration ID.</p>
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
         * <p>Whether to enable GRPC, default is disabled. Possible values:</p>
         * <ul>
         * <li>on: Enable</li>
         * <li>off: Disable</li>
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
         * <p>Whether to enable HTTP2 origin, default is disabled. Possible values:</p>
         * <ul>
         * <li>on: Enable</li>
         * <li>off: Disable</li>
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
         * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true</li>
         * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;)</li>
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
         * <p>Rule switch. This parameter is not required when adding a global configuration. Possible values:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
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
         * <p>Rule name. This parameter is not required when adding a global configuration.</p>
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
         * Sequence.
         */
        public Builder sequence(Integer sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
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
         * <p>Whether to enable the smart routing service, default is disabled. Possible values:</p>
         * <ul>
         * <li>on: Enable</li>
         * <li>off: Disable</li>
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
         * <p>Maximum upload file size, in MB, with a range of 100 to 500.</p>
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
         * <p>Whether to enable Websocket, default is enabled. Possible values:</p>
         * <ul>
         * <li>on: Enable</li>
         * <li>off: Disable</li>
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
