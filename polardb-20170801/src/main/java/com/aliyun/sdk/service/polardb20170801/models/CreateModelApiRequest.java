// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateModelApiRequest} extends {@link RequestModel}
 *
 * <p>CreateModelApiRequest</p>
 */
public class CreateModelApiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceModel")
    private String forceModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCategory")
    private String modelCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelMappings")
    private String modelMappings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelRouting")
    private String modelRouting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathPrefix")
    private String pathPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordInput")
    private String recordInput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordOutput")
    private String recordOutput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteRules")
    private String routeRules;

    private CreateModelApiRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.forceModel = builder.forceModel;
        this.gwClusterId = builder.gwClusterId;
        this.modelCategory = builder.modelCategory;
        this.modelMappings = builder.modelMappings;
        this.modelRouting = builder.modelRouting;
        this.name = builder.name;
        this.pathPrefix = builder.pathPrefix;
        this.protocol = builder.protocol;
        this.recordInput = builder.recordInput;
        this.recordOutput = builder.recordOutput;
        this.regionId = builder.regionId;
        this.routeRules = builder.routeRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return forceModel
     */
    public String getForceModel() {
        return this.forceModel;
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return modelCategory
     */
    public String getModelCategory() {
        return this.modelCategory;
    }

    /**
     * @return modelMappings
     */
    public String getModelMappings() {
        return this.modelMappings;
    }

    /**
     * @return modelRouting
     */
    public String getModelRouting() {
        return this.modelRouting;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pathPrefix
     */
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return recordInput
     */
    public String getRecordInput() {
        return this.recordInput;
    }

    /**
     * @return recordOutput
     */
    public String getRecordOutput() {
        return this.recordOutput;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return routeRules
     */
    public String getRouteRules() {
        return this.routeRules;
    }

    public static final class Builder extends Request.Builder<CreateModelApiRequest, Builder> {
        private String config; 
        private String forceModel; 
        private String gwClusterId; 
        private String modelCategory; 
        private String modelMappings; 
        private String modelRouting; 
        private String name; 
        private String pathPrefix; 
        private String protocol; 
        private String recordInput; 
        private String recordOutput; 
        private String regionId; 
        private String routeRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelApiRequest request) {
            super(request);
            this.config = request.config;
            this.forceModel = request.forceModel;
            this.gwClusterId = request.gwClusterId;
            this.modelCategory = request.modelCategory;
            this.modelMappings = request.modelMappings;
            this.modelRouting = request.modelRouting;
            this.name = request.name;
            this.pathPrefix = request.pathPrefix;
            this.protocol = request.protocol;
            this.recordInput = request.recordInput;
            this.recordOutput = request.recordOutput;
            this.regionId = request.regionId;
            this.routeRules = request.routeRules;
        } 

        /**
         * <p>The gateway retry configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;failover&quot;: {
         *         &quot;enabled&quot;: true,
         *         &quot;max_provider_retries&quot;: 2,
         *         &quot;max_failover_providers&quot;: 1,
         *         &quot;retryable_status_codes&quot;: [429, 500, 502, 503, 504],
         *         &quot;retry_delay&quot;: 0.5
         *     }
         * }</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The forced model.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-32B</p>
         */
        public Builder forceModel(String forceModel) {
            this.putQueryParameter("ForceModel", forceModel);
            this.forceModel = forceModel;
            return this;
        }

        /**
         * <p>The ID of the gateway instance. You can obtain this ID from the GwClusterId value returned by the CreateGateway operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>The category. Valid values:</p>
         * <ul>
         * <li><strong>text</strong></li>
         * <li><strong>embedding</strong></li>
         * <li><strong>rerank</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder modelCategory(String modelCategory) {
            this.putQueryParameter("ModelCategory", modelCategory);
            this.modelCategory = modelCategory;
            return this;
        }

        /**
         * <p>The model name mappings, specified as a JSON array string. Each element is in the format of {&quot;Source&quot;:&quot;client model name&quot;,&quot;Target&quot;:&quot;upstream model name&quot;}. The Source parameter is matched in a case-insensitive manner and must be unique. The Target parameter retains its original case when forwarded. Both parameters cannot be empty and cannot contain leading or trailing spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Source&quot;:&quot;client-model-a&quot;,&quot;Target&quot;:&quot;upstream-model-a&quot;},{&quot;Source&quot;:&quot;client-model-b&quot;,&quot;Target&quot;:&quot;upstream-model-b&quot;}]</p>
         */
        public Builder modelMappings(String modelMappings) {
            this.putQueryParameter("ModelMappings", modelMappings);
            this.modelMappings = modelMappings;
            return this;
        }

        /**
         * <p>The intelligent routing candidate list, specified as a JSON object string. Currently, it only contains AllowedModels, which is a non-empty array of unique model names. The order of the array determines the candidate order. Do not pass the Enabled, cost, or quality tier parameters. Saving candidates does not enable the feature. You must first call the EnableModelRouting operation to obtain the gateway entitlements.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AllowedModels&quot;:[&quot;deepseek-v4-pro&quot;,&quot;glm-5.3&quot;,&quot;glm-5.3-flash&quot;]}</p>
         */
        public Builder modelRouting(String modelRouting) {
            this.putQueryParameter("ModelRouting", modelRouting);
            this.modelRouting = modelRouting;
            return this;
        }

        /**
         * <p>The name of the model API.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The API path prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        public Builder pathPrefix(String pathPrefix) {
            this.putQueryParameter("PathPrefix", pathPrefix);
            this.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>openai</strong></li>
         * <li><strong>anthropic</strong></li>
         * <li><strong>bailian</strong></li>
         * <li><strong>vllm</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The number of input points.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder recordInput(String recordInput) {
            this.putQueryParameter("RecordInput", recordInput);
            this.recordInput = recordInput;
            return this;
        }

        /**
         * <p>The number of output points.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder recordOutput(String recordOutput) {
            this.putQueryParameter("RecordOutput", recordOutput);
            this.recordOutput = recordOutput;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of routing rules, specified as a JSON array string.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;RuleName&quot;: &quot;string&quot;,
         *     &quot;FallbackMode&quot;: &quot;failover&quot;,
         *     &quot;MatchModelListJson&quot;: &quot;[]&quot;,
         *     &quot;providerBalancerAlgorithm&quot;: &quot;round-robin&quot;,
         *     &quot;Providers&quot;: [
         *       {
         *         &quot;ModelServiceName&quot;: &quot;string&quot;,
         *         &quot;Weight&quot;: &quot;0&quot;,
         *         &quot;model_protocol&quot;: &quot;vllm&quot;
         *         &quot;ModelList&quot;: &quot;[]&quot;
         *       }
         *     ],
         *     &quot;FallbackProviders&quot;: [
         *       {
         *         &quot;ModelServiceName&quot;: &quot;string&quot;,
         *         &quot;model_protocol&quot;: &quot;anthropic&quot;,
         *         &quot;Weight&quot;: &quot;10&quot;,
         *         &quot;ModelList&quot;: &quot;[]&quot;
         *       }
         *     ]
         *   }
         * ]</p>
         */
        public Builder routeRules(String routeRules) {
            this.putQueryParameter("RouteRules", routeRules);
            this.routeRules = routeRules;
            return this;
        }

        @Override
        public CreateModelApiRequest build() {
            return new CreateModelApiRequest(this);
        } 

    } 

}
