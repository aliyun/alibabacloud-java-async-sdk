// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteABMetricRequest} extends {@link RequestModel}
 *
 * <p>DeleteABMetricRequest</p>
 */
public class DeleteABMetricRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ABMetricId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ABMetricId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DeleteABMetricRequest(Builder builder) {
        super(builder);
        this.ABMetricId = builder.ABMetricId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteABMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ABMetricId
     */
    public String getABMetricId() {
        return this.ABMetricId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteABMetricRequest, Builder> {
        private String ABMetricId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteABMetricRequest request) {
            super(request);
            this.ABMetricId = request.ABMetricId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ABMetricId.
         */
        public Builder ABMetricId(String ABMetricId) {
            this.putPathParameter("ABMetricId", ABMetricId);
            this.ABMetricId = ABMetricId;
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
        public DeleteABMetricRequest build() {
            return new DeleteABMetricRequest(this);
        } 

    } 

}
