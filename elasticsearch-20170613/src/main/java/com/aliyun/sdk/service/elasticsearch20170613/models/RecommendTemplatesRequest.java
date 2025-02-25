// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
         * <ul>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * </ul>
         * <p>**</p>
         * <hr>
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
