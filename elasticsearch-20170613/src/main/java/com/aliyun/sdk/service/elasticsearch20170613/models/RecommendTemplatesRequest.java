// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link RecommendTemplatesRequest} extends {@link RequestModel}
 *
 * <p>RecommendTemplatesRequest</p>
 */
public class RecommendTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("usageScenario")
    @com.aliyun.core.annotation.Validation(required = true)
    private String usageScenario;

    private RecommendTemplatesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.usageScenario = builder.usageScenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecommendTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return usageScenario
     */
    public String getUsageScenario() {
        return this.usageScenario;
    }

    public static final class Builder extends Request.Builder<RecommendTemplatesRequest, Builder> {
        private String instanceId; 
        private String usageScenario; 

        private Builder() {
            super();
        } 

        private Builder(RecommendTemplatesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.usageScenario = request.usageScenario;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-oew20apwz0007****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The scenario-specific templatetype used by the cluster. Valid values:</p>
         * <ul>
         * <li>general: general-purpose scenario</li>
         * <li>analysisVisualization: data analytics scenario</li>
         * <li>dbAcceleration: database acceleration scenario</li>
         * <li>search: search scenario</li>
         * <li>log: log scenario</li>
         * </ul>
         * <blockquote>
         * <p>Standard instances support general-purpose, data analytics, database acceleration, and search scenarios. Advanced Edition supports only the log scenario.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        public Builder usageScenario(String usageScenario) {
            this.putQueryParameter("usageScenario", usageScenario);
            this.usageScenario = usageScenario;
            return this;
        }

        @Override
        public RecommendTemplatesRequest build() {
            return new RecommendTemplatesRequest(this);
        } 

    } 

}
