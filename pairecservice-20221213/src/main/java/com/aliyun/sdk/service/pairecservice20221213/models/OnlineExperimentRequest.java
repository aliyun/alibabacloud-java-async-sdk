// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnlineExperimentRequest} extends {@link RequestModel}
 *
 * <p>OnlineExperimentRequest</p>
 */
public class OnlineExperimentRequest extends Request {
    @Path
    @NameInMap("ExperimentId")
    @Validation(required = true)
    private String experimentId;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    private OnlineExperimentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnlineExperimentRequest create() {
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

    public static final class Builder extends Request.Builder<OnlineExperimentRequest, Builder> {
        private String experimentId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(OnlineExperimentRequest request) {
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
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public OnlineExperimentRequest build() {
            return new OnlineExperimentRequest(this);
        } 

    } 

}
