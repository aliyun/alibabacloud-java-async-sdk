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
 * {@link ModifyModelApiRequest} extends {@link RequestModel}
 *
 * <p>ModifyModelApiRequest</p>
 */
public class ModifyModelApiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelApiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathPrefix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pathPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeRules;

    private ModifyModelApiRequest(Builder builder) {
        super(builder);
        this.gwClusterId = builder.gwClusterId;
        this.modelApiId = builder.modelApiId;
        this.modelCategory = builder.modelCategory;
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

    public static ModifyModelApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return modelApiId
     */
    public String getModelApiId() {
        return this.modelApiId;
    }

    /**
     * @return modelCategory
     */
    public String getModelCategory() {
        return this.modelCategory;
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

    public static final class Builder extends Request.Builder<ModifyModelApiRequest, Builder> {
        private String gwClusterId; 
        private String modelApiId; 
        private String modelCategory; 
        private String pathPrefix; 
        private String protocol; 
        private String recordInput; 
        private String recordOutput; 
        private String regionId; 
        private String routeRules; 

        private Builder() {
            super();
        } 

        private Builder(ModifyModelApiRequest request) {
            super(request);
            this.gwClusterId = request.gwClusterId;
            this.modelApiId = request.modelApiId;
            this.modelCategory = request.modelCategory;
            this.pathPrefix = request.pathPrefix;
            this.protocol = request.protocol;
            this.recordInput = request.recordInput;
            this.recordOutput = request.recordOutput;
            this.regionId = request.regionId;
            this.routeRules = request.routeRules;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mi-xxxxx</p>
         */
        public Builder modelApiId(String modelApiId) {
            this.putQueryParameter("ModelApiId", modelApiId);
            this.modelApiId = modelApiId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * RecordInput.
         */
        public Builder recordInput(String recordInput) {
            this.putQueryParameter("RecordInput", recordInput);
            this.recordInput = recordInput;
            return this;
        }

        /**
         * RecordOutput.
         */
        public Builder recordOutput(String recordOutput) {
            this.putQueryParameter("RecordOutput", recordOutput);
            this.recordOutput = recordOutput;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
        public ModifyModelApiRequest build() {
            return new ModifyModelApiRequest(this);
        } 

    } 

}
