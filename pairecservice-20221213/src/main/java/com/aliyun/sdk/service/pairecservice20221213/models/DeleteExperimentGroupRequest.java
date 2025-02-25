// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExperimentGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteExperimentGroupRequest</p>
 */
public class DeleteExperimentGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DeleteExperimentGroupRequest(Builder builder) {
        super(builder);
        this.experimentGroupId = builder.experimentGroupId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExperimentGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentGroupId
     */
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteExperimentGroupRequest, Builder> {
        private String experimentGroupId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExperimentGroupRequest request) {
            super(request);
            this.experimentGroupId = request.experimentGroupId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ExperimentGroupId.
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.putPathParameter("ExperimentGroupId", experimentGroupId);
            this.experimentGroupId = experimentGroupId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteExperimentGroupRequest build() {
            return new DeleteExperimentGroupRequest(this);
        } 

    } 

}
