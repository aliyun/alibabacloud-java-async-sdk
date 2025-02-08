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
            this.siteId = request.siteId;
            this.smartRouting = request.smartRouting;
            this.uploadMaxFilesize = request.uploadMaxFilesize;
            this.websocket = request.websocket;
        } 

        /**
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
         * Grpc.
         */
        public Builder grpc(String grpc) {
            this.putQueryParameter("Grpc", grpc);
            this.grpc = grpc;
            return this;
        }

        /**
         * Http2Origin.
         */
        public Builder http2Origin(String http2Origin) {
            this.putQueryParameter("Http2Origin", http2Origin);
            this.http2Origin = http2Origin;
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
         * SmartRouting.
         */
        public Builder smartRouting(String smartRouting) {
            this.putQueryParameter("SmartRouting", smartRouting);
            this.smartRouting = smartRouting;
            return this;
        }

        /**
         * UploadMaxFilesize.
         */
        public Builder uploadMaxFilesize(String uploadMaxFilesize) {
            this.putQueryParameter("UploadMaxFilesize", uploadMaxFilesize);
            this.uploadMaxFilesize = uploadMaxFilesize;
            return this;
        }

        /**
         * Websocket.
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
