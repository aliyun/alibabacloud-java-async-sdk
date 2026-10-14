// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link CheckAgentConfigSupportedRequest} extends {@link RequestModel}
 *
 * <p>CheckAgentConfigSupportedRequest</p>
 */
public class CheckAgentConfigSupportedRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("checkType")
    private String checkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clusters")
    private String clusters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instances")
    private String instances;

    private CheckAgentConfigSupportedRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.checkType = builder.checkType;
        this.clusters = builder.clusters;
        this.configId = builder.configId;
        this.content = builder.content;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAgentConfigSupportedRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return checkType
     */
    public String getCheckType() {
        return this.checkType;
    }

    /**
     * @return clusters
     */
    public String getClusters() {
        return this.clusters;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return instances
     */
    public String getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<CheckAgentConfigSupportedRequest, Builder> {
        private String agentId; 
        private String checkType; 
        private String clusters; 
        private String configId; 
        private String content; 
        private String instances; 

        private Builder() {
            super();
        } 

        private Builder(CheckAgentConfigSupportedRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.checkType = request.checkType;
            this.clusters = request.clusters;
            this.configId = request.configId;
            this.content = request.content;
            this.instances = request.instances;
        } 

        /**
         * <p>The ID of the component to update. You can obtain the component ID from the ListAgents operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The configuration dimension to check, such as cluster or node.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder checkType(String checkType) {
            this.putQueryParameter("checkType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c726e7497b7d246d09d8644ed62effacc</p>
         */
        public Builder clusters(String clusters) {
            this.putQueryParameter("clusters", clusters);
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The ID of the component configuration to install.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4d5ecf02-3d01-11f0-8c90-00163e1029a</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("configId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>The configuration content.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;code\&quot;: \&quot;BABA\&quot;, \&quot;changeRate\&quot;: \&quot;-1.434%\&quot;, \&quot;exchange\&quot;: \&quot;NYSE\&quot;, \&quot;price\&quot;: \&quot;112.690\&quot;, \&quot;changePrice\&quot;: \&quot;-$1.640\&quot;, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;date\&quot;: \&quot;2026-06-11T20:01 EDT\&quot;}</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The list of instances. Separate multiple instance IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp10ktsji8vsbd8gco5i,i-bp1163pp7k7njfggvuqp,i-bp12ytprghv6rwzfgypm</p>
         */
        public Builder instances(String instances) {
            this.putQueryParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public CheckAgentConfigSupportedRequest build() {
            return new CheckAgentConfigSupportedRequest(this);
        } 

    } 

}
