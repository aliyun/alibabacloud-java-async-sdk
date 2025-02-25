// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteFilteringAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>DeleteFilteringAlgorithmRequest</p>
 */
public class DeleteFilteringAlgorithmRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("algorithmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithmId;

    private DeleteFilteringAlgorithmRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.algorithmId = builder.algorithmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFilteringAlgorithmRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFilteringAlgorithmRequest, Builder> {
        private String instanceId; 
        private String algorithmId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFilteringAlgorithmRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.algorithmId = request.algorithmId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the specified filtering table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder algorithmId(String algorithmId) {
            this.putPathParameter("algorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        @Override
        public DeleteFilteringAlgorithmRequest build() {
            return new DeleteFilteringAlgorithmRequest(this);
        } 

    } 

}
