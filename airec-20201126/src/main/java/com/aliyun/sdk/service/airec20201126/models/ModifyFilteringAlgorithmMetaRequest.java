// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyFilteringAlgorithmMetaRequest} extends {@link RequestModel}
 *
 * <p>ModifyFilteringAlgorithmMetaRequest</p>
 */
public class ModifyFilteringAlgorithmMetaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("algorithmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithmId;

    private ModifyFilteringAlgorithmMetaRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.algorithmId = builder.algorithmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFilteringAlgorithmMetaRequest create() {
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
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public static final class Builder extends Request.Builder<ModifyFilteringAlgorithmMetaRequest, Builder> {
        private String instanceId; 
        private String algorithmId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFilteringAlgorithmMetaRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.algorithmId = request.algorithmId;
        } 

        /**
         * <p>Indicates whether the scheduled task is enabled.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The request ID.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder algorithmId(String algorithmId) {
            this.putPathParameter("algorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        @Override
        public ModifyFilteringAlgorithmMetaRequest build() {
            return new ModifyFilteringAlgorithmMetaRequest(this);
        } 

    } 

}
