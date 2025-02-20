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
 * {@link CreateNetworkOptimizationRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkOptimizationRequest</p>
 */
public class CreateNetworkOptimizationRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartRouting")
    private String smartRouting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadMaxFilesize")
    private String uploadMaxFilesize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Websocket")
    private String websocket;

    private CreateNetworkOptimizationRequest(Builder builder) {
        super(builder);
        this.grpc = builder.grpc;
        this.http2Origin = builder.http2Origin;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
        this.smartRouting = builder.smartRouting;
        this.uploadMaxFilesize = builder.uploadMaxFilesize;
        this.websocket = builder.websocket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkOptimizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateNetworkOptimizationRequest, Builder> {
        private String grpc; 
        private String http2Origin; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Long siteId; 
        private Integer siteVersion; 
        private String smartRouting; 
        private String uploadMaxFilesize; 
        private String websocket; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkOptimizationRequest request) {
            super(request);
            this.grpc = request.grpc;
            this.http2Origin = request.http2Origin;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
            this.smartRouting = request.smartRouting;
            this.uploadMaxFilesize = request.uploadMaxFilesize;
            this.websocket = request.websocket;
        } 

        /**
         * <p>Indicates whether to enable GRPC, disabled by default. Possible values:</p>
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
         * <p>Indicates whether to enable HTTP2 origin, disabled by default. Possible values:</p>
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
         * <p>Rule content.</p>
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
         * <p>Rule switch. Possible values:</p>
         * <ul>
         * <li>on: Enable</li>
         * <li>off: Disable</li>
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
         * <p>Rule name.</p>
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
         * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>340035003106221</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>Version number of the site configuration. For sites with version management enabled, this parameter specifies the version to which the configuration applies, defaulting to version 0.</p>
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
         * <p>Indicates whether to enable smart routing service, disabled by default. Possible values:</p>
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
         * <p>Maximum file size for upload, in MB. Range: 100～500.</p>
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
         * <p>Indicates whether to enable Websocket, enabled by default. Possible values:</p>
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
        public CreateNetworkOptimizationRequest build() {
            return new CreateNetworkOptimizationRequest(this);
        } 

    } 

}
