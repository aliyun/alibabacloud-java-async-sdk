// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCrowdRequest} extends {@link RequestModel}
 *
 * <p>DeleteCrowdRequest</p>
 */
public class DeleteCrowdRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CrowdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String crowdId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DeleteCrowdRequest(Builder builder) {
        super(builder);
        this.crowdId = builder.crowdId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCrowdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crowdId
     */
    public String getCrowdId() {
        return this.crowdId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteCrowdRequest, Builder> {
        private String crowdId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCrowdRequest request) {
            super(request);
            this.crowdId = request.crowdId;
            this.instanceId = request.instanceId;
        } 

        /**
         * CrowdId.
         */
        public Builder crowdId(String crowdId) {
            this.putPathParameter("CrowdId", crowdId);
            this.crowdId = crowdId;
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
        public DeleteCrowdRequest build() {
            return new DeleteCrowdRequest(this);
        } 

    } 

}
