// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteABMetricGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteABMetricGroupRequest</p>
 */
public class DeleteABMetricGroupRequest extends Request {
    @Path
    @NameInMap("ABMetricGroupId")
    @Validation(required = true)
    private String ABMetricGroupId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteABMetricGroupRequest(Builder builder) {
        super(builder);
        this.ABMetricGroupId = builder.ABMetricGroupId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteABMetricGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ABMetricGroupId
     */
    public String getABMetricGroupId() {
        return this.ABMetricGroupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteABMetricGroupRequest, Builder> {
        private String ABMetricGroupId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteABMetricGroupRequest request) {
            super(request);
            this.ABMetricGroupId = request.ABMetricGroupId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ABMetricGroupId.
         */
        public Builder ABMetricGroupId(String ABMetricGroupId) {
            this.putPathParameter("ABMetricGroupId", ABMetricGroupId);
            this.ABMetricGroupId = ABMetricGroupId;
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
        public DeleteABMetricGroupRequest build() {
            return new DeleteABMetricGroupRequest(this);
        } 

    } 

}
