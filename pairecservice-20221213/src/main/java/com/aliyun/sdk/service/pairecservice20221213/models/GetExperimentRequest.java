// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentRequest</p>
 */
public class GetExperimentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetExperimentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetExperimentRequest, Builder> {
        private String experimentId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
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
        public GetExperimentRequest build() {
            return new GetExperimentRequest(this);
        } 

    } 

}
