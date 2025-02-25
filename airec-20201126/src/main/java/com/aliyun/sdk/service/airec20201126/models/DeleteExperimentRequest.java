// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteExperimentRequest} extends {@link RequestModel}
 *
 * <p>DeleteExperimentRequest</p>
 */
public class DeleteExperimentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("experimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    private DeleteExperimentRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sceneId = builder.sceneId;
        this.experimentId = builder.experimentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExperimentRequest create() {
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
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    public static final class Builder extends Request.Builder<DeleteExperimentRequest, Builder> {
        private String instanceId; 
        private String sceneId; 
        private String experimentId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExperimentRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.sceneId = request.sceneId;
            this.experimentId = request.experimentId;
        } 

        /**
         * <p>The response body.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Indicates whether the test was deleted. Valid values: true or false.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sceneId(String sceneId) {
            this.putPathParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("experimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        @Override
        public DeleteExperimentRequest build() {
            return new DeleteExperimentRequest(this);
        } 

    } 

}
